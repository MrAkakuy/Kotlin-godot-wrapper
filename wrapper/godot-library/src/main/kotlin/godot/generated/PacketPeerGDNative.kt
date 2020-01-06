@file:Suppress("unused", "ClassName", "EnumEntryName", "FunctionName", "SpellCheckingInspection", "PARAMETER_NAME_CHANGED_ON_OVERRIDE", "UnusedImport", "PackageDirectoryMismatch")
package godot

import godot.gdnative.*
import godot.core.*
import godot.utils.*
import godot.icalls.*
import kotlinx.cinterop.*


// NOTE: THIS FILE IS AUTO GENERATED FROM JSON API CONFIG


open class PacketPeerGDNative : PacketPeer {
    constructor() : super("PacketPeerGDNative")
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
        infix fun from(other: PacketPeer): PacketPeerGDNative = PacketPeerGDNative("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Reference): PacketPeerGDNative = PacketPeerGDNative("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Object): PacketPeerGDNative = PacketPeerGDNative("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Variant): PacketPeerGDNative = fromVariant(PacketPeerGDNative(""), other)


        // Constants


    }


    // Properties


    // Methods
}
