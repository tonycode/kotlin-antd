package dev.tonycode.kotlin_wrappers.kotlin_antd_demo.ui.screens.tabs

import dev.tonycode.kotlin_wrappers.kotlin_antd_demo.ui.components.DemoCard
import react.FC
import react.Props
import react.create


val TabsDemoCard = FC<Props> {

    DemoCard {
        title = "Tabs"
        showcase = TabsDemo.create()
    }

}
