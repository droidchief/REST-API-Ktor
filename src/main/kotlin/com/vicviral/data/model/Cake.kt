package com.vicviral.data.model

import kotlinx.serialization.Serializable

@Serializable
data class Cake(
    val id: Int,
    val name: String,
    val description: String,
    val type: String,
    val imageUrl: String
)
