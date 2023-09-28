package dev.tonycode.kotlin_wrappers.kotlin_antd_demo.ui.components

import antd.Typography
import dev.tonycode.kotlin_wrappers.kotlin_antd_demo.ui.Dimens
import emotion.react.css
import react.FC
import react.Props
import web.cssom.px


external interface SectionProps : Props {

    var title: String

}

val Section = FC<SectionProps> { props ->

    Typography.Title {
        css {
            marginLeft = Dimens.cardMargin
            marginTop = 16.px
            marginBottom = 0.px
        }
        level = 4

        +props.title
    }

}
