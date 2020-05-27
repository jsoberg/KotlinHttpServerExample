package org.example.httpserver

import fi.iki.elonen.NanoHTTPD

class ExampleServer : NanoHTTPD(8080) {

    override fun serve(session: IHTTPSession?): Response {
        var msg = "<html><body><h1>Hello server</h1>\n"
        val parms = session!!.parameters
        msg += if (parms["username"] == null) {
            """<form action='?' method='get'> <p>Your name: <input type='text' name='username'></p></form>"""
        } else {
            "<p>Hello, " + parms["username"] + "!</p>"
        }
        msg += "</body></html>\n"
        return newFixedLengthResponse(msg)
    }
}