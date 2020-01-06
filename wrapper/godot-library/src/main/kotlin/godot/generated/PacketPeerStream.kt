@file:Suppress("unused", "ClassName", "EnumEntryName", "FunctionName", "SpellCheckingInspection", "PARAMETER_NAME_CHANGED_ON_OVERRIDE", "UnusedImport", "PackageDirectoryMismatch")
package godot

import godot.gdnative.*
import godot.core.*
import godot.utils.*
import godot.icalls.*
import kotlinx.cinterop.*


// NOTE: THIS FILE IS AUTO GENERATED FROM JSON API CONFIG


open class PacketPeerStream : PacketPeer {
    constructor() : super("PacketPeerStream")
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
        infix fun from(other: PacketPeer): PacketPeerStream = PacketPeerStream("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Reference): PacketPeerStream = PacketPeerStream("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Object): PacketPeerStream = PacketPeerStream("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Variant): PacketPeerStream = fromVariant(PacketPeerStream(""), other)


        // Constants


    }


    // Properties
    open var inputBufferMaxSize: Long
        get() = _icall_Long(getInputBufferMaxSizeMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Long(setInputBufferMaxSizeMethodBind, this.rawMemory, value)


    open var outputBufferMaxSize: Long
        get() = _icall_Long(getOutputBufferMaxSizeMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Long(setOutputBufferMaxSizeMethodBind, this.rawMemory, value)


    open var streamPeer: StreamPeer
        get() = _icall_StreamPeer(getStreamPeerMethodBind, this.rawMemory)
        set(value) = _icall_Unit_Object(setStreamPeerMethodBind, this.rawMemory, value)




    // Methods
    private val setStreamPeerMethodBind: CPointer<godot_method_bind> by lazy { getMB("PacketPeerStream", "set_stream_peer") }
    open fun setStreamPeer(peer: StreamPeer) {
        _icall_Unit_Object(setStreamPeerMethodBind, this.rawMemory, peer)
    }


    private val getStreamPeerMethodBind: CPointer<godot_method_bind> by lazy { getMB("PacketPeerStream", "get_stream_peer") }
    open fun getStreamPeer(): StreamPeer {
        return _icall_StreamPeer(getStreamPeerMethodBind, this.rawMemory)
    }


    private val setInputBufferMaxSizeMethodBind: CPointer<godot_method_bind> by lazy { getMB("PacketPeerStream", "set_input_buffer_max_size") }
    open fun setInputBufferMaxSize(maxSizeBytes: Long) {
        _icall_Unit_Long(setInputBufferMaxSizeMethodBind, this.rawMemory, maxSizeBytes)
    }


    private val setOutputBufferMaxSizeMethodBind: CPointer<godot_method_bind> by lazy { getMB("PacketPeerStream", "set_output_buffer_max_size") }
    open fun setOutputBufferMaxSize(maxSizeBytes: Long) {
        _icall_Unit_Long(setOutputBufferMaxSizeMethodBind, this.rawMemory, maxSizeBytes)
    }


    private val getInputBufferMaxSizeMethodBind: CPointer<godot_method_bind> by lazy { getMB("PacketPeerStream", "get_input_buffer_max_size") }
    open fun getInputBufferMaxSize(): Long {
        return _icall_Long(getInputBufferMaxSizeMethodBind, this.rawMemory)
    }


    private val getOutputBufferMaxSizeMethodBind: CPointer<godot_method_bind> by lazy { getMB("PacketPeerStream", "get_output_buffer_max_size") }
    open fun getOutputBufferMaxSize(): Long {
        return _icall_Long(getOutputBufferMaxSizeMethodBind, this.rawMemory)
    }


}
