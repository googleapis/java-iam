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

    // Specify the name of the Deny policy you want to retrieve.
    String policyName = "deny-policy-name";

    getDenyPolicy(projectId, policyName);
  }


  // Retrieve the Deny policy given the project id and policy name.
  public static void getDenyPolicy(String projectId, String policyName) throws IOException {
    // Create the IAM Policies client.
    try (PoliciesClient policiesClient = PoliciesClient.create()) {

      String attachmentPoint =
          String.format("cloudresourcemanager.googleapis.com/projects/%s", projectId)
              .replaceAll("/", "%2F");

      String policyParent = String.format(
          "policies/%s/denypolicies/%s", attachmentPoint, policyName);

      // Specify the policyParent and execute the Policy Get request.
      GetPolicyRequest getPolicyRequest = GetPolicyRequest.newBuilder()
          .setName(policyParent)
          .build();

      Policy policy = policiesClient.getPolicy(getPolicyRequest);
      System.out.println(policy.getName());
    }
  }

}
