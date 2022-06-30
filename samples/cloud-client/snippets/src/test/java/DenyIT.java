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

import static com.google.common.truth.Truth.assertThat;
import static com.google.common.truth.Truth.assertWithMessage;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeoutException;
import org.junit.Test;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class DenyIT {


  private static final String PROJECT_ID = System.getenv("GOOGLE_CLOUD_PROJECT");
  private static String POLICY_NAME;

  private ByteArrayOutputStream stdOut;

  // Check if the required environment variables are set.
  public static void requireEnvVar(String envVarName) {
    assertWithMessage(String.format("Missing environment variable '%s' ", envVarName))
        .that(System.getenv(envVarName)).isNotEmpty();
  }

  @BeforeAll
  public static void setUp()
      throws IOException, InterruptedException, ExecutionException, TimeoutException {
    final PrintStream out = System.out;
    ByteArrayOutputStream stdOut = new ByteArrayOutputStream();
    System.setOut(new PrintStream(stdOut));
    requireEnvVar("GOOGLE_APPLICATION_CREDENTIALS");
    requireEnvVar("GOOGLE_CLOUD_PROJECT");

    POLICY_NAME = "limit-project-deletion";

    CreateDenyPolicy.createDenyPolicy(PROJECT_ID, POLICY_NAME);
    assertThat(stdOut.toString()).contains("Successfully created the policy:");

    stdOut.close();
    System.setOut(out);
  }


  @AfterAll
  public static void cleanup()
      throws IOException, InterruptedException, ExecutionException, TimeoutException {
    final PrintStream out = System.out;
    ByteArrayOutputStream stdOut = new ByteArrayOutputStream();
    System.setOut(new PrintStream(stdOut));
    requireEnvVar("GOOGLE_APPLICATION_CREDENTIALS");
    requireEnvVar("GOOGLE_CLOUD_PROJECT");

    DeleteDenyPolicy.deleteDenyPolicy(PROJECT_ID, POLICY_NAME);
    assertThat(stdOut.toString()).contains("Successfully deleted the policy:");

    stdOut.close();
    System.setOut(out);
  }

  @BeforeEach
  public void beforeEach() {
    stdOut = new ByteArrayOutputStream();
    System.setOut(new PrintStream(stdOut));
  }

  @AfterEach
  public void afterEach() {
    stdOut = null;
    System.setOut(null);
  }

  @Test
  public void testListDenyPolicies() throws IOException {
    ListDenyPolicies.listDenyPolicies(PROJECT_ID);
    assertThat(stdOut.toString()).contains("Listed all deny policies in the project");
  }

  @Test
  public void testGetDenyPolicy() throws IOException {
    GetDenyPolicy.getDenyPolicy(PROJECT_ID, POLICY_NAME);
    assertThat(stdOut.toString()).contains("Successfully retrieved the policy: ");
    assertThat(stdOut.toString()).contains(POLICY_NAME);
  }

  @Test
  public void testUpdateDenyPolicy()
      throws IOException, ExecutionException, InterruptedException, TimeoutException {
    UpdateDenyPolicy.updateDenyPolicy(PROJECT_ID, POLICY_NAME);
    assertThat(stdOut.toString()).contains("Updated the policy name");
  }

}
