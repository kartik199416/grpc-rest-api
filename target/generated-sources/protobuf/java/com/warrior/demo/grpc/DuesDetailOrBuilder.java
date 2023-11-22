// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: dues.proto

package com.warrior.demo.grpc;

public interface DuesDetailOrBuilder extends
    // @@protoc_insertion_point(interface_extends:com.warrior.demo.grpc.DuesDetail)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string loanAccountNumber = 1;</code>
   * @return The loanAccountNumber.
   */
  java.lang.String getLoanAccountNumber();
  /**
   * <code>string loanAccountNumber = 1;</code>
   * @return The bytes for loanAccountNumber.
   */
  com.google.protobuf.ByteString
      getLoanAccountNumberBytes();

  /**
   * <code>double dueAmount = 2;</code>
   * @return The dueAmount.
   */
  double getDueAmount();

  /**
   * <code>double principal = 3;</code>
   * @return The principal.
   */
  double getPrincipal();

  /**
   * <code>double interest = 4;</code>
   * @return The interest.
   */
  double getInterest();

  /**
   * <code>.com.warrior.demo.grpc.DueCharges dueCharges = 5;</code>
   * @return Whether the dueCharges field is set.
   */
  boolean hasDueCharges();
  /**
   * <code>.com.warrior.demo.grpc.DueCharges dueCharges = 5;</code>
   * @return The dueCharges.
   */
  com.warrior.demo.grpc.DueCharges getDueCharges();
  /**
   * <code>.com.warrior.demo.grpc.DueCharges dueCharges = 5;</code>
   */
  com.warrior.demo.grpc.DueChargesOrBuilder getDueChargesOrBuilder();

  /**
   * <code>double outstandingPrincipal = 6;</code>
   * @return The outstandingPrincipal.
   */
  double getOutstandingPrincipal();

  /**
   * <code>int64 dueDate = 7;</code>
   * @return The dueDate.
   */
  long getDueDate();

  /**
   * <code>double excess = 8;</code>
   * @return The excess.
   */
  double getExcess();
}
