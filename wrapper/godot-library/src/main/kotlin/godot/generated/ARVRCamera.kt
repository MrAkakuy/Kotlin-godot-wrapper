@file:Suppress("unused", "ClassName", "EnumEntryName", "FunctionName", "SpellCheckingInspection", "PARAMETER_NAME_CHANGED_ON_OVERRIDE", "UnusedImport", "PackageDirectoryMismatch")
package godot

import godot.gdnative.*
import godot.core.*
import godot.utils.*
import godot.icalls.*
import kotlinx.cinterop.*


// NOTE: THIS FILE IS AUTO GENERATED FROM JSON API CONFIG


open class ARVRCamera : Camera {
    constructor() : super("ARVRCamera")
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
        infix fun from(other: Camera): ARVRCamera = ARVRCamera("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Spatial): ARVRCamera = ARVRCamera("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Node): ARVRCamera = ARVRCamera("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Object): ARVRCamera = ARVRCamera("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Variant): ARVRCamera = fromVariant(ARVRCamera(""), other)


        // Constants


    }


    // Properties


    // Methods
}
