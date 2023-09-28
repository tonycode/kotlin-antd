package dev.tonycode.kotlin_wrappers.kotlin_antd_demo.ui.screens

import antd.Direction
import antd.Size
import antd.Space
import dev.tonycode.kotlin_wrappers.kotlin_antd_demo.ui.screens.button.ButtonDemoCard
import dev.tonycode.kotlin_wrappers.kotlin_antd_demo.ui.screens.radio.RadioDemoCard
import dev.tonycode.kotlin_wrappers.kotlin_antd_demo.ui.screens.spin.SpinDemoCard
import dev.tonycode.kotlin_wrappers.kotlin_antd_demo.ui.screens.typography.TypographyTextDemoCard
import dev.tonycode.kotlin_wrappers.kotlin_antd_demo.ui.screens.typography.TypographyTitleDemoCard
import emotion.react.css
import react.FC
import react.Props
import web.cssom.pct


val DemoScreen = FC<Props> {

    Space {
        css { width = 100.pct }
        direction = Direction.vertical
        size = Size.large

        ButtonDemoCard()

        TypographyTitleDemoCard()

        TypographyTextDemoCard()

        RadioDemoCard()

        SpinDemoCard()

    }

}
