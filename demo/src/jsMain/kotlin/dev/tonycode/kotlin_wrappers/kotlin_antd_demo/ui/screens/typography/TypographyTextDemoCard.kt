package dev.tonycode.kotlin_wrappers.kotlin_antd_demo.ui.screens.typography

import dev.tonycode.kotlin_wrappers.kotlin_antd_demo.ui.components.DemoCard
import react.FC
import react.Props
import react.create


val TypographyTextDemoCard = FC<Props> {

    DemoCard {
        title = "Typography.Text"
        showcase = TypographyTextDemo.create()
    }

}
