package dev.tonycode.kotlin_wrappers.kotlin_antd_demo.ui.components

import antd.Typography
import dev.tonycode.kotlin_wrappers.kotlin_antd_demo.ui.Colors
import dev.tonycode.kotlin_wrappers.kotlin_antd_demo.ui.Dimens
import emotion.react.css
import react.FC
import react.Props
import react.ReactNode
import react.dom.html.ReactHTML.code
import react.dom.html.ReactHTML.div
import web.cssom.px
import web.cssom.times


external interface DemoCardProps : Props {

    var title: String

    var showcase: ReactNode

    var controls: ReactNode

}

val DemoCard = FC<DemoCardProps> { props ->

    div {
        css {
            borderRadius = Dimens.cardCornerRadius
            backgroundColor = Colors.onScreenBackground
        }

        div {
            css {
                borderRadius = Dimens.cardCornerRadius
                backgroundColor = Colors.cardBackground
                padding = Dimens.cardMargin
                paddingBottom = (1.5 * Dimens.cardMargin)
            }

            // title
            Typography.Title {
                css {
                    code { margin = 0.px /* clear left & right margins just for title usage */ }
                }
                level = 4
                code = true

                +props.title
            }

            // showcase
            div {
                css { marginTop = (1.5 * Dimens.cardMargin) }
                child(props.showcase)
            }
        }

        // controls
        div {
            css { padding = Dimens.cardMargin }
            child(props.controls)
        }
    }

}