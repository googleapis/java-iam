/*
 * Copyright 2020 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/iam/v2beta/policy.proto

package com.google.iam.v2beta;

public final class PolicyProto {
  private PolicyProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_iam_v2beta_Policy_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_iam_v2beta_Policy_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_iam_v2beta_Policy_AnnotationsEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_iam_v2beta_Policy_AnnotationsEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_iam_v2beta_PolicyRule_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_iam_v2beta_PolicyRule_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_iam_v2beta_ListPoliciesRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_iam_v2beta_ListPoliciesRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_iam_v2beta_ListPoliciesResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_iam_v2beta_ListPoliciesResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_iam_v2beta_GetPolicyRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_iam_v2beta_GetPolicyRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_iam_v2beta_CreatePolicyRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_iam_v2beta_CreatePolicyRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_iam_v2beta_UpdatePolicyRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_iam_v2beta_UpdatePolicyRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_iam_v2beta_DeletePolicyRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_iam_v2beta_DeletePolicyRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_iam_v2beta_PolicyOperationMetadata_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_iam_v2beta_PolicyOperationMetadata_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n\036google/iam/v2beta/policy.proto\022\021google"
          + ".iam.v2beta\032\034google/api/annotations.prot"
          + "o\032\027google/api/client.proto\032\037google/api/f"
          + "ield_behavior.proto\032\034google/iam/v2beta/d"
          + "eny.proto\032#google/longrunning/operations"
          + ".proto\032\037google/protobuf/timestamp.proto\""
          + "\251\003\n\006Policy\022\021\n\004name\030\001 \001(\tB\003\340A\005\022\020\n\003uid\030\002 \001"
          + "(\tB\003\340A\005\022\021\n\004kind\030\003 \001(\tB\003\340A\003\022\024\n\014display_na"
          + "me\030\004 \001(\t\022?\n\013annotations\030\005 \003(\0132*.google.i"
          + "am.v2beta.Policy.AnnotationsEntry\022\014\n\004eta"
          + "g\030\006 \001(\t\0224\n\013create_time\030\007 \001(\0132\032.google.pr"
          + "otobuf.TimestampB\003\340A\003\0224\n\013update_time\030\010 \001"
          + "(\0132\032.google.protobuf.TimestampB\003\340A\003\0224\n\013d"
          + "elete_time\030\t \001(\0132\032.google.protobuf.Times"
          + "tampB\003\340A\003\022,\n\005rules\030\n \003(\0132\035.google.iam.v2"
          + "beta.PolicyRule\0322\n\020AnnotationsEntry\022\013\n\003k"
          + "ey\030\001 \001(\t\022\r\n\005value\030\002 \001(\t:\0028\001\"[\n\nPolicyRul"
          + "e\0220\n\tdeny_rule\030\002 \001(\0132\033.google.iam.v2beta"
          + ".DenyRuleH\000\022\023\n\013description\030\001 \001(\tB\006\n\004kind"
          + "\"Q\n\023ListPoliciesRequest\022\023\n\006parent\030\001 \001(\tB"
          + "\003\340A\002\022\021\n\tpage_size\030\002 \001(\005\022\022\n\npage_token\030\003 "
          + "\001(\t\"\\\n\024ListPoliciesResponse\022+\n\010policies\030"
          + "\001 \003(\0132\031.google.iam.v2beta.Policy\022\027\n\017next"
          + "_page_token\030\002 \001(\t\"%\n\020GetPolicyRequest\022\021\n"
          + "\004name\030\001 \001(\tB\003\340A\002\"m\n\023CreatePolicyRequest\022"
          + "\023\n\006parent\030\001 \001(\tB\003\340A\002\022.\n\006policy\030\002 \001(\0132\031.g"
          + "oogle.iam.v2beta.PolicyB\003\340A\002\022\021\n\tpolicy_i"
          + "d\030\003 \001(\t\"E\n\023UpdatePolicyRequest\022.\n\006policy"
          + "\030\001 \001(\0132\031.google.iam.v2beta.PolicyB\003\340A\002\";"
          + "\n\023DeletePolicyRequest\022\021\n\004name\030\001 \001(\tB\003\340A\002"
          + "\022\021\n\004etag\030\002 \001(\tB\003\340A\001\"J\n\027PolicyOperationMe"
          + "tadata\022/\n\013create_time\030\001 \001(\0132\032.google.pro"
          + "tobuf.Timestamp2\200\007\n\010Policies\022\217\001\n\014ListPol"
          + "icies\022&.google.iam.v2beta.ListPoliciesRe"
          + "quest\032\'.google.iam.v2beta.ListPoliciesRe"
          + "sponse\".\202\323\344\223\002\037\022\035/v2beta/{parent=policies"
          + "/*/*}\332A\006parent\022y\n\tGetPolicy\022#.google.iam"
          + ".v2beta.GetPolicyRequest\032\031.google.iam.v2"
          + "beta.Policy\",\202\323\344\223\002\037\022\035/v2beta/{name=polic"
          + "ies/*/*/*}\332A\004name\022\302\001\n\014CreatePolicy\022&.goo"
          + "gle.iam.v2beta.CreatePolicyRequest\032\035.goo"
          + "gle.longrunning.Operation\"k\202\323\344\223\002\'\"\035/v2be"
          + "ta/{parent=policies/*/*}:\006policy\332A\027paren"
          + "t,policy,policy_id\312A!\n\006Policy\022\027PolicyOpe"
          + "rationMetadata\022\257\001\n\014UpdatePolicy\022&.google"
          + ".iam.v2beta.UpdatePolicyRequest\032\035.google"
          + ".longrunning.Operation\"X\202\323\344\223\002.\032$/v2beta/"
          + "{policy.name=policies/*/*/*}:\006policy\312A!\n"
          + "\006Policy\022\027PolicyOperationMetadata\022\247\001\n\014Del"
          + "etePolicy\022&.google.iam.v2beta.DeletePoli"
          + "cyRequest\032\035.google.longrunning.Operation"
          + "\"P\202\323\344\223\002\037*\035/v2beta/{name=policies/*/*/*}\332"
          + "A\004name\312A!\n\006Policy\022\027PolicyOperationMetada"
          + "ta\032F\312A\022iam.googleapis.com\322A.https://www."
          + "googleapis.com/auth/cloud-platformB\220\001\n\025c"
          + "om.google.iam.v2betaB\013PolicyProtoP\001Z4goo"
          + "gle.golang.org/genproto/googleapis/iam/v"
          + "2beta;iam\252\002\027Google.Cloud.Iam.V2Beta\312\002\027Go"
          + "ogle\\Cloud\\Iam\\V2betab\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.AnnotationsProto.getDescriptor(),
              com.google.api.ClientProto.getDescriptor(),
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.iam.v2beta.DenyRuleProto.getDescriptor(),
              com.google.longrunning.OperationsProto.getDescriptor(),
              com.google.protobuf.TimestampProto.getDescriptor(),
            });
    internal_static_google_iam_v2beta_Policy_descriptor = getDescriptor().getMessageTypes().get(0);
    internal_static_google_iam_v2beta_Policy_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_iam_v2beta_Policy_descriptor,
            new java.lang.String[] {
              "Name",
              "Uid",
              "Kind",
              "DisplayName",
              "Annotations",
              "Etag",
              "CreateTime",
              "UpdateTime",
              "DeleteTime",
              "Rules",
            });
    internal_static_google_iam_v2beta_Policy_AnnotationsEntry_descriptor =
        internal_static_google_iam_v2beta_Policy_descriptor.getNestedTypes().get(0);
    internal_static_google_iam_v2beta_Policy_AnnotationsEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_iam_v2beta_Policy_AnnotationsEntry_descriptor,
            new java.lang.String[] {
              "Key", "Value",
            });
    internal_static_google_iam_v2beta_PolicyRule_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_iam_v2beta_PolicyRule_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_iam_v2beta_PolicyRule_descriptor,
            new java.lang.String[] {
              "DenyRule", "Description", "Kind",
            });
    internal_static_google_iam_v2beta_ListPoliciesRequest_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_iam_v2beta_ListPoliciesRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_iam_v2beta_ListPoliciesRequest_descriptor,
            new java.lang.String[] {
              "Parent", "PageSize", "PageToken",
            });
    internal_static_google_iam_v2beta_ListPoliciesResponse_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_google_iam_v2beta_ListPoliciesResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_iam_v2beta_ListPoliciesResponse_descriptor,
            new java.lang.String[] {
              "Policies", "NextPageToken",
            });
    internal_static_google_iam_v2beta_GetPolicyRequest_descriptor =
        getDescriptor().getMessageTypes().get(4);
    internal_static_google_iam_v2beta_GetPolicyRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_iam_v2beta_GetPolicyRequest_descriptor,
            new java.lang.String[] {
              "Name",
            });
    internal_static_google_iam_v2beta_CreatePolicyRequest_descriptor =
        getDescriptor().getMessageTypes().get(5);
    internal_static_google_iam_v2beta_CreatePolicyRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_iam_v2beta_CreatePolicyRequest_descriptor,
            new java.lang.String[] {
              "Parent", "Policy", "PolicyId",
            });
    internal_static_google_iam_v2beta_UpdatePolicyRequest_descriptor =
        getDescriptor().getMessageTypes().get(6);
    internal_static_google_iam_v2beta_UpdatePolicyRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_iam_v2beta_UpdatePolicyRequest_descriptor,
            new java.lang.String[] {
              "Policy",
            });
    internal_static_google_iam_v2beta_DeletePolicyRequest_descriptor =
        getDescriptor().getMessageTypes().get(7);
    internal_static_google_iam_v2beta_DeletePolicyRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_iam_v2beta_DeletePolicyRequest_descriptor,
            new java.lang.String[] {
              "Name", "Etag",
            });
    internal_static_google_iam_v2beta_PolicyOperationMetadata_descriptor =
        getDescriptor().getMessageTypes().get(8);
    internal_static_google_iam_v2beta_PolicyOperationMetadata_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_iam_v2beta_PolicyOperationMetadata_descriptor,
            new java.lang.String[] {
              "CreateTime",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.ClientProto.defaultHost);
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.AnnotationsProto.http);
    registry.add(com.google.api.ClientProto.methodSignature);
    registry.add(com.google.api.ClientProto.oauthScopes);
    registry.add(com.google.longrunning.OperationsProto.operationInfo);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.iam.v2beta.DenyRuleProto.getDescriptor();
    com.google.longrunning.OperationsProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
