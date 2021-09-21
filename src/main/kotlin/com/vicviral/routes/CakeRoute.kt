package com.vicviral.routes

import com.vicviral.data.model.Cake
import io.ktor.application.*
import io.ktor.http.*
import io.ktor.response.*
import io.ktor.routing.*

private const val BASE_URL =  "https://192.168.1.144:8080"

private val cakes = listOf(
    Cake(1, "dotch cake", "The best thing you will ever taste", "Butter Cake", "$BASE_URL/cakes/cake1.jpeg"),
    Cake(2, "frad cake", "The best thing you will ever taste", "Ice Cake", "$BASE_URL/cakes/cake2.jpeg"),
    Cake(3, "german cake", "The best thing you will ever taste", "Fondant Cake", "$BASE_URL/cakes/cake3.jpeg"),
    Cake(4, "spanish cake", "The best thing you will ever taste", "Swiss Cake", "$BASE_URL/cakes/cake4.jpeg"),
    Cake(5, "italian cake", "The best thing you will ever taste", "Berries Cake", "$BASE_URL/cakes/cake5.jpeg")
)

fun Route.randomCake() {
    get("/randomcake") {
        call.respond(
            HttpStatusCode.OK,
            cakes
        )
    }
}