package dev.tonycode.kotlin_wrappers.kotlin_antd_demo.ui.screens.button

import antd.ButtonShape
import antd.ButtonShapeFactory
import antd.Direction
import antd.Radio
import antd.RadioOptionType
import antd.Size
import antd.SizeFactory
import antd.Space
import antd.setOptions
import antd.setValue
import dev.tonycode.kotlin_wrappers.kotlin_antd_demo.ui.components.DemoBooleanParam
import dev.tonycode.kotlin_wrappers.kotlin_antd_demo.ui.components.DemoParam
import react.FC
import react.create


external interface ButtonDemoControlsProps : ButtonDemoProps {

    var onButtonsDangerChanged: (value: Boolean) -> Unit

    var onButtonsDisabledChanged: (value: Boolean) -> Unit

    var onButtonsGhostChanged: (value: Boolean) -> Unit

    var onButtonsLoadingChanged: (value: Boolean) -> Unit

    var onButtonsShapeChanged: (value: ButtonShape) -> Unit

    var onButtonsSizeChanged: (value: Size) -> Unit

}

val ButtonDemoControls = FC<ButtonDemoControlsProps>("ButtonDemoControls") { props ->

    Space {
        direction = Direction.vertical

        DemoBooleanParam {
            name = "danger"
            value = props.areButtonsDanger
            onValueChanged = { props.onButtonsDangerChanged(it) }
        }

        DemoBooleanParam {
            name = "disabled"
            value = props.areButtonsDisabled
            onValueChanged = { props.onButtonsDisabledChanged(it) }
        }

        DemoBooleanParam {
            name = "ghost"
            value = props.areButtonsGhost
            onValueChanged = { props.onButtonsGhostChanged(it) }
        }

        DemoBooleanParam {
            name = "loading"
            value = props.areButtonsLoading
            onValueChanged = { props.onButtonsLoadingChanged(it) }
        }

        DemoParam {
            name = "shape"

            changer = Radio.Group.create {
                setOptions(
                    ButtonShape.default.toString(),
                    ButtonShape.circle.toString(),
                    ButtonShape.round.toString(),
                )
                setValue(props.buttonsShape.toString())

                optionType = RadioOptionType.button

                onChange = {
                    props.onButtonsShapeChanged(ButtonShapeFactory.ofValue(it.target.value))
                }
            }
        }

        DemoParam {
            name = "size"

            changer = Radio.Group.create {
                setOptions(
                    Size.small.toString(),
                    Size.middle.toString(),
                    Size.large.toString(),
                )
                setValue(props.buttonsSize.toString())

                optionType = RadioOptionType.button

                onChange = {
                    props.onButtonsSizeChanged(SizeFactory.ofValue(it.target.value))
                }
            }
        }
    }

}
