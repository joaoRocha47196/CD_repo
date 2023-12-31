// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: CN2223TFService.proto

package cn2223tf;

/**
 * Protobuf type {@code cn2223tf.LandmarksResponse}
 */
public  final class LandmarksResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:cn2223tf.LandmarksResponse)
    LandmarksResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use LandmarksResponse.newBuilder() to construct.
  private LandmarksResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private LandmarksResponse() {
    landmark_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new LandmarksResponse();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private LandmarksResponse(
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
          case 10: {
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              landmark_ = new java.util.ArrayList<cn2223tf.Landmark>();
              mutable_bitField0_ |= 0x00000001;
            }
            landmark_.add(
                input.readMessage(cn2223tf.Landmark.parser(), extensionRegistry));
            break;
          }
          default: {
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      if (((mutable_bitField0_ & 0x00000001) != 0)) {
        landmark_ = java.util.Collections.unmodifiableList(landmark_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return cn2223tf.CN2223TFServiceOuterClass.internal_static_cn2223tf_LandmarksResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return cn2223tf.CN2223TFServiceOuterClass.internal_static_cn2223tf_LandmarksResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            cn2223tf.LandmarksResponse.class, cn2223tf.LandmarksResponse.Builder.class);
  }

  public static final int LANDMARK_FIELD_NUMBER = 1;
  private java.util.List<cn2223tf.Landmark> landmark_;
  /**
   * <code>repeated .cn2223tf.Landmark landmark = 1;</code>
   */
  public java.util.List<cn2223tf.Landmark> getLandmarkList() {
    return landmark_;
  }
  /**
   * <code>repeated .cn2223tf.Landmark landmark = 1;</code>
   */
  public java.util.List<? extends cn2223tf.LandmarkOrBuilder> 
      getLandmarkOrBuilderList() {
    return landmark_;
  }
  /**
   * <code>repeated .cn2223tf.Landmark landmark = 1;</code>
   */
  public int getLandmarkCount() {
    return landmark_.size();
  }
  /**
   * <code>repeated .cn2223tf.Landmark landmark = 1;</code>
   */
  public cn2223tf.Landmark getLandmark(int index) {
    return landmark_.get(index);
  }
  /**
   * <code>repeated .cn2223tf.Landmark landmark = 1;</code>
   */
  public cn2223tf.LandmarkOrBuilder getLandmarkOrBuilder(
      int index) {
    return landmark_.get(index);
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
    for (int i = 0; i < landmark_.size(); i++) {
      output.writeMessage(1, landmark_.get(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < landmark_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, landmark_.get(i));
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
    if (!(obj instanceof cn2223tf.LandmarksResponse)) {
      return super.equals(obj);
    }
    cn2223tf.LandmarksResponse other = (cn2223tf.LandmarksResponse) obj;

    if (!getLandmarkList()
        .equals(other.getLandmarkList())) return false;
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
    if (getLandmarkCount() > 0) {
      hash = (37 * hash) + LANDMARK_FIELD_NUMBER;
      hash = (53 * hash) + getLandmarkList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static cn2223tf.LandmarksResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static cn2223tf.LandmarksResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static cn2223tf.LandmarksResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static cn2223tf.LandmarksResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static cn2223tf.LandmarksResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static cn2223tf.LandmarksResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static cn2223tf.LandmarksResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static cn2223tf.LandmarksResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static cn2223tf.LandmarksResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static cn2223tf.LandmarksResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static cn2223tf.LandmarksResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static cn2223tf.LandmarksResponse parseFrom(
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
  public static Builder newBuilder(cn2223tf.LandmarksResponse prototype) {
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
   * Protobuf type {@code cn2223tf.LandmarksResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:cn2223tf.LandmarksResponse)
      cn2223tf.LandmarksResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return cn2223tf.CN2223TFServiceOuterClass.internal_static_cn2223tf_LandmarksResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return cn2223tf.CN2223TFServiceOuterClass.internal_static_cn2223tf_LandmarksResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              cn2223tf.LandmarksResponse.class, cn2223tf.LandmarksResponse.Builder.class);
    }

    // Construct using cn2223tf.LandmarksResponse.newBuilder()
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
        getLandmarkFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (landmarkBuilder_ == null) {
        landmark_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        landmarkBuilder_.clear();
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return cn2223tf.CN2223TFServiceOuterClass.internal_static_cn2223tf_LandmarksResponse_descriptor;
    }

    @java.lang.Override
    public cn2223tf.LandmarksResponse getDefaultInstanceForType() {
      return cn2223tf.LandmarksResponse.getDefaultInstance();
    }

    @java.lang.Override
    public cn2223tf.LandmarksResponse build() {
      cn2223tf.LandmarksResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public cn2223tf.LandmarksResponse buildPartial() {
      cn2223tf.LandmarksResponse result = new cn2223tf.LandmarksResponse(this);
      int from_bitField0_ = bitField0_;
      if (landmarkBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          landmark_ = java.util.Collections.unmodifiableList(landmark_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.landmark_ = landmark_;
      } else {
        result.landmark_ = landmarkBuilder_.build();
      }
      onBuilt();
      return result;
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
      if (other instanceof cn2223tf.LandmarksResponse) {
        return mergeFrom((cn2223tf.LandmarksResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(cn2223tf.LandmarksResponse other) {
      if (other == cn2223tf.LandmarksResponse.getDefaultInstance()) return this;
      if (landmarkBuilder_ == null) {
        if (!other.landmark_.isEmpty()) {
          if (landmark_.isEmpty()) {
            landmark_ = other.landmark_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureLandmarkIsMutable();
            landmark_.addAll(other.landmark_);
          }
          onChanged();
        }
      } else {
        if (!other.landmark_.isEmpty()) {
          if (landmarkBuilder_.isEmpty()) {
            landmarkBuilder_.dispose();
            landmarkBuilder_ = null;
            landmark_ = other.landmark_;
            bitField0_ = (bitField0_ & ~0x00000001);
            landmarkBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getLandmarkFieldBuilder() : null;
          } else {
            landmarkBuilder_.addAllMessages(other.landmark_);
          }
        }
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
      cn2223tf.LandmarksResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (cn2223tf.LandmarksResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.util.List<cn2223tf.Landmark> landmark_ =
      java.util.Collections.emptyList();
    private void ensureLandmarkIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        landmark_ = new java.util.ArrayList<cn2223tf.Landmark>(landmark_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        cn2223tf.Landmark, cn2223tf.Landmark.Builder, cn2223tf.LandmarkOrBuilder> landmarkBuilder_;

    /**
     * <code>repeated .cn2223tf.Landmark landmark = 1;</code>
     */
    public java.util.List<cn2223tf.Landmark> getLandmarkList() {
      if (landmarkBuilder_ == null) {
        return java.util.Collections.unmodifiableList(landmark_);
      } else {
        return landmarkBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .cn2223tf.Landmark landmark = 1;</code>
     */
    public int getLandmarkCount() {
      if (landmarkBuilder_ == null) {
        return landmark_.size();
      } else {
        return landmarkBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .cn2223tf.Landmark landmark = 1;</code>
     */
    public cn2223tf.Landmark getLandmark(int index) {
      if (landmarkBuilder_ == null) {
        return landmark_.get(index);
      } else {
        return landmarkBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .cn2223tf.Landmark landmark = 1;</code>
     */
    public Builder setLandmark(
        int index, cn2223tf.Landmark value) {
      if (landmarkBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureLandmarkIsMutable();
        landmark_.set(index, value);
        onChanged();
      } else {
        landmarkBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .cn2223tf.Landmark landmark = 1;</code>
     */
    public Builder setLandmark(
        int index, cn2223tf.Landmark.Builder builderForValue) {
      if (landmarkBuilder_ == null) {
        ensureLandmarkIsMutable();
        landmark_.set(index, builderForValue.build());
        onChanged();
      } else {
        landmarkBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .cn2223tf.Landmark landmark = 1;</code>
     */
    public Builder addLandmark(cn2223tf.Landmark value) {
      if (landmarkBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureLandmarkIsMutable();
        landmark_.add(value);
        onChanged();
      } else {
        landmarkBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .cn2223tf.Landmark landmark = 1;</code>
     */
    public Builder addLandmark(
        int index, cn2223tf.Landmark value) {
      if (landmarkBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureLandmarkIsMutable();
        landmark_.add(index, value);
        onChanged();
      } else {
        landmarkBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .cn2223tf.Landmark landmark = 1;</code>
     */
    public Builder addLandmark(
        cn2223tf.Landmark.Builder builderForValue) {
      if (landmarkBuilder_ == null) {
        ensureLandmarkIsMutable();
        landmark_.add(builderForValue.build());
        onChanged();
      } else {
        landmarkBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .cn2223tf.Landmark landmark = 1;</code>
     */
    public Builder addLandmark(
        int index, cn2223tf.Landmark.Builder builderForValue) {
      if (landmarkBuilder_ == null) {
        ensureLandmarkIsMutable();
        landmark_.add(index, builderForValue.build());
        onChanged();
      } else {
        landmarkBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .cn2223tf.Landmark landmark = 1;</code>
     */
    public Builder addAllLandmark(
        java.lang.Iterable<? extends cn2223tf.Landmark> values) {
      if (landmarkBuilder_ == null) {
        ensureLandmarkIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, landmark_);
        onChanged();
      } else {
        landmarkBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .cn2223tf.Landmark landmark = 1;</code>
     */
    public Builder clearLandmark() {
      if (landmarkBuilder_ == null) {
        landmark_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        landmarkBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .cn2223tf.Landmark landmark = 1;</code>
     */
    public Builder removeLandmark(int index) {
      if (landmarkBuilder_ == null) {
        ensureLandmarkIsMutable();
        landmark_.remove(index);
        onChanged();
      } else {
        landmarkBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .cn2223tf.Landmark landmark = 1;</code>
     */
    public cn2223tf.Landmark.Builder getLandmarkBuilder(
        int index) {
      return getLandmarkFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .cn2223tf.Landmark landmark = 1;</code>
     */
    public cn2223tf.LandmarkOrBuilder getLandmarkOrBuilder(
        int index) {
      if (landmarkBuilder_ == null) {
        return landmark_.get(index);  } else {
        return landmarkBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .cn2223tf.Landmark landmark = 1;</code>
     */
    public java.util.List<? extends cn2223tf.LandmarkOrBuilder> 
         getLandmarkOrBuilderList() {
      if (landmarkBuilder_ != null) {
        return landmarkBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(landmark_);
      }
    }
    /**
     * <code>repeated .cn2223tf.Landmark landmark = 1;</code>
     */
    public cn2223tf.Landmark.Builder addLandmarkBuilder() {
      return getLandmarkFieldBuilder().addBuilder(
          cn2223tf.Landmark.getDefaultInstance());
    }
    /**
     * <code>repeated .cn2223tf.Landmark landmark = 1;</code>
     */
    public cn2223tf.Landmark.Builder addLandmarkBuilder(
        int index) {
      return getLandmarkFieldBuilder().addBuilder(
          index, cn2223tf.Landmark.getDefaultInstance());
    }
    /**
     * <code>repeated .cn2223tf.Landmark landmark = 1;</code>
     */
    public java.util.List<cn2223tf.Landmark.Builder> 
         getLandmarkBuilderList() {
      return getLandmarkFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        cn2223tf.Landmark, cn2223tf.Landmark.Builder, cn2223tf.LandmarkOrBuilder> 
        getLandmarkFieldBuilder() {
      if (landmarkBuilder_ == null) {
        landmarkBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            cn2223tf.Landmark, cn2223tf.Landmark.Builder, cn2223tf.LandmarkOrBuilder>(
                landmark_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        landmark_ = null;
      }
      return landmarkBuilder_;
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


    // @@protoc_insertion_point(builder_scope:cn2223tf.LandmarksResponse)
  }

  // @@protoc_insertion_point(class_scope:cn2223tf.LandmarksResponse)
  private static final cn2223tf.LandmarksResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new cn2223tf.LandmarksResponse();
  }

  public static cn2223tf.LandmarksResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<LandmarksResponse>
      PARSER = new com.google.protobuf.AbstractParser<LandmarksResponse>() {
    @java.lang.Override
    public LandmarksResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new LandmarksResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<LandmarksResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<LandmarksResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public cn2223tf.LandmarksResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

