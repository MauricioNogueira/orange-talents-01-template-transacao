// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: keyManagerGrpc.proto

package br.com.zup;

public interface ChavePixOrBuilder extends
    // @@protoc_insertion_point(interface_extends:br.com.zup.ChavePix)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string pixId = 1;</code>
   * @return The pixId.
   */
  java.lang.String getPixId();
  /**
   * <code>string pixId = 1;</code>
   * @return The bytes for pixId.
   */
  com.google.protobuf.ByteString
      getPixIdBytes();

  /**
   * <code>string clienteId = 2;</code>
   * @return The clienteId.
   */
  java.lang.String getClienteId();
  /**
   * <code>string clienteId = 2;</code>
   * @return The bytes for clienteId.
   */
  com.google.protobuf.ByteString
      getClienteIdBytes();

  /**
   * <code>string tipoChave = 3;</code>
   * @return The tipoChave.
   */
  java.lang.String getTipoChave();
  /**
   * <code>string tipoChave = 3;</code>
   * @return The bytes for tipoChave.
   */
  com.google.protobuf.ByteString
      getTipoChaveBytes();

  /**
   * <code>string valorChave = 4;</code>
   * @return The valorChave.
   */
  java.lang.String getValorChave();
  /**
   * <code>string valorChave = 4;</code>
   * @return The bytes for valorChave.
   */
  com.google.protobuf.ByteString
      getValorChaveBytes();

  /**
   * <code>.br.com.zup.TipoConta tipoConta = 5;</code>
   * @return The enum numeric value on the wire for tipoConta.
   */
  int getTipoContaValue();
  /**
   * <code>.br.com.zup.TipoConta tipoConta = 5;</code>
   * @return The tipoConta.
   */
  br.com.zup.TipoConta getTipoConta();

  /**
   * <code>.google.protobuf.Timestamp criacaoChave = 6;</code>
   * @return Whether the criacaoChave field is set.
   */
  boolean hasCriacaoChave();
  /**
   * <code>.google.protobuf.Timestamp criacaoChave = 6;</code>
   * @return The criacaoChave.
   */
  com.google.protobuf.Timestamp getCriacaoChave();
  /**
   * <code>.google.protobuf.Timestamp criacaoChave = 6;</code>
   */
  com.google.protobuf.TimestampOrBuilder getCriacaoChaveOrBuilder();
}
