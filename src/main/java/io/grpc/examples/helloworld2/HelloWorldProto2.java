// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: helloworld2.proto

package io.grpc.examples.helloworld2;

public final class HelloWorldProto2 {
  private HelloWorldProto2() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_helloworld_User_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_helloworld_User_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_helloworld_Role_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_helloworld_Role_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\021helloworld2.proto\022\nhelloworld\"E\n\004User\022" +
      "\020\n\010username\030\001 \001(\t\022\013\n\003age\030\002 \001(\005\022\036\n\004role\030\003" +
      " \001(\0132\020.helloworld.Role\"\030\n\004Role\022\020\n\010rolena" +
      "me\030\001 \003(\t2G\n\017UserRoleService\0224\n\014getUserRo" +
      "les\022\020.helloworld.User\032\020.helloworld.Role\"" +
      "\000B8\n\034io.grpc.examples.helloworld2B\020Hello" +
      "WorldProto2P\001\242\002\003HLWb\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
    internal_static_helloworld_User_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_helloworld_User_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_helloworld_User_descriptor,
        new java.lang.String[] { "Username", "Age", "Role", });
    internal_static_helloworld_Role_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_helloworld_Role_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_helloworld_Role_descriptor,
        new java.lang.String[] { "Rolename", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
