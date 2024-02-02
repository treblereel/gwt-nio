let DirectByteBuffer = goog.forwardDeclare('java.nio.DirectByteBuffer$impl');
let Js = goog.forwardDeclare('jsinterop.base.Js$impl');

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
