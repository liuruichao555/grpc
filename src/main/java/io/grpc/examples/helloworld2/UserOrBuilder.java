// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: helloworld2.proto

package io.grpc.examples.helloworld2;

public interface UserOrBuilder extends
    // @@protoc_insertion_point(interface_extends:helloworld.User)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string username = 1;</code>
   */
  java.lang.String getUsername();
  /**
   * <code>string username = 1;</code>
   */
  com.google.protobuf.ByteString
      getUsernameBytes();

  /**
   * <code>int32 age = 2;</code>
   */
  int getAge();

  /**
   * <code>.helloworld.Role role = 3;</code>
   */
  boolean hasRole();
  /**
   * <code>.helloworld.Role role = 3;</code>
   */
  io.grpc.examples.helloworld2.Role getRole();
  /**
   * <code>.helloworld.Role role = 3;</code>
   */
  io.grpc.examples.helloworld2.RoleOrBuilder getRoleOrBuilder();
}
