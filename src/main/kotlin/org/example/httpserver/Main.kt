package org.example.httpserver

import fi.iki.elonen.util.ServerRunner

fun main(args: Array<String>) {
    ServerRunner.run(MediaServer::class.java)
}