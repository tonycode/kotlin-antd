package dev.tonycode.kotlin_wrappers.kotlin_antd_demo.ui.screens.button

import antd.ButtonShape
import antd.ButtonShapeFactory
import antd.Checkbox
import antd.Option
import antd.Select
import antd.Size
import antd.SizeFactory
import antd.Space
import react.FC
import react.Fragment
import react.dom.html.ReactHTML.p


external interface ButtonDemoControlsProps : ButtonDemoProps {

    var onButtonsDangerChanged: (value: Boolean) -> Unit

    var onButtonsDisabledChanged: (value: Boolean) -> Unit

    var onButtonsGhostChanged: (value: Boolean) -> Unit

    var onButtonsLoadingChanged: (value: Boolean) -> Unit

    var onButtonsShapeChanged: (value: ButtonShape) -> Unit

    var onButtonsSizeChanged: (value: Size) -> Unit

}

val ButtonDemoControls = FC<ButtonDemoControlsProps> { props ->

    Fragment {
        Space {
            wrap = true

            // danger
            Checkbox {
                checked = props.areButtonsDanger

                onChange = {
                    props.onButtonsDangerChanged(it.target.checked)
                }

                +"danger"
            }

            // disabled
            Checkbox {
                checked = props.areButtonsDisabled

                onChange = {
                    props.onButtonsDisabledChanged(it.target.checked)
                }

                +"disabled"
            }

            // ghost
            Checkbox {
                checked = props.areButtonsGhost

                onChange = {
                    props.onButtonsGhostChanged(it.target.checked)
                }

                +"ghost"
            }

            // loading
            Checkbox {
                checked = props.areButtonsLoading

                onChange = {
                    props.onButtonsLoadingChanged(it.target.checked)
                }

                +"loading"
            }

            // shape
            p { +"shape:" }
            Select {
                options = arrayOf(
                    Option(ButtonShape.default.toString()),
                    Option(ButtonShape.circle.toString()),
                    Option(ButtonShape.round.toString()),
                )
                defaultValue = props.buttonsShape.toString()

                onChange = { value ->
                    props.onButtonsShapeChanged(ButtonShapeFactory.ofValue(value))
                }
            }

            // size
            p { +"size:" }
            Select {
                options = arrayOf(
                    Option(Size.small.toString()),
                    Option(Size.middle.toString()),
                    Option(Size.large.toString()),
                )
                defaultValue = props.buttonsSize.toString()

                onChange = { value ->
                    props.onButtonsSizeChanged(SizeFactory.ofValue(value))
                }
            }
        }

    }

}
