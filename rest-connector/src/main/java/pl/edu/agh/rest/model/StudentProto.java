// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: student.proto

package pl.edu.agh.rest.model;

public final class StudentProto {
  private StudentProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface StudentOrBuilder extends
      // @@protoc_insertion_point(interface_extends:pl.edu.agh.soa.Student)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>string name = 2;</code>
     * @return The name.
     */
    java.lang.String getName();
    /**
     * <code>string name = 2;</code>
     * @return The bytes for name.
     */
    com.google.protobuf.ByteString
        getNameBytes();

    /**
     * <code>int32 album = 1;</code>
     * @return The album.
     */
    int getAlbum();

    /**
     * <code>string picturePath = 4;</code>
     * @return The picturePath.
     */
    java.lang.String getPicturePath();
    /**
     * <code>string picturePath = 4;</code>
     * @return The bytes for picturePath.
     */
    com.google.protobuf.ByteString
        getPicturePathBytes();

    /**
     * <code>repeated string courses = 5;</code>
     * @return A list containing the courses.
     */
    java.util.List<java.lang.String>
        getCoursesList();
    /**
     * <code>repeated string courses = 5;</code>
     * @return The count of courses.
     */
    int getCoursesCount();
    /**
     * <code>repeated string courses = 5;</code>
     * @param index The index of the element to return.
     * @return The courses at the given index.
     */
    java.lang.String getCourses(int index);
    /**
     * <code>repeated string courses = 5;</code>
     * @param index The index of the value to return.
     * @return The bytes of the courses at the given index.
     */
    com.google.protobuf.ByteString
        getCoursesBytes(int index);
  }
  /**
   * Protobuf type {@code pl.edu.agh.soa.Student}
   */
  public  static final class Student extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:pl.edu.agh.soa.Student)
      StudentOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use Student.newBuilder() to construct.
    private Student(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private Student() {
      name_ = "";
      picturePath_ = "";
      courses_ = com.google.protobuf.LazyStringArrayList.EMPTY;
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new Student();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private Student(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      int mutable_bitField0_ = 0;
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

              album_ = input.readInt32();
              break;
            }
            case 18: {
              java.lang.String s = input.readStringRequireUtf8();

              name_ = s;
              break;
            }
            case 34: {
              java.lang.String s = input.readStringRequireUtf8();

              picturePath_ = s;
              break;
            }
            case 42: {
              java.lang.String s = input.readStringRequireUtf8();
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                courses_ = new com.google.protobuf.LazyStringArrayList();
                mutable_bitField0_ |= 0x00000001;
              }
              courses_.add(s);
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
        if (((mutable_bitField0_ & 0x00000001) != 0)) {
          courses_ = courses_.getUnmodifiableView();
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return pl.edu.agh.rest.model.StudentProto.internal_static_pl_edu_agh_soa_Student_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return pl.edu.agh.rest.model.StudentProto.internal_static_pl_edu_agh_soa_Student_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              pl.edu.agh.rest.model.StudentProto.Student.class, pl.edu.agh.rest.model.StudentProto.Student.Builder.class);
    }

    public static final int NAME_FIELD_NUMBER = 2;
    private volatile java.lang.Object name_;
    /**
     * <code>string name = 2;</code>
     * @return The name.
     */
    public java.lang.String getName() {
      java.lang.Object ref = name_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        name_ = s;
        return s;
      }
    }
    /**
     * <code>string name = 2;</code>
     * @return The bytes for name.
     */
    public com.google.protobuf.ByteString
        getNameBytes() {
      java.lang.Object ref = name_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        name_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int ALBUM_FIELD_NUMBER = 1;
    private int album_;
    /**
     * <code>int32 album = 1;</code>
     * @return The album.
     */
    public int getAlbum() {
      return album_;
    }

    public static final int PICTUREPATH_FIELD_NUMBER = 4;
    private volatile java.lang.Object picturePath_;
    /**
     * <code>string picturePath = 4;</code>
     * @return The picturePath.
     */
    public java.lang.String getPicturePath() {
      java.lang.Object ref = picturePath_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        picturePath_ = s;
        return s;
      }
    }
    /**
     * <code>string picturePath = 4;</code>
     * @return The bytes for picturePath.
     */
    public com.google.protobuf.ByteString
        getPicturePathBytes() {
      java.lang.Object ref = picturePath_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        picturePath_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int COURSES_FIELD_NUMBER = 5;
    private com.google.protobuf.LazyStringList courses_;
    /**
     * <code>repeated string courses = 5;</code>
     * @return A list containing the courses.
     */
    public com.google.protobuf.ProtocolStringList
        getCoursesList() {
      return courses_;
    }
    /**
     * <code>repeated string courses = 5;</code>
     * @return The count of courses.
     */
    public int getCoursesCount() {
      return courses_.size();
    }
    /**
     * <code>repeated string courses = 5;</code>
     * @param index The index of the element to return.
     * @return The courses at the given index.
     */
    public java.lang.String getCourses(int index) {
      return courses_.get(index);
    }
    /**
     * <code>repeated string courses = 5;</code>
     * @param index The index of the value to return.
     * @return The bytes of the courses at the given index.
     */
    public com.google.protobuf.ByteString
        getCoursesBytes(int index) {
      return courses_.getByteString(index);
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
      if (album_ != 0) {
        output.writeInt32(1, album_);
      }
      if (!getNameBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 2, name_);
      }
      if (!getPicturePathBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 4, picturePath_);
      }
      for (int i = 0; i < courses_.size(); i++) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 5, courses_.getRaw(i));
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (album_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(1, album_);
      }
      if (!getNameBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, name_);
      }
      if (!getPicturePathBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, picturePath_);
      }
      {
        int dataSize = 0;
        for (int i = 0; i < courses_.size(); i++) {
          dataSize += computeStringSizeNoTag(courses_.getRaw(i));
        }
        size += dataSize;
        size += 1 * getCoursesList().size();
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
      if (!(obj instanceof pl.edu.agh.rest.model.StudentProto.Student)) {
        return super.equals(obj);
      }
      pl.edu.agh.rest.model.StudentProto.Student other = (pl.edu.agh.rest.model.StudentProto.Student) obj;

      if (!getName()
          .equals(other.getName())) return false;
      if (getAlbum()
          != other.getAlbum()) return false;
      if (!getPicturePath()
          .equals(other.getPicturePath())) return false;
      if (!getCoursesList()
          .equals(other.getCoursesList())) return false;
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
      hash = (37 * hash) + NAME_FIELD_NUMBER;
      hash = (53 * hash) + getName().hashCode();
      hash = (37 * hash) + ALBUM_FIELD_NUMBER;
      hash = (53 * hash) + getAlbum();
      hash = (37 * hash) + PICTUREPATH_FIELD_NUMBER;
      hash = (53 * hash) + getPicturePath().hashCode();
      if (getCoursesCount() > 0) {
        hash = (37 * hash) + COURSES_FIELD_NUMBER;
        hash = (53 * hash) + getCoursesList().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static pl.edu.agh.rest.model.StudentProto.Student parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static pl.edu.agh.rest.model.StudentProto.Student parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static pl.edu.agh.rest.model.StudentProto.Student parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static pl.edu.agh.rest.model.StudentProto.Student parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static pl.edu.agh.rest.model.StudentProto.Student parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static pl.edu.agh.rest.model.StudentProto.Student parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static pl.edu.agh.rest.model.StudentProto.Student parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static pl.edu.agh.rest.model.StudentProto.Student parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static pl.edu.agh.rest.model.StudentProto.Student parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static pl.edu.agh.rest.model.StudentProto.Student parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static pl.edu.agh.rest.model.StudentProto.Student parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static pl.edu.agh.rest.model.StudentProto.Student parseFrom(
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
    public static Builder newBuilder(pl.edu.agh.rest.model.StudentProto.Student prototype) {
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
     * Protobuf type {@code pl.edu.agh.soa.Student}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:pl.edu.agh.soa.Student)
        pl.edu.agh.rest.model.StudentProto.StudentOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return pl.edu.agh.rest.model.StudentProto.internal_static_pl_edu_agh_soa_Student_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return pl.edu.agh.rest.model.StudentProto.internal_static_pl_edu_agh_soa_Student_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                pl.edu.agh.rest.model.StudentProto.Student.class, pl.edu.agh.rest.model.StudentProto.Student.Builder.class);
      }

      // Construct using pl.edu.agh.rest.model.StudentProto.Student.newBuilder()
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
        name_ = "";

        album_ = 0;

        picturePath_ = "";

        courses_ = com.google.protobuf.LazyStringArrayList.EMPTY;
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return pl.edu.agh.rest.model.StudentProto.internal_static_pl_edu_agh_soa_Student_descriptor;
      }

      @java.lang.Override
      public pl.edu.agh.rest.model.StudentProto.Student getDefaultInstanceForType() {
        return pl.edu.agh.rest.model.StudentProto.Student.getDefaultInstance();
      }

      @java.lang.Override
      public pl.edu.agh.rest.model.StudentProto.Student build() {
        pl.edu.agh.rest.model.StudentProto.Student result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public pl.edu.agh.rest.model.StudentProto.Student buildPartial() {
        pl.edu.agh.rest.model.StudentProto.Student result = new pl.edu.agh.rest.model.StudentProto.Student(this);
        int from_bitField0_ = bitField0_;
        result.name_ = name_;
        result.album_ = album_;
        result.picturePath_ = picturePath_;
        if (((bitField0_ & 0x00000001) != 0)) {
          courses_ = courses_.getUnmodifiableView();
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.courses_ = courses_;
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
        if (other instanceof pl.edu.agh.rest.model.StudentProto.Student) {
          return mergeFrom((pl.edu.agh.rest.model.StudentProto.Student)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(pl.edu.agh.rest.model.StudentProto.Student other) {
        if (other == pl.edu.agh.rest.model.StudentProto.Student.getDefaultInstance()) return this;
        if (!other.getName().isEmpty()) {
          name_ = other.name_;
          onChanged();
        }
        if (other.getAlbum() != 0) {
          setAlbum(other.getAlbum());
        }
        if (!other.getPicturePath().isEmpty()) {
          picturePath_ = other.picturePath_;
          onChanged();
        }
        if (!other.courses_.isEmpty()) {
          if (courses_.isEmpty()) {
            courses_ = other.courses_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureCoursesIsMutable();
            courses_.addAll(other.courses_);
          }
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
        pl.edu.agh.rest.model.StudentProto.Student parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (pl.edu.agh.rest.model.StudentProto.Student) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private java.lang.Object name_ = "";
      /**
       * <code>string name = 2;</code>
       * @return The name.
       */
      public java.lang.String getName() {
        java.lang.Object ref = name_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          name_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string name = 2;</code>
       * @return The bytes for name.
       */
      public com.google.protobuf.ByteString
          getNameBytes() {
        java.lang.Object ref = name_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          name_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string name = 2;</code>
       * @param value The name to set.
       * @return This builder for chaining.
       */
      public Builder setName(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        name_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>string name = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearName() {
        
        name_ = getDefaultInstance().getName();
        onChanged();
        return this;
      }
      /**
       * <code>string name = 2;</code>
       * @param value The bytes for name to set.
       * @return This builder for chaining.
       */
      public Builder setNameBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        name_ = value;
        onChanged();
        return this;
      }

      private int album_ ;
      /**
       * <code>int32 album = 1;</code>
       * @return The album.
       */
      public int getAlbum() {
        return album_;
      }
      /**
       * <code>int32 album = 1;</code>
       * @param value The album to set.
       * @return This builder for chaining.
       */
      public Builder setAlbum(int value) {
        
        album_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int32 album = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearAlbum() {
        
        album_ = 0;
        onChanged();
        return this;
      }

      private java.lang.Object picturePath_ = "";
      /**
       * <code>string picturePath = 4;</code>
       * @return The picturePath.
       */
      public java.lang.String getPicturePath() {
        java.lang.Object ref = picturePath_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          picturePath_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string picturePath = 4;</code>
       * @return The bytes for picturePath.
       */
      public com.google.protobuf.ByteString
          getPicturePathBytes() {
        java.lang.Object ref = picturePath_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          picturePath_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string picturePath = 4;</code>
       * @param value The picturePath to set.
       * @return This builder for chaining.
       */
      public Builder setPicturePath(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        picturePath_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>string picturePath = 4;</code>
       * @return This builder for chaining.
       */
      public Builder clearPicturePath() {
        
        picturePath_ = getDefaultInstance().getPicturePath();
        onChanged();
        return this;
      }
      /**
       * <code>string picturePath = 4;</code>
       * @param value The bytes for picturePath to set.
       * @return This builder for chaining.
       */
      public Builder setPicturePathBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        picturePath_ = value;
        onChanged();
        return this;
      }

      private com.google.protobuf.LazyStringList courses_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      private void ensureCoursesIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          courses_ = new com.google.protobuf.LazyStringArrayList(courses_);
          bitField0_ |= 0x00000001;
         }
      }
      /**
       * <code>repeated string courses = 5;</code>
       * @return A list containing the courses.
       */
      public com.google.protobuf.ProtocolStringList
          getCoursesList() {
        return courses_.getUnmodifiableView();
      }
      /**
       * <code>repeated string courses = 5;</code>
       * @return The count of courses.
       */
      public int getCoursesCount() {
        return courses_.size();
      }
      /**
       * <code>repeated string courses = 5;</code>
       * @param index The index of the element to return.
       * @return The courses at the given index.
       */
      public java.lang.String getCourses(int index) {
        return courses_.get(index);
      }
      /**
       * <code>repeated string courses = 5;</code>
       * @param index The index of the value to return.
       * @return The bytes of the courses at the given index.
       */
      public com.google.protobuf.ByteString
          getCoursesBytes(int index) {
        return courses_.getByteString(index);
      }
      /**
       * <code>repeated string courses = 5;</code>
       * @param index The index to set the value at.
       * @param value The courses to set.
       * @return This builder for chaining.
       */
      public Builder setCourses(
          int index, java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  ensureCoursesIsMutable();
        courses_.set(index, value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated string courses = 5;</code>
       * @param value The courses to add.
       * @return This builder for chaining.
       */
      public Builder addCourses(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  ensureCoursesIsMutable();
        courses_.add(value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated string courses = 5;</code>
       * @param values The courses to add.
       * @return This builder for chaining.
       */
      public Builder addAllCourses(
          java.lang.Iterable<java.lang.String> values) {
        ensureCoursesIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, courses_);
        onChanged();
        return this;
      }
      /**
       * <code>repeated string courses = 5;</code>
       * @return This builder for chaining.
       */
      public Builder clearCourses() {
        courses_ = com.google.protobuf.LazyStringArrayList.EMPTY;
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
        return this;
      }
      /**
       * <code>repeated string courses = 5;</code>
       * @param value The bytes of the courses to add.
       * @return This builder for chaining.
       */
      public Builder addCoursesBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        ensureCoursesIsMutable();
        courses_.add(value);
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


      // @@protoc_insertion_point(builder_scope:pl.edu.agh.soa.Student)
    }

    // @@protoc_insertion_point(class_scope:pl.edu.agh.soa.Student)
    private static final pl.edu.agh.rest.model.StudentProto.Student DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new pl.edu.agh.rest.model.StudentProto.Student();
    }

    public static pl.edu.agh.rest.model.StudentProto.Student getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<Student>
        PARSER = new com.google.protobuf.AbstractParser<Student>() {
      @java.lang.Override
      public Student parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new Student(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<Student> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<Student> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public pl.edu.agh.rest.model.StudentProto.Student getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_pl_edu_agh_soa_Student_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_pl_edu_agh_soa_Student_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\rstudent.proto\022\016pl.edu.agh.soa\"L\n\007Stude" +
      "nt\022\014\n\004name\030\002 \001(\t\022\r\n\005album\030\001 \001(\005\022\023\n\013pictu" +
      "rePath\030\004 \001(\t\022\017\n\007courses\030\005 \003(\tB%\n\025pl.edu." +
      "agh.rest.modelB\014StudentProtob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_pl_edu_agh_soa_Student_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_pl_edu_agh_soa_Student_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_pl_edu_agh_soa_Student_descriptor,
        new java.lang.String[] { "Name", "Album", "PicturePath", "Courses", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
