@file:Suppress("unused", "ClassName", "EnumEntryName", "FunctionName", "SpellCheckingInspection", "PARAMETER_NAME_CHANGED_ON_OVERRIDE", "UnusedImport", "PackageDirectoryMismatch")
package godot

import godot.gdnative.*
import godot.core.*
import godot.utils.*
import godot.icalls.*
import kotlinx.cinterop.*


// NOTE: THIS FILE IS AUTO GENERATED FROM JSON API CONFIG


open class IP_Unix : IP {
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
        infix fun from(other: IP): IP_Unix = IP_Unix("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Object): IP_Unix = IP_Unix("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Variant): IP_Unix = fromVariant(IP_Unix(""), other)


        // Constants


    }


    // Properties


    // Methods
}
