// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: CSService.proto

package csstubs;

public interface StatusResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:csservice.StatusResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string image_id = 1;</code>
   * @return The imageId.
   */
  java.lang.String getImageId();
  /**
   * <code>string image_id = 1;</code>
   * @return The bytes for imageId.
   */
  com.google.protobuf.ByteString
      getImageIdBytes();

  /**
   * <code>.csservice.Status status = 3;</code>
   * @return The enum numeric value on the wire for status.
   */
  int getStatusValue();
  /**
   * <code>.csservice.Status status = 3;</code>
   * @return The status.
   */
  csstubs.Status getStatus();
}
