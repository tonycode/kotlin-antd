package dev.tonycode.kotlin_wrappers.kotlin_antd_demo.ui.screens.icon

import dev.tonycode.kotlin_wrappers.kotlin_antd_demo.ui.components.DemoCard
import react.FC
import react.Props
import react.create


val IconDemoCard = FC<Props> {

    DemoCard {
        title = "Icon"
        showcase = IconDemo.create()
    }

}
