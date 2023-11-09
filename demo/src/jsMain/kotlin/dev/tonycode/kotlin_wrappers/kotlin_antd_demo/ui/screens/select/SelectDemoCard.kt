package dev.tonycode.kotlin_wrappers.kotlin_antd_demo.ui.screens.select

import dev.tonycode.kotlin_wrappers.kotlin_antd_demo.ui.components.DemoCard
import react.FC
import react.Props
import react.create


val SelectDemoCard = FC<Props>("SelectDemoCard") {

    DemoCard {
        title = "Select"
        demoSrcLink = "select/SelectDemo.kt"

        showcase = SelectDemo.create()
    }

}
