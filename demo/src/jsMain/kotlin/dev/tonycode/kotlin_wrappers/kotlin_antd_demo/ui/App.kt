package dev.tonycode.kotlin_wrappers.kotlin_antd_demo.ui

import dev.tonycode.kotlin_wrappers.kotlin_antd_demo.ui.components.BuildInfoView
import dev.tonycode.kotlin_wrappers.kotlin_antd_demo.ui.screens.DemoScreen
import emotion.react.Global
import emotion.react.css
import emotion.react.styles
import react.FC
import react.Fragment
import react.Props
import react.dom.html.ReactHTML.body
import react.dom.html.ReactHTML.div
import react.dom.html.ReactHTML.h2
import web.cssom.Position
import web.cssom.div
import web.cssom.pct
import web.cssom.plus
import web.cssom.px
import web.cssom.times


val App = FC<Props> {

    Global {
        styles {
            body {
                margin = 0.px
                backgroundColor = Colors.screenBackground
            }
        }
    }

    Fragment {
        // header
        h2 {
            css {
                marginTop = (1.5 * Dimens.screenMargin)
                marginLeft = (Dimens.screenMargin + Dimens.cardMargin/2)
                marginRight = (Dimens.screenMargin + Dimens.cardMargin/2)
            }

            +"kotlin-antd - Demos"
        }

        // content
        div {
            css {
                marginTop = (1.5 * Dimens.screenMargin)
                paddingLeft = Dimens.screenMargin
                paddingRight = Dimens.screenMargin
            }

            DemoScreen()
        }

        // footer
        div {
            css {
                width = 100.pct
                position = Position.fixed
                bottom = 0.px
            }

            BuildInfoView()
        }
    }

}
