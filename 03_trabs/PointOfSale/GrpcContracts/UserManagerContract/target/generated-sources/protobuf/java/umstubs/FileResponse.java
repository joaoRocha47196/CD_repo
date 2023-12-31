// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: UMService.proto

package umstubs;

/**
 * Protobuf type {@code UMService.FileResponse}
 */
public final class FileResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:UMService.FileResponse)
    FileResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use FileResponse.newBuilder() to construct.
  private FileResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private FileResponse() {
    fileId_ = "";
    processedBytes_ = com.google.protobuf.ByteString.EMPTY;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new FileResponse();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return umstubs.UMServiceOuterClass.internal_static_UMService_FileResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return umstubs.UMServiceOuterClass.internal_static_UMService_FileResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            umstubs.FileResponse.class, umstubs.FileResponse.Builder.class);
  }

  public static final int FILEID_FIELD_NUMBER = 1;
  private volatile java.lang.Object fileId_;
  /**
   * <code>string fileId = 1;</code>
   * @return The fileId.
   */
  @java.lang.Override
  public java.lang.String getFileId() {
    java.lang.Object ref = fileId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      fileId_ = s;
      return s;
    }
  }
  /**
   * <code>string fileId = 1;</code>
   * @return The bytes for fileId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getFileIdBytes() {
    java.lang.Object ref = fileId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      fileId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int PROCESSEDBYTES_FIELD_NUMBER = 2;
  private com.google.protobuf.ByteString processedBytes_;
  /**
   * <code>bytes processedBytes = 2;</code>
   * @return The processedBytes.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getProcessedBytes() {
    return processedBytes_;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(fileId_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, fileId_);
    }
    if (!processedBytes_.isEmpty()) {
      output.writeBytes(2, processedBytes_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(fileId_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, fileId_);
    }
    if (!processedBytes_.isEmpty()) {
      size += com.google.protobuf.CodedOutputStream
        .computeBytesSize(2, processedBytes_);
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
    if (!(obj instanceof umstubs.FileResponse)) {
      return super.equals(obj);
    }
    umstubs.FileResponse other = (umstubs.FileResponse) obj;

    if (!getFileId()
        .equals(other.getFileId())) return false;
    if (!getProcessedBytes()
        .equals(other.getProcessedBytes())) return false;
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
    hash = (37 * hash) + FILEID_FIELD_NUMBER;
    hash = (53 * hash) + getFileId().hashCode();
    hash = (37 * hash) + PROCESSEDBYTES_FIELD_NUMBER;
    hash = (53 * hash) + getProcessedBytes().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static umstubs.FileResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static umstubs.FileResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static umstubs.FileResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static umstubs.FileResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static umstubs.FileResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static umstubs.FileResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static umstubs.FileResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static umstubs.FileResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static umstubs.FileResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static umstubs.FileResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static umstubs.FileResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static umstubs.FileResponse parseFrom(
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
  public static Builder newBuilder(umstubs.FileResponse prototype) {
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
   * Protobuf type {@code UMService.FileResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:UMService.FileResponse)
      umstubs.FileResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return umstubs.UMServiceOuterClass.internal_static_UMService_FileResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return umstubs.UMServiceOuterClass.internal_static_UMService_FileResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              umstubs.FileResponse.class, umstubs.FileResponse.Builder.class);
    }

    // Construct using umstubs.FileResponse.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      fileId_ = "";

      processedBytes_ = com.google.protobuf.ByteString.EMPTY;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return umstubs.UMServiceOuterClass.internal_static_UMService_FileResponse_descriptor;
    }

    @java.lang.Override
    public umstubs.FileResponse getDefaultInstanceForType() {
      return umstubs.FileResponse.getDefaultInstance();
    }

    @java.lang.Override
    public umstubs.FileResponse build() {
      umstubs.FileResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public umstubs.FileResponse buildPartial() {
      umstubs.FileResponse result = new umstubs.FileResponse(this);
      result.fileId_ = fileId_;
      result.processedBytes_ = processedBytes_;
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
      if (other instanceof umstubs.FileResponse) {
        return mergeFrom((umstubs.FileResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(umstubs.FileResponse other) {
      if (other == umstubs.FileResponse.getDefaultInstance()) return this;
      if (!other.getFileId().isEmpty()) {
        fileId_ = other.fileId_;
        onChanged();
      }
      if (other.getProcessedBytes() != com.google.protobuf.ByteString.EMPTY) {
        setProcessedBytes(other.getProcessedBytes());
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
              fileId_ = input.readStringRequireUtf8();

              break;
            } // case 10
            case 18: {
              processedBytes_ = input.readBytes();

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

    private java.lang.Object fileId_ = "";
    /**
     * <code>string fileId = 1;</code>
     * @return The fileId.
     */
    public java.lang.String getFileId() {
      java.lang.Object ref = fileId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        fileId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string fileId = 1;</code>
     * @return The bytes for fileId.
     */
    public com.google.protobuf.ByteString
        getFileIdBytes() {
      java.lang.Object ref = fileId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        fileId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string fileId = 1;</code>
     * @param value The fileId to set.
     * @return This builder for chaining.
     */
    public Builder setFileId(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      fileId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string fileId = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearFileId() {
      
      fileId_ = getDefaultInstance().getFileId();
      onChanged();
      return this;
    }
    /**
     * <code>string fileId = 1;</code>
     * @param value The bytes for fileId to set.
     * @return This builder for chaining.
     */
    public Builder setFileIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      fileId_ = value;
      onChanged();
      return this;
    }

    private com.google.protobuf.ByteString processedBytes_ = com.google.protobuf.ByteString.EMPTY;
    /**
     * <code>bytes processedBytes = 2;</code>
     * @return The processedBytes.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString getProcessedBytes() {
      return processedBytes_;
    }
    /**
     * <code>bytes processedBytes = 2;</code>
     * @param value The processedBytes to set.
     * @return This builder for chaining.
     */
    public Builder setProcessedBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      processedBytes_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bytes processedBytes = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearProcessedBytes() {
      
      processedBytes_ = getDefaultInstance().getProcessedBytes();
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


    // @@protoc_insertion_point(builder_scope:UMService.FileResponse)
  }

  // @@protoc_insertion_point(class_scope:UMService.FileResponse)
  private static final umstubs.FileResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new umstubs.FileResponse();
  }

  public static umstubs.FileResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<FileResponse>
      PARSER = new com.google.protobuf.AbstractParser<FileResponse>() {
    @java.lang.Override
    public FileResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<FileResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<FileResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public umstubs.FileResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

