package dev.tonycode.kotlin_wrappers.kotlin_antd_demo

import dev.tonycode.kotlin_wrappers.kotlin_antd_demo.ui.App
import react.create
import react.dom.client.createRoot
import web.dom.Element
import web.dom.document


fun main() {
    val rootContainer: Element =
        document.getElementById("root") ?: error("Couldn't find root container!")

    createRoot(rootContainer).render(
        App.create()
    )
}
