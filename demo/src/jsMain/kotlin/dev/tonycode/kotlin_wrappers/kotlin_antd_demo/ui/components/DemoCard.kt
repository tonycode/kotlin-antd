package dev.tonycode.kotlin_wrappers.kotlin_antd_demo.ui.components

import antd.Align
import antd.Direction
import antd.GithubFilled
import antd.Size
import antd.Space
import antd.Typography
import dev.tonycode.kotlin_wrappers.kotlin_antd_demo.ui.Colors
import dev.tonycode.kotlin_wrappers.kotlin_antd_demo.ui.Dimens
import dev.tonycode.kotlin_wrappers.kotlin_antd_demo.util.ifNotNull
import emotion.react.css
import react.FC
import react.Props
import react.ReactNode
import react.dom.html.ReactHTML.a
import react.dom.html.ReactHTML.code
import react.dom.html.ReactHTML.div
import web.cssom.px
import web.cssom.times
import web.window.WindowTarget


external interface DemoCardProps : Props {

    var title: String

    /** without [demoSrcPrefix] */
    var demoSrcLink: String?

    var showcase: ReactNode

    var controls: ReactNode?

}

val DemoCard = FC<DemoCardProps>("DemoCard") { props ->

    val controls = props.controls


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
                if (controls != null) paddingBottom = (1.5 * Dimens.cardMargin)
            }

            Space {
                direction = Direction.horizontal
                align = Align.baseline

                // title
                Typography.Title {
                    css {
                        code { margin = 0.px /* clear left & right margins just for title usage */ }
                    }
                    level = 4
                    code = true

                    +props.title
                }

                props.demoSrcLink?.ifNotNull { demoSrcLink ->
                    // demo src link
                    a {
                        href = demoSrcPrefix + demoSrcLink
                        target = WindowTarget._blank
                        title = "example source"

                        GithubFilled()
                    }
                }
            }

            // showcase
            div {
                css { marginTop = (1.5 * Dimens.cardMargin) }

                +props.showcase
            }
        }

        // controls
        if (controls != null) {
            div {
                css { padding = Dimens.cardMargin }

                +controls
            }
        }
    }

}


val demoSrcPrefix = "https://github.com/tonycode/kotlin-antd/" +
    "blob/main/" +
    "demo/src/jsMain/kotlin/dev/tonycode/kotlin_wrappers/kotlin_antd_demo/ui/screens/"
