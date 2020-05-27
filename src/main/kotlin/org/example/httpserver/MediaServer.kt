package org.example.httpserver

import fi.iki.elonen.NanoHTTPD

class MediaServer : NanoHTTPD(8080) {

    override fun serve(session: IHTTPSession?): Response {
        val mimeType = "image/jpeg"
        val mediaStream = MediaServer::class.java.getResourceAsStream("/bubbles.jpg")
        return newChunkedResponse(Response.Status.OK, mimeType, mediaStream)
    }
}