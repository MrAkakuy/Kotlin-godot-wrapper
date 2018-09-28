@file:Suppress("unused", "ClassName", "EnumEntryName", "FunctionName", "SpellCheckingInspection", "PARAMETER_NAME_CHANGED_ON_OVERRIDE", "UnusedImport", "PackageDirectoryMismatch")
package godot

import godot.gdnative.*
import godot.core.*
import godot.icalls.*
import kotlinx.cinterop.*


// NOTE: THIS FILE IS AUTO GENERATED FROM JSON API CONFIG


open class Material : Resource {
    private constructor() : super("")
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
        infix fun from(other: Resource): Material = Material("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Reference): Material = Material("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Object): Material = Material("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Variant): Material = fromVariant(Material(""), other)


        // Constants
        const val RENDER_PRIORITY_MAX: Int = 127
        const val RENDER_PRIORITY_MIN: Int = -128


    }


    // Properties
    open var renderPriority: Int
        get() = _icall_Int(getRenderPriorityMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Int(setRenderPriorityMethodBind, this.rawMemory, value)


    open var nextPass: Material
        get() = _icall_Material(getNextPassMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Object(setNextPassMethodBind, this.rawMemory, value)




    // Methods
    private val setNextPassMethodBind: CPointer<godot_method_bind> by lazy { getMB("Material", "set_next_pass") }
    open fun setNextPass(nextPass: Material) {
        _icall_Unit_Object(setNextPassMethodBind, this.rawMemory, nextPass)
    }


    private val getNextPassMethodBind: CPointer<godot_method_bind> by lazy { getMB("Material", "get_next_pass") }
    open fun getNextPass(): Material {
        return _icall_Material(getNextPassMethodBind, this.rawMemory)
    }


    private val setRenderPriorityMethodBind: CPointer<godot_method_bind> by lazy { getMB("Material", "set_render_priority") }
    open fun setRenderPriority(priority: Int) {
        _icall_Unit_Int(setRenderPriorityMethodBind, this.rawMemory, priority)
    }


    private val getRenderPriorityMethodBind: CPointer<godot_method_bind> by lazy { getMB("Material", "get_render_priority") }
    open fun getRenderPriority(): Int {
        return _icall_Int(getRenderPriorityMethodBind, this.rawMemory)
    }


}
