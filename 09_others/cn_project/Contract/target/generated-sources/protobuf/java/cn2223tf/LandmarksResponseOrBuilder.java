// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: CN2223TFService.proto

package cn2223tf;

public interface LandmarksResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:cn2223tf.LandmarksResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .cn2223tf.Landmark landmark = 1;</code>
   */
  java.util.List<cn2223tf.Landmark> 
      getLandmarkList();
  /**
   * <code>repeated .cn2223tf.Landmark landmark = 1;</code>
   */
  cn2223tf.Landmark getLandmark(int index);
  /**
   * <code>repeated .cn2223tf.Landmark landmark = 1;</code>
   */
  int getLandmarkCount();
  /**
   * <code>repeated .cn2223tf.Landmark landmark = 1;</code>
   */
  java.util.List<? extends cn2223tf.LandmarkOrBuilder> 
      getLandmarkOrBuilderList();
  /**
   * <code>repeated .cn2223tf.Landmark landmark = 1;</code>
   */
  cn2223tf.LandmarkOrBuilder getLandmarkOrBuilder(
      int index);
}