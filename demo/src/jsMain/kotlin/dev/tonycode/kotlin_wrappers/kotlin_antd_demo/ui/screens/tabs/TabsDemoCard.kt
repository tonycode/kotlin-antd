package dev.tonycode.kotlin_wrappers.kotlin_antd_demo.ui.screens.tabs

import dev.tonycode.kotlin_wrappers.kotlin_antd_demo.ui.components.DemoCard
import react.FC
import react.Props
import react.create


val TabsDemoCard = FC<Props>("TabsDemoCard") {

    DemoCard {
        title = "Tabs"
        demoSrcLink = "tabs/TabsDemo.kt"

        showcase = TabsDemo.create()
    }

}
