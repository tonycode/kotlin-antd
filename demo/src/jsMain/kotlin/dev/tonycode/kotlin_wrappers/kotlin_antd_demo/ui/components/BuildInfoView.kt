package dev.tonycode.kotlin_wrappers.kotlin_antd_demo.ui.components

import dev.tonycode.kotlin_wrappers.kotlin_antd_demo.util.getBuildInfo
import emotion.react.css
import react.FC
import react.Props
import react.dom.html.ReactHTML.div
import react.dom.html.ReactHTML.p
import web.cssom.Auto
import web.cssom.Display
import web.cssom.pct


val BuildInfoView = FC<Props> {

    div {
        css {
            width = 100.pct
            display = Display.flex
        }

        p {
            css {
                display = Display.inlineBlock
                marginLeft = Auto.auto
                marginRight = Auto.auto
            }

            +getBuildInfo()
        }
    }

}
