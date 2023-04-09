package com.example.kapp

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform

fun hello(): String = "Hello from Platform"
class Proxy {
    fun proxyHello() = hello()
}