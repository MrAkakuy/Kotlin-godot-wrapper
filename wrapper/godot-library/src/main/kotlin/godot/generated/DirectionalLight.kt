@file:Suppress("unused", "ClassName", "EnumEntryName", "FunctionName", "SpellCheckingInspection", "PARAMETER_NAME_CHANGED_ON_OVERRIDE", "UnusedImport", "PackageDirectoryMismatch")
package godot

import godot.gdnative.*
import godot.core.*
import godot.utils.*
import godot.icalls.*
import kotlinx.cinterop.*


// NOTE: THIS FILE IS AUTO GENERATED FROM JSON API CONFIG


open class DirectionalLight : Light {
    constructor() : super("DirectionalLight")
    constructor(variant: Variant) : super(variant)
    internal constructor(mem: COpaquePointer) : super(mem)
    internal constructor(name: String) : super(name)


    // Enums 

    enum class ShadowMode(val id: Long) {
        SHADOW_ORTHOGONAL(0),
        SHADOW_PARALLEL_2_SPLITS(1),
        SHADOW_PARALLEL_4_SPLITS(2),
        ;

        companion object {
            fun fromInt(value: Long) = values().single { it.id == value }
        }
    }
    enum class ShadowDepthRange(val id: Long) {
        SHADOW_DEPTH_RANGE_STABLE(0),
        SHADOW_DEPTH_RANGE_OPTIMIZED(1),
        ;

        companion object {
            fun fromInt(value: Long) = values().single { it.id == value }
        }
    }


    // Signals
    class Signal {
        companion object {
        }
    }


    companion object {
        infix fun from(other: Light): DirectionalLight = DirectionalLight("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: VisualInstance): DirectionalLight = DirectionalLight("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Spatial): DirectionalLight = DirectionalLight("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Node): DirectionalLight = DirectionalLight("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Object): DirectionalLight = DirectionalLight("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Variant): DirectionalLight = fromVariant(DirectionalLight(""), other)


        // Constants
        const val SHADOW_ORTHOGONAL: Long = 0
        const val SHADOW_PARALLEL_2_SPLITS: Long = 1
        const val SHADOW_PARALLEL_4_SPLITS: Long = 2
        const val SHADOW_DEPTH_RANGE_STABLE: Long = 0
        const val SHADOW_DEPTH_RANGE_OPTIMIZED: Long = 1


    }


    // Properties
    open var directionalShadowMode: Long
        get() = _icall_Long(getShadowModeMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Long(setShadowModeMethodBind, this.rawMemory, value)


    open var directionalShadowBlendSplits: Boolean
        get() = _icall_Boolean(isBlendSplitsEnabledMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Boolean(setBlendSplitsMethodBind, this.rawMemory, value)


    open var directionalShadowDepthRange: Long
        get() = _icall_Long(getShadowDepthRangeMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Long(setShadowDepthRangeMethodBind, this.rawMemory, value)




    // Methods
    private val setShadowModeMethodBind: CPointer<godot_method_bind> by lazy { getMB("DirectionalLight", "set_shadow_mode") }
    open fun setShadowMode(mode: Long) {
        _icall_Unit_Long(setShadowModeMethodBind, this.rawMemory, mode)
    }


    private val getShadowModeMethodBind: CPointer<godot_method_bind> by lazy { getMB("DirectionalLight", "get_shadow_mode") }
    open fun getShadowMode(): DirectionalLight.ShadowMode {
        return DirectionalLight.ShadowMode.fromInt(_icall_Long(getShadowModeMethodBind, this.rawMemory))
    }


    private val setShadowDepthRangeMethodBind: CPointer<godot_method_bind> by lazy { getMB("DirectionalLight", "set_shadow_depth_range") }
    open fun setShadowDepthRange(mode: Long) {
        _icall_Unit_Long(setShadowDepthRangeMethodBind, this.rawMemory, mode)
    }


    private val getShadowDepthRangeMethodBind: CPointer<godot_method_bind> by lazy { getMB("DirectionalLight", "get_shadow_depth_range") }
    open fun getShadowDepthRange(): DirectionalLight.ShadowDepthRange {
        return DirectionalLight.ShadowDepthRange.fromInt(_icall_Long(getShadowDepthRangeMethodBind, this.rawMemory))
    }


    private val setBlendSplitsMethodBind: CPointer<godot_method_bind> by lazy { getMB("DirectionalLight", "set_blend_splits") }
    open fun setBlendSplits(enabled: Boolean) {
        _icall_Unit_Boolean(setBlendSplitsMethodBind, this.rawMemory, enabled)
    }


    private val isBlendSplitsEnabledMethodBind: CPointer<godot_method_bind> by lazy { getMB("DirectionalLight", "is_blend_splits_enabled") }
    open fun isBlendSplitsEnabled(): Boolean {
        return _icall_Boolean(isBlendSplitsEnabledMethodBind, this.rawMemory)
    }


}
