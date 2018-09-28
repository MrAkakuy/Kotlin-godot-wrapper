@file:Suppress("unused", "ClassName", "EnumEntryName", "FunctionName", "SpellCheckingInspection", "PARAMETER_NAME_CHANGED_ON_OVERRIDE", "UnusedImport", "PackageDirectoryMismatch")
package godot

import godot.gdnative.*
import godot.core.*
import godot.icalls.*
import kotlinx.cinterop.*


// NOTE: THIS FILE IS AUTO GENERATED FROM JSON API CONFIG


open class StyleBoxLine : StyleBox {
    constructor() : super("StyleBoxLine")
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
        infix fun from(other: StyleBox): StyleBoxLine = StyleBoxLine("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Resource): StyleBoxLine = StyleBoxLine("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Reference): StyleBoxLine = StyleBoxLine("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Object): StyleBoxLine = StyleBoxLine("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Variant): StyleBoxLine = fromVariant(StyleBoxLine(""), other)


        // Constants


    }


    // Properties
    open var color: Color
        get() = _icall_Color(getColorMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Color(setColorMethodBind, this.rawMemory, value)
    open fun color(shedule: (Color) -> Unit): Color = color.apply {
        shedule(this)
        color = this
    }


    open var growBegin: Float
        get() = _icall_Float(getGrowBeginMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Float(setGrowBeginMethodBind, this.rawMemory, value)


    open var growEnd: Float
        get() = _icall_Float(getGrowEndMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Float(setGrowEndMethodBind, this.rawMemory, value)


    open var thickness: Int
        get() = _icall_Int(getThicknessMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Int(setThicknessMethodBind, this.rawMemory, value)


    open var vertical: Boolean
        get() = _icall_Boolean(isVerticalMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Boolean(setVerticalMethodBind, this.rawMemory, value)




    // Methods
    private val setColorMethodBind: CPointer<godot_method_bind> by lazy { getMB("StyleBoxLine", "set_color") }
    open fun setColor(color: Color) {
        _icall_Unit_Color(setColorMethodBind, this.rawMemory, color)
    }


    private val getColorMethodBind: CPointer<godot_method_bind> by lazy { getMB("StyleBoxLine", "get_color") }
    open fun getColor(): Color {
        return _icall_Color(getColorMethodBind, this.rawMemory)
    }


    private val setThicknessMethodBind: CPointer<godot_method_bind> by lazy { getMB("StyleBoxLine", "set_thickness") }
    open fun setThickness(thickness: Int) {
        _icall_Unit_Int(setThicknessMethodBind, this.rawMemory, thickness)
    }


    private val getThicknessMethodBind: CPointer<godot_method_bind> by lazy { getMB("StyleBoxLine", "get_thickness") }
    open fun getThickness(): Int {
        return _icall_Int(getThicknessMethodBind, this.rawMemory)
    }


    private val setGrowBeginMethodBind: CPointer<godot_method_bind> by lazy { getMB("StyleBoxLine", "set_grow_begin") }
    open fun setGrowBegin(offset: Float) {
        _icall_Unit_Float(setGrowBeginMethodBind, this.rawMemory, offset)
    }


    private val getGrowBeginMethodBind: CPointer<godot_method_bind> by lazy { getMB("StyleBoxLine", "get_grow_begin") }
    open fun getGrowBegin(): Float {
        return _icall_Float(getGrowBeginMethodBind, this.rawMemory)
    }


    private val setGrowEndMethodBind: CPointer<godot_method_bind> by lazy { getMB("StyleBoxLine", "set_grow_end") }
    open fun setGrowEnd(offset: Float) {
        _icall_Unit_Float(setGrowEndMethodBind, this.rawMemory, offset)
    }


    private val getGrowEndMethodBind: CPointer<godot_method_bind> by lazy { getMB("StyleBoxLine", "get_grow_end") }
    open fun getGrowEnd(): Float {
        return _icall_Float(getGrowEndMethodBind, this.rawMemory)
    }


    private val setVerticalMethodBind: CPointer<godot_method_bind> by lazy { getMB("StyleBoxLine", "set_vertical") }
    open fun setVertical(vertical: Boolean) {
        _icall_Unit_Boolean(setVerticalMethodBind, this.rawMemory, vertical)
    }


    private val isVerticalMethodBind: CPointer<godot_method_bind> by lazy { getMB("StyleBoxLine", "is_vertical") }
    open fun isVertical(): Boolean {
        return _icall_Boolean(isVerticalMethodBind, this.rawMemory)
    }


}
