/*
 * Copyright 2022 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

import com.google.iam.v2beta.DenyRule;
import com.google.iam.v2beta.PoliciesClient;
import com.google.iam.v2beta.Policy;
import com.google.iam.v2beta.PolicyRule;
import com.google.iam.v2beta.UpdatePolicyRequest;
import com.google.longrunning.Operation;
import com.google.type.Expr;
import java.io.IOException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public class UpdateDenyPolicy {

  public static void main(String[] args)
      throws IOException, ExecutionException, InterruptedException, TimeoutException {
    // TODO(developer): Replace these variables before running the sample.

    // ID or number of the Google Cloud project you want to use.
    String projectId = "your-google-cloud-project-id";

    // Specify the id of the Deny policy you want to retrieve.
    String policyId = "deny-policy-id";

    // Etag field that identifies the policy version. The etag changes each time
    // you update the policy. Get the etag of a policy by performing a Policy Get request.
    String etag = "policy_etag";

    updateDenyPolicy(projectId, policyId, etag);
  }

  public static void updateDenyPolicy(String projectId, String policyId, String etag)
      throws IOException, ExecutionException, InterruptedException, TimeoutException {

    try (PoliciesClient policiesClient = PoliciesClient.create()) {

      String attachmentPoint =
          String.format("cloudresourcemanager.googleapis.com/projects/%s", projectId)
              .replaceAll("/", "%2F");

      String policyParent =
          String.format("policies/%s/denypolicies/%s", attachmentPoint, policyId);

      Policy policy =
          Policy.newBuilder()
              .setName(policyParent)
              .setEtag(etag)
              .addRules(
                  PolicyRule.newBuilder()
                      .setDescription(
                          "block all principals from deleting projects, unless the principal is a member of project-admins@example.com and the project being deleted has a tag with the value test")
                      .setDenyRule(
                          DenyRule.newBuilder()
                              .addDeniedPrincipals("principalSet://goog/public:all")
                              // .addExceptionPrincipals(
                              //     "principalSet://goog/group/project-admins@example.com")
                              .addDeniedPermissions(
                                  "cloudresourcemanager.googleapis.com/projects.delete")
                              .addExceptionPermissions("iam.googleapis.com/roles.list")
                              .setDenialCondition(
                                  Expr.newBuilder()
                                      .setExpression("!resource.matchTag('12345678/env', 'prod')")
                                      .setTitle("Only for non-test projects")
                                      .build())
                              .build())
                      .build())
              .build();

      UpdatePolicyRequest updatePolicyRequest =
          UpdatePolicyRequest.newBuilder().setPolicy(policy).build();

      Operation operation = policiesClient.updatePolicyCallable().futureCall(updatePolicyRequest)
          .get(3, TimeUnit.MINUTES);

      if (operation.hasError()) {
        System.out.println("Error in updating the policy " + operation.getError());
        return;
      }

      System.out.println("Updated the deny policy: " + policyId);
    }
  }
}
