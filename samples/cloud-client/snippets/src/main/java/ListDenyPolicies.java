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

import com.google.iam.v2beta.PoliciesClient;
import com.google.iam.v2beta.Policy;
import java.io.IOException;

public class ListDenyPolicies {

  public static void main(String[] args) throws IOException {
    // TODO(developer): Replace these variables before running the sample.
    // ID or number of the Google Cloud project you want to use.
    String projectId = "your-google-cloud-project-id";

    listDenyPolicies(projectId);
  }

  public static void listDenyPolicies(String projectId) throws IOException {
    // Initialize the IAM service.
    try (PoliciesClient policiesClient = PoliciesClient.create()) {
      String attachmentPoint =
          String.format("cloudresourcemanager.googleapis.com/projects/%s", projectId)
              .replaceAll("/", "%2F");

      String policyParent = String.format("policies/%s/denypolicies", attachmentPoint);

      for (Policy policy : policiesClient.listPolicies(policyParent).iterateAll()) {
        System.out.println(policy.getName());
      }
      System.out.println("Listed all deny policies in the project");
    }
  }
}
