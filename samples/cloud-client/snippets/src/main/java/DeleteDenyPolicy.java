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

import com.google.iam.v2beta.DeletePolicyRequest;
import com.google.iam.v2beta.PoliciesClient;
import com.google.iam.v2beta.Policy;
import java.io.IOException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public class DeleteDenyPolicy {

  public static void main(String[] args)
      throws IOException, InterruptedException, ExecutionException, TimeoutException {
    // TODO(developer): Replace these variables before running the sample.

    // ID or number of the Google Cloud project you want to use.
    String projectId = "your-google-cloud-project-id";

    // Specify the name of the Deny policy you want to delete.
    String policyName = "deny-policy-name";

    deleteDenyPolicy(projectId, policyName);
  }

  public static void deleteDenyPolicy(String projectId, String policyName)
      throws IOException, InterruptedException, ExecutionException, TimeoutException {
    try (PoliciesClient policiesClient = PoliciesClient.create()) {

      String attachmentPoint =
          String.format("cloudresourcemanager.googleapis.com/projects/%s", projectId)
              .replaceAll("/", "%2F");

      String policyParent = String.format(
          "policies/%s/denypolicies/%s", attachmentPoint, policyName);

      DeletePolicyRequest deletePolicyRequest = DeletePolicyRequest.newBuilder()
          .setName(policyParent)
          .build();

      Policy policy = policiesClient.deletePolicyAsync(deletePolicyRequest)
          .get(3, TimeUnit.MINUTES);
      System.out.println("Successfully deleted the policy: " + policy.getName());
    }
  }
}
