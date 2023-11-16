package dev.tonycode.kotlin_wrappers.kotlin_antd_demo.ui.screens.message

import dev.tonycode.kotlin_wrappers.kotlin_antd_demo.ui.components.DemoCard
import react.FC
import react.Props
import react.create


val MessageDemoCard = FC<Props>("MessageDemoCard") {

    DemoCard {
        title = "message"
        demoSrcLink = "message/MessageDemo.kt"

        showcase = MessageDemo.create()
    }

}
