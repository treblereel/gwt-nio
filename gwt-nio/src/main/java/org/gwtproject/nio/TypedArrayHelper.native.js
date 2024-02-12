let DirectByteBuffer = goog.forwardDeclare('java.nio.DirectByteBuffer$impl');
let DirectReadWriteByteBuffer = goog.forwardDeclare('java.nio.DirectReadWriteByteBuffer$impl');

/**
 * @nodts @return {ArrayBuffer}
 * @suppress {checkTypes}
 */
TypedArrayHelper._wrap = function(/** ArrayBuffer */ ab) {
    TypedArrayHelper.$clinit();
    return DirectReadWriteByteBuffer.$create__elemental2_core_ArrayBuffer(ab);
}

/** @nodts @return {ArrayBufferView} */
TypedArrayHelper.unwrap = function(/** ByteBuffer */ bb) {
    TypedArrayHelper.$clinit();
    return /**@type {DirectByteBuffer}*/ (Js.m_uncheckedCast__java_lang_Object__java_lang_Object(bb)).m_getTypedArray__elemental2_core_ArrayBufferView();
}
/** @nodts @return {ByteBuffer} */
TypedArrayHelper.stringToByteBuffer = function(/** ?string */ s) {
    TypedArrayHelper.$clinit();
    return TypedArrayHelper.f_buffer__org_gwtproject_nio_TypedArrayHelper_.m_stringToByteBuffer__java_lang_String__java_nio_ByteBuffer(s);
}
