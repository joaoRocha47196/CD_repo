// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: UMService.proto

package umstubs;

/**
 * Protobuf type {@code UMService.ResumeInfo}
 */
public final class ResumeInfo extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:UMService.ResumeInfo)
    ResumeInfoOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ResumeInfo.newBuilder() to construct.
  private ResumeInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ResumeInfo() {
    exchangeName_ = "";
    fileName_ = "";
    productType_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ResumeInfo();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return umstubs.UMServiceOuterClass.internal_static_UMService_ResumeInfo_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return umstubs.UMServiceOuterClass.internal_static_UMService_ResumeInfo_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            umstubs.ResumeInfo.class, umstubs.ResumeInfo.Builder.class);
  }

  public static final int EXCHANGENAME_FIELD_NUMBER = 1;
  private volatile java.lang.Object exchangeName_;
  /**
   * <code>string exchangeName = 1;</code>
   * @return The exchangeName.
   */
  @java.lang.Override
  public java.lang.String getExchangeName() {
    java.lang.Object ref = exchangeName_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      exchangeName_ = s;
      return s;
    }
  }
  /**
   * <code>string exchangeName = 1;</code>
   * @return The bytes for exchangeName.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getExchangeNameBytes() {
    java.lang.Object ref = exchangeName_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      exchangeName_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int FILENAME_FIELD_NUMBER = 2;
  private volatile java.lang.Object fileName_;
  /**
   * <code>string fileName = 2;</code>
   * @return The fileName.
   */
  @java.lang.Override
  public java.lang.String getFileName() {
    java.lang.Object ref = fileName_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      fileName_ = s;
      return s;
    }
  }
  /**
   * <code>string fileName = 2;</code>
   * @return The bytes for fileName.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getFileNameBytes() {
    java.lang.Object ref = fileName_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      fileName_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int PRODUCTTYPE_FIELD_NUMBER = 3;
  private volatile java.lang.Object productType_;
  /**
   * <code>string productType = 3;</code>
   * @return The productType.
   */
  @java.lang.Override
  public java.lang.String getProductType() {
    java.lang.Object ref = productType_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      productType_ = s;
      return s;
    }
  }
  /**
   * <code>string productType = 3;</code>
   * @return The bytes for productType.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getProductTypeBytes() {
    java.lang.Object ref = productType_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      productType_ = b;
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
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(exchangeName_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, exchangeName_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(fileName_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, fileName_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(productType_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, productType_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(exchangeName_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, exchangeName_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(fileName_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, fileName_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(productType_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, productType_);
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
    if (!(obj instanceof umstubs.ResumeInfo)) {
      return super.equals(obj);
    }
    umstubs.ResumeInfo other = (umstubs.ResumeInfo) obj;

    if (!getExchangeName()
        .equals(other.getExchangeName())) return false;
    if (!getFileName()
        .equals(other.getFileName())) return false;
    if (!getProductType()
        .equals(other.getProductType())) return false;
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
    hash = (37 * hash) + EXCHANGENAME_FIELD_NUMBER;
    hash = (53 * hash) + getExchangeName().hashCode();
    hash = (37 * hash) + FILENAME_FIELD_NUMBER;
    hash = (53 * hash) + getFileName().hashCode();
    hash = (37 * hash) + PRODUCTTYPE_FIELD_NUMBER;
    hash = (53 * hash) + getProductType().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static umstubs.ResumeInfo parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static umstubs.ResumeInfo parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static umstubs.ResumeInfo parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static umstubs.ResumeInfo parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static umstubs.ResumeInfo parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static umstubs.ResumeInfo parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static umstubs.ResumeInfo parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static umstubs.ResumeInfo parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static umstubs.ResumeInfo parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static umstubs.ResumeInfo parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static umstubs.ResumeInfo parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static umstubs.ResumeInfo parseFrom(
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
  public static Builder newBuilder(umstubs.ResumeInfo prototype) {
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
   * Protobuf type {@code UMService.ResumeInfo}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:UMService.ResumeInfo)
      umstubs.ResumeInfoOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return umstubs.UMServiceOuterClass.internal_static_UMService_ResumeInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return umstubs.UMServiceOuterClass.internal_static_UMService_ResumeInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              umstubs.ResumeInfo.class, umstubs.ResumeInfo.Builder.class);
    }

    // Construct using umstubs.ResumeInfo.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      exchangeName_ = "";

      fileName_ = "";

      productType_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return umstubs.UMServiceOuterClass.internal_static_UMService_ResumeInfo_descriptor;
    }

    @java.lang.Override
    public umstubs.ResumeInfo getDefaultInstanceForType() {
      return umstubs.ResumeInfo.getDefaultInstance();
    }

    @java.lang.Override
    public umstubs.ResumeInfo build() {
      umstubs.ResumeInfo result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public umstubs.ResumeInfo buildPartial() {
      umstubs.ResumeInfo result = new umstubs.ResumeInfo(this);
      result.exchangeName_ = exchangeName_;
      result.fileName_ = fileName_;
      result.productType_ = productType_;
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
      if (other instanceof umstubs.ResumeInfo) {
        return mergeFrom((umstubs.ResumeInfo)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(umstubs.ResumeInfo other) {
      if (other == umstubs.ResumeInfo.getDefaultInstance()) return this;
      if (!other.getExchangeName().isEmpty()) {
        exchangeName_ = other.exchangeName_;
        onChanged();
      }
      if (!other.getFileName().isEmpty()) {
        fileName_ = other.fileName_;
        onChanged();
      }
      if (!other.getProductType().isEmpty()) {
        productType_ = other.productType_;
        onChanged();
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
              exchangeName_ = input.readStringRequireUtf8();

              break;
            } // case 10
            case 18: {
              fileName_ = input.readStringRequireUtf8();

              break;
            } // case 18
            case 26: {
              productType_ = input.readStringRequireUtf8();

              break;
            } // case 26
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

    private java.lang.Object exchangeName_ = "";
    /**
     * <code>string exchangeName = 1;</code>
     * @return The exchangeName.
     */
    public java.lang.String getExchangeName() {
      java.lang.Object ref = exchangeName_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        exchangeName_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string exchangeName = 1;</code>
     * @return The bytes for exchangeName.
     */
    public com.google.protobuf.ByteString
        getExchangeNameBytes() {
      java.lang.Object ref = exchangeName_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        exchangeName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string exchangeName = 1;</code>
     * @param value The exchangeName to set.
     * @return This builder for chaining.
     */
    public Builder setExchangeName(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      exchangeName_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string exchangeName = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearExchangeName() {
      
      exchangeName_ = getDefaultInstance().getExchangeName();
      onChanged();
      return this;
    }
    /**
     * <code>string exchangeName = 1;</code>
     * @param value The bytes for exchangeName to set.
     * @return This builder for chaining.
     */
    public Builder setExchangeNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      exchangeName_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object fileName_ = "";
    /**
     * <code>string fileName = 2;</code>
     * @return The fileName.
     */
    public java.lang.String getFileName() {
      java.lang.Object ref = fileName_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        fileName_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string fileName = 2;</code>
     * @return The bytes for fileName.
     */
    public com.google.protobuf.ByteString
        getFileNameBytes() {
      java.lang.Object ref = fileName_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        fileName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string fileName = 2;</code>
     * @param value The fileName to set.
     * @return This builder for chaining.
     */
    public Builder setFileName(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      fileName_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string fileName = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearFileName() {
      
      fileName_ = getDefaultInstance().getFileName();
      onChanged();
      return this;
    }
    /**
     * <code>string fileName = 2;</code>
     * @param value The bytes for fileName to set.
     * @return This builder for chaining.
     */
    public Builder setFileNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      fileName_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object productType_ = "";
    /**
     * <code>string productType = 3;</code>
     * @return The productType.
     */
    public java.lang.String getProductType() {
      java.lang.Object ref = productType_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        productType_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string productType = 3;</code>
     * @return The bytes for productType.
     */
    public com.google.protobuf.ByteString
        getProductTypeBytes() {
      java.lang.Object ref = productType_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        productType_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string productType = 3;</code>
     * @param value The productType to set.
     * @return This builder for chaining.
     */
    public Builder setProductType(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      productType_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string productType = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearProductType() {
      
      productType_ = getDefaultInstance().getProductType();
      onChanged();
      return this;
    }
    /**
     * <code>string productType = 3;</code>
     * @param value The bytes for productType to set.
     * @return This builder for chaining.
     */
    public Builder setProductTypeBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      productType_ = value;
      onChanged();
      return this;
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


    // @@protoc_insertion_point(builder_scope:UMService.ResumeInfo)
  }

  // @@protoc_insertion_point(class_scope:UMService.ResumeInfo)
  private static final umstubs.ResumeInfo DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new umstubs.ResumeInfo();
  }

  public static umstubs.ResumeInfo getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ResumeInfo>
      PARSER = new com.google.protobuf.AbstractParser<ResumeInfo>() {
    @java.lang.Override
    public ResumeInfo parsePartialFrom(
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

  public static com.google.protobuf.Parser<ResumeInfo> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ResumeInfo> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public umstubs.ResumeInfo getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

