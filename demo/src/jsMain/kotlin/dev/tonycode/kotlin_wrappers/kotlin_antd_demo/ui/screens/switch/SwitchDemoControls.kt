package dev.tonycode.kotlin_wrappers.kotlin_antd_demo.ui.screens.switch

import antd.Direction
import antd.Option
import antd.Radio
import antd.RadioOptionType
import antd.Space
import antd.SwitchSize
import antd.SwitchSizeFactory
import dev.tonycode.kotlin_wrappers.kotlin_antd_demo.ui.components.DemoBooleanParam
import dev.tonycode.kotlin_wrappers.kotlin_antd_demo.ui.components.DemoParam
import react.FC
import react.create


external interface SwitchDemoControlsProps : SwitchDemoProps {

    var onDisabledChanged: (disabled: Boolean) -> Unit

    var onLoadingChanged: (loading: Boolean) -> Unit

    var onSizeChanged: (size: SwitchSize) -> Unit

}

val SwitchDemoControls = FC<SwitchDemoControlsProps>("SwitchDemoControls") { props ->

    Space {
        direction = Direction.vertical

        DemoBooleanParam {
            name = "disabled"
            value = props.disabled
            onValueChanged = { props.onDisabledChanged(it) }
        }

        DemoBooleanParam {
            name = "loading"
            value = props.loading
            onValueChanged = { props.onLoadingChanged(it) }
        }

        DemoParam {
            name = "size"
            changer = Radio.Group.create {
                options = arrayOf(
                    Option(SwitchSize.default.toString()),
                    Option(SwitchSize.small.toString()),
                )
                defaultValue = props.size.toString()

                optionType = RadioOptionType.button

                onChange = {
                    props.onSizeChanged(SwitchSizeFactory.ofValue(it.target.value))
                }
            }
        }
    }

}
