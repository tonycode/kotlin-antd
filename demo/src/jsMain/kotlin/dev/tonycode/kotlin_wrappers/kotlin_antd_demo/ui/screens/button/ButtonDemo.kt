package dev.tonycode.kotlin_wrappers.kotlin_antd_demo.ui.screens.button

import antd.Button
import antd.ButtonShape
import antd.ButtonType
import antd.Size
import antd.Space
import emotion.react.css
import react.FC
import react.Props
import web.cssom.Color
import web.cssom.px


external interface ButtonDemoProps : Props {

    var areButtonsDanger: Boolean

    var areButtonsDisabled: Boolean

    var areButtonsGhost: Boolean

    var areButtonsLoading: Boolean

    var buttonsShape: ButtonShape

    var buttonsSize: Size

}

val ButtonDemo = FC<ButtonDemoProps>("ButtonDemo") { props ->

    Space {
        css {
            if (props.areButtonsGhost) {
                backgroundColor = Color("#ccc")
                padding = 8.px
                borderRadius = 8.px
            }
        }
        wrap = true

        Button {
            type = ButtonType.default
            danger = props.areButtonsDanger
            disabled = props.areButtonsDisabled
            ghost = props.areButtonsGhost
            loading = props.areButtonsLoading
            shape = props.buttonsShape
            size = props.buttonsSize

            +"default"
        }

        Button {
            type = ButtonType.primary
            danger = props.areButtonsDanger
            disabled = props.areButtonsDisabled
            ghost = props.areButtonsGhost
            loading = props.areButtonsLoading
            shape = props.buttonsShape
            size = props.buttonsSize

            +"primary"
        }

        Button {
            type = ButtonType.dashed
            danger = props.areButtonsDanger
            disabled = props.areButtonsDisabled
            ghost = props.areButtonsGhost
            loading = props.areButtonsLoading
            shape = props.buttonsShape
            size = props.buttonsSize

            +"dashed"
        }

        Button {
            type = ButtonType.text
            danger = props.areButtonsDanger
            disabled = props.areButtonsDisabled
            ghost = props.areButtonsGhost
            loading = props.areButtonsLoading
            shape = props.buttonsShape
            size = props.buttonsSize

            +"text"
        }

        Button {
            type = ButtonType.link
            danger = props.areButtonsDanger
            disabled = props.areButtonsDisabled
            ghost = props.areButtonsGhost
            loading = props.areButtonsLoading
            shape = props.buttonsShape
            size = props.buttonsSize

            +"link"
        }
    }

}
