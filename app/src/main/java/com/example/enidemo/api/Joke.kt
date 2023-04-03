package com.example.enidemo.api

import com.squareup.moshi.Json

data class Joke(@Json(name="value") val value: String) {
}