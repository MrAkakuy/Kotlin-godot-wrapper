@file:Suppress("unused", "ClassName", "EnumEntryName", "FunctionName", "SpellCheckingInspection", "PARAMETER_NAME_CHANGED_ON_OVERRIDE", "UnusedImport", "PackageDirectoryMismatch")
package godot

import godot.gdnative.*
import godot.core.*
import godot.utils.*
import godot.icalls.*
import kotlinx.cinterop.*


// NOTE: THIS FILE IS AUTO GENERATED FROM JSON API CONFIG


open class AnimationNodeTimeScale : AnimationNode {
    constructor() : super("AnimationNodeTimeScale")
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
        infix fun from(other: AnimationNode): AnimationNodeTimeScale = AnimationNodeTimeScale("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Resource): AnimationNodeTimeScale = AnimationNodeTimeScale("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Reference): AnimationNodeTimeScale = AnimationNodeTimeScale("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Object): AnimationNodeTimeScale = AnimationNodeTimeScale("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Variant): AnimationNodeTimeScale = fromVariant(AnimationNodeTimeScale(""), other)


        // Constants


    }


    // Properties
    open var scale: Double
        get() = _icall_Double(getScaleMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Double(setScaleMethodBind, this.rawMemory, value)




    // Methods
    private val setScaleMethodBind: CPointer<godot_method_bind> by lazy { getMB("AnimationNodeTimeScale", "set_scale") }
    open fun setScale(scale: Double) {
        _icall_Unit_Double(setScaleMethodBind, this.rawMemory, scale)
    }


    private val getScaleMethodBind: CPointer<godot_method_bind> by lazy { getMB("AnimationNodeTimeScale", "get_scale") }
    open fun getScale(): Double {
        return _icall_Double(getScaleMethodBind, this.rawMemory)
    }


}
