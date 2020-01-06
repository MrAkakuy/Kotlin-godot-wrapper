@file:Suppress("unused", "ClassName", "EnumEntryName", "FunctionName", "SpellCheckingInspection", "PARAMETER_NAME_CHANGED_ON_OVERRIDE", "UnusedImport", "PackageDirectoryMismatch")
package godot

import godot.gdnative.*
import godot.core.*
import godot.utils.*
import godot.icalls.*
import kotlinx.cinterop.*


// NOTE: THIS FILE IS AUTO GENERATED FROM JSON API CONFIG


open class VisualShaderNodeCubeMap : VisualShaderNode {
    constructor() : super("VisualShaderNodeCubeMap")
    constructor(variant: Variant) : super(variant)
    internal constructor(mem: COpaquePointer) : super(mem)
    internal constructor(name: String) : super(name)


    // Enums 

    enum class TextureType(val id: Long) {
        TYPE_DATA(0),
        TYPE_COLOR(1),
        TYPE_NORMALMAP(2),
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
        infix fun from(other: VisualShaderNode): VisualShaderNodeCubeMap = VisualShaderNodeCubeMap("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Resource): VisualShaderNodeCubeMap = VisualShaderNodeCubeMap("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Reference): VisualShaderNodeCubeMap = VisualShaderNodeCubeMap("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Object): VisualShaderNodeCubeMap = VisualShaderNodeCubeMap("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Variant): VisualShaderNodeCubeMap = fromVariant(VisualShaderNodeCubeMap(""), other)


        // Constants
        const val TYPE_DATA: Long = 0
        const val TYPE_COLOR: Long = 1
        const val TYPE_NORMALMAP: Long = 2


    }


    // Properties
    open var cubeMap: CubeMap
        get() = _icall_CubeMap(getCubeMapMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Object(setCubeMapMethodBind, this.rawMemory, value)


    open var textureType: Long
        get() = _icall_Long(getTextureTypeMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Long(setTextureTypeMethodBind, this.rawMemory, value)




    // Methods
    private val setCubeMapMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualShaderNodeCubeMap", "set_cube_map") }
    open fun setCubeMap(value: CubeMap) {
        _icall_Unit_Object(setCubeMapMethodBind, this.rawMemory, value)
    }


    private val getCubeMapMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualShaderNodeCubeMap", "get_cube_map") }
    open fun getCubeMap(): CubeMap {
        return _icall_CubeMap(getCubeMapMethodBind, this.rawMemory)
    }


    private val setTextureTypeMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualShaderNodeCubeMap", "set_texture_type") }
    open fun setTextureType(value: Long) {
        _icall_Unit_Long(setTextureTypeMethodBind, this.rawMemory, value)
    }


    private val getTextureTypeMethodBind: CPointer<godot_method_bind> by lazy { getMB("VisualShaderNodeCubeMap", "get_texture_type") }
    open fun getTextureType(): VisualShaderNodeCubeMap.TextureType {
        return VisualShaderNodeCubeMap.TextureType.fromInt(_icall_Long(getTextureTypeMethodBind, this.rawMemory))
    }


}
