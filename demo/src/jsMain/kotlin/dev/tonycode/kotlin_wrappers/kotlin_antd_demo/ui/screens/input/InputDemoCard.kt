package dev.tonycode.kotlin_wrappers.kotlin_antd_demo.ui.screens.input

import dev.tonycode.kotlin_wrappers.kotlin_antd_demo.ui.components.DemoCard
import react.FC
import react.Props
import react.create


val InputDemoCard = FC<Props>("InputDemoCard") {

    DemoCard {
        title = "Input"
        demoSrcLink = "input/InputDemo.kt"

        showcase = InputDemo.create()
    }

}
