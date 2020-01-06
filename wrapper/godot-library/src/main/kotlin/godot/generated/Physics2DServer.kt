@file:Suppress("unused", "ClassName", "EnumEntryName", "FunctionName", "SpellCheckingInspection", "PARAMETER_NAME_CHANGED_ON_OVERRIDE", "UnusedImport", "PackageDirectoryMismatch")
package godot

import godot.gdnative.*
import godot.core.*
import godot.utils.*
import godot.icalls.*
import kotlinx.cinterop.*


// NOTE: THIS FILE IS AUTO GENERATED FROM JSON API CONFIG


open class Physics2DServer : Object {
    private constructor() : super("")
    constructor(variant: Variant) : super(variant)
    internal constructor(mem: COpaquePointer) : super(mem)
    internal constructor(name: String) : super(name)


    // Enums 

    enum class ProcessInfo(val id: Long) {
        INFO_ACTIVE_OBJECTS(0),
        INFO_COLLISION_PAIRS(1),
        INFO_ISLAND_COUNT(2),
        ;

        companion object {
            fun fromInt(value: Long) = values().single { it.id == value }
        }
    }
    enum class AreaBodyStatus(val id: Long) {
        AREA_BODY_ADDED(0),
        AREA_BODY_REMOVED(1),
        ;

        companion object {
            fun fromInt(value: Long) = values().single { it.id == value }
        }
    }
    enum class DampedStringParam(val id: Long) {
        DAMPED_STRING_REST_LENGTH(0),
        DAMPED_STRING_STIFFNESS(1),
        DAMPED_STRING_DAMPING(2),
        ;

        companion object {
            fun fromInt(value: Long) = values().single { it.id == value }
        }
    }
    enum class BodyMode(val id: Long) {
        BODY_MODE_STATIC(0),
        BODY_MODE_KINEMATIC(1),
        BODY_MODE_RIGID(2),
        BODY_MODE_CHARACTER(3),
        ;

        companion object {
            fun fromInt(value: Long) = values().single { it.id == value }
        }
    }
    enum class ShapeType(val id: Long) {
        SHAPE_LINE(0),
        SHAPE_RAY(1),
        SHAPE_SEGMENT(2),
        SHAPE_CIRCLE(3),
        SHAPE_RECTANGLE(4),
        SHAPE_CAPSULE(5),
        SHAPE_CONVEX_POLYGON(6),
        SHAPE_CONCAVE_POLYGON(7),
        SHAPE_CUSTOM(8),
        ;

        companion object {
            fun fromInt(value: Long) = values().single { it.id == value }
        }
    }
    enum class JointParam(val id: Long) {
        JOINT_PARAM_BIAS(0),
        JOINT_PARAM_MAX_BIAS(1),
        JOINT_PARAM_MAX_FORCE(2),
        ;

        companion object {
            fun fromInt(value: Long) = values().single { it.id == value }
        }
    }
    enum class SpaceParameter(val id: Long) {
        SPACE_PARAM_CONTACT_RECYCLE_RADIUS(0),
        SPACE_PARAM_CONTACT_MAX_SEPARATION(1),
        SPACE_PARAM_BODY_MAX_ALLOWED_PENETRATION(2),
        SPACE_PARAM_BODY_LINEAR_VELOCITY_SLEEP_THRESHOLD(3),
        SPACE_PARAM_BODY_ANGULAR_VELOCITY_SLEEP_THRESHOLD(4),
        SPACE_PARAM_BODY_TIME_TO_SLEEP(5),
        SPACE_PARAM_CONSTRAINT_DEFAULT_BIAS(6),
        ;

        companion object {
            fun fromInt(value: Long) = values().single { it.id == value }
        }
    }
    enum class JointType(val id: Long) {
        JOINT_PIN(0),
        JOINT_GROOVE(1),
        JOINT_DAMPED_SPRING(2),
        ;

        companion object {
            fun fromInt(value: Long) = values().single { it.id == value }
        }
    }
    enum class CCDMode(val id: Long) {
        CCD_MODE_DISABLED(0),
        CCD_MODE_CAST_RAY(1),
        CCD_MODE_CAST_SHAPE(2),
        ;

        companion object {
            fun fromInt(value: Long) = values().single { it.id == value }
        }
    }
    enum class BodyState(val id: Long) {
        BODY_STATE_TRANSFORM(0),
        BODY_STATE_LINEAR_VELOCITY(1),
        BODY_STATE_ANGULAR_VELOCITY(2),
        BODY_STATE_SLEEPING(3),
        BODY_STATE_CAN_SLEEP(4),
        ;

        companion object {
            fun fromInt(value: Long) = values().single { it.id == value }
        }
    }
    enum class BodyParameter(val id: Long) {
        BODY_PARAM_BOUNCE(0),
        BODY_PARAM_FRICTION(1),
        BODY_PARAM_MASS(2),
        BODY_PARAM_INERTIA(3),
        BODY_PARAM_GRAVITY_SCALE(4),
        BODY_PARAM_LINEAR_DAMP(5),
        BODY_PARAM_ANGULAR_DAMP(6),
        BODY_PARAM_MAX(7),
        ;

        companion object {
            fun fromInt(value: Long) = values().single { it.id == value }
        }
    }
    enum class AreaSpaceOverrideMode(val id: Long) {
        AREA_SPACE_OVERRIDE_DISABLED(0),
        AREA_SPACE_OVERRIDE_COMBINE(1),
        AREA_SPACE_OVERRIDE_COMBINE_REPLACE(2),
        AREA_SPACE_OVERRIDE_REPLACE(3),
        AREA_SPACE_OVERRIDE_REPLACE_COMBINE(4),
        ;

        companion object {
            fun fromInt(value: Long) = values().single { it.id == value }
        }
    }
    enum class AreaParameter(val id: Long) {
        AREA_PARAM_GRAVITY(0),
        AREA_PARAM_GRAVITY_VECTOR(1),
        AREA_PARAM_GRAVITY_IS_POINT(2),
        AREA_PARAM_GRAVITY_DISTANCE_SCALE(3),
        AREA_PARAM_GRAVITY_POINT_ATTENUATION(4),
        AREA_PARAM_LINEAR_DAMP(5),
        AREA_PARAM_ANGULAR_DAMP(6),
        AREA_PARAM_PRIORITY(7),
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


    @ThreadLocal    companion object {
        infix fun from(other: Object): Physics2DServer = Physics2DServer("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Variant): Physics2DServer = fromVariant(Physics2DServer(""), other)


        // Constants
        const val SPACE_PARAM_CONTACT_RECYCLE_RADIUS: Long = 0
        const val SPACE_PARAM_CONTACT_MAX_SEPARATION: Long = 1
        const val SPACE_PARAM_BODY_MAX_ALLOWED_PENETRATION: Long = 2
        const val SPACE_PARAM_BODY_LINEAR_VELOCITY_SLEEP_THRESHOLD: Long = 3
        const val SPACE_PARAM_BODY_ANGULAR_VELOCITY_SLEEP_THRESHOLD: Long = 4
        const val SPACE_PARAM_BODY_TIME_TO_SLEEP: Long = 5
        const val SPACE_PARAM_CONSTRAINT_DEFAULT_BIAS: Long = 6
        const val SHAPE_LINE: Long = 0
        const val SHAPE_RAY: Long = 1
        const val SHAPE_SEGMENT: Long = 2
        const val SHAPE_CIRCLE: Long = 3
        const val SHAPE_RECTANGLE: Long = 4
        const val SHAPE_CAPSULE: Long = 5
        const val SHAPE_CONVEX_POLYGON: Long = 6
        const val SHAPE_CONCAVE_POLYGON: Long = 7
        const val SHAPE_CUSTOM: Long = 8
        const val AREA_PARAM_GRAVITY: Long = 0
        const val AREA_PARAM_GRAVITY_VECTOR: Long = 1
        const val AREA_PARAM_GRAVITY_IS_POINT: Long = 2
        const val AREA_PARAM_GRAVITY_DISTANCE_SCALE: Long = 3
        const val AREA_PARAM_GRAVITY_POINT_ATTENUATION: Long = 4
        const val AREA_PARAM_LINEAR_DAMP: Long = 5
        const val AREA_PARAM_ANGULAR_DAMP: Long = 6
        const val AREA_PARAM_PRIORITY: Long = 7
        const val AREA_SPACE_OVERRIDE_DISABLED: Long = 0
        const val AREA_SPACE_OVERRIDE_COMBINE: Long = 1
        const val AREA_SPACE_OVERRIDE_COMBINE_REPLACE: Long = 2
        const val AREA_SPACE_OVERRIDE_REPLACE: Long = 3
        const val AREA_SPACE_OVERRIDE_REPLACE_COMBINE: Long = 4
        const val BODY_MODE_STATIC: Long = 0
        const val BODY_MODE_KINEMATIC: Long = 1
        const val BODY_MODE_RIGID: Long = 2
        const val BODY_MODE_CHARACTER: Long = 3
        const val BODY_PARAM_BOUNCE: Long = 0
        const val BODY_PARAM_FRICTION: Long = 1
        const val BODY_PARAM_MASS: Long = 2
        const val BODY_PARAM_INERTIA: Long = 3
        const val BODY_PARAM_GRAVITY_SCALE: Long = 4
        const val BODY_PARAM_LINEAR_DAMP: Long = 5
        const val BODY_PARAM_ANGULAR_DAMP: Long = 6
        const val BODY_PARAM_MAX: Long = 7
        const val BODY_STATE_TRANSFORM: Long = 0
        const val BODY_STATE_LINEAR_VELOCITY: Long = 1
        const val BODY_STATE_ANGULAR_VELOCITY: Long = 2
        const val BODY_STATE_SLEEPING: Long = 3
        const val BODY_STATE_CAN_SLEEP: Long = 4
        const val JOINT_PIN: Long = 0
        const val JOINT_GROOVE: Long = 1
        const val JOINT_DAMPED_SPRING: Long = 2
        const val JOINT_PARAM_BIAS: Long = 0
        const val JOINT_PARAM_MAX_BIAS: Long = 1
        const val JOINT_PARAM_MAX_FORCE: Long = 2
        const val DAMPED_STRING_REST_LENGTH: Long = 0
        const val DAMPED_STRING_STIFFNESS: Long = 1
        const val DAMPED_STRING_DAMPING: Long = 2
        const val CCD_MODE_DISABLED: Long = 0
        const val CCD_MODE_CAST_RAY: Long = 1
        const val CCD_MODE_CAST_SHAPE: Long = 2
        const val AREA_BODY_ADDED: Long = 0
        const val AREA_BODY_REMOVED: Long = 1
        const val INFO_ACTIVE_OBJECTS: Long = 0
        const val INFO_COLLISION_PAIRS: Long = 1
        const val INFO_ISLAND_COUNT: Long = 2


        private val rawMemory: COpaquePointer by lazy { getSingleton("Physics2DServer", "Physics2DServer") }


        // Properties


        // Methods
        private val lineShapeCreateMethodBind: CPointer<godot_method_bind> by lazy { getMB("Physics2DServer", "line_shape_create") }
        fun lineShapeCreate(): RID {
            return _icall_RID(lineShapeCreateMethodBind, this.rawMemory)
        }


        private val rayShapeCreateMethodBind: CPointer<godot_method_bind> by lazy { getMB("Physics2DServer", "ray_shape_create") }
        fun rayShapeCreate(): RID {
            return _icall_RID(rayShapeCreateMethodBind, this.rawMemory)
        }


        private val segmentShapeCreateMethodBind: CPointer<godot_method_bind> by lazy { getMB("Physics2DServer", "segment_shape_create") }
        fun segmentShapeCreate(): RID {
            return _icall_RID(segmentShapeCreateMethodBind, this.rawMemory)
        }


        private val circleShapeCreateMethodBind: CPointer<godot_method_bind> by lazy { getMB("Physics2DServer", "circle_shape_create") }
        fun circleShapeCreate(): RID {
            return _icall_RID(circleShapeCreateMethodBind, this.rawMemory)
        }


        private val rectangleShapeCreateMethodBind: CPointer<godot_method_bind> by lazy { getMB("Physics2DServer", "rectangle_shape_create") }
        fun rectangleShapeCreate(): RID {
            return _icall_RID(rectangleShapeCreateMethodBind, this.rawMemory)
        }


        private val capsuleShapeCreateMethodBind: CPointer<godot_method_bind> by lazy { getMB("Physics2DServer", "capsule_shape_create") }
        fun capsuleShapeCreate(): RID {
            return _icall_RID(capsuleShapeCreateMethodBind, this.rawMemory)
        }


        private val convexPolygonShapeCreateMethodBind: CPointer<godot_method_bind> by lazy { getMB("Physics2DServer", "convex_polygon_shape_create") }
        fun convexPolygonShapeCreate(): RID {
            return _icall_RID(convexPolygonShapeCreateMethodBind, this.rawMemory)
        }


        private val concavePolygonShapeCreateMethodBind: CPointer<godot_method_bind> by lazy { getMB("Physics2DServer", "concave_polygon_shape_create") }
        fun concavePolygonShapeCreate(): RID {
            return _icall_RID(concavePolygonShapeCreateMethodBind, this.rawMemory)
        }


        private val shapeSetDataMethodBind: CPointer<godot_method_bind> by lazy { getMB("Physics2DServer", "shape_set_data") }
        fun shapeSetData(shape: RID, data: Variant) {
            _icall_Unit_RID_Variant(shapeSetDataMethodBind, this.rawMemory, shape, data)
        }


        private val shapeGetTypeMethodBind: CPointer<godot_method_bind> by lazy { getMB("Physics2DServer", "shape_get_type") }
        fun shapeGetType(shape: RID): Physics2DServer.ShapeType {
            return Physics2DServer.ShapeType.fromInt(_icall_Long_RID(shapeGetTypeMethodBind, this.rawMemory, shape))
        }


        private val shapeGetDataMethodBind: CPointer<godot_method_bind> by lazy { getMB("Physics2DServer", "shape_get_data") }
        fun shapeGetData(shape: RID): Variant {
            return _icall_Variant_RID(shapeGetDataMethodBind, this.rawMemory, shape)
        }


        private val spaceCreateMethodBind: CPointer<godot_method_bind> by lazy { getMB("Physics2DServer", "space_create") }
        fun spaceCreate(): RID {
            return _icall_RID(spaceCreateMethodBind, this.rawMemory)
        }


        private val spaceSetActiveMethodBind: CPointer<godot_method_bind> by lazy { getMB("Physics2DServer", "space_set_active") }
        fun spaceSetActive(space: RID, active: Boolean) {
            _icall_Unit_RID_Boolean(spaceSetActiveMethodBind, this.rawMemory, space, active)
        }


        private val spaceIsActiveMethodBind: CPointer<godot_method_bind> by lazy { getMB("Physics2DServer", "space_is_active") }
        fun spaceIsActive(space: RID): Boolean {
            return _icall_Boolean_RID(spaceIsActiveMethodBind, this.rawMemory, space)
        }


        private val spaceSetParamMethodBind: CPointer<godot_method_bind> by lazy { getMB("Physics2DServer", "space_set_param") }
        fun spaceSetParam(space: RID, param: Long, value: Double) {
            _icall_Unit_RID_Long_Double(spaceSetParamMethodBind, this.rawMemory, space, param, value)
        }


        private val spaceGetParamMethodBind: CPointer<godot_method_bind> by lazy { getMB("Physics2DServer", "space_get_param") }
        fun spaceGetParam(space: RID, param: Long): Double {
            return _icall_Double_RID_Long(spaceGetParamMethodBind, this.rawMemory, space, param)
        }


        private val spaceGetDirectStateMethodBind: CPointer<godot_method_bind> by lazy { getMB("Physics2DServer", "space_get_direct_state") }
        fun spaceGetDirectState(space: RID): Physics2DDirectSpaceState {
            return _icall_Physics2DDirectSpaceState_RID(spaceGetDirectStateMethodBind, this.rawMemory, space)
        }


        private val areaCreateMethodBind: CPointer<godot_method_bind> by lazy { getMB("Physics2DServer", "area_create") }
        fun areaCreate(): RID {
            return _icall_RID(areaCreateMethodBind, this.rawMemory)
        }


        private val areaSetSpaceMethodBind: CPointer<godot_method_bind> by lazy { getMB("Physics2DServer", "area_set_space") }
        fun areaSetSpace(area: RID, space: RID) {
            _icall_Unit_RID_RID(areaSetSpaceMethodBind, this.rawMemory, area, space)
        }


        private val areaGetSpaceMethodBind: CPointer<godot_method_bind> by lazy { getMB("Physics2DServer", "area_get_space") }
        fun areaGetSpace(area: RID): RID {
            return _icall_RID_RID(areaGetSpaceMethodBind, this.rawMemory, area)
        }


        private val areaSetSpaceOverrideModeMethodBind: CPointer<godot_method_bind> by lazy { getMB("Physics2DServer", "area_set_space_override_mode") }
        fun areaSetSpaceOverrideMode(area: RID, mode: Long) {
            _icall_Unit_RID_Long(areaSetSpaceOverrideModeMethodBind, this.rawMemory, area, mode)
        }


        private val areaGetSpaceOverrideModeMethodBind: CPointer<godot_method_bind> by lazy { getMB("Physics2DServer", "area_get_space_override_mode") }
        fun areaGetSpaceOverrideMode(area: RID): Physics2DServer.AreaSpaceOverrideMode {
            return Physics2DServer.AreaSpaceOverrideMode.fromInt(_icall_Long_RID(areaGetSpaceOverrideModeMethodBind, this.rawMemory, area))
        }


        private val areaAddShapeMethodBind: CPointer<godot_method_bind> by lazy { getMB("Physics2DServer", "area_add_shape") }
        fun areaAddShape(area: RID, shape: RID, transform: Transform2D = Transform2D()) {
            _icall_Unit_RID_RID_Transform2D(areaAddShapeMethodBind, this.rawMemory, area, shape, transform)
        }


        private val areaSetShapeMethodBind: CPointer<godot_method_bind> by lazy { getMB("Physics2DServer", "area_set_shape") }
        fun areaSetShape(area: RID, shapeIdx: Long, shape: RID) {
            _icall_Unit_RID_Long_RID(areaSetShapeMethodBind, this.rawMemory, area, shapeIdx, shape)
        }


        private val areaSetShapeTransformMethodBind: CPointer<godot_method_bind> by lazy { getMB("Physics2DServer", "area_set_shape_transform") }
        fun areaSetShapeTransform(area: RID, shapeIdx: Long, transform: Transform2D) {
            _icall_Unit_RID_Long_Transform2D(areaSetShapeTransformMethodBind, this.rawMemory, area, shapeIdx, transform)
        }


        private val areaSetShapeDisabledMethodBind: CPointer<godot_method_bind> by lazy { getMB("Physics2DServer", "area_set_shape_disabled") }
        fun areaSetShapeDisabled(area: RID, shapeIdx: Long, disable: Boolean) {
            _icall_Unit_RID_Long_Boolean(areaSetShapeDisabledMethodBind, this.rawMemory, area, shapeIdx, disable)
        }


        private val areaGetShapeCountMethodBind: CPointer<godot_method_bind> by lazy { getMB("Physics2DServer", "area_get_shape_count") }
        fun areaGetShapeCount(area: RID): Long {
            return _icall_Long_RID(areaGetShapeCountMethodBind, this.rawMemory, area)
        }


        private val areaGetShapeMethodBind: CPointer<godot_method_bind> by lazy { getMB("Physics2DServer", "area_get_shape") }
        fun areaGetShape(area: RID, shapeIdx: Long): RID {
            return _icall_RID_RID_Long(areaGetShapeMethodBind, this.rawMemory, area, shapeIdx)
        }


        private val areaGetShapeTransformMethodBind: CPointer<godot_method_bind> by lazy { getMB("Physics2DServer", "area_get_shape_transform") }
        fun areaGetShapeTransform(area: RID, shapeIdx: Long): Transform2D {
            return _icall_Transform2D_RID_Long(areaGetShapeTransformMethodBind, this.rawMemory, area, shapeIdx)
        }


        private val areaRemoveShapeMethodBind: CPointer<godot_method_bind> by lazy { getMB("Physics2DServer", "area_remove_shape") }
        fun areaRemoveShape(area: RID, shapeIdx: Long) {
            _icall_Unit_RID_Long(areaRemoveShapeMethodBind, this.rawMemory, area, shapeIdx)
        }


        private val areaClearShapesMethodBind: CPointer<godot_method_bind> by lazy { getMB("Physics2DServer", "area_clear_shapes") }
        fun areaClearShapes(area: RID) {
            _icall_Unit_RID(areaClearShapesMethodBind, this.rawMemory, area)
        }


        private val areaSetCollisionLayerMethodBind: CPointer<godot_method_bind> by lazy { getMB("Physics2DServer", "area_set_collision_layer") }
        fun areaSetCollisionLayer(area: RID, layer: Long) {
            _icall_Unit_RID_Long(areaSetCollisionLayerMethodBind, this.rawMemory, area, layer)
        }


        private val areaSetCollisionMaskMethodBind: CPointer<godot_method_bind> by lazy { getMB("Physics2DServer", "area_set_collision_mask") }
        fun areaSetCollisionMask(area: RID, mask: Long) {
            _icall_Unit_RID_Long(areaSetCollisionMaskMethodBind, this.rawMemory, area, mask)
        }


        private val areaSetParamMethodBind: CPointer<godot_method_bind> by lazy { getMB("Physics2DServer", "area_set_param") }
        fun areaSetParam(area: RID, param: Long, value: Variant) {
            _icall_Unit_RID_Long_Variant(areaSetParamMethodBind, this.rawMemory, area, param, value)
        }


        private val areaSetTransformMethodBind: CPointer<godot_method_bind> by lazy { getMB("Physics2DServer", "area_set_transform") }
        fun areaSetTransform(area: RID, transform: Transform2D) {
            _icall_Unit_RID_Transform2D(areaSetTransformMethodBind, this.rawMemory, area, transform)
        }


        private val areaGetParamMethodBind: CPointer<godot_method_bind> by lazy { getMB("Physics2DServer", "area_get_param") }
        fun areaGetParam(area: RID, param: Long): Variant {
            return _icall_Variant_RID_Long(areaGetParamMethodBind, this.rawMemory, area, param)
        }


        private val areaGetTransformMethodBind: CPointer<godot_method_bind> by lazy { getMB("Physics2DServer", "area_get_transform") }
        fun areaGetTransform(area: RID): Transform2D {
            return _icall_Transform2D_RID(areaGetTransformMethodBind, this.rawMemory, area)
        }


        private val areaAttachObjectInstanceIdMethodBind: CPointer<godot_method_bind> by lazy { getMB("Physics2DServer", "area_attach_object_instance_id") }
        fun areaAttachObjectInstanceId(area: RID, id: Long) {
            _icall_Unit_RID_Long(areaAttachObjectInstanceIdMethodBind, this.rawMemory, area, id)
        }


        private val areaGetObjectInstanceIdMethodBind: CPointer<godot_method_bind> by lazy { getMB("Physics2DServer", "area_get_object_instance_id") }
        fun areaGetObjectInstanceId(area: RID): Long {
            return _icall_Long_RID(areaGetObjectInstanceIdMethodBind, this.rawMemory, area)
        }


        private val areaSetMonitorCallbackMethodBind: CPointer<godot_method_bind> by lazy { getMB("Physics2DServer", "area_set_monitor_callback") }
        fun areaSetMonitorCallback(area: RID, receiver: Object, method: String) {
            _icall_Unit_RID_Object_String(areaSetMonitorCallbackMethodBind, this.rawMemory, area, receiver, method)
        }


        private val areaSetAreaMonitorCallbackMethodBind: CPointer<godot_method_bind> by lazy { getMB("Physics2DServer", "area_set_area_monitor_callback") }
        fun areaSetAreaMonitorCallback(area: RID, receiver: Object, method: String) {
            _icall_Unit_RID_Object_String(areaSetAreaMonitorCallbackMethodBind, this.rawMemory, area, receiver, method)
        }


        private val areaSetMonitorableMethodBind: CPointer<godot_method_bind> by lazy { getMB("Physics2DServer", "area_set_monitorable") }
        fun areaSetMonitorable(area: RID, monitorable: Boolean) {
            _icall_Unit_RID_Boolean(areaSetMonitorableMethodBind, this.rawMemory, area, monitorable)
        }


        private val bodyCreateMethodBind: CPointer<godot_method_bind> by lazy { getMB("Physics2DServer", "body_create") }
        fun bodyCreate(): RID {
            return _icall_RID(bodyCreateMethodBind, this.rawMemory)
        }


        private val bodySetSpaceMethodBind: CPointer<godot_method_bind> by lazy { getMB("Physics2DServer", "body_set_space") }
        fun bodySetSpace(body: RID, space: RID) {
            _icall_Unit_RID_RID(bodySetSpaceMethodBind, this.rawMemory, body, space)
        }


        private val bodyGetSpaceMethodBind: CPointer<godot_method_bind> by lazy { getMB("Physics2DServer", "body_get_space") }
        fun bodyGetSpace(body: RID): RID {
            return _icall_RID_RID(bodyGetSpaceMethodBind, this.rawMemory, body)
        }


        private val bodySetModeMethodBind: CPointer<godot_method_bind> by lazy { getMB("Physics2DServer", "body_set_mode") }
        fun bodySetMode(body: RID, mode: Long) {
            _icall_Unit_RID_Long(bodySetModeMethodBind, this.rawMemory, body, mode)
        }


        private val bodyGetModeMethodBind: CPointer<godot_method_bind> by lazy { getMB("Physics2DServer", "body_get_mode") }
        fun bodyGetMode(body: RID): Physics2DServer.BodyMode {
            return Physics2DServer.BodyMode.fromInt(_icall_Long_RID(bodyGetModeMethodBind, this.rawMemory, body))
        }


        private val bodyAddShapeMethodBind: CPointer<godot_method_bind> by lazy { getMB("Physics2DServer", "body_add_shape") }
        fun bodyAddShape(body: RID, shape: RID, transform: Transform2D = Transform2D()) {
            _icall_Unit_RID_RID_Transform2D(bodyAddShapeMethodBind, this.rawMemory, body, shape, transform)
        }


        private val bodySetShapeMethodBind: CPointer<godot_method_bind> by lazy { getMB("Physics2DServer", "body_set_shape") }
        fun bodySetShape(body: RID, shapeIdx: Long, shape: RID) {
            _icall_Unit_RID_Long_RID(bodySetShapeMethodBind, this.rawMemory, body, shapeIdx, shape)
        }


        private val bodySetShapeTransformMethodBind: CPointer<godot_method_bind> by lazy { getMB("Physics2DServer", "body_set_shape_transform") }
        fun bodySetShapeTransform(body: RID, shapeIdx: Long, transform: Transform2D) {
            _icall_Unit_RID_Long_Transform2D(bodySetShapeTransformMethodBind, this.rawMemory, body, shapeIdx, transform)
        }


        private val bodySetShapeMetadataMethodBind: CPointer<godot_method_bind> by lazy { getMB("Physics2DServer", "body_set_shape_metadata") }
        fun bodySetShapeMetadata(body: RID, shapeIdx: Long, metadata: Variant) {
            _icall_Unit_RID_Long_Variant(bodySetShapeMetadataMethodBind, this.rawMemory, body, shapeIdx, metadata)
        }


        private val bodyGetShapeCountMethodBind: CPointer<godot_method_bind> by lazy { getMB("Physics2DServer", "body_get_shape_count") }
        fun bodyGetShapeCount(body: RID): Long {
            return _icall_Long_RID(bodyGetShapeCountMethodBind, this.rawMemory, body)
        }


        private val bodyGetShapeMethodBind: CPointer<godot_method_bind> by lazy { getMB("Physics2DServer", "body_get_shape") }
        fun bodyGetShape(body: RID, shapeIdx: Long): RID {
            return _icall_RID_RID_Long(bodyGetShapeMethodBind, this.rawMemory, body, shapeIdx)
        }


        private val bodyGetShapeTransformMethodBind: CPointer<godot_method_bind> by lazy { getMB("Physics2DServer", "body_get_shape_transform") }
        fun bodyGetShapeTransform(body: RID, shapeIdx: Long): Transform2D {
            return _icall_Transform2D_RID_Long(bodyGetShapeTransformMethodBind, this.rawMemory, body, shapeIdx)
        }


        private val bodyGetShapeMetadataMethodBind: CPointer<godot_method_bind> by lazy { getMB("Physics2DServer", "body_get_shape_metadata") }
        fun bodyGetShapeMetadata(body: RID, shapeIdx: Long): Variant {
            return _icall_Variant_RID_Long(bodyGetShapeMetadataMethodBind, this.rawMemory, body, shapeIdx)
        }


        private val bodyRemoveShapeMethodBind: CPointer<godot_method_bind> by lazy { getMB("Physics2DServer", "body_remove_shape") }
        fun bodyRemoveShape(body: RID, shapeIdx: Long) {
            _icall_Unit_RID_Long(bodyRemoveShapeMethodBind, this.rawMemory, body, shapeIdx)
        }


        private val bodyClearShapesMethodBind: CPointer<godot_method_bind> by lazy { getMB("Physics2DServer", "body_clear_shapes") }
        fun bodyClearShapes(body: RID) {
            _icall_Unit_RID(bodyClearShapesMethodBind, this.rawMemory, body)
        }


        private val bodySetShapeDisabledMethodBind: CPointer<godot_method_bind> by lazy { getMB("Physics2DServer", "body_set_shape_disabled") }
        fun bodySetShapeDisabled(body: RID, shapeIdx: Long, disable: Boolean) {
            _icall_Unit_RID_Long_Boolean(bodySetShapeDisabledMethodBind, this.rawMemory, body, shapeIdx, disable)
        }


        private val bodySetShapeAsOneWayCollisionMethodBind: CPointer<godot_method_bind> by lazy { getMB("Physics2DServer", "body_set_shape_as_one_way_collision") }
        fun bodySetShapeAsOneWayCollision(body: RID, shapeIdx: Long, enable: Boolean) {
            _icall_Unit_RID_Long_Boolean(bodySetShapeAsOneWayCollisionMethodBind, this.rawMemory, body, shapeIdx, enable)
        }


        private val bodyAttachObjectInstanceIdMethodBind: CPointer<godot_method_bind> by lazy { getMB("Physics2DServer", "body_attach_object_instance_id") }
        fun bodyAttachObjectInstanceId(body: RID, id: Long) {
            _icall_Unit_RID_Long(bodyAttachObjectInstanceIdMethodBind, this.rawMemory, body, id)
        }


        private val bodyGetObjectInstanceIdMethodBind: CPointer<godot_method_bind> by lazy { getMB("Physics2DServer", "body_get_object_instance_id") }
        fun bodyGetObjectInstanceId(body: RID): Long {
            return _icall_Long_RID(bodyGetObjectInstanceIdMethodBind, this.rawMemory, body)
        }


        private val bodySetContinuousCollisionDetectionModeMethodBind: CPointer<godot_method_bind> by lazy { getMB("Physics2DServer", "body_set_continuous_collision_detection_mode") }
        fun bodySetContinuousCollisionDetectionMode(body: RID, mode: Long) {
            _icall_Unit_RID_Long(bodySetContinuousCollisionDetectionModeMethodBind, this.rawMemory, body, mode)
        }


        private val bodyGetContinuousCollisionDetectionModeMethodBind: CPointer<godot_method_bind> by lazy { getMB("Physics2DServer", "body_get_continuous_collision_detection_mode") }
        fun bodyGetContinuousCollisionDetectionMode(body: RID): Physics2DServer.CCDMode {
            return Physics2DServer.CCDMode.fromInt(_icall_Long_RID(bodyGetContinuousCollisionDetectionModeMethodBind, this.rawMemory, body))
        }


        private val bodySetCollisionLayerMethodBind: CPointer<godot_method_bind> by lazy { getMB("Physics2DServer", "body_set_collision_layer") }
        fun bodySetCollisionLayer(body: RID, layer: Long) {
            _icall_Unit_RID_Long(bodySetCollisionLayerMethodBind, this.rawMemory, body, layer)
        }


        private val bodyGetCollisionLayerMethodBind: CPointer<godot_method_bind> by lazy { getMB("Physics2DServer", "body_get_collision_layer") }
        fun bodyGetCollisionLayer(body: RID): Long {
            return _icall_Long_RID(bodyGetCollisionLayerMethodBind, this.rawMemory, body)
        }


        private val bodySetCollisionMaskMethodBind: CPointer<godot_method_bind> by lazy { getMB("Physics2DServer", "body_set_collision_mask") }
        fun bodySetCollisionMask(body: RID, mask: Long) {
            _icall_Unit_RID_Long(bodySetCollisionMaskMethodBind, this.rawMemory, body, mask)
        }


        private val bodyGetCollisionMaskMethodBind: CPointer<godot_method_bind> by lazy { getMB("Physics2DServer", "body_get_collision_mask") }
        fun bodyGetCollisionMask(body: RID): Long {
            return _icall_Long_RID(bodyGetCollisionMaskMethodBind, this.rawMemory, body)
        }


        private val bodySetParamMethodBind: CPointer<godot_method_bind> by lazy { getMB("Physics2DServer", "body_set_param") }
        fun bodySetParam(body: RID, param: Long, value: Double) {
            _icall_Unit_RID_Long_Double(bodySetParamMethodBind, this.rawMemory, body, param, value)
        }


        private val bodyGetParamMethodBind: CPointer<godot_method_bind> by lazy { getMB("Physics2DServer", "body_get_param") }
        fun bodyGetParam(body: RID, param: Long): Double {
            return _icall_Double_RID_Long(bodyGetParamMethodBind, this.rawMemory, body, param)
        }


        private val bodySetStateMethodBind: CPointer<godot_method_bind> by lazy { getMB("Physics2DServer", "body_set_state") }
        fun bodySetState(body: RID, state: Long, value: Variant) {
            _icall_Unit_RID_Long_Variant(bodySetStateMethodBind, this.rawMemory, body, state, value)
        }


        private val bodyGetStateMethodBind: CPointer<godot_method_bind> by lazy { getMB("Physics2DServer", "body_get_state") }
        fun bodyGetState(body: RID, state: Long): Variant {
            return _icall_Variant_RID_Long(bodyGetStateMethodBind, this.rawMemory, body, state)
        }


        private val bodyApplyImpulseMethodBind: CPointer<godot_method_bind> by lazy { getMB("Physics2DServer", "body_apply_impulse") }
        fun bodyApplyImpulse(body: RID, position: Vector2, impulse: Vector2) {
            _icall_Unit_RID_Vector2_Vector2(bodyApplyImpulseMethodBind, this.rawMemory, body, position, impulse)
        }


        private val bodyAddForceMethodBind: CPointer<godot_method_bind> by lazy { getMB("Physics2DServer", "body_add_force") }
        fun bodyAddForce(body: RID, offset: Vector2, force: Vector2) {
            _icall_Unit_RID_Vector2_Vector2(bodyAddForceMethodBind, this.rawMemory, body, offset, force)
        }


        private val bodySetAxisVelocityMethodBind: CPointer<godot_method_bind> by lazy { getMB("Physics2DServer", "body_set_axis_velocity") }
        fun bodySetAxisVelocity(body: RID, axisVelocity: Vector2) {
            _icall_Unit_RID_Vector2(bodySetAxisVelocityMethodBind, this.rawMemory, body, axisVelocity)
        }


        private val bodyAddCollisionExceptionMethodBind: CPointer<godot_method_bind> by lazy { getMB("Physics2DServer", "body_add_collision_exception") }
        fun bodyAddCollisionException(body: RID, exceptedBody: RID) {
            _icall_Unit_RID_RID(bodyAddCollisionExceptionMethodBind, this.rawMemory, body, exceptedBody)
        }


        private val bodyRemoveCollisionExceptionMethodBind: CPointer<godot_method_bind> by lazy { getMB("Physics2DServer", "body_remove_collision_exception") }
        fun bodyRemoveCollisionException(body: RID, exceptedBody: RID) {
            _icall_Unit_RID_RID(bodyRemoveCollisionExceptionMethodBind, this.rawMemory, body, exceptedBody)
        }


        private val bodySetMaxContactsReportedMethodBind: CPointer<godot_method_bind> by lazy { getMB("Physics2DServer", "body_set_max_contacts_reported") }
        fun bodySetMaxContactsReported(body: RID, amount: Long) {
            _icall_Unit_RID_Long(bodySetMaxContactsReportedMethodBind, this.rawMemory, body, amount)
        }


        private val bodyGetMaxContactsReportedMethodBind: CPointer<godot_method_bind> by lazy { getMB("Physics2DServer", "body_get_max_contacts_reported") }
        fun bodyGetMaxContactsReported(body: RID): Long {
            return _icall_Long_RID(bodyGetMaxContactsReportedMethodBind, this.rawMemory, body)
        }


        private val bodySetOmitForceIntegrationMethodBind: CPointer<godot_method_bind> by lazy { getMB("Physics2DServer", "body_set_omit_force_integration") }
        fun bodySetOmitForceIntegration(body: RID, enable: Boolean) {
            _icall_Unit_RID_Boolean(bodySetOmitForceIntegrationMethodBind, this.rawMemory, body, enable)
        }


        private val bodyIsOmittingForceIntegrationMethodBind: CPointer<godot_method_bind> by lazy { getMB("Physics2DServer", "body_is_omitting_force_integration") }
        fun bodyIsOmittingForceIntegration(body: RID): Boolean {
            return _icall_Boolean_RID(bodyIsOmittingForceIntegrationMethodBind, this.rawMemory, body)
        }


        private val bodySetForceIntegrationCallbackMethodBind: CPointer<godot_method_bind> by lazy { getMB("Physics2DServer", "body_set_force_integration_callback") }
        fun bodySetForceIntegrationCallback(body: RID, receiver: Object, method: String, userdata: Variant? = null) {
            _icall_Unit_RID_Object_String_nVariant(bodySetForceIntegrationCallbackMethodBind, this.rawMemory, body, receiver, method, userdata)
        }


        private val bodyTestMotionMethodBind: CPointer<godot_method_bind> by lazy { getMB("Physics2DServer", "body_test_motion") }
        fun bodyTestMotion(body: RID, from: Transform2D, motion: Vector2, infiniteInertia: Boolean, margin: Double = 0.08, result: Physics2DTestMotionResult? = null): Boolean {
            return _icall_Boolean_RID_Transform2D_Vector2_Boolean_Double_nObject(bodyTestMotionMethodBind, this.rawMemory, body, from, motion, infiniteInertia, margin, result)
        }


        private val bodyGetDirectStateMethodBind: CPointer<godot_method_bind> by lazy { getMB("Physics2DServer", "body_get_direct_state") }
        fun bodyGetDirectState(body: RID): Physics2DDirectBodyState {
            return _icall_Physics2DDirectBodyState_RID(bodyGetDirectStateMethodBind, this.rawMemory, body)
        }


        private val jointSetParamMethodBind: CPointer<godot_method_bind> by lazy { getMB("Physics2DServer", "joint_set_param") }
        fun jointSetParam(joint: RID, param: Long, value: Double) {
            _icall_Unit_RID_Long_Double(jointSetParamMethodBind, this.rawMemory, joint, param, value)
        }


        private val jointGetParamMethodBind: CPointer<godot_method_bind> by lazy { getMB("Physics2DServer", "joint_get_param") }
        fun jointGetParam(joint: RID, param: Long): Double {
            return _icall_Double_RID_Long(jointGetParamMethodBind, this.rawMemory, joint, param)
        }


        private val pinJointCreateMethodBind: CPointer<godot_method_bind> by lazy { getMB("Physics2DServer", "pin_joint_create") }
        fun pinJointCreate(anchor: Vector2, bodyA: RID, bodyB: RID = RID()): RID {
            return _icall_RID_Vector2_RID_RID(pinJointCreateMethodBind, this.rawMemory, anchor, bodyA, bodyB)
        }


        private val grooveJointCreateMethodBind: CPointer<godot_method_bind> by lazy { getMB("Physics2DServer", "groove_joint_create") }
        fun grooveJointCreate(groove1A: Vector2, groove2A: Vector2, anchorB: Vector2, bodyA: RID = RID(), bodyB: RID = RID()): RID {
            return _icall_RID_Vector2_Vector2_Vector2_RID_RID(grooveJointCreateMethodBind, this.rawMemory, groove1A, groove2A, anchorB, bodyA, bodyB)
        }


        private val dampedSpringJointCreateMethodBind: CPointer<godot_method_bind> by lazy { getMB("Physics2DServer", "damped_spring_joint_create") }
        fun dampedSpringJointCreate(anchorA: Vector2, anchorB: Vector2, bodyA: RID, bodyB: RID = RID()): RID {
            return _icall_RID_Vector2_Vector2_RID_RID(dampedSpringJointCreateMethodBind, this.rawMemory, anchorA, anchorB, bodyA, bodyB)
        }


        private val dampedStringJointSetParamMethodBind: CPointer<godot_method_bind> by lazy { getMB("Physics2DServer", "damped_string_joint_set_param") }
        fun dampedStringJointSetParam(joint: RID, param: Long, value: Double) {
            _icall_Unit_RID_Long_Double(dampedStringJointSetParamMethodBind, this.rawMemory, joint, param, value)
        }


        private val dampedStringJointGetParamMethodBind: CPointer<godot_method_bind> by lazy { getMB("Physics2DServer", "damped_string_joint_get_param") }
        fun dampedStringJointGetParam(joint: RID, param: Long): Double {
            return _icall_Double_RID_Long(dampedStringJointGetParamMethodBind, this.rawMemory, joint, param)
        }


        private val jointGetTypeMethodBind: CPointer<godot_method_bind> by lazy { getMB("Physics2DServer", "joint_get_type") }
        fun jointGetType(joint: RID): Physics2DServer.JointType {
            return Physics2DServer.JointType.fromInt(_icall_Long_RID(jointGetTypeMethodBind, this.rawMemory, joint))
        }


        private val freeRidMethodBind: CPointer<godot_method_bind> by lazy { getMB("Physics2DServer", "free_rid") }
        fun freeRid(rid: RID) {
            _icall_Unit_RID(freeRidMethodBind, this.rawMemory, rid)
        }


        private val setActiveMethodBind: CPointer<godot_method_bind> by lazy { getMB("Physics2DServer", "set_active") }
        fun setActive(active: Boolean) {
            _icall_Unit_Boolean(setActiveMethodBind, this.rawMemory, active)
        }


        private val getProcessInfoMethodBind: CPointer<godot_method_bind> by lazy { getMB("Physics2DServer", "get_process_info") }
        fun getProcessInfo(processInfo: Long): Long {
            return _icall_Long_Long(getProcessInfoMethodBind, this.rawMemory, processInfo)
        }


    }
}
