package dev.tonycode.kotlin_wrappers.kotlin_antd_demo.ui

import antd.Typography
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
import web.cssom.BoxSizing
import web.cssom.Position
import web.cssom.Selector
import web.cssom.div
import web.cssom.number
import web.cssom.pct
import web.cssom.plus
import web.cssom.px
import web.cssom.times


val App = FC<Props> {

    Global {
        styles {
            "*" {
                margin = 0.px
            }
            "*, *::before, *::after" {
                boxSizing = BoxSizing.borderBox
            }
            body {
                backgroundColor = Colors.screenBackground
                lineHeight = number(1.5)
                set(Selector("-webkit-font-smoothing"), "antialiased")
            }
        }
    }

    Fragment {
        // header
        Typography.Title {
            css {
                marginTop = (1.5 * Dimens.screenMargin)
                marginLeft = (Dimens.screenMargin + Dimens.cardMargin/2)
                marginRight = (Dimens.screenMargin + Dimens.cardMargin/2)
            }
            level = 3

            +"kotlin-antd - Demos"
        }

        // content
        div {
            css {
                marginTop = (1.5 * Dimens.screenMargin)
                marginBottom = 72.px
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
