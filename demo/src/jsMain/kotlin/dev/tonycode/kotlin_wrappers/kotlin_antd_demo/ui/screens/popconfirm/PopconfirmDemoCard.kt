package dev.tonycode.kotlin_wrappers.kotlin_antd_demo.ui.screens.popconfirm

import dev.tonycode.kotlin_wrappers.kotlin_antd_demo.ui.components.DemoCard
import react.FC
import react.Props
import react.create


val PopconfirmDemoCard = FC<Props>("PopconfirmDemoCard") {

    DemoCard {
        title = "Popconfirm"
        demoSrcLink = "popconfirm/PopconfirmDemo.kt"

        showcase = PopconfirmDemo.create()
    }

}
