@file:Suppress("unused", "ClassName", "EnumEntryName", "FunctionName", "SpellCheckingInspection", "PARAMETER_NAME_CHANGED_ON_OVERRIDE", "UnusedImport", "PackageDirectoryMismatch")
package godot

import godot.gdnative.*
import godot.core.*
import godot.utils.*
import godot.icalls.*
import kotlinx.cinterop.*


// NOTE: THIS FILE IS AUTO GENERATED FROM JSON API CONFIG


open class HBoxContainer : BoxContainer {
    constructor() : super("HBoxContainer")
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
        infix fun from(other: BoxContainer): HBoxContainer = HBoxContainer("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Container): HBoxContainer = HBoxContainer("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Control): HBoxContainer = HBoxContainer("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: CanvasItem): HBoxContainer = HBoxContainer("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Node): HBoxContainer = HBoxContainer("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Object): HBoxContainer = HBoxContainer("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Variant): HBoxContainer = fromVariant(HBoxContainer(""), other)


        // Constants


    }


    // Properties


    // Methods
}
