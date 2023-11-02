package dev.tonycode.kotlin_wrappers.kotlin_antd_demo.ui.components

import dev.tonycode.kotlin_wrappers.kotlin_antd_demo.ui.Colors
import dev.tonycode.kotlin_wrappers.kotlin_antd_demo.util.getBuildInfo
import emotion.react.css
import react.FC
import react.Props
import react.dom.html.ReactHTML.div
import react.dom.html.ReactHTML.p
import react.dom.html.ReactHTML.small
import web.cssom.Auto
import web.cssom.Display


val BuildInfoView = FC<Props>("BuildInfoView") {

    div {
        css {
            backgroundColor = Colors.onScreenBackground
            display = Display.flex
        }

        p {
            css {
                display = Display.inlineBlock
                marginLeft = Auto.auto
                marginRight = Auto.auto
            }

            small { +getBuildInfo() }
        }
    }

}
