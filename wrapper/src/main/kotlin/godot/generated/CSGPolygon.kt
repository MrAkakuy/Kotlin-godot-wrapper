@file:Suppress("unused", "ClassName", "EnumEntryName", "FunctionName", "SpellCheckingInspection", "PARAMETER_NAME_CHANGED_ON_OVERRIDE", "UnusedImport", "PackageDirectoryMismatch")
package godot

import godot.gdnative.*
import godot.core.*
import godot.icalls.*
import kotlinx.cinterop.*


// NOTE: THIS FILE IS AUTO GENERATED FROM JSON API CONFIG


open class CSGPolygon : CSGPrimitive {
    constructor() : super("CSGPolygon")
    constructor(variant: Variant) : super(variant)
    internal constructor(mem: COpaquePointer) : super(mem)
    internal constructor(name: String) : super(name)


    // Enums 

    enum class PathRotation(val id: Int) {
        PATH_ROTATION_POLYGON(0),
        PATH_ROTATION_PATH(1),
        PATH_ROTATION_PATH_FOLLOW(2),
        ;

        companion object {
            fun fromInt(value: Int) = values().single { it.id == value }
        }
    }
    enum class Mode(val id: Int) {
        MODE_DEPTH(0),
        MODE_SPIN(1),
        MODE_PATH(2),
        ;

        companion object {
            fun fromInt(value: Int) = values().single { it.id == value }
        }
    }


    // Signals
    class Signal {
        companion object {
        }
    }


    companion object {
        infix fun from(other: CSGPrimitive): CSGPolygon = CSGPolygon("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: CSGShape): CSGPolygon = CSGPolygon("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: VisualInstance): CSGPolygon = CSGPolygon("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Spatial): CSGPolygon = CSGPolygon("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Node): CSGPolygon = CSGPolygon("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Object): CSGPolygon = CSGPolygon("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Variant): CSGPolygon = fromVariant(CSGPolygon(""), other)


        // Constants
        const val MODE_DEPTH: Int = 0
        const val MODE_SPIN: Int = 1
        const val MODE_PATH: Int = 2
        const val PATH_ROTATION_POLYGON: Int = 0
        const val PATH_ROTATION_PATH: Int = 1
        const val PATH_ROTATION_PATH_FOLLOW: Int = 2


    }


    // Properties
    open var polygon: PoolVector2Array
        get() = _icall_PoolVector2Array(getPolygonMethodBind, this.rawMemory)
        set(value) = _icall_Unit_PoolVector2Array(setPolygonMethodBind, this.rawMemory, value)


    open var mode: Int
        get() = _icall_Int(getModeMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Int(setModeMethodBind, this.rawMemory, value)


    open var depth: Float
        get() = _icall_Float(getDepthMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Float(setDepthMethodBind, this.rawMemory, value)


    open var spinDegrees: Float
        get() = _icall_Float(getSpinDegreesMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Float(setSpinDegreesMethodBind, this.rawMemory, value)


    open var spinSides: Int
        get() = _icall_Int(getSpinSidesMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Int(setSpinSidesMethodBind, this.rawMemory, value)


    open var pathNode: NodePath
        get() = _icall_NodePath(getPathNodeMethodBind, this.rawMemory)
        set(value) = _icall_Unit_NodePath(setPathNodeMethodBind, this.rawMemory, value)


    open var pathInterval: Float
        get() = _icall_Float(getPathIntervalMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Float(setPathIntervalMethodBind, this.rawMemory, value)


    open var pathRotation: Int
        get() = _icall_Int(getPathRotationMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Int(setPathRotationMethodBind, this.rawMemory, value)


    open var smoothFaces: Boolean
        get() = _icall_Boolean(getSmoothFacesMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Boolean(setSmoothFacesMethodBind, this.rawMemory, value)


    open var material: Material
        get() = _icall_Material(getMaterialMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Object(setMaterialMethodBind, this.rawMemory, value)




    // Methods
    private val setPolygonMethodBind: CPointer<godot_method_bind> by lazy { getMB("CSGPolygon", "set_polygon") }
    open fun setPolygon(polygon: PoolVector2Array) {
        _icall_Unit_PoolVector2Array(setPolygonMethodBind, this.rawMemory, polygon)
    }


    private val getPolygonMethodBind: CPointer<godot_method_bind> by lazy { getMB("CSGPolygon", "get_polygon") }
    open fun getPolygon(): PoolVector2Array {
        return _icall_PoolVector2Array(getPolygonMethodBind, this.rawMemory)
    }


    private val setModeMethodBind: CPointer<godot_method_bind> by lazy { getMB("CSGPolygon", "set_mode") }
    open fun setMode(mode: Int) {
        _icall_Unit_Int(setModeMethodBind, this.rawMemory, mode)
    }


    private val getModeMethodBind: CPointer<godot_method_bind> by lazy { getMB("CSGPolygon", "get_mode") }
    open fun getMode(): CSGPolygon.Mode {
        return CSGPolygon.Mode.fromInt(_icall_Int(getModeMethodBind, this.rawMemory))
    }


    private val setDepthMethodBind: CPointer<godot_method_bind> by lazy { getMB("CSGPolygon", "set_depth") }
    open fun setDepth(depth: Float) {
        _icall_Unit_Float(setDepthMethodBind, this.rawMemory, depth)
    }


    private val getDepthMethodBind: CPointer<godot_method_bind> by lazy { getMB("CSGPolygon", "get_depth") }
    open fun getDepth(): Float {
        return _icall_Float(getDepthMethodBind, this.rawMemory)
    }


    private val setSpinDegreesMethodBind: CPointer<godot_method_bind> by lazy { getMB("CSGPolygon", "set_spin_degrees") }
    open fun setSpinDegrees(degrees: Float) {
        _icall_Unit_Float(setSpinDegreesMethodBind, this.rawMemory, degrees)
    }


    private val getSpinDegreesMethodBind: CPointer<godot_method_bind> by lazy { getMB("CSGPolygon", "get_spin_degrees") }
    open fun getSpinDegrees(): Float {
        return _icall_Float(getSpinDegreesMethodBind, this.rawMemory)
    }


    private val setSpinSidesMethodBind: CPointer<godot_method_bind> by lazy { getMB("CSGPolygon", "set_spin_sides") }
    open fun setSpinSides(spinSides: Int) {
        _icall_Unit_Int(setSpinSidesMethodBind, this.rawMemory, spinSides)
    }


    private val getSpinSidesMethodBind: CPointer<godot_method_bind> by lazy { getMB("CSGPolygon", "get_spin_sides") }
    open fun getSpinSides(): Int {
        return _icall_Int(getSpinSidesMethodBind, this.rawMemory)
    }


    private val setPathNodeMethodBind: CPointer<godot_method_bind> by lazy { getMB("CSGPolygon", "set_path_node") }
    open fun setPathNode(path: NodePath) {
        _icall_Unit_NodePath(setPathNodeMethodBind, this.rawMemory, path)
    }


    private val getPathNodeMethodBind: CPointer<godot_method_bind> by lazy { getMB("CSGPolygon", "get_path_node") }
    open fun getPathNode(): NodePath {
        return _icall_NodePath(getPathNodeMethodBind, this.rawMemory)
    }


    private val setPathIntervalMethodBind: CPointer<godot_method_bind> by lazy { getMB("CSGPolygon", "set_path_interval") }
    open fun setPathInterval(distance: Float) {
        _icall_Unit_Float(setPathIntervalMethodBind, this.rawMemory, distance)
    }


    private val getPathIntervalMethodBind: CPointer<godot_method_bind> by lazy { getMB("CSGPolygon", "get_path_interval") }
    open fun getPathInterval(): Float {
        return _icall_Float(getPathIntervalMethodBind, this.rawMemory)
    }


    private val setPathRotationMethodBind: CPointer<godot_method_bind> by lazy { getMB("CSGPolygon", "set_path_rotation") }
    open fun setPathRotation(mode: Int) {
        _icall_Unit_Int(setPathRotationMethodBind, this.rawMemory, mode)
    }


    private val getPathRotationMethodBind: CPointer<godot_method_bind> by lazy { getMB("CSGPolygon", "get_path_rotation") }
    open fun getPathRotation(): CSGPolygon.PathRotation {
        return CSGPolygon.PathRotation.fromInt(_icall_Int(getPathRotationMethodBind, this.rawMemory))
    }


    private val setMaterialMethodBind: CPointer<godot_method_bind> by lazy { getMB("CSGPolygon", "set_material") }
    open fun setMaterial(material: Material) {
        _icall_Unit_Object(setMaterialMethodBind, this.rawMemory, material)
    }


    private val getMaterialMethodBind: CPointer<godot_method_bind> by lazy { getMB("CSGPolygon", "get_material") }
    open fun getMaterial(): Material {
        return _icall_Material(getMaterialMethodBind, this.rawMemory)
    }


    private val setSmoothFacesMethodBind: CPointer<godot_method_bind> by lazy { getMB("CSGPolygon", "set_smooth_faces") }
    open fun setSmoothFaces(smoothFaces: Boolean) {
        _icall_Unit_Boolean(setSmoothFacesMethodBind, this.rawMemory, smoothFaces)
    }


    private val getSmoothFacesMethodBind: CPointer<godot_method_bind> by lazy { getMB("CSGPolygon", "get_smooth_faces") }
    open fun getSmoothFaces(): Boolean {
        return _icall_Boolean(getSmoothFacesMethodBind, this.rawMemory)
    }


    open fun _is_editable_3d_polygon(): Boolean {
        throw NotImplementedError("_is_editable_3d_polygon is not implemented for CSGPolygon")
    }


    open fun _has_editable_3d_polygon_no_depth(): Boolean {
        throw NotImplementedError("_has_editable_3d_polygon_no_depth is not implemented for CSGPolygon")
    }


    open fun _path_exited() {
    }


    open fun _path_changed() {
    }


}
