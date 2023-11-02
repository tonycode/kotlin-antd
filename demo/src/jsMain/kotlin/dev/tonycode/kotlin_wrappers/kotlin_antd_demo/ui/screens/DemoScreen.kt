package dev.tonycode.kotlin_wrappers.kotlin_antd_demo.ui.screens

import antd.Direction
import antd.Size
import antd.Space
import dev.tonycode.kotlin_wrappers.kotlin_antd_demo.ui.components.Section
import dev.tonycode.kotlin_wrappers.kotlin_antd_demo.ui.screens.alert.AlertDemoCard
import dev.tonycode.kotlin_wrappers.kotlin_antd_demo.ui.screens.button.ButtonDemoCard
import dev.tonycode.kotlin_wrappers.kotlin_antd_demo.ui.screens.icon.IconDemoCard
import dev.tonycode.kotlin_wrappers.kotlin_antd_demo.ui.screens.radio.RadioDemoCard
import dev.tonycode.kotlin_wrappers.kotlin_antd_demo.ui.screens.spin.SpinDemoCard
import dev.tonycode.kotlin_wrappers.kotlin_antd_demo.ui.screens.tabs.TabsDemoCard
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

        Section { title = "General" }
        ButtonDemoCard()
        IconDemoCard()
        TypographyTitleDemoCard()
        TypographyTextDemoCard()

        Section { title = "Data Entry" }
        RadioDemoCard()

        Section { title = "Data Display" }
        TabsDemoCard()

        Section { title = "Feedback" }
        AlertDemoCard()
        SpinDemoCard()
    }

}
