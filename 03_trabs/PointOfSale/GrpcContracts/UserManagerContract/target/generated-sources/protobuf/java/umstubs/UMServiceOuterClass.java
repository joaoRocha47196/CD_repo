// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: UMService.proto

package umstubs;

public final class UMServiceOuterClass {
  private UMServiceOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_UMService_ResumeInfo_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_UMService_ResumeInfo_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_UMService_FileIdentifier_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_UMService_FileIdentifier_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_UMService_FileResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_UMService_FileResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_UMService_EmptyResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_UMService_EmptyResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\017UMService.proto\022\tUMService\"I\n\nResumeIn" +
      "fo\022\024\n\014exchangeName\030\001 \001(\t\022\020\n\010fileName\030\002 \001" +
      "(\t\022\023\n\013productType\030\003 \001(\t\" \n\016FileIdentifie" +
      "r\022\016\n\006fileId\030\001 \001(\t\"6\n\014FileResponse\022\016\n\006fil" +
      "eId\030\001 \001(\t\022\026\n\016processedBytes\030\002 \001(\014\"\017\n\rEmp" +
      "tyResponse2\221\001\n\tUMService\022>\n\013resumeSales\022" +
      "\025.UMService.ResumeInfo\032\030.UMService.Empty" +
      "Response\022D\n\014downloadFile\022\031.UMService.Fil" +
      "eIdentifier\032\027.UMService.FileResponse0\001B\013" +
      "\n\007umstubsP\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_UMService_ResumeInfo_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_UMService_ResumeInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_UMService_ResumeInfo_descriptor,
        new java.lang.String[] { "ExchangeName", "FileName", "ProductType", });
    internal_static_UMService_FileIdentifier_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_UMService_FileIdentifier_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_UMService_FileIdentifier_descriptor,
        new java.lang.String[] { "FileId", });
    internal_static_UMService_FileResponse_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_UMService_FileResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_UMService_FileResponse_descriptor,
        new java.lang.String[] { "FileId", "ProcessedBytes", });
    internal_static_UMService_EmptyResponse_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_UMService_EmptyResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_UMService_EmptyResponse_descriptor,
        new java.lang.String[] { });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
