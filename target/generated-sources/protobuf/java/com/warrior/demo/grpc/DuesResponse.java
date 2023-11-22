// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: dues.proto

package com.warrior.demo.grpc;

/**
 * Protobuf type {@code com.warrior.demo.grpc.DuesResponse}
 */
public final class DuesResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:com.warrior.demo.grpc.DuesResponse)
    DuesResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use DuesResponse.newBuilder() to construct.
  private DuesResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private DuesResponse() {
    duesDetail_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new DuesResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.warrior.demo.grpc.DuesProto.internal_static_com_warrior_demo_grpc_DuesResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.warrior.demo.grpc.DuesProto.internal_static_com_warrior_demo_grpc_DuesResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.warrior.demo.grpc.DuesResponse.class, com.warrior.demo.grpc.DuesResponse.Builder.class);
  }

  private int bitField0_;
  public static final int DUESDETAIL_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private java.util.List<com.warrior.demo.grpc.DuesDetail> duesDetail_;
  /**
   * <code>repeated .com.warrior.demo.grpc.DuesDetail duesDetail = 1;</code>
   */
  @java.lang.Override
  public java.util.List<com.warrior.demo.grpc.DuesDetail> getDuesDetailList() {
    return duesDetail_;
  }
  /**
   * <code>repeated .com.warrior.demo.grpc.DuesDetail duesDetail = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.warrior.demo.grpc.DuesDetailOrBuilder> 
      getDuesDetailOrBuilderList() {
    return duesDetail_;
  }
  /**
   * <code>repeated .com.warrior.demo.grpc.DuesDetail duesDetail = 1;</code>
   */
  @java.lang.Override
  public int getDuesDetailCount() {
    return duesDetail_.size();
  }
  /**
   * <code>repeated .com.warrior.demo.grpc.DuesDetail duesDetail = 1;</code>
   */
  @java.lang.Override
  public com.warrior.demo.grpc.DuesDetail getDuesDetail(int index) {
    return duesDetail_.get(index);
  }
  /**
   * <code>repeated .com.warrior.demo.grpc.DuesDetail duesDetail = 1;</code>
   */
  @java.lang.Override
  public com.warrior.demo.grpc.DuesDetailOrBuilder getDuesDetailOrBuilder(
      int index) {
    return duesDetail_.get(index);
  }

  public static final int ERROR_FIELD_NUMBER = 2;
  private com.warrior.demo.grpc.Error error_;
  /**
   * <code>.com.warrior.demo.grpc.Error error = 2;</code>
   * @return Whether the error field is set.
   */
  @java.lang.Override
  public boolean hasError() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <code>.com.warrior.demo.grpc.Error error = 2;</code>
   * @return The error.
   */
  @java.lang.Override
  public com.warrior.demo.grpc.Error getError() {
    return error_ == null ? com.warrior.demo.grpc.Error.getDefaultInstance() : error_;
  }
  /**
   * <code>.com.warrior.demo.grpc.Error error = 2;</code>
   */
  @java.lang.Override
  public com.warrior.demo.grpc.ErrorOrBuilder getErrorOrBuilder() {
    return error_ == null ? com.warrior.demo.grpc.Error.getDefaultInstance() : error_;
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
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    for (int i = 0; i < duesDetail_.size(); i++) {
      output.writeMessage(1, duesDetail_.get(i));
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      output.writeMessage(2, getError());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < duesDetail_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, duesDetail_.get(i));
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getError());
    }
    size += getUnknownFields().getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.warrior.demo.grpc.DuesResponse)) {
      return super.equals(obj);
    }
    com.warrior.demo.grpc.DuesResponse other = (com.warrior.demo.grpc.DuesResponse) obj;

    if (!getDuesDetailList()
        .equals(other.getDuesDetailList())) return false;
    if (hasError() != other.hasError()) return false;
    if (hasError()) {
      if (!getError()
          .equals(other.getError())) return false;
    }
    if (!getUnknownFields().equals(other.getUnknownFields())) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (getDuesDetailCount() > 0) {
      hash = (37 * hash) + DUESDETAIL_FIELD_NUMBER;
      hash = (53 * hash) + getDuesDetailList().hashCode();
    }
    if (hasError()) {
      hash = (37 * hash) + ERROR_FIELD_NUMBER;
      hash = (53 * hash) + getError().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.warrior.demo.grpc.DuesResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.warrior.demo.grpc.DuesResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.warrior.demo.grpc.DuesResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.warrior.demo.grpc.DuesResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.warrior.demo.grpc.DuesResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.warrior.demo.grpc.DuesResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.warrior.demo.grpc.DuesResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.warrior.demo.grpc.DuesResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.warrior.demo.grpc.DuesResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.warrior.demo.grpc.DuesResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.warrior.demo.grpc.DuesResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.warrior.demo.grpc.DuesResponse parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.warrior.demo.grpc.DuesResponse prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code com.warrior.demo.grpc.DuesResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:com.warrior.demo.grpc.DuesResponse)
      com.warrior.demo.grpc.DuesResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.warrior.demo.grpc.DuesProto.internal_static_com_warrior_demo_grpc_DuesResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.warrior.demo.grpc.DuesProto.internal_static_com_warrior_demo_grpc_DuesResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.warrior.demo.grpc.DuesResponse.class, com.warrior.demo.grpc.DuesResponse.Builder.class);
    }

    // Construct using com.warrior.demo.grpc.DuesResponse.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
        getDuesDetailFieldBuilder();
        getErrorFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      if (duesDetailBuilder_ == null) {
        duesDetail_ = java.util.Collections.emptyList();
      } else {
        duesDetail_ = null;
        duesDetailBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      error_ = null;
      if (errorBuilder_ != null) {
        errorBuilder_.dispose();
        errorBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.warrior.demo.grpc.DuesProto.internal_static_com_warrior_demo_grpc_DuesResponse_descriptor;
    }

    @java.lang.Override
    public com.warrior.demo.grpc.DuesResponse getDefaultInstanceForType() {
      return com.warrior.demo.grpc.DuesResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.warrior.demo.grpc.DuesResponse build() {
      com.warrior.demo.grpc.DuesResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.warrior.demo.grpc.DuesResponse buildPartial() {
      com.warrior.demo.grpc.DuesResponse result = new com.warrior.demo.grpc.DuesResponse(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(com.warrior.demo.grpc.DuesResponse result) {
      if (duesDetailBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          duesDetail_ = java.util.Collections.unmodifiableList(duesDetail_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.duesDetail_ = duesDetail_;
      } else {
        result.duesDetail_ = duesDetailBuilder_.build();
      }
    }

    private void buildPartial0(com.warrior.demo.grpc.DuesResponse result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.error_ = errorBuilder_ == null
            ? error_
            : errorBuilder_.build();
        to_bitField0_ |= 0x00000001;
      }
      result.bitField0_ |= to_bitField0_;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.warrior.demo.grpc.DuesResponse) {
        return mergeFrom((com.warrior.demo.grpc.DuesResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.warrior.demo.grpc.DuesResponse other) {
      if (other == com.warrior.demo.grpc.DuesResponse.getDefaultInstance()) return this;
      if (duesDetailBuilder_ == null) {
        if (!other.duesDetail_.isEmpty()) {
          if (duesDetail_.isEmpty()) {
            duesDetail_ = other.duesDetail_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureDuesDetailIsMutable();
            duesDetail_.addAll(other.duesDetail_);
          }
          onChanged();
        }
      } else {
        if (!other.duesDetail_.isEmpty()) {
          if (duesDetailBuilder_.isEmpty()) {
            duesDetailBuilder_.dispose();
            duesDetailBuilder_ = null;
            duesDetail_ = other.duesDetail_;
            bitField0_ = (bitField0_ & ~0x00000001);
            duesDetailBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getDuesDetailFieldBuilder() : null;
          } else {
            duesDetailBuilder_.addAllMessages(other.duesDetail_);
          }
        }
      }
      if (other.hasError()) {
        mergeError(other.getError());
      }
      this.mergeUnknownFields(other.getUnknownFields());
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
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 10: {
              com.warrior.demo.grpc.DuesDetail m =
                  input.readMessage(
                      com.warrior.demo.grpc.DuesDetail.parser(),
                      extensionRegistry);
              if (duesDetailBuilder_ == null) {
                ensureDuesDetailIsMutable();
                duesDetail_.add(m);
              } else {
                duesDetailBuilder_.addMessage(m);
              }
              break;
            } // case 10
            case 18: {
              input.readMessage(
                  getErrorFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            default: {
              if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                done = true; // was an endgroup tag
              }
              break;
            } // default:
          } // switch (tag)
        } // while (!done)
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.unwrapIOException();
      } finally {
        onChanged();
      } // finally
      return this;
    }
    private int bitField0_;

    private java.util.List<com.warrior.demo.grpc.DuesDetail> duesDetail_ =
      java.util.Collections.emptyList();
    private void ensureDuesDetailIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        duesDetail_ = new java.util.ArrayList<com.warrior.demo.grpc.DuesDetail>(duesDetail_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.warrior.demo.grpc.DuesDetail, com.warrior.demo.grpc.DuesDetail.Builder, com.warrior.demo.grpc.DuesDetailOrBuilder> duesDetailBuilder_;

    /**
     * <code>repeated .com.warrior.demo.grpc.DuesDetail duesDetail = 1;</code>
     */
    public java.util.List<com.warrior.demo.grpc.DuesDetail> getDuesDetailList() {
      if (duesDetailBuilder_ == null) {
        return java.util.Collections.unmodifiableList(duesDetail_);
      } else {
        return duesDetailBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .com.warrior.demo.grpc.DuesDetail duesDetail = 1;</code>
     */
    public int getDuesDetailCount() {
      if (duesDetailBuilder_ == null) {
        return duesDetail_.size();
      } else {
        return duesDetailBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .com.warrior.demo.grpc.DuesDetail duesDetail = 1;</code>
     */
    public com.warrior.demo.grpc.DuesDetail getDuesDetail(int index) {
      if (duesDetailBuilder_ == null) {
        return duesDetail_.get(index);
      } else {
        return duesDetailBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .com.warrior.demo.grpc.DuesDetail duesDetail = 1;</code>
     */
    public Builder setDuesDetail(
        int index, com.warrior.demo.grpc.DuesDetail value) {
      if (duesDetailBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureDuesDetailIsMutable();
        duesDetail_.set(index, value);
        onChanged();
      } else {
        duesDetailBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .com.warrior.demo.grpc.DuesDetail duesDetail = 1;</code>
     */
    public Builder setDuesDetail(
        int index, com.warrior.demo.grpc.DuesDetail.Builder builderForValue) {
      if (duesDetailBuilder_ == null) {
        ensureDuesDetailIsMutable();
        duesDetail_.set(index, builderForValue.build());
        onChanged();
      } else {
        duesDetailBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .com.warrior.demo.grpc.DuesDetail duesDetail = 1;</code>
     */
    public Builder addDuesDetail(com.warrior.demo.grpc.DuesDetail value) {
      if (duesDetailBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureDuesDetailIsMutable();
        duesDetail_.add(value);
        onChanged();
      } else {
        duesDetailBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .com.warrior.demo.grpc.DuesDetail duesDetail = 1;</code>
     */
    public Builder addDuesDetail(
        int index, com.warrior.demo.grpc.DuesDetail value) {
      if (duesDetailBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureDuesDetailIsMutable();
        duesDetail_.add(index, value);
        onChanged();
      } else {
        duesDetailBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .com.warrior.demo.grpc.DuesDetail duesDetail = 1;</code>
     */
    public Builder addDuesDetail(
        com.warrior.demo.grpc.DuesDetail.Builder builderForValue) {
      if (duesDetailBuilder_ == null) {
        ensureDuesDetailIsMutable();
        duesDetail_.add(builderForValue.build());
        onChanged();
      } else {
        duesDetailBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .com.warrior.demo.grpc.DuesDetail duesDetail = 1;</code>
     */
    public Builder addDuesDetail(
        int index, com.warrior.demo.grpc.DuesDetail.Builder builderForValue) {
      if (duesDetailBuilder_ == null) {
        ensureDuesDetailIsMutable();
        duesDetail_.add(index, builderForValue.build());
        onChanged();
      } else {
        duesDetailBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .com.warrior.demo.grpc.DuesDetail duesDetail = 1;</code>
     */
    public Builder addAllDuesDetail(
        java.lang.Iterable<? extends com.warrior.demo.grpc.DuesDetail> values) {
      if (duesDetailBuilder_ == null) {
        ensureDuesDetailIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, duesDetail_);
        onChanged();
      } else {
        duesDetailBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .com.warrior.demo.grpc.DuesDetail duesDetail = 1;</code>
     */
    public Builder clearDuesDetail() {
      if (duesDetailBuilder_ == null) {
        duesDetail_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        duesDetailBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .com.warrior.demo.grpc.DuesDetail duesDetail = 1;</code>
     */
    public Builder removeDuesDetail(int index) {
      if (duesDetailBuilder_ == null) {
        ensureDuesDetailIsMutable();
        duesDetail_.remove(index);
        onChanged();
      } else {
        duesDetailBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .com.warrior.demo.grpc.DuesDetail duesDetail = 1;</code>
     */
    public com.warrior.demo.grpc.DuesDetail.Builder getDuesDetailBuilder(
        int index) {
      return getDuesDetailFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .com.warrior.demo.grpc.DuesDetail duesDetail = 1;</code>
     */
    public com.warrior.demo.grpc.DuesDetailOrBuilder getDuesDetailOrBuilder(
        int index) {
      if (duesDetailBuilder_ == null) {
        return duesDetail_.get(index);  } else {
        return duesDetailBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .com.warrior.demo.grpc.DuesDetail duesDetail = 1;</code>
     */
    public java.util.List<? extends com.warrior.demo.grpc.DuesDetailOrBuilder> 
         getDuesDetailOrBuilderList() {
      if (duesDetailBuilder_ != null) {
        return duesDetailBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(duesDetail_);
      }
    }
    /**
     * <code>repeated .com.warrior.demo.grpc.DuesDetail duesDetail = 1;</code>
     */
    public com.warrior.demo.grpc.DuesDetail.Builder addDuesDetailBuilder() {
      return getDuesDetailFieldBuilder().addBuilder(
          com.warrior.demo.grpc.DuesDetail.getDefaultInstance());
    }
    /**
     * <code>repeated .com.warrior.demo.grpc.DuesDetail duesDetail = 1;</code>
     */
    public com.warrior.demo.grpc.DuesDetail.Builder addDuesDetailBuilder(
        int index) {
      return getDuesDetailFieldBuilder().addBuilder(
          index, com.warrior.demo.grpc.DuesDetail.getDefaultInstance());
    }
    /**
     * <code>repeated .com.warrior.demo.grpc.DuesDetail duesDetail = 1;</code>
     */
    public java.util.List<com.warrior.demo.grpc.DuesDetail.Builder> 
         getDuesDetailBuilderList() {
      return getDuesDetailFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.warrior.demo.grpc.DuesDetail, com.warrior.demo.grpc.DuesDetail.Builder, com.warrior.demo.grpc.DuesDetailOrBuilder> 
        getDuesDetailFieldBuilder() {
      if (duesDetailBuilder_ == null) {
        duesDetailBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.warrior.demo.grpc.DuesDetail, com.warrior.demo.grpc.DuesDetail.Builder, com.warrior.demo.grpc.DuesDetailOrBuilder>(
                duesDetail_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        duesDetail_ = null;
      }
      return duesDetailBuilder_;
    }

    private com.warrior.demo.grpc.Error error_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.warrior.demo.grpc.Error, com.warrior.demo.grpc.Error.Builder, com.warrior.demo.grpc.ErrorOrBuilder> errorBuilder_;
    /**
     * <code>.com.warrior.demo.grpc.Error error = 2;</code>
     * @return Whether the error field is set.
     */
    public boolean hasError() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <code>.com.warrior.demo.grpc.Error error = 2;</code>
     * @return The error.
     */
    public com.warrior.demo.grpc.Error getError() {
      if (errorBuilder_ == null) {
        return error_ == null ? com.warrior.demo.grpc.Error.getDefaultInstance() : error_;
      } else {
        return errorBuilder_.getMessage();
      }
    }
    /**
     * <code>.com.warrior.demo.grpc.Error error = 2;</code>
     */
    public Builder setError(com.warrior.demo.grpc.Error value) {
      if (errorBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        error_ = value;
      } else {
        errorBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>.com.warrior.demo.grpc.Error error = 2;</code>
     */
    public Builder setError(
        com.warrior.demo.grpc.Error.Builder builderForValue) {
      if (errorBuilder_ == null) {
        error_ = builderForValue.build();
      } else {
        errorBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>.com.warrior.demo.grpc.Error error = 2;</code>
     */
    public Builder mergeError(com.warrior.demo.grpc.Error value) {
      if (errorBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0) &&
          error_ != null &&
          error_ != com.warrior.demo.grpc.Error.getDefaultInstance()) {
          getErrorBuilder().mergeFrom(value);
        } else {
          error_ = value;
        }
      } else {
        errorBuilder_.mergeFrom(value);
      }
      if (error_ != null) {
        bitField0_ |= 0x00000002;
        onChanged();
      }
      return this;
    }
    /**
     * <code>.com.warrior.demo.grpc.Error error = 2;</code>
     */
    public Builder clearError() {
      bitField0_ = (bitField0_ & ~0x00000002);
      error_ = null;
      if (errorBuilder_ != null) {
        errorBuilder_.dispose();
        errorBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <code>.com.warrior.demo.grpc.Error error = 2;</code>
     */
    public com.warrior.demo.grpc.Error.Builder getErrorBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getErrorFieldBuilder().getBuilder();
    }
    /**
     * <code>.com.warrior.demo.grpc.Error error = 2;</code>
     */
    public com.warrior.demo.grpc.ErrorOrBuilder getErrorOrBuilder() {
      if (errorBuilder_ != null) {
        return errorBuilder_.getMessageOrBuilder();
      } else {
        return error_ == null ?
            com.warrior.demo.grpc.Error.getDefaultInstance() : error_;
      }
    }
    /**
     * <code>.com.warrior.demo.grpc.Error error = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.warrior.demo.grpc.Error, com.warrior.demo.grpc.Error.Builder, com.warrior.demo.grpc.ErrorOrBuilder> 
        getErrorFieldBuilder() {
      if (errorBuilder_ == null) {
        errorBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.warrior.demo.grpc.Error, com.warrior.demo.grpc.Error.Builder, com.warrior.demo.grpc.ErrorOrBuilder>(
                getError(),
                getParentForChildren(),
                isClean());
        error_ = null;
      }
      return errorBuilder_;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:com.warrior.demo.grpc.DuesResponse)
  }

  // @@protoc_insertion_point(class_scope:com.warrior.demo.grpc.DuesResponse)
  private static final com.warrior.demo.grpc.DuesResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.warrior.demo.grpc.DuesResponse();
  }

  public static com.warrior.demo.grpc.DuesResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<DuesResponse>
      PARSER = new com.google.protobuf.AbstractParser<DuesResponse>() {
    @java.lang.Override
    public DuesResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      Builder builder = newBuilder();
      try {
        builder.mergeFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(builder.buildPartial());
      } catch (com.google.protobuf.UninitializedMessageException e) {
        throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(e)
            .setUnfinishedMessage(builder.buildPartial());
      }
      return builder.buildPartial();
    }
  };

  public static com.google.protobuf.Parser<DuesResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<DuesResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.warrior.demo.grpc.DuesResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
