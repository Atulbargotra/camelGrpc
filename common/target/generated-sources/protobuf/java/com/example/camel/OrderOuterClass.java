// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Order.proto

package com.example.camel;

public final class OrderOuterClass {
  private OrderOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_example_camel_Order_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_example_camel_Order_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\013Order.proto\022\021com.example.camel\"`\n\005Orde" +
      "r\022\017\n\007orderId\030\001 \001(\t\022\022\n\ncustomerId\030\002 \001(\t\022\020" +
      "\n\010itemName\030\003 \001(\t\022\020\n\010quantity\030\004 \001(\005\022\016\n\006am" +
      "ount\030\005 \001(\001B\025\n\021com.example.camelP\001b\006proto" +
      "3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_com_example_camel_Order_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_com_example_camel_Order_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_example_camel_Order_descriptor,
        new java.lang.String[] { "OrderId", "CustomerId", "ItemName", "Quantity", "Amount", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
