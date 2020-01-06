@file:Suppress("unused", "ClassName", "EnumEntryName", "FunctionName", "SpellCheckingInspection", "PARAMETER_NAME_CHANGED_ON_OVERRIDE", "UnusedImport", "PackageDirectoryMismatch")
package godot

import godot.gdnative.*
import godot.core.*
import godot.utils.*
import godot.icalls.*
import kotlinx.cinterop.*


// NOTE: THIS FILE IS AUTO GENERATED FROM JSON API CONFIG


open class InputEventKey : InputEventWithModifiers {
    constructor() : super("InputEventKey")
    constructor(variant: Variant) : super(variant)
    internal constructor(mem: COpaquePointer) : super(mem)
    internal constructor(name: String) : super(name)


    // Enums 



    // Signals
    class Signal {
        companion object {
        }
    }


    companion object {
        infix fun from(other: InputEventWithModifiers): InputEventKey = InputEventKey("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: InputEvent): InputEventKey = InputEventKey("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Resource): InputEventKey = InputEventKey("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Reference): InputEventKey = InputEventKey("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Object): InputEventKey = InputEventKey("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Variant): InputEventKey = fromVariant(InputEventKey(""), other)


        // Constants


    }


    // Properties
    open var pressed: Boolean
        get() = throw UninitializedPropertyAccessException("Cannot access property pressed: has no getter")
        set(value) = _icall_Unit_Boolean(setPressedMethodBind, this.rawMemory, value)


    open var scancode: Long
        get() = _icall_Long(getScancodeMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Long(setScancodeMethodBind, this.rawMemory, value)


    open var unicode: Long
        get() = _icall_Long(getUnicodeMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Long(setUnicodeMethodBind, this.rawMemory, value)


    open var echo: Long
        get() = throw UninitializedPropertyAccessException("Cannot access property echo: has no getter")
        set(value) = _icall_Unit_Long(setEchoMethodBind, this.rawMemory, value)




    // Methods
    private val setPressedMethodBind: CPointer<godot_method_bind> by lazy { getMB("InputEventKey", "set_pressed") }
    open fun setPressed(pressed: Boolean) {
        _icall_Unit_Boolean(setPressedMethodBind, this.rawMemory, pressed)
    }


    private val setScancodeMethodBind: CPointer<godot_method_bind> by lazy { getMB("InputEventKey", "set_scancode") }
    open fun setScancode(scancode: Long) {
        _icall_Unit_Long(setScancodeMethodBind, this.rawMemory, scancode)
    }


    private val getScancodeMethodBind: CPointer<godot_method_bind> by lazy { getMB("InputEventKey", "get_scancode") }
    open fun getScancode(): Long {
        return _icall_Long(getScancodeMethodBind, this.rawMemory)
    }


    private val setUnicodeMethodBind: CPointer<godot_method_bind> by lazy { getMB("InputEventKey", "set_unicode") }
    open fun setUnicode(unicode: Long) {
        _icall_Unit_Long(setUnicodeMethodBind, this.rawMemory, unicode)
    }


    private val getUnicodeMethodBind: CPointer<godot_method_bind> by lazy { getMB("InputEventKey", "get_unicode") }
    open fun getUnicode(): Long {
        return _icall_Long(getUnicodeMethodBind, this.rawMemory)
    }


    private val setEchoMethodBind: CPointer<godot_method_bind> by lazy { getMB("InputEventKey", "set_echo") }
    open fun setEcho(echo: Boolean) {
        _icall_Unit_Boolean(setEchoMethodBind, this.rawMemory, echo)
    }


    private val getScancodeWithModifiersMethodBind: CPointer<godot_method_bind> by lazy { getMB("InputEventKey", "get_scancode_with_modifiers") }
    open fun getScancodeWithModifiers(): Long {
        return _icall_Long(getScancodeWithModifiersMethodBind, this.rawMemory)
    }


}
