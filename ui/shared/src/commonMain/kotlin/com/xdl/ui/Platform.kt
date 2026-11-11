package com.xdl.ui

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform