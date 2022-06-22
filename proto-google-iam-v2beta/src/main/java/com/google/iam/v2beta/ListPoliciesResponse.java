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

/**
 *
 *
 * <pre>
 * Response message for `ListPolicies`.
 * </pre>
 *
 * Protobuf type {@code google.iam.v2beta.ListPoliciesResponse}
 */
public final class ListPoliciesResponse extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.iam.v2beta.ListPoliciesResponse)
    ListPoliciesResponseOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use ListPoliciesResponse.newBuilder() to construct.
  private ListPoliciesResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private ListPoliciesResponse() {
    policies_ = java.util.Collections.emptyList();
    nextPageToken_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new ListPoliciesResponse();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private ListPoliciesResponse(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 10:
            {
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                policies_ = new java.util.ArrayList<com.google.iam.v2beta.Policy>();
                mutable_bitField0_ |= 0x00000001;
              }
              policies_.add(
                  input.readMessage(com.google.iam.v2beta.Policy.parser(), extensionRegistry));
              break;
            }
          case 18:
            {
              java.lang.String s = input.readStringRequireUtf8();

              nextPageToken_ = s;
              break;
            }
          default:
            {
              if (!parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (com.google.protobuf.UninitializedMessageException e) {
      throw e.asInvalidProtocolBufferException().setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(e).setUnfinishedMessage(this);
    } finally {
      if (((mutable_bitField0_ & 0x00000001) != 0)) {
        policies_ = java.util.Collections.unmodifiableList(policies_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.iam.v2beta.PolicyProto
        .internal_static_google_iam_v2beta_ListPoliciesResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.iam.v2beta.PolicyProto
        .internal_static_google_iam_v2beta_ListPoliciesResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.iam.v2beta.ListPoliciesResponse.class,
            com.google.iam.v2beta.ListPoliciesResponse.Builder.class);
  }

  public static final int POLICIES_FIELD_NUMBER = 1;
  private java.util.List<com.google.iam.v2beta.Policy> policies_;
  /**
   *
   *
   * <pre>
   * Metadata for the policies that are attached to the resource.
   * </pre>
   *
   * <code>repeated .google.iam.v2beta.Policy policies = 1;</code>
   */
  @java.lang.Override
  public java.util.List<com.google.iam.v2beta.Policy> getPoliciesList() {
    return policies_;
  }
  /**
   *
   *
   * <pre>
   * Metadata for the policies that are attached to the resource.
   * </pre>
   *
   * <code>repeated .google.iam.v2beta.Policy policies = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.google.iam.v2beta.PolicyOrBuilder>
      getPoliciesOrBuilderList() {
    return policies_;
  }
  /**
   *
   *
   * <pre>
   * Metadata for the policies that are attached to the resource.
   * </pre>
   *
   * <code>repeated .google.iam.v2beta.Policy policies = 1;</code>
   */
  @java.lang.Override
  public int getPoliciesCount() {
    return policies_.size();
  }
  /**
   *
   *
   * <pre>
   * Metadata for the policies that are attached to the resource.
   * </pre>
   *
   * <code>repeated .google.iam.v2beta.Policy policies = 1;</code>
   */
  @java.lang.Override
  public com.google.iam.v2beta.Policy getPolicies(int index) {
    return policies_.get(index);
  }
  /**
   *
   *
   * <pre>
   * Metadata for the policies that are attached to the resource.
   * </pre>
   *
   * <code>repeated .google.iam.v2beta.Policy policies = 1;</code>
   */
  @java.lang.Override
  public com.google.iam.v2beta.PolicyOrBuilder getPoliciesOrBuilder(int index) {
    return policies_.get(index);
  }

  public static final int NEXT_PAGE_TOKEN_FIELD_NUMBER = 2;
  private volatile java.lang.Object nextPageToken_;
  /**
   *
   *
   * <pre>
   * A page token that you can use in a [ListPoliciesRequest][google.iam.v2beta.ListPoliciesRequest] to retrieve the
   * next page. If this field is omitted, there are no additional pages.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   *
   * @return The nextPageToken.
   */
  @java.lang.Override
  public java.lang.String getNextPageToken() {
    java.lang.Object ref = nextPageToken_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      nextPageToken_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * A page token that you can use in a [ListPoliciesRequest][google.iam.v2beta.ListPoliciesRequest] to retrieve the
   * next page. If this field is omitted, there are no additional pages.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   *
   * @return The bytes for nextPageToken.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getNextPageTokenBytes() {
    java.lang.Object ref = nextPageToken_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      nextPageToken_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  private byte memoizedIsInitialized = -1;

  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
    for (int i = 0; i < policies_.size(); i++) {
      output.writeMessage(1, policies_.get(i));
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(nextPageToken_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, nextPageToken_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < policies_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, policies_.get(i));
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(nextPageToken_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, nextPageToken_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
      return true;
    }
    if (!(obj instanceof com.google.iam.v2beta.ListPoliciesResponse)) {
      return super.equals(obj);
    }
    com.google.iam.v2beta.ListPoliciesResponse other =
        (com.google.iam.v2beta.ListPoliciesResponse) obj;

    if (!getPoliciesList().equals(other.getPoliciesList())) return false;
    if (!getNextPageToken().equals(other.getNextPageToken())) return false;
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (getPoliciesCount() > 0) {
      hash = (37 * hash) + POLICIES_FIELD_NUMBER;
      hash = (53 * hash) + getPoliciesList().hashCode();
    }
    hash = (37 * hash) + NEXT_PAGE_TOKEN_FIELD_NUMBER;
    hash = (53 * hash) + getNextPageToken().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.iam.v2beta.ListPoliciesResponse parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.iam.v2beta.ListPoliciesResponse parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.iam.v2beta.ListPoliciesResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.iam.v2beta.ListPoliciesResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.iam.v2beta.ListPoliciesResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.iam.v2beta.ListPoliciesResponse parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.iam.v2beta.ListPoliciesResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.iam.v2beta.ListPoliciesResponse parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.iam.v2beta.ListPoliciesResponse parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.iam.v2beta.ListPoliciesResponse parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.iam.v2beta.ListPoliciesResponse parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.iam.v2beta.ListPoliciesResponse parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() {
    return newBuilder();
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }

  public static Builder newBuilder(com.google.iam.v2beta.ListPoliciesResponse prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }

  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   *
   *
   * <pre>
   * Response message for `ListPolicies`.
   * </pre>
   *
   * Protobuf type {@code google.iam.v2beta.ListPoliciesResponse}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.iam.v2beta.ListPoliciesResponse)
      com.google.iam.v2beta.ListPoliciesResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.iam.v2beta.PolicyProto
          .internal_static_google_iam_v2beta_ListPoliciesResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.iam.v2beta.PolicyProto
          .internal_static_google_iam_v2beta_ListPoliciesResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.iam.v2beta.ListPoliciesResponse.class,
              com.google.iam.v2beta.ListPoliciesResponse.Builder.class);
    }

    // Construct using com.google.iam.v2beta.ListPoliciesResponse.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {
        getPoliciesFieldBuilder();
      }
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (policiesBuilder_ == null) {
        policies_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        policiesBuilder_.clear();
      }
      nextPageToken_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.iam.v2beta.PolicyProto
          .internal_static_google_iam_v2beta_ListPoliciesResponse_descriptor;
    }

    @java.lang.Override
    public com.google.iam.v2beta.ListPoliciesResponse getDefaultInstanceForType() {
      return com.google.iam.v2beta.ListPoliciesResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.iam.v2beta.ListPoliciesResponse build() {
      com.google.iam.v2beta.ListPoliciesResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.iam.v2beta.ListPoliciesResponse buildPartial() {
      com.google.iam.v2beta.ListPoliciesResponse result =
          new com.google.iam.v2beta.ListPoliciesResponse(this);
      int from_bitField0_ = bitField0_;
      if (policiesBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          policies_ = java.util.Collections.unmodifiableList(policies_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.policies_ = policies_;
      } else {
        result.policies_ = policiesBuilder_.build();
      }
      result.nextPageToken_ = nextPageToken_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }

    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.setField(field, value);
    }

    @java.lang.Override
    public Builder clearField(com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }

    @java.lang.Override
    public Builder clearOneof(com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }

    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }

    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.iam.v2beta.ListPoliciesResponse) {
        return mergeFrom((com.google.iam.v2beta.ListPoliciesResponse) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.iam.v2beta.ListPoliciesResponse other) {
      if (other == com.google.iam.v2beta.ListPoliciesResponse.getDefaultInstance()) return this;
      if (policiesBuilder_ == null) {
        if (!other.policies_.isEmpty()) {
          if (policies_.isEmpty()) {
            policies_ = other.policies_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensurePoliciesIsMutable();
            policies_.addAll(other.policies_);
          }
          onChanged();
        }
      } else {
        if (!other.policies_.isEmpty()) {
          if (policiesBuilder_.isEmpty()) {
            policiesBuilder_.dispose();
            policiesBuilder_ = null;
            policies_ = other.policies_;
            bitField0_ = (bitField0_ & ~0x00000001);
            policiesBuilder_ =
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders
                    ? getPoliciesFieldBuilder()
                    : null;
          } else {
            policiesBuilder_.addAllMessages(other.policies_);
          }
        }
      }
      if (!other.getNextPageToken().isEmpty()) {
        nextPageToken_ = other.nextPageToken_;
        onChanged();
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.google.iam.v2beta.ListPoliciesResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.iam.v2beta.ListPoliciesResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int bitField0_;

    private java.util.List<com.google.iam.v2beta.Policy> policies_ =
        java.util.Collections.emptyList();

    private void ensurePoliciesIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        policies_ = new java.util.ArrayList<com.google.iam.v2beta.Policy>(policies_);
        bitField0_ |= 0x00000001;
      }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.iam.v2beta.Policy,
            com.google.iam.v2beta.Policy.Builder,
            com.google.iam.v2beta.PolicyOrBuilder>
        policiesBuilder_;

    /**
     *
     *
     * <pre>
     * Metadata for the policies that are attached to the resource.
     * </pre>
     *
     * <code>repeated .google.iam.v2beta.Policy policies = 1;</code>
     */
    public java.util.List<com.google.iam.v2beta.Policy> getPoliciesList() {
      if (policiesBuilder_ == null) {
        return java.util.Collections.unmodifiableList(policies_);
      } else {
        return policiesBuilder_.getMessageList();
      }
    }
    /**
     *
     *
     * <pre>
     * Metadata for the policies that are attached to the resource.
     * </pre>
     *
     * <code>repeated .google.iam.v2beta.Policy policies = 1;</code>
     */
    public int getPoliciesCount() {
      if (policiesBuilder_ == null) {
        return policies_.size();
      } else {
        return policiesBuilder_.getCount();
      }
    }
    /**
     *
     *
     * <pre>
     * Metadata for the policies that are attached to the resource.
     * </pre>
     *
     * <code>repeated .google.iam.v2beta.Policy policies = 1;</code>
     */
    public com.google.iam.v2beta.Policy getPolicies(int index) {
      if (policiesBuilder_ == null) {
        return policies_.get(index);
      } else {
        return policiesBuilder_.getMessage(index);
      }
    }
    /**
     *
     *
     * <pre>
     * Metadata for the policies that are attached to the resource.
     * </pre>
     *
     * <code>repeated .google.iam.v2beta.Policy policies = 1;</code>
     */
    public Builder setPolicies(int index, com.google.iam.v2beta.Policy value) {
      if (policiesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensurePoliciesIsMutable();
        policies_.set(index, value);
        onChanged();
      } else {
        policiesBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Metadata for the policies that are attached to the resource.
     * </pre>
     *
     * <code>repeated .google.iam.v2beta.Policy policies = 1;</code>
     */
    public Builder setPolicies(int index, com.google.iam.v2beta.Policy.Builder builderForValue) {
      if (policiesBuilder_ == null) {
        ensurePoliciesIsMutable();
        policies_.set(index, builderForValue.build());
        onChanged();
      } else {
        policiesBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Metadata for the policies that are attached to the resource.
     * </pre>
     *
     * <code>repeated .google.iam.v2beta.Policy policies = 1;</code>
     */
    public Builder addPolicies(com.google.iam.v2beta.Policy value) {
      if (policiesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensurePoliciesIsMutable();
        policies_.add(value);
        onChanged();
      } else {
        policiesBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Metadata for the policies that are attached to the resource.
     * </pre>
     *
     * <code>repeated .google.iam.v2beta.Policy policies = 1;</code>
     */
    public Builder addPolicies(int index, com.google.iam.v2beta.Policy value) {
      if (policiesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensurePoliciesIsMutable();
        policies_.add(index, value);
        onChanged();
      } else {
        policiesBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Metadata for the policies that are attached to the resource.
     * </pre>
     *
     * <code>repeated .google.iam.v2beta.Policy policies = 1;</code>
     */
    public Builder addPolicies(com.google.iam.v2beta.Policy.Builder builderForValue) {
      if (policiesBuilder_ == null) {
        ensurePoliciesIsMutable();
        policies_.add(builderForValue.build());
        onChanged();
      } else {
        policiesBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Metadata for the policies that are attached to the resource.
     * </pre>
     *
     * <code>repeated .google.iam.v2beta.Policy policies = 1;</code>
     */
    public Builder addPolicies(int index, com.google.iam.v2beta.Policy.Builder builderForValue) {
      if (policiesBuilder_ == null) {
        ensurePoliciesIsMutable();
        policies_.add(index, builderForValue.build());
        onChanged();
      } else {
        policiesBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Metadata for the policies that are attached to the resource.
     * </pre>
     *
     * <code>repeated .google.iam.v2beta.Policy policies = 1;</code>
     */
    public Builder addAllPolicies(
        java.lang.Iterable<? extends com.google.iam.v2beta.Policy> values) {
      if (policiesBuilder_ == null) {
        ensurePoliciesIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(values, policies_);
        onChanged();
      } else {
        policiesBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Metadata for the policies that are attached to the resource.
     * </pre>
     *
     * <code>repeated .google.iam.v2beta.Policy policies = 1;</code>
     */
    public Builder clearPolicies() {
      if (policiesBuilder_ == null) {
        policies_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        policiesBuilder_.clear();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Metadata for the policies that are attached to the resource.
     * </pre>
     *
     * <code>repeated .google.iam.v2beta.Policy policies = 1;</code>
     */
    public Builder removePolicies(int index) {
      if (policiesBuilder_ == null) {
        ensurePoliciesIsMutable();
        policies_.remove(index);
        onChanged();
      } else {
        policiesBuilder_.remove(index);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Metadata for the policies that are attached to the resource.
     * </pre>
     *
     * <code>repeated .google.iam.v2beta.Policy policies = 1;</code>
     */
    public com.google.iam.v2beta.Policy.Builder getPoliciesBuilder(int index) {
      return getPoliciesFieldBuilder().getBuilder(index);
    }
    /**
     *
     *
     * <pre>
     * Metadata for the policies that are attached to the resource.
     * </pre>
     *
     * <code>repeated .google.iam.v2beta.Policy policies = 1;</code>
     */
    public com.google.iam.v2beta.PolicyOrBuilder getPoliciesOrBuilder(int index) {
      if (policiesBuilder_ == null) {
        return policies_.get(index);
      } else {
        return policiesBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     *
     *
     * <pre>
     * Metadata for the policies that are attached to the resource.
     * </pre>
     *
     * <code>repeated .google.iam.v2beta.Policy policies = 1;</code>
     */
    public java.util.List<? extends com.google.iam.v2beta.PolicyOrBuilder>
        getPoliciesOrBuilderList() {
      if (policiesBuilder_ != null) {
        return policiesBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(policies_);
      }
    }
    /**
     *
     *
     * <pre>
     * Metadata for the policies that are attached to the resource.
     * </pre>
     *
     * <code>repeated .google.iam.v2beta.Policy policies = 1;</code>
     */
    public com.google.iam.v2beta.Policy.Builder addPoliciesBuilder() {
      return getPoliciesFieldBuilder()
          .addBuilder(com.google.iam.v2beta.Policy.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * Metadata for the policies that are attached to the resource.
     * </pre>
     *
     * <code>repeated .google.iam.v2beta.Policy policies = 1;</code>
     */
    public com.google.iam.v2beta.Policy.Builder addPoliciesBuilder(int index) {
      return getPoliciesFieldBuilder()
          .addBuilder(index, com.google.iam.v2beta.Policy.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * Metadata for the policies that are attached to the resource.
     * </pre>
     *
     * <code>repeated .google.iam.v2beta.Policy policies = 1;</code>
     */
    public java.util.List<com.google.iam.v2beta.Policy.Builder> getPoliciesBuilderList() {
      return getPoliciesFieldBuilder().getBuilderList();
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.iam.v2beta.Policy,
            com.google.iam.v2beta.Policy.Builder,
            com.google.iam.v2beta.PolicyOrBuilder>
        getPoliciesFieldBuilder() {
      if (policiesBuilder_ == null) {
        policiesBuilder_ =
            new com.google.protobuf.RepeatedFieldBuilderV3<
                com.google.iam.v2beta.Policy,
                com.google.iam.v2beta.Policy.Builder,
                com.google.iam.v2beta.PolicyOrBuilder>(
                policies_, ((bitField0_ & 0x00000001) != 0), getParentForChildren(), isClean());
        policies_ = null;
      }
      return policiesBuilder_;
    }

    private java.lang.Object nextPageToken_ = "";
    /**
     *
     *
     * <pre>
     * A page token that you can use in a [ListPoliciesRequest][google.iam.v2beta.ListPoliciesRequest] to retrieve the
     * next page. If this field is omitted, there are no additional pages.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     *
     * @return The nextPageToken.
     */
    public java.lang.String getNextPageToken() {
      java.lang.Object ref = nextPageToken_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        nextPageToken_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * A page token that you can use in a [ListPoliciesRequest][google.iam.v2beta.ListPoliciesRequest] to retrieve the
     * next page. If this field is omitted, there are no additional pages.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     *
     * @return The bytes for nextPageToken.
     */
    public com.google.protobuf.ByteString getNextPageTokenBytes() {
      java.lang.Object ref = nextPageToken_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        nextPageToken_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * A page token that you can use in a [ListPoliciesRequest][google.iam.v2beta.ListPoliciesRequest] to retrieve the
     * next page. If this field is omitted, there are no additional pages.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     *
     * @param value The nextPageToken to set.
     * @return This builder for chaining.
     */
    public Builder setNextPageToken(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      nextPageToken_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * A page token that you can use in a [ListPoliciesRequest][google.iam.v2beta.ListPoliciesRequest] to retrieve the
     * next page. If this field is omitted, there are no additional pages.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearNextPageToken() {

      nextPageToken_ = getDefaultInstance().getNextPageToken();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * A page token that you can use in a [ListPoliciesRequest][google.iam.v2beta.ListPoliciesRequest] to retrieve the
     * next page. If this field is omitted, there are no additional pages.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     *
     * @param value The bytes for nextPageToken to set.
     * @return This builder for chaining.
     */
    public Builder setNextPageTokenBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      nextPageToken_ = value;
      onChanged();
      return this;
    }

    @java.lang.Override
    public final Builder setUnknownFields(final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }

    // @@protoc_insertion_point(builder_scope:google.iam.v2beta.ListPoliciesResponse)
  }

  // @@protoc_insertion_point(class_scope:google.iam.v2beta.ListPoliciesResponse)
  private static final com.google.iam.v2beta.ListPoliciesResponse DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.iam.v2beta.ListPoliciesResponse();
  }

  public static com.google.iam.v2beta.ListPoliciesResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ListPoliciesResponse> PARSER =
      new com.google.protobuf.AbstractParser<ListPoliciesResponse>() {
        @java.lang.Override
        public ListPoliciesResponse parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new ListPoliciesResponse(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<ListPoliciesResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ListPoliciesResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.iam.v2beta.ListPoliciesResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
