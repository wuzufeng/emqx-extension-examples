// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: exhook.proto

package io.emqx.exhook;

/**
 * Protobuf type {@code emqx.exhook.v1.ClientCheckAclRequest}
 */
public final class ClientCheckAclRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:emqx.exhook.v1.ClientCheckAclRequest)
    ClientCheckAclRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ClientCheckAclRequest.newBuilder() to construct.
  private ClientCheckAclRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ClientCheckAclRequest() {
    type_ = 0;
    topic_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ClientCheckAclRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private ClientCheckAclRequest(
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
            io.emqx.exhook.ClientInfo.Builder subBuilder = null;
            if (clientinfo_ != null) {
              subBuilder = clientinfo_.toBuilder();
            }
            clientinfo_ = input.readMessage(io.emqx.exhook.ClientInfo.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(clientinfo_);
              clientinfo_ = subBuilder.buildPartial();
            }

            break;
          }
          case 16: {
            int rawValue = input.readEnum();

            type_ = rawValue;
            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();

            topic_ = s;
            break;
          }
          case 32: {

            result_ = input.readBool();
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
    return io.emqx.exhook.EmqxExHookProto.internal_static_emqx_exhook_v1_ClientCheckAclRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return io.emqx.exhook.EmqxExHookProto.internal_static_emqx_exhook_v1_ClientCheckAclRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            io.emqx.exhook.ClientCheckAclRequest.class, io.emqx.exhook.ClientCheckAclRequest.Builder.class);
  }

  /**
   * Protobuf enum {@code emqx.exhook.v1.ClientCheckAclRequest.AclReqType}
   */
  public enum AclReqType
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>PUBLISH = 0;</code>
     */
    PUBLISH(0),
    /**
     * <code>SUBSCRIBE = 1;</code>
     */
    SUBSCRIBE(1),
    UNRECOGNIZED(-1),
    ;

    /**
     * <code>PUBLISH = 0;</code>
     */
    public static final int PUBLISH_VALUE = 0;
    /**
     * <code>SUBSCRIBE = 1;</code>
     */
    public static final int SUBSCRIBE_VALUE = 1;


    public final int getNumber() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalArgumentException(
            "Can't get the number of an unknown enum value.");
      }
      return value;
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static AclReqType valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static AclReqType forNumber(int value) {
      switch (value) {
        case 0: return PUBLISH;
        case 1: return SUBSCRIBE;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<AclReqType>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        AclReqType> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<AclReqType>() {
            public AclReqType findValueByNumber(int number) {
              return AclReqType.forNumber(number);
            }
          };

    public final com.google.protobuf.Descriptors.EnumValueDescriptor
        getValueDescriptor() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalStateException(
            "Can't get the descriptor of an unrecognized enum value.");
      }
      return getDescriptor().getValues().get(ordinal());
    }
    public final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptorForType() {
      return getDescriptor();
    }
    public static final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptor() {
      return io.emqx.exhook.ClientCheckAclRequest.getDescriptor().getEnumTypes().get(0);
    }

    private static final AclReqType[] VALUES = values();

    public static AclReqType valueOf(
        com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException(
          "EnumValueDescriptor is not for this type.");
      }
      if (desc.getIndex() == -1) {
        return UNRECOGNIZED;
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private AclReqType(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:emqx.exhook.v1.ClientCheckAclRequest.AclReqType)
  }

  public static final int CLIENTINFO_FIELD_NUMBER = 1;
  private io.emqx.exhook.ClientInfo clientinfo_;
  /**
   * <code>.emqx.exhook.v1.ClientInfo clientinfo = 1;</code>
   * @return Whether the clientinfo field is set.
   */
  @java.lang.Override
  public boolean hasClientinfo() {
    return clientinfo_ != null;
  }
  /**
   * <code>.emqx.exhook.v1.ClientInfo clientinfo = 1;</code>
   * @return The clientinfo.
   */
  @java.lang.Override
  public io.emqx.exhook.ClientInfo getClientinfo() {
    return clientinfo_ == null ? io.emqx.exhook.ClientInfo.getDefaultInstance() : clientinfo_;
  }
  /**
   * <code>.emqx.exhook.v1.ClientInfo clientinfo = 1;</code>
   */
  @java.lang.Override
  public io.emqx.exhook.ClientInfoOrBuilder getClientinfoOrBuilder() {
    return getClientinfo();
  }

  public static final int TYPE_FIELD_NUMBER = 2;
  private int type_;
  /**
   * <code>.emqx.exhook.v1.ClientCheckAclRequest.AclReqType type = 2;</code>
   * @return The enum numeric value on the wire for type.
   */
  @java.lang.Override public int getTypeValue() {
    return type_;
  }
  /**
   * <code>.emqx.exhook.v1.ClientCheckAclRequest.AclReqType type = 2;</code>
   * @return The type.
   */
  @java.lang.Override public io.emqx.exhook.ClientCheckAclRequest.AclReqType getType() {
    @SuppressWarnings("deprecation")
    io.emqx.exhook.ClientCheckAclRequest.AclReqType result = io.emqx.exhook.ClientCheckAclRequest.AclReqType.valueOf(type_);
    return result == null ? io.emqx.exhook.ClientCheckAclRequest.AclReqType.UNRECOGNIZED : result;
  }

  public static final int TOPIC_FIELD_NUMBER = 3;
  private volatile java.lang.Object topic_;
  /**
   * <code>string topic = 3;</code>
   * @return The topic.
   */
  @java.lang.Override
  public java.lang.String getTopic() {
    java.lang.Object ref = topic_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      topic_ = s;
      return s;
    }
  }
  /**
   * <code>string topic = 3;</code>
   * @return The bytes for topic.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getTopicBytes() {
    java.lang.Object ref = topic_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      topic_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int RESULT_FIELD_NUMBER = 4;
  private boolean result_;
  /**
   * <code>bool result = 4;</code>
   * @return The result.
   */
  @java.lang.Override
  public boolean getResult() {
    return result_;
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
    if (clientinfo_ != null) {
      output.writeMessage(1, getClientinfo());
    }
    if (type_ != io.emqx.exhook.ClientCheckAclRequest.AclReqType.PUBLISH.getNumber()) {
      output.writeEnum(2, type_);
    }
    if (!getTopicBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, topic_);
    }
    if (result_ != false) {
      output.writeBool(4, result_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (clientinfo_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getClientinfo());
    }
    if (type_ != io.emqx.exhook.ClientCheckAclRequest.AclReqType.PUBLISH.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(2, type_);
    }
    if (!getTopicBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, topic_);
    }
    if (result_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(4, result_);
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
    if (!(obj instanceof io.emqx.exhook.ClientCheckAclRequest)) {
      return super.equals(obj);
    }
    io.emqx.exhook.ClientCheckAclRequest other = (io.emqx.exhook.ClientCheckAclRequest) obj;

    if (hasClientinfo() != other.hasClientinfo()) return false;
    if (hasClientinfo()) {
      if (!getClientinfo()
          .equals(other.getClientinfo())) return false;
    }
    if (type_ != other.type_) return false;
    if (!getTopic()
        .equals(other.getTopic())) return false;
    if (getResult()
        != other.getResult()) return false;
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
    if (hasClientinfo()) {
      hash = (37 * hash) + CLIENTINFO_FIELD_NUMBER;
      hash = (53 * hash) + getClientinfo().hashCode();
    }
    hash = (37 * hash) + TYPE_FIELD_NUMBER;
    hash = (53 * hash) + type_;
    hash = (37 * hash) + TOPIC_FIELD_NUMBER;
    hash = (53 * hash) + getTopic().hashCode();
    hash = (37 * hash) + RESULT_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getResult());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static io.emqx.exhook.ClientCheckAclRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.emqx.exhook.ClientCheckAclRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.emqx.exhook.ClientCheckAclRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.emqx.exhook.ClientCheckAclRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.emqx.exhook.ClientCheckAclRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.emqx.exhook.ClientCheckAclRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.emqx.exhook.ClientCheckAclRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.emqx.exhook.ClientCheckAclRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.emqx.exhook.ClientCheckAclRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static io.emqx.exhook.ClientCheckAclRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.emqx.exhook.ClientCheckAclRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.emqx.exhook.ClientCheckAclRequest parseFrom(
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
  public static Builder newBuilder(io.emqx.exhook.ClientCheckAclRequest prototype) {
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
   * Protobuf type {@code emqx.exhook.v1.ClientCheckAclRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:emqx.exhook.v1.ClientCheckAclRequest)
      io.emqx.exhook.ClientCheckAclRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.emqx.exhook.EmqxExHookProto.internal_static_emqx_exhook_v1_ClientCheckAclRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.emqx.exhook.EmqxExHookProto.internal_static_emqx_exhook_v1_ClientCheckAclRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.emqx.exhook.ClientCheckAclRequest.class, io.emqx.exhook.ClientCheckAclRequest.Builder.class);
    }

    // Construct using io.emqx.exhook.ClientCheckAclRequest.newBuilder()
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
      if (clientinfoBuilder_ == null) {
        clientinfo_ = null;
      } else {
        clientinfo_ = null;
        clientinfoBuilder_ = null;
      }
      type_ = 0;

      topic_ = "";

      result_ = false;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return io.emqx.exhook.EmqxExHookProto.internal_static_emqx_exhook_v1_ClientCheckAclRequest_descriptor;
    }

    @java.lang.Override
    public io.emqx.exhook.ClientCheckAclRequest getDefaultInstanceForType() {
      return io.emqx.exhook.ClientCheckAclRequest.getDefaultInstance();
    }

    @java.lang.Override
    public io.emqx.exhook.ClientCheckAclRequest build() {
      io.emqx.exhook.ClientCheckAclRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public io.emqx.exhook.ClientCheckAclRequest buildPartial() {
      io.emqx.exhook.ClientCheckAclRequest result = new io.emqx.exhook.ClientCheckAclRequest(this);
      if (clientinfoBuilder_ == null) {
        result.clientinfo_ = clientinfo_;
      } else {
        result.clientinfo_ = clientinfoBuilder_.build();
      }
      result.type_ = type_;
      result.topic_ = topic_;
      result.result_ = result_;
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
      if (other instanceof io.emqx.exhook.ClientCheckAclRequest) {
        return mergeFrom((io.emqx.exhook.ClientCheckAclRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(io.emqx.exhook.ClientCheckAclRequest other) {
      if (other == io.emqx.exhook.ClientCheckAclRequest.getDefaultInstance()) return this;
      if (other.hasClientinfo()) {
        mergeClientinfo(other.getClientinfo());
      }
      if (other.type_ != 0) {
        setTypeValue(other.getTypeValue());
      }
      if (!other.getTopic().isEmpty()) {
        topic_ = other.topic_;
        onChanged();
      }
      if (other.getResult() != false) {
        setResult(other.getResult());
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
      io.emqx.exhook.ClientCheckAclRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (io.emqx.exhook.ClientCheckAclRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private io.emqx.exhook.ClientInfo clientinfo_;
    private com.google.protobuf.SingleFieldBuilderV3<
        io.emqx.exhook.ClientInfo, io.emqx.exhook.ClientInfo.Builder, io.emqx.exhook.ClientInfoOrBuilder> clientinfoBuilder_;
    /**
     * <code>.emqx.exhook.v1.ClientInfo clientinfo = 1;</code>
     * @return Whether the clientinfo field is set.
     */
    public boolean hasClientinfo() {
      return clientinfoBuilder_ != null || clientinfo_ != null;
    }
    /**
     * <code>.emqx.exhook.v1.ClientInfo clientinfo = 1;</code>
     * @return The clientinfo.
     */
    public io.emqx.exhook.ClientInfo getClientinfo() {
      if (clientinfoBuilder_ == null) {
        return clientinfo_ == null ? io.emqx.exhook.ClientInfo.getDefaultInstance() : clientinfo_;
      } else {
        return clientinfoBuilder_.getMessage();
      }
    }
    /**
     * <code>.emqx.exhook.v1.ClientInfo clientinfo = 1;</code>
     */
    public Builder setClientinfo(io.emqx.exhook.ClientInfo value) {
      if (clientinfoBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        clientinfo_ = value;
        onChanged();
      } else {
        clientinfoBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.emqx.exhook.v1.ClientInfo clientinfo = 1;</code>
     */
    public Builder setClientinfo(
        io.emqx.exhook.ClientInfo.Builder builderForValue) {
      if (clientinfoBuilder_ == null) {
        clientinfo_ = builderForValue.build();
        onChanged();
      } else {
        clientinfoBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.emqx.exhook.v1.ClientInfo clientinfo = 1;</code>
     */
    public Builder mergeClientinfo(io.emqx.exhook.ClientInfo value) {
      if (clientinfoBuilder_ == null) {
        if (clientinfo_ != null) {
          clientinfo_ =
            io.emqx.exhook.ClientInfo.newBuilder(clientinfo_).mergeFrom(value).buildPartial();
        } else {
          clientinfo_ = value;
        }
        onChanged();
      } else {
        clientinfoBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.emqx.exhook.v1.ClientInfo clientinfo = 1;</code>
     */
    public Builder clearClientinfo() {
      if (clientinfoBuilder_ == null) {
        clientinfo_ = null;
        onChanged();
      } else {
        clientinfo_ = null;
        clientinfoBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.emqx.exhook.v1.ClientInfo clientinfo = 1;</code>
     */
    public io.emqx.exhook.ClientInfo.Builder getClientinfoBuilder() {
      
      onChanged();
      return getClientinfoFieldBuilder().getBuilder();
    }
    /**
     * <code>.emqx.exhook.v1.ClientInfo clientinfo = 1;</code>
     */
    public io.emqx.exhook.ClientInfoOrBuilder getClientinfoOrBuilder() {
      if (clientinfoBuilder_ != null) {
        return clientinfoBuilder_.getMessageOrBuilder();
      } else {
        return clientinfo_ == null ?
            io.emqx.exhook.ClientInfo.getDefaultInstance() : clientinfo_;
      }
    }
    /**
     * <code>.emqx.exhook.v1.ClientInfo clientinfo = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        io.emqx.exhook.ClientInfo, io.emqx.exhook.ClientInfo.Builder, io.emqx.exhook.ClientInfoOrBuilder> 
        getClientinfoFieldBuilder() {
      if (clientinfoBuilder_ == null) {
        clientinfoBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            io.emqx.exhook.ClientInfo, io.emqx.exhook.ClientInfo.Builder, io.emqx.exhook.ClientInfoOrBuilder>(
                getClientinfo(),
                getParentForChildren(),
                isClean());
        clientinfo_ = null;
      }
      return clientinfoBuilder_;
    }

    private int type_ = 0;
    /**
     * <code>.emqx.exhook.v1.ClientCheckAclRequest.AclReqType type = 2;</code>
     * @return The enum numeric value on the wire for type.
     */
    @java.lang.Override public int getTypeValue() {
      return type_;
    }
    /**
     * <code>.emqx.exhook.v1.ClientCheckAclRequest.AclReqType type = 2;</code>
     * @param value The enum numeric value on the wire for type to set.
     * @return This builder for chaining.
     */
    public Builder setTypeValue(int value) {
      
      type_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.emqx.exhook.v1.ClientCheckAclRequest.AclReqType type = 2;</code>
     * @return The type.
     */
    @java.lang.Override
    public io.emqx.exhook.ClientCheckAclRequest.AclReqType getType() {
      @SuppressWarnings("deprecation")
      io.emqx.exhook.ClientCheckAclRequest.AclReqType result = io.emqx.exhook.ClientCheckAclRequest.AclReqType.valueOf(type_);
      return result == null ? io.emqx.exhook.ClientCheckAclRequest.AclReqType.UNRECOGNIZED : result;
    }
    /**
     * <code>.emqx.exhook.v1.ClientCheckAclRequest.AclReqType type = 2;</code>
     * @param value The type to set.
     * @return This builder for chaining.
     */
    public Builder setType(io.emqx.exhook.ClientCheckAclRequest.AclReqType value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      type_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.emqx.exhook.v1.ClientCheckAclRequest.AclReqType type = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearType() {
      
      type_ = 0;
      onChanged();
      return this;
    }

    private java.lang.Object topic_ = "";
    /**
     * <code>string topic = 3;</code>
     * @return The topic.
     */
    public java.lang.String getTopic() {
      java.lang.Object ref = topic_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        topic_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string topic = 3;</code>
     * @return The bytes for topic.
     */
    public com.google.protobuf.ByteString
        getTopicBytes() {
      java.lang.Object ref = topic_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        topic_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string topic = 3;</code>
     * @param value The topic to set.
     * @return This builder for chaining.
     */
    public Builder setTopic(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      topic_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string topic = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearTopic() {
      
      topic_ = getDefaultInstance().getTopic();
      onChanged();
      return this;
    }
    /**
     * <code>string topic = 3;</code>
     * @param value The bytes for topic to set.
     * @return This builder for chaining.
     */
    public Builder setTopicBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      topic_ = value;
      onChanged();
      return this;
    }

    private boolean result_ ;
    /**
     * <code>bool result = 4;</code>
     * @return The result.
     */
    @java.lang.Override
    public boolean getResult() {
      return result_;
    }
    /**
     * <code>bool result = 4;</code>
     * @param value The result to set.
     * @return This builder for chaining.
     */
    public Builder setResult(boolean value) {
      
      result_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bool result = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearResult() {
      
      result_ = false;
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


    // @@protoc_insertion_point(builder_scope:emqx.exhook.v1.ClientCheckAclRequest)
  }

  // @@protoc_insertion_point(class_scope:emqx.exhook.v1.ClientCheckAclRequest)
  private static final io.emqx.exhook.ClientCheckAclRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new io.emqx.exhook.ClientCheckAclRequest();
  }

  public static io.emqx.exhook.ClientCheckAclRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ClientCheckAclRequest>
      PARSER = new com.google.protobuf.AbstractParser<ClientCheckAclRequest>() {
    @java.lang.Override
    public ClientCheckAclRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new ClientCheckAclRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ClientCheckAclRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ClientCheckAclRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public io.emqx.exhook.ClientCheckAclRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
