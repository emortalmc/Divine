package dev.emortal.divine.config

@kotlinx.serialization.Serializable
data class DivineConfig(
    val address: String = "redis://172.17.0.1:6379",
    val tips: Array<String> = arrayOf("")
)