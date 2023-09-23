package dev.tonycode.kotlin_wrappers.kotlin_antd_demo.ui.components

import dev.tonycode.kotlin_wrappers.kotlin_antd_demo.ui.Colors
import dev.tonycode.kotlin_wrappers.kotlin_antd_demo.ui.Dimens
import emotion.react.css
import react.FC
import react.Props
import react.ReactNode
import react.dom.html.ReactHTML.div
import react.dom.html.ReactHTML.h3
import web.cssom.px


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
            }

            // title
            h3 {
                css {
                    marginTop = 0.px
                    marginBottom = Dimens.cardMargin
                }

                +props.title
            }

            // showcase
            child(props.showcase)
        }

        // controls
        div {
            css { padding = Dimens.cardMargin }
            child(props.controls)
        }
    }

}
