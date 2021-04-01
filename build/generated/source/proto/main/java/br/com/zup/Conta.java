// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: keyManagerGrpc.proto

package br.com.zup;

/**
 * Protobuf type {@code br.com.zup.Conta}
 */
public final class Conta extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:br.com.zup.Conta)
    ContaOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Conta.newBuilder() to construct.
  private Conta(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Conta() {
    instituicao_ = "";
    agencia_ = "";
    numero_ = "";
    tipoConta_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new Conta();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private Conta(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 10: {
            java.lang.String s = input.readStringRequireUtf8();

            instituicao_ = s;
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            agencia_ = s;
            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();

            numero_ = s;
            break;
          }
          case 34: {
            java.lang.String s = input.readStringRequireUtf8();

            tipoConta_ = s;
            break;
          }
          default: {
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return br.com.zup.KeyManagerGrpc.internal_static_br_com_zup_Conta_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return br.com.zup.KeyManagerGrpc.internal_static_br_com_zup_Conta_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            br.com.zup.Conta.class, br.com.zup.Conta.Builder.class);
  }

  public static final int INSTITUICAO_FIELD_NUMBER = 1;
  private volatile java.lang.Object instituicao_;
  /**
   * <code>string instituicao = 1;</code>
   * @return The instituicao.
   */
  @java.lang.Override
  public java.lang.String getInstituicao() {
    java.lang.Object ref = instituicao_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      instituicao_ = s;
      return s;
    }
  }
  /**
   * <code>string instituicao = 1;</code>
   * @return The bytes for instituicao.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getInstituicaoBytes() {
    java.lang.Object ref = instituicao_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      instituicao_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int AGENCIA_FIELD_NUMBER = 2;
  private volatile java.lang.Object agencia_;
  /**
   * <code>string agencia = 2;</code>
   * @return The agencia.
   */
  @java.lang.Override
  public java.lang.String getAgencia() {
    java.lang.Object ref = agencia_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      agencia_ = s;
      return s;
    }
  }
  /**
   * <code>string agencia = 2;</code>
   * @return The bytes for agencia.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getAgenciaBytes() {
    java.lang.Object ref = agencia_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      agencia_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int NUMERO_FIELD_NUMBER = 3;
  private volatile java.lang.Object numero_;
  /**
   * <code>string numero = 3;</code>
   * @return The numero.
   */
  @java.lang.Override
  public java.lang.String getNumero() {
    java.lang.Object ref = numero_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      numero_ = s;
      return s;
    }
  }
  /**
   * <code>string numero = 3;</code>
   * @return The bytes for numero.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getNumeroBytes() {
    java.lang.Object ref = numero_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      numero_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int TIPOCONTA_FIELD_NUMBER = 4;
  private volatile java.lang.Object tipoConta_;
  /**
   * <code>string tipoConta = 4;</code>
   * @return The tipoConta.
   */
  @java.lang.Override
  public java.lang.String getTipoConta() {
    java.lang.Object ref = tipoConta_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      tipoConta_ = s;
      return s;
    }
  }
  /**
   * <code>string tipoConta = 4;</code>
   * @return The bytes for tipoConta.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getTipoContaBytes() {
    java.lang.Object ref = tipoConta_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      tipoConta_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
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
    if (!getInstituicaoBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, instituicao_);
    }
    if (!getAgenciaBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, agencia_);
    }
    if (!getNumeroBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, numero_);
    }
    if (!getTipoContaBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, tipoConta_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getInstituicaoBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, instituicao_);
    }
    if (!getAgenciaBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, agencia_);
    }
    if (!getNumeroBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, numero_);
    }
    if (!getTipoContaBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, tipoConta_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof br.com.zup.Conta)) {
      return super.equals(obj);
    }
    br.com.zup.Conta other = (br.com.zup.Conta) obj;

    if (!getInstituicao()
        .equals(other.getInstituicao())) return false;
    if (!getAgencia()
        .equals(other.getAgencia())) return false;
    if (!getNumero()
        .equals(other.getNumero())) return false;
    if (!getTipoConta()
        .equals(other.getTipoConta())) return false;
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + INSTITUICAO_FIELD_NUMBER;
    hash = (53 * hash) + getInstituicao().hashCode();
    hash = (37 * hash) + AGENCIA_FIELD_NUMBER;
    hash = (53 * hash) + getAgencia().hashCode();
    hash = (37 * hash) + NUMERO_FIELD_NUMBER;
    hash = (53 * hash) + getNumero().hashCode();
    hash = (37 * hash) + TIPOCONTA_FIELD_NUMBER;
    hash = (53 * hash) + getTipoConta().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static br.com.zup.Conta parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static br.com.zup.Conta parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static br.com.zup.Conta parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static br.com.zup.Conta parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static br.com.zup.Conta parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static br.com.zup.Conta parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static br.com.zup.Conta parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static br.com.zup.Conta parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static br.com.zup.Conta parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static br.com.zup.Conta parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static br.com.zup.Conta parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static br.com.zup.Conta parseFrom(
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
  public static Builder newBuilder(br.com.zup.Conta prototype) {
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
   * Protobuf type {@code br.com.zup.Conta}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:br.com.zup.Conta)
      br.com.zup.ContaOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return br.com.zup.KeyManagerGrpc.internal_static_br_com_zup_Conta_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return br.com.zup.KeyManagerGrpc.internal_static_br_com_zup_Conta_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              br.com.zup.Conta.class, br.com.zup.Conta.Builder.class);
    }

    // Construct using br.com.zup.Conta.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      instituicao_ = "";

      agencia_ = "";

      numero_ = "";

      tipoConta_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return br.com.zup.KeyManagerGrpc.internal_static_br_com_zup_Conta_descriptor;
    }

    @java.lang.Override
    public br.com.zup.Conta getDefaultInstanceForType() {
      return br.com.zup.Conta.getDefaultInstance();
    }

    @java.lang.Override
    public br.com.zup.Conta build() {
      br.com.zup.Conta result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public br.com.zup.Conta buildPartial() {
      br.com.zup.Conta result = new br.com.zup.Conta(this);
      result.instituicao_ = instituicao_;
      result.agencia_ = agencia_;
      result.numero_ = numero_;
      result.tipoConta_ = tipoConta_;
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
      if (other instanceof br.com.zup.Conta) {
        return mergeFrom((br.com.zup.Conta)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(br.com.zup.Conta other) {
      if (other == br.com.zup.Conta.getDefaultInstance()) return this;
      if (!other.getInstituicao().isEmpty()) {
        instituicao_ = other.instituicao_;
        onChanged();
      }
      if (!other.getAgencia().isEmpty()) {
        agencia_ = other.agencia_;
        onChanged();
      }
      if (!other.getNumero().isEmpty()) {
        numero_ = other.numero_;
        onChanged();
      }
      if (!other.getTipoConta().isEmpty()) {
        tipoConta_ = other.tipoConta_;
        onChanged();
      }
      this.mergeUnknownFields(other.unknownFields);
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
      br.com.zup.Conta parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (br.com.zup.Conta) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object instituicao_ = "";
    /**
     * <code>string instituicao = 1;</code>
     * @return The instituicao.
     */
    public java.lang.String getInstituicao() {
      java.lang.Object ref = instituicao_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        instituicao_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string instituicao = 1;</code>
     * @return The bytes for instituicao.
     */
    public com.google.protobuf.ByteString
        getInstituicaoBytes() {
      java.lang.Object ref = instituicao_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        instituicao_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string instituicao = 1;</code>
     * @param value The instituicao to set.
     * @return This builder for chaining.
     */
    public Builder setInstituicao(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      instituicao_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string instituicao = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearInstituicao() {
      
      instituicao_ = getDefaultInstance().getInstituicao();
      onChanged();
      return this;
    }
    /**
     * <code>string instituicao = 1;</code>
     * @param value The bytes for instituicao to set.
     * @return This builder for chaining.
     */
    public Builder setInstituicaoBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      instituicao_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object agencia_ = "";
    /**
     * <code>string agencia = 2;</code>
     * @return The agencia.
     */
    public java.lang.String getAgencia() {
      java.lang.Object ref = agencia_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        agencia_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string agencia = 2;</code>
     * @return The bytes for agencia.
     */
    public com.google.protobuf.ByteString
        getAgenciaBytes() {
      java.lang.Object ref = agencia_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        agencia_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string agencia = 2;</code>
     * @param value The agencia to set.
     * @return This builder for chaining.
     */
    public Builder setAgencia(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      agencia_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string agencia = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearAgencia() {
      
      agencia_ = getDefaultInstance().getAgencia();
      onChanged();
      return this;
    }
    /**
     * <code>string agencia = 2;</code>
     * @param value The bytes for agencia to set.
     * @return This builder for chaining.
     */
    public Builder setAgenciaBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      agencia_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object numero_ = "";
    /**
     * <code>string numero = 3;</code>
     * @return The numero.
     */
    public java.lang.String getNumero() {
      java.lang.Object ref = numero_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        numero_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string numero = 3;</code>
     * @return The bytes for numero.
     */
    public com.google.protobuf.ByteString
        getNumeroBytes() {
      java.lang.Object ref = numero_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        numero_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string numero = 3;</code>
     * @param value The numero to set.
     * @return This builder for chaining.
     */
    public Builder setNumero(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      numero_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string numero = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearNumero() {
      
      numero_ = getDefaultInstance().getNumero();
      onChanged();
      return this;
    }
    /**
     * <code>string numero = 3;</code>
     * @param value The bytes for numero to set.
     * @return This builder for chaining.
     */
    public Builder setNumeroBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      numero_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object tipoConta_ = "";
    /**
     * <code>string tipoConta = 4;</code>
     * @return The tipoConta.
     */
    public java.lang.String getTipoConta() {
      java.lang.Object ref = tipoConta_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        tipoConta_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string tipoConta = 4;</code>
     * @return The bytes for tipoConta.
     */
    public com.google.protobuf.ByteString
        getTipoContaBytes() {
      java.lang.Object ref = tipoConta_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        tipoConta_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string tipoConta = 4;</code>
     * @param value The tipoConta to set.
     * @return This builder for chaining.
     */
    public Builder setTipoConta(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      tipoConta_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string tipoConta = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearTipoConta() {
      
      tipoConta_ = getDefaultInstance().getTipoConta();
      onChanged();
      return this;
    }
    /**
     * <code>string tipoConta = 4;</code>
     * @param value The bytes for tipoConta to set.
     * @return This builder for chaining.
     */
    public Builder setTipoContaBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      tipoConta_ = value;
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


    // @@protoc_insertion_point(builder_scope:br.com.zup.Conta)
  }

  // @@protoc_insertion_point(class_scope:br.com.zup.Conta)
  private static final br.com.zup.Conta DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new br.com.zup.Conta();
  }

  public static br.com.zup.Conta getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Conta>
      PARSER = new com.google.protobuf.AbstractParser<Conta>() {
    @java.lang.Override
    public Conta parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new Conta(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<Conta> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Conta> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public br.com.zup.Conta getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

