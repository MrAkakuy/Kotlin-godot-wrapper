@file:Suppress("unused", "ClassName", "EnumEntryName", "FunctionName", "SpellCheckingInspection", "PARAMETER_NAME_CHANGED_ON_OVERRIDE", "UnusedImport", "PackageDirectoryMismatch")
package godot

import godot.gdnative.*
import godot.core.*
import godot.icalls.*
import kotlinx.cinterop.*


// NOTE: THIS FILE IS AUTO GENERATED FROM JSON API CONFIG


open class IP : Object {
    private constructor() : super("")
    constructor(variant: Variant) : super(variant)
    internal constructor(mem: COpaquePointer) : super(mem)
    internal constructor(name: String) : super(name)


    // Enums 

    enum class ResolverStatus(val id: Int) {
        RESOLVER_STATUS_NONE(0),
        RESOLVER_STATUS_WAITING(1),
        RESOLVER_STATUS_DONE(2),
        RESOLVER_STATUS_ERROR(3),
        ;

        companion object {
            fun fromInt(value: Int) = values().single { it.id == value }
        }
    }
    enum class Type(val id: Int) {
        TYPE_NONE(0),
        TYPE_IPV4(1),
        TYPE_IPV6(2),
        TYPE_ANY(3),
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


    @ThreadLocal    companion object {
        infix fun from(other: Object): IP = IP("").apply { setRawMemory(other.rawMemory) }
        infix fun from(other: Variant): IP = fromVariant(IP(""), other)


        // Constants
        const val RESOLVER_STATUS_NONE: Int = 0
        const val RESOLVER_STATUS_WAITING: Int = 1
        const val RESOLVER_STATUS_DONE: Int = 2
        const val RESOLVER_STATUS_ERROR: Int = 3
        const val RESOLVER_MAX_QUERIES: Int = 32
        const val RESOLVER_INVALID_ID: Int = -1
        const val TYPE_NONE: Int = 0
        const val TYPE_IPV4: Int = 1
        const val TYPE_IPV6: Int = 2
        const val TYPE_ANY: Int = 3


        private val rawMemory: COpaquePointer by lazy { getSingleton("IP", "IP") }


        // Properties


        // Methods
        private val resolveHostnameMethodBind: CPointer<godot_method_bind> by lazy { getMB("IP", "resolve_hostname") }
        fun resolveHostname(host: String, ipType: Int = 3): String {
            return _icall_String_String_Int(resolveHostnameMethodBind, this.rawMemory, host, ipType)
        }


        private val resolveHostnameQueueItemMethodBind: CPointer<godot_method_bind> by lazy { getMB("IP", "resolve_hostname_queue_item") }
        fun resolveHostnameQueueItem(host: String, ipType: Int = 3): Int {
            return _icall_Int_String_Int(resolveHostnameQueueItemMethodBind, this.rawMemory, host, ipType)
        }


        private val getResolveItemStatusMethodBind: CPointer<godot_method_bind> by lazy { getMB("IP", "get_resolve_item_status") }
        fun getResolveItemStatus(id: Int): IP.ResolverStatus {
            return IP.ResolverStatus.fromInt(_icall_Int_Int(getResolveItemStatusMethodBind, this.rawMemory, id))
        }


        private val getResolveItemAddressMethodBind: CPointer<godot_method_bind> by lazy { getMB("IP", "get_resolve_item_address") }
        fun getResolveItemAddress(id: Int): String {
            return _icall_String_Int(getResolveItemAddressMethodBind, this.rawMemory, id)
        }


        private val eraseResolveItemMethodBind: CPointer<godot_method_bind> by lazy { getMB("IP", "erase_resolve_item") }
        fun eraseResolveItem(id: Int) {
            _icall_Unit_Int(eraseResolveItemMethodBind, this.rawMemory, id)
        }


        private val getLocalAddressesMethodBind: CPointer<godot_method_bind> by lazy { getMB("IP", "get_local_addresses") }
        fun getLocalAddresses(): GDArray {
            return _icall_GDArray(getLocalAddressesMethodBind, this.rawMemory)
        }


        private val clearCacheMethodBind: CPointer<godot_method_bind> by lazy { getMB("IP", "clear_cache") }
        fun clearCache(hostname: String = "") {
            _icall_Unit_String(clearCacheMethodBind, this.rawMemory, hostname)
        }


    }
}
