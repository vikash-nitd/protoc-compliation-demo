// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: customer.proto

public final class CustomerOuterClass {
  private CustomerOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface CustomerOrBuilder extends
      // @@protoc_insertion_point(interface_extends:Customer)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>int32 id = 1;</code>
     * @return The id.
     */
    int getId();

    /**
     * <code>string username = 2;</code>
     * @return The username.
     */
    java.lang.String getUsername();
    /**
     * <code>string username = 2;</code>
     * @return The bytes for username.
     */
    com.google.protobuf.ByteString
        getUsernameBytes();

    /**
     * <code>string first_name = 3;</code>
     * @return The firstName.
     */
    java.lang.String getFirstName();
    /**
     * <code>string first_name = 3;</code>
     * @return The bytes for firstName.
     */
    com.google.protobuf.ByteString
        getFirstNameBytes();

    /**
     * <code>string last_name = 4;</code>
     * @return The lastName.
     */
    java.lang.String getLastName();
    /**
     * <code>string last_name = 4;</code>
     * @return The bytes for lastName.
     */
    com.google.protobuf.ByteString
        getLastNameBytes();
  }
  /**
   * Protobuf type {@code Customer}
   */
  public static final class Customer extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:Customer)
      CustomerOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use Customer.newBuilder() to construct.
    private Customer(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private Customer() {
      username_ = "";
      firstName_ = "";
      lastName_ = "";
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new Customer();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private Customer(
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
            case 8: {

              id_ = input.readInt32();
              break;
            }
            case 18: {
              java.lang.String s = input.readStringRequireUtf8();

              username_ = s;
              break;
            }
            case 26: {
              java.lang.String s = input.readStringRequireUtf8();

              firstName_ = s;
              break;
            }
            case 34: {
              java.lang.String s = input.readStringRequireUtf8();

              lastName_ = s;
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
      return CustomerOuterClass.internal_static_Customer_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return CustomerOuterClass.internal_static_Customer_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              CustomerOuterClass.Customer.class, CustomerOuterClass.Customer.Builder.class);
    }

    public static final int ID_FIELD_NUMBER = 1;
    private int id_;
    /**
     * <code>int32 id = 1;</code>
     * @return The id.
     */
    @java.lang.Override
    public int getId() {
      return id_;
    }

    public static final int USERNAME_FIELD_NUMBER = 2;
    private volatile java.lang.Object username_;
    /**
     * <code>string username = 2;</code>
     * @return The username.
     */
    @java.lang.Override
    public java.lang.String getUsername() {
      java.lang.Object ref = username_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        username_ = s;
        return s;
      }
    }
    /**
     * <code>string username = 2;</code>
     * @return The bytes for username.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getUsernameBytes() {
      java.lang.Object ref = username_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        username_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int FIRST_NAME_FIELD_NUMBER = 3;
    private volatile java.lang.Object firstName_;
    /**
     * <code>string first_name = 3;</code>
     * @return The firstName.
     */
    @java.lang.Override
    public java.lang.String getFirstName() {
      java.lang.Object ref = firstName_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        firstName_ = s;
        return s;
      }
    }
    /**
     * <code>string first_name = 3;</code>
     * @return The bytes for firstName.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getFirstNameBytes() {
      java.lang.Object ref = firstName_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        firstName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int LAST_NAME_FIELD_NUMBER = 4;
    private volatile java.lang.Object lastName_;
    /**
     * <code>string last_name = 4;</code>
     * @return The lastName.
     */
    @java.lang.Override
    public java.lang.String getLastName() {
      java.lang.Object ref = lastName_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        lastName_ = s;
        return s;
      }
    }
    /**
     * <code>string last_name = 4;</code>
     * @return The bytes for lastName.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getLastNameBytes() {
      java.lang.Object ref = lastName_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        lastName_ = b;
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
      if (id_ != 0) {
        output.writeInt32(1, id_);
      }
      if (!getUsernameBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 2, username_);
      }
      if (!getFirstNameBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 3, firstName_);
      }
      if (!getLastNameBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 4, lastName_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (id_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(1, id_);
      }
      if (!getUsernameBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, username_);
      }
      if (!getFirstNameBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, firstName_);
      }
      if (!getLastNameBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, lastName_);
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
      if (!(obj instanceof CustomerOuterClass.Customer)) {
        return super.equals(obj);
      }
      CustomerOuterClass.Customer other = (CustomerOuterClass.Customer) obj;

      if (getId()
          != other.getId()) return false;
      if (!getUsername()
          .equals(other.getUsername())) return false;
      if (!getFirstName()
          .equals(other.getFirstName())) return false;
      if (!getLastName()
          .equals(other.getLastName())) return false;
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
      hash = (37 * hash) + ID_FIELD_NUMBER;
      hash = (53 * hash) + getId();
      hash = (37 * hash) + USERNAME_FIELD_NUMBER;
      hash = (53 * hash) + getUsername().hashCode();
      hash = (37 * hash) + FIRST_NAME_FIELD_NUMBER;
      hash = (53 * hash) + getFirstName().hashCode();
      hash = (37 * hash) + LAST_NAME_FIELD_NUMBER;
      hash = (53 * hash) + getLastName().hashCode();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static CustomerOuterClass.Customer parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static CustomerOuterClass.Customer parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static CustomerOuterClass.Customer parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static CustomerOuterClass.Customer parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static CustomerOuterClass.Customer parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static CustomerOuterClass.Customer parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static CustomerOuterClass.Customer parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static CustomerOuterClass.Customer parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static CustomerOuterClass.Customer parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static CustomerOuterClass.Customer parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static CustomerOuterClass.Customer parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static CustomerOuterClass.Customer parseFrom(
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
    public static Builder newBuilder(CustomerOuterClass.Customer prototype) {
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
     * Protobuf type {@code Customer}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:Customer)
        CustomerOuterClass.CustomerOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return CustomerOuterClass.internal_static_Customer_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return CustomerOuterClass.internal_static_Customer_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                CustomerOuterClass.Customer.class, CustomerOuterClass.Customer.Builder.class);
      }

      // Construct using CustomerOuterClass.Customer.newBuilder()
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
        id_ = 0;

        username_ = "";

        firstName_ = "";

        lastName_ = "";

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return CustomerOuterClass.internal_static_Customer_descriptor;
      }

      @java.lang.Override
      public CustomerOuterClass.Customer getDefaultInstanceForType() {
        return CustomerOuterClass.Customer.getDefaultInstance();
      }

      @java.lang.Override
      public CustomerOuterClass.Customer build() {
        CustomerOuterClass.Customer result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public CustomerOuterClass.Customer buildPartial() {
        CustomerOuterClass.Customer result = new CustomerOuterClass.Customer(this);
        result.id_ = id_;
        result.username_ = username_;
        result.firstName_ = firstName_;
        result.lastName_ = lastName_;
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
        if (other instanceof CustomerOuterClass.Customer) {
          return mergeFrom((CustomerOuterClass.Customer)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(CustomerOuterClass.Customer other) {
        if (other == CustomerOuterClass.Customer.getDefaultInstance()) return this;
        if (other.getId() != 0) {
          setId(other.getId());
        }
        if (!other.getUsername().isEmpty()) {
          username_ = other.username_;
          onChanged();
        }
        if (!other.getFirstName().isEmpty()) {
          firstName_ = other.firstName_;
          onChanged();
        }
        if (!other.getLastName().isEmpty()) {
          lastName_ = other.lastName_;
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
        CustomerOuterClass.Customer parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (CustomerOuterClass.Customer) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int id_ ;
      /**
       * <code>int32 id = 1;</code>
       * @return The id.
       */
      @java.lang.Override
      public int getId() {
        return id_;
      }
      /**
       * <code>int32 id = 1;</code>
       * @param value The id to set.
       * @return This builder for chaining.
       */
      public Builder setId(int value) {
        
        id_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int32 id = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearId() {
        
        id_ = 0;
        onChanged();
        return this;
      }

      private java.lang.Object username_ = "";
      /**
       * <code>string username = 2;</code>
       * @return The username.
       */
      public java.lang.String getUsername() {
        java.lang.Object ref = username_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          username_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string username = 2;</code>
       * @return The bytes for username.
       */
      public com.google.protobuf.ByteString
          getUsernameBytes() {
        java.lang.Object ref = username_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          username_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string username = 2;</code>
       * @param value The username to set.
       * @return This builder for chaining.
       */
      public Builder setUsername(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        username_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>string username = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearUsername() {
        
        username_ = getDefaultInstance().getUsername();
        onChanged();
        return this;
      }
      /**
       * <code>string username = 2;</code>
       * @param value The bytes for username to set.
       * @return This builder for chaining.
       */
      public Builder setUsernameBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        username_ = value;
        onChanged();
        return this;
      }

      private java.lang.Object firstName_ = "";
      /**
       * <code>string first_name = 3;</code>
       * @return The firstName.
       */
      public java.lang.String getFirstName() {
        java.lang.Object ref = firstName_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          firstName_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string first_name = 3;</code>
       * @return The bytes for firstName.
       */
      public com.google.protobuf.ByteString
          getFirstNameBytes() {
        java.lang.Object ref = firstName_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          firstName_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string first_name = 3;</code>
       * @param value The firstName to set.
       * @return This builder for chaining.
       */
      public Builder setFirstName(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        firstName_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>string first_name = 3;</code>
       * @return This builder for chaining.
       */
      public Builder clearFirstName() {
        
        firstName_ = getDefaultInstance().getFirstName();
        onChanged();
        return this;
      }
      /**
       * <code>string first_name = 3;</code>
       * @param value The bytes for firstName to set.
       * @return This builder for chaining.
       */
      public Builder setFirstNameBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        firstName_ = value;
        onChanged();
        return this;
      }

      private java.lang.Object lastName_ = "";
      /**
       * <code>string last_name = 4;</code>
       * @return The lastName.
       */
      public java.lang.String getLastName() {
        java.lang.Object ref = lastName_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          lastName_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string last_name = 4;</code>
       * @return The bytes for lastName.
       */
      public com.google.protobuf.ByteString
          getLastNameBytes() {
        java.lang.Object ref = lastName_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          lastName_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string last_name = 4;</code>
       * @param value The lastName to set.
       * @return This builder for chaining.
       */
      public Builder setLastName(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        lastName_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>string last_name = 4;</code>
       * @return This builder for chaining.
       */
      public Builder clearLastName() {
        
        lastName_ = getDefaultInstance().getLastName();
        onChanged();
        return this;
      }
      /**
       * <code>string last_name = 4;</code>
       * @param value The bytes for lastName to set.
       * @return This builder for chaining.
       */
      public Builder setLastNameBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        lastName_ = value;
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


      // @@protoc_insertion_point(builder_scope:Customer)
    }

    // @@protoc_insertion_point(class_scope:Customer)
    private static final CustomerOuterClass.Customer DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new CustomerOuterClass.Customer();
    }

    public static CustomerOuterClass.Customer getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<Customer>
        PARSER = new com.google.protobuf.AbstractParser<Customer>() {
      @java.lang.Override
      public Customer parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new Customer(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<Customer> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<Customer> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public CustomerOuterClass.Customer getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Customer_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Customer_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\016customer.proto\"O\n\010Customer\022\n\n\002id\030\001 \001(\005" +
      "\022\020\n\010username\030\002 \001(\t\022\022\n\nfirst_name\030\003 \001(\t\022\021" +
      "\n\tlast_name\030\004 \001(\tb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_Customer_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_Customer_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Customer_descriptor,
        new java.lang.String[] { "Id", "Username", "FirstName", "LastName", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
