@file:Suppress("unused", "ClassName", "EnumEntryName", "FunctionName", "SpellCheckingInspection", "PARAMETER_NAME_CHANGED_ON_OVERRIDE", "UnusedImport", "PackageDirectoryMismatch")
package godot

import godot.gdnative.*
import godot.core.*
import godot.icalls.*
import kotlinx.cinterop.*


// NOTE: THIS FILE IS AUTO GENERATED FROM JSON API CONFIG


open class Area : CollisionObject {
    constructor() : super("Area")
    constructor(variant: Variant) : super(variant)
    internal constructor(mem: COpaquePointer) : super(mem)
    internal constructor(name: String) : super(name)


    // Enums 

    enum class SpaceOverride(val id: Int) {
        SPACE_OVERRIDE_DISABLED(0),
        SPACE_OVERRIDE_COMBINE(1),
        SPACE_OVERRIDE_COMBINE_REPLACE(2),
        SPACE_OVERRIDE_REPLACE(3),
        SPACE_OVERRIDE_REPLACE_COMBINE(4),
        ;

        companion object {
            fun fromInt(value: Int) = values().single { it.id == value }
        }
    }


    // Signals
    class Signal {
        companion object {
            const val AREA_EXITED: String = "area_exited"
            const val AREA_SHAPE_EXITED: String = "area_shape_exited"
            const val BODY_ENTERED: String = "body_entered"
            const val BODY_SHAPE_ENTERED: String = "body_shape_entered"
            const val AREA_ENTERED: String = "area_entered"
            const val AREA_SHAPE_ENTERED: String = "area_shape_entered"
            const val BODY_EXITED: String = "body_exited"
            const val BODY_SHAPE_EXITED: String = "body_shape_exited"
        }
    }


    companion object {
        infix fun from(other: CollisionObject): Area = Area("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Spatial): Area = Area("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Node): Area = Area("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Object): Area = Area("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Variant): Area = fromVariant(Area(""), other)


        // Constants
        const val SPACE_OVERRIDE_DISABLED: Int = 0
        const val SPACE_OVERRIDE_COMBINE: Int = 1
        const val SPACE_OVERRIDE_COMBINE_REPLACE: Int = 2
        const val SPACE_OVERRIDE_REPLACE: Int = 3
        const val SPACE_OVERRIDE_REPLACE_COMBINE: Int = 4


    }


    // Properties
    open var spaceOverride: Int
        get() = _icall_Int(getSpaceOverrideModeMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Int(setSpaceOverrideModeMethodBind, this.rawMemory, value)


    open var gravityPoint: Boolean
        get() = _icall_Boolean(isGravityAPointMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Boolean(setGravityIsPointMethodBind, this.rawMemory, value)


    open var gravityDistanceScale: Float
        get() = _icall_Float(getGravityDistanceScaleMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Float(setGravityDistanceScaleMethodBind, this.rawMemory, value)


    open var gravityVec: Vector3
        get() = _icall_Vector3(getGravityVectorMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Vector3(setGravityVectorMethodBind, this.rawMemory, value)
    open fun gravityVec(shedule: (Vector3) -> Unit): Vector3 = gravityVec.apply {
        shedule(this)
        gravityVec = this
    }


    open var gravity: Float
        get() = _icall_Float(getGravityMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Float(setGravityMethodBind, this.rawMemory, value)


    open var linearDamp: Float
        get() = _icall_Float(getLinearDampMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Float(setLinearDampMethodBind, this.rawMemory, value)


    open var angularDamp: Float
        get() = _icall_Float(getAngularDampMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Float(setAngularDampMethodBind, this.rawMemory, value)


    open var priority: Int
        get() = _icall_Int(getPriorityMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Int(setPriorityMethodBind, this.rawMemory, value)


    open var monitoring: Boolean
        get() = _icall_Boolean(isMonitoringMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Boolean(setMonitoringMethodBind, this.rawMemory, value)


    open var monitorable: Boolean
        get() = _icall_Boolean(isMonitorableMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Boolean(setMonitorableMethodBind, this.rawMemory, value)


    open var collisionLayer: Int
        get() = _icall_Int(getCollisionLayerMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Int(setCollisionLayerMethodBind, this.rawMemory, value)


    open var collisionMask: Int
        get() = _icall_Int(getCollisionMaskMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Int(setCollisionMaskMethodBind, this.rawMemory, value)


    open var audioBusOverride: Boolean
        get() = _icall_Boolean(isOverridingAudioBusMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Boolean(setAudioBusOverrideMethodBind, this.rawMemory, value)


    open var audioBusName: String
        get() = _icall_String(getAudioBusMethodBind, this.rawMemory)
        set(value) = _icall_Unit_String(setAudioBusMethodBind, this.rawMemory, value)


    open var reverbBusEnable: Boolean
        get() = _icall_Boolean(isUsingReverbBusMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Boolean(setUseReverbBusMethodBind, this.rawMemory, value)


    open var reverbBusName: String
        get() = _icall_String(getReverbBusMethodBind, this.rawMemory)
        set(value) = _icall_Unit_String(setReverbBusMethodBind, this.rawMemory, value)


    open var reverbBusAmount: Float
        get() = _icall_Float(getReverbAmountMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Float(setReverbAmountMethodBind, this.rawMemory, value)


    open var reverbBusUniformity: Float
        get() = _icall_Float(getReverbUniformityMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Float(setReverbUniformityMethodBind, this.rawMemory, value)




    // Methods
    open fun _body_enter_tree(id: Int) {
    }


    open fun _body_exit_tree(id: Int) {
    }


    open fun _area_enter_tree(id: Int) {
    }


    open fun _area_exit_tree(id: Int) {
    }


    private val setSpaceOverrideModeMethodBind: CPointer<godot_method_bind> by lazy { getMB("Area", "set_space_override_mode") }
    open fun setSpaceOverrideMode(enable: Int) {
        _icall_Unit_Int(setSpaceOverrideModeMethodBind, this.rawMemory, enable)
    }


    private val getSpaceOverrideModeMethodBind: CPointer<godot_method_bind> by lazy { getMB("Area", "get_space_override_mode") }
    open fun getSpaceOverrideMode(): Area.SpaceOverride {
        return Area.SpaceOverride.fromInt(_icall_Int(getSpaceOverrideModeMethodBind, this.rawMemory))
    }


    private val setGravityIsPointMethodBind: CPointer<godot_method_bind> by lazy { getMB("Area", "set_gravity_is_point") }
    open fun setGravityIsPoint(enable: Boolean) {
        _icall_Unit_Boolean(setGravityIsPointMethodBind, this.rawMemory, enable)
    }


    private val isGravityAPointMethodBind: CPointer<godot_method_bind> by lazy { getMB("Area", "is_gravity_a_point") }
    open fun isGravityAPoint(): Boolean {
        return _icall_Boolean(isGravityAPointMethodBind, this.rawMemory)
    }


    private val setGravityDistanceScaleMethodBind: CPointer<godot_method_bind> by lazy { getMB("Area", "set_gravity_distance_scale") }
    open fun setGravityDistanceScale(distanceScale: Float) {
        _icall_Unit_Float(setGravityDistanceScaleMethodBind, this.rawMemory, distanceScale)
    }


    private val getGravityDistanceScaleMethodBind: CPointer<godot_method_bind> by lazy { getMB("Area", "get_gravity_distance_scale") }
    open fun getGravityDistanceScale(): Float {
        return _icall_Float(getGravityDistanceScaleMethodBind, this.rawMemory)
    }


    private val setGravityVectorMethodBind: CPointer<godot_method_bind> by lazy { getMB("Area", "set_gravity_vector") }
    open fun setGravityVector(vector: Vector3) {
        _icall_Unit_Vector3(setGravityVectorMethodBind, this.rawMemory, vector)
    }


    private val getGravityVectorMethodBind: CPointer<godot_method_bind> by lazy { getMB("Area", "get_gravity_vector") }
    open fun getGravityVector(): Vector3 {
        return _icall_Vector3(getGravityVectorMethodBind, this.rawMemory)
    }


    private val setGravityMethodBind: CPointer<godot_method_bind> by lazy { getMB("Area", "set_gravity") }
    open fun setGravity(gravity: Float) {
        _icall_Unit_Float(setGravityMethodBind, this.rawMemory, gravity)
    }


    private val getGravityMethodBind: CPointer<godot_method_bind> by lazy { getMB("Area", "get_gravity") }
    open fun getGravity(): Float {
        return _icall_Float(getGravityMethodBind, this.rawMemory)
    }


    private val setAngularDampMethodBind: CPointer<godot_method_bind> by lazy { getMB("Area", "set_angular_damp") }
    open fun setAngularDamp(angularDamp: Float) {
        _icall_Unit_Float(setAngularDampMethodBind, this.rawMemory, angularDamp)
    }


    private val getAngularDampMethodBind: CPointer<godot_method_bind> by lazy { getMB("Area", "get_angular_damp") }
    open fun getAngularDamp(): Float {
        return _icall_Float(getAngularDampMethodBind, this.rawMemory)
    }


    private val setLinearDampMethodBind: CPointer<godot_method_bind> by lazy { getMB("Area", "set_linear_damp") }
    open fun setLinearDamp(linearDamp: Float) {
        _icall_Unit_Float(setLinearDampMethodBind, this.rawMemory, linearDamp)
    }


    private val getLinearDampMethodBind: CPointer<godot_method_bind> by lazy { getMB("Area", "get_linear_damp") }
    open fun getLinearDamp(): Float {
        return _icall_Float(getLinearDampMethodBind, this.rawMemory)
    }


    private val setPriorityMethodBind: CPointer<godot_method_bind> by lazy { getMB("Area", "set_priority") }
    open fun setPriority(priority: Float) {
        _icall_Unit_Float(setPriorityMethodBind, this.rawMemory, priority)
    }


    private val getPriorityMethodBind: CPointer<godot_method_bind> by lazy { getMB("Area", "get_priority") }
    open fun getPriority(): Float {
        return _icall_Float(getPriorityMethodBind, this.rawMemory)
    }


    private val setCollisionMaskMethodBind: CPointer<godot_method_bind> by lazy { getMB("Area", "set_collision_mask") }
    open fun setCollisionMask(collisionMask: Int) {
        _icall_Unit_Int(setCollisionMaskMethodBind, this.rawMemory, collisionMask)
    }


    private val getCollisionMaskMethodBind: CPointer<godot_method_bind> by lazy { getMB("Area", "get_collision_mask") }
    open fun getCollisionMask(): Int {
        return _icall_Int(getCollisionMaskMethodBind, this.rawMemory)
    }


    private val setCollisionLayerMethodBind: CPointer<godot_method_bind> by lazy { getMB("Area", "set_collision_layer") }
    open fun setCollisionLayer(collisionLayer: Int) {
        _icall_Unit_Int(setCollisionLayerMethodBind, this.rawMemory, collisionLayer)
    }


    private val getCollisionLayerMethodBind: CPointer<godot_method_bind> by lazy { getMB("Area", "get_collision_layer") }
    open fun getCollisionLayer(): Int {
        return _icall_Int(getCollisionLayerMethodBind, this.rawMemory)
    }


    private val setCollisionMaskBitMethodBind: CPointer<godot_method_bind> by lazy { getMB("Area", "set_collision_mask_bit") }
    open fun setCollisionMaskBit(bit: Int, value: Boolean) {
        _icall_Unit_Int_Boolean(setCollisionMaskBitMethodBind, this.rawMemory, bit, value)
    }


    private val getCollisionMaskBitMethodBind: CPointer<godot_method_bind> by lazy { getMB("Area", "get_collision_mask_bit") }
    open fun getCollisionMaskBit(bit: Int): Boolean {
        return _icall_Boolean_Int(getCollisionMaskBitMethodBind, this.rawMemory, bit)
    }


    private val setCollisionLayerBitMethodBind: CPointer<godot_method_bind> by lazy { getMB("Area", "set_collision_layer_bit") }
    open fun setCollisionLayerBit(bit: Int, value: Boolean) {
        _icall_Unit_Int_Boolean(setCollisionLayerBitMethodBind, this.rawMemory, bit, value)
    }


    private val getCollisionLayerBitMethodBind: CPointer<godot_method_bind> by lazy { getMB("Area", "get_collision_layer_bit") }
    open fun getCollisionLayerBit(bit: Int): Boolean {
        return _icall_Boolean_Int(getCollisionLayerBitMethodBind, this.rawMemory, bit)
    }


    private val setMonitorableMethodBind: CPointer<godot_method_bind> by lazy { getMB("Area", "set_monitorable") }
    open fun setMonitorable(enable: Boolean) {
        _icall_Unit_Boolean(setMonitorableMethodBind, this.rawMemory, enable)
    }


    private val isMonitorableMethodBind: CPointer<godot_method_bind> by lazy { getMB("Area", "is_monitorable") }
    open fun isMonitorable(): Boolean {
        return _icall_Boolean(isMonitorableMethodBind, this.rawMemory)
    }


    private val setMonitoringMethodBind: CPointer<godot_method_bind> by lazy { getMB("Area", "set_monitoring") }
    open fun setMonitoring(enable: Boolean) {
        _icall_Unit_Boolean(setMonitoringMethodBind, this.rawMemory, enable)
    }


    private val isMonitoringMethodBind: CPointer<godot_method_bind> by lazy { getMB("Area", "is_monitoring") }
    open fun isMonitoring(): Boolean {
        return _icall_Boolean(isMonitoringMethodBind, this.rawMemory)
    }


    private val getOverlappingBodiesMethodBind: CPointer<godot_method_bind> by lazy { getMB("Area", "get_overlapping_bodies") }
    open fun getOverlappingBodies(): GDArray {
        return _icall_GDArray(getOverlappingBodiesMethodBind, this.rawMemory)
    }


    private val getOverlappingAreasMethodBind: CPointer<godot_method_bind> by lazy { getMB("Area", "get_overlapping_areas") }
    open fun getOverlappingAreas(): GDArray {
        return _icall_GDArray(getOverlappingAreasMethodBind, this.rawMemory)
    }


    private val overlapsBodyMethodBind: CPointer<godot_method_bind> by lazy { getMB("Area", "overlaps_body") }
    open fun overlapsBody(body: Object): Boolean {
        return _icall_Boolean_Object(overlapsBodyMethodBind, this.rawMemory, body)
    }


    private val overlapsAreaMethodBind: CPointer<godot_method_bind> by lazy { getMB("Area", "overlaps_area") }
    open fun overlapsArea(area: Object): Boolean {
        return _icall_Boolean_Object(overlapsAreaMethodBind, this.rawMemory, area)
    }


    open fun _body_inout(arg0: Int, arg1: RID, arg2: Int, arg3: Int, arg4: Int) {
    }


    open fun _area_inout(arg0: Int, arg1: RID, arg2: Int, arg3: Int, arg4: Int) {
    }


    private val setAudioBusOverrideMethodBind: CPointer<godot_method_bind> by lazy { getMB("Area", "set_audio_bus_override") }
    open fun setAudioBusOverride(enable: Boolean) {
        _icall_Unit_Boolean(setAudioBusOverrideMethodBind, this.rawMemory, enable)
    }


    private val isOverridingAudioBusMethodBind: CPointer<godot_method_bind> by lazy { getMB("Area", "is_overriding_audio_bus") }
    open fun isOverridingAudioBus(): Boolean {
        return _icall_Boolean(isOverridingAudioBusMethodBind, this.rawMemory)
    }


    private val setAudioBusMethodBind: CPointer<godot_method_bind> by lazy { getMB("Area", "set_audio_bus") }
    open fun setAudioBus(name: String) {
        _icall_Unit_String(setAudioBusMethodBind, this.rawMemory, name)
    }


    private val getAudioBusMethodBind: CPointer<godot_method_bind> by lazy { getMB("Area", "get_audio_bus") }
    open fun getAudioBus(): String {
        return _icall_String(getAudioBusMethodBind, this.rawMemory)
    }


    private val setUseReverbBusMethodBind: CPointer<godot_method_bind> by lazy { getMB("Area", "set_use_reverb_bus") }
    open fun setUseReverbBus(enable: Boolean) {
        _icall_Unit_Boolean(setUseReverbBusMethodBind, this.rawMemory, enable)
    }


    private val isUsingReverbBusMethodBind: CPointer<godot_method_bind> by lazy { getMB("Area", "is_using_reverb_bus") }
    open fun isUsingReverbBus(): Boolean {
        return _icall_Boolean(isUsingReverbBusMethodBind, this.rawMemory)
    }


    private val setReverbBusMethodBind: CPointer<godot_method_bind> by lazy { getMB("Area", "set_reverb_bus") }
    open fun setReverbBus(name: String) {
        _icall_Unit_String(setReverbBusMethodBind, this.rawMemory, name)
    }


    private val getReverbBusMethodBind: CPointer<godot_method_bind> by lazy { getMB("Area", "get_reverb_bus") }
    open fun getReverbBus(): String {
        return _icall_String(getReverbBusMethodBind, this.rawMemory)
    }


    private val setReverbAmountMethodBind: CPointer<godot_method_bind> by lazy { getMB("Area", "set_reverb_amount") }
    open fun setReverbAmount(amount: Float) {
        _icall_Unit_Float(setReverbAmountMethodBind, this.rawMemory, amount)
    }


    private val getReverbAmountMethodBind: CPointer<godot_method_bind> by lazy { getMB("Area", "get_reverb_amount") }
    open fun getReverbAmount(): Float {
        return _icall_Float(getReverbAmountMethodBind, this.rawMemory)
    }


    private val setReverbUniformityMethodBind: CPointer<godot_method_bind> by lazy { getMB("Area", "set_reverb_uniformity") }
    open fun setReverbUniformity(amount: Float) {
        _icall_Unit_Float(setReverbUniformityMethodBind, this.rawMemory, amount)
    }


    private val getReverbUniformityMethodBind: CPointer<godot_method_bind> by lazy { getMB("Area", "get_reverb_uniformity") }
    open fun getReverbUniformity(): Float {
        return _icall_Float(getReverbUniformityMethodBind, this.rawMemory)
    }


}
