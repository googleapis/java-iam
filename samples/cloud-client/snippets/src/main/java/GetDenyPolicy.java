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

import com.google.iam.v2beta.GetPolicyRequest;
import com.google.iam.v2beta.PoliciesClient;
import com.google.iam.v2beta.Policy;
import java.io.IOException;

public class GetDenyPolicy {

  public static void main(String[] args) throws IOException {
    // TODO(developer): Replace these variables before running the sample.

    // ID or number of the Google Cloud project you want to use.
    String projectId = "your-google-cloud-project-id";

    // Specify the id of the deny policy you want to retrieve.
    String policyId = "deny-policy-id";

    getDenyPolicy(projectId, policyId);
  }

  // Retrieve the deny policy given the project id and policy id.
  public static void getDenyPolicy(String projectId, String policyId) throws IOException {
    // Create the IAM Policies client.
    try (PoliciesClient policiesClient = PoliciesClient.create()) {

      // Each deny policy is attached to an organization, folder, or project.
      // To work with deny policies, specify the attachment point.
      //
      // Its format can be one of the following:
      // 1. cloudresourcemanager.googleapis.com/organizations/ORG_ID
      // 2. cloudresourcemanager.googleapis.com/folders/FOLDER_ID
      // 3. cloudresourcemanager.googleapis.com/projects/PROJECT_ID
      //
      // The attachment point is identified by its URL-encoded full resource name. Hence, replace
      // the "/" with "%2F".
      String attachmentPoint =
          String.format("cloudresourcemanager.googleapis.com/projects/%s", projectId)
              .replaceAll("/", "%2F");

      // Construct the full path of the resource to which the policy is attached to.
      // Its format is: "policies/{attachmentPoint}/denypolicies/{policyId}"
      String policyParent =
          String.format("policies/%s/denypolicies/%s", attachmentPoint, policyId);

      // Specify the policyParent and execute the GetPolicy request.
      GetPolicyRequest getPolicyRequest =
          GetPolicyRequest.newBuilder()
              .setName(policyParent)
              .build();

      Policy policy = policiesClient.getPolicy(getPolicyRequest);
      System.out.printf("Retrieved the deny policy: %s : %s%n", policyId, policy);
    }
  }
}
