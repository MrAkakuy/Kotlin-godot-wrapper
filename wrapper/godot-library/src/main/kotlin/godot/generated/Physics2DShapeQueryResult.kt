@file:Suppress("unused", "ClassName", "EnumEntryName", "FunctionName", "SpellCheckingInspection", "PARAMETER_NAME_CHANGED_ON_OVERRIDE", "UnusedImport", "PackageDirectoryMismatch")
package godot

import godot.gdnative.*
import godot.core.*
import godot.utils.*
import godot.icalls.*
import kotlinx.cinterop.*


// NOTE: THIS FILE IS AUTO GENERATED FROM JSON API CONFIG


open class Physics2DShapeQueryResult : Reference {
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
        infix fun from(other: Reference): Physics2DShapeQueryResult = Physics2DShapeQueryResult("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Object): Physics2DShapeQueryResult = Physics2DShapeQueryResult("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Variant): Physics2DShapeQueryResult = fromVariant(Physics2DShapeQueryResult(""), other)


        // Constants


    }


    // Properties


    // Methods
    private val getResultCountMethodBind: CPointer<godot_method_bind> by lazy { getMB("Physics2DShapeQueryResult", "get_result_count") }
    open fun getResultCount(): Long {
        return _icall_Long(getResultCountMethodBind, this.rawMemory)
    }


    private val getResultRidMethodBind: CPointer<godot_method_bind> by lazy { getMB("Physics2DShapeQueryResult", "get_result_rid") }
    open fun getResultRid(idx: Long): RID {
        return _icall_RID_Long(getResultRidMethodBind, this.rawMemory, idx)
    }


    private val getResultObjectIdMethodBind: CPointer<godot_method_bind> by lazy { getMB("Physics2DShapeQueryResult", "get_result_object_id") }
    open fun getResultObjectId(idx: Long): Long {
        return _icall_Long_Long(getResultObjectIdMethodBind, this.rawMemory, idx)
    }


    private val getResultObjectMethodBind: CPointer<godot_method_bind> by lazy { getMB("Physics2DShapeQueryResult", "get_result_object") }
    open fun getResultObject(idx: Long): Object {
        return _icall_Object_Long(getResultObjectMethodBind, this.rawMemory, idx)
    }


    private val getResultObjectShapeMethodBind: CPointer<godot_method_bind> by lazy { getMB("Physics2DShapeQueryResult", "get_result_object_shape") }
    open fun getResultObjectShape(idx: Long): Long {
        return _icall_Long_Long(getResultObjectShapeMethodBind, this.rawMemory, idx)
    }


}
