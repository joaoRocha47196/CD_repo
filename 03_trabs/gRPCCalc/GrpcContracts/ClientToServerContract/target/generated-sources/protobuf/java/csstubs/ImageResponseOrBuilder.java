// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: CSService.proto

package csstubs;

public interface ImageResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:csservice.ImageResponse)
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
   * <code>bytes processed_image = 2;</code>
   * @return The processedImage.
   */
  com.google.protobuf.ByteString getProcessedImage();

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