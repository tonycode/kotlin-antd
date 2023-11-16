package dev.tonycode.kotlin_wrappers.kotlin_antd_demo.ui.screens.radio

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


external interface RadioDemoControlsProps : RadioDemoProps {

    var onDisabledChanged: (value: Boolean) -> Unit

    var onSizeChanged: (value: Size) -> Unit

}

val RadioDemoControls = FC<RadioDemoControlsProps>("RadioDemoControls") { props ->

    Space {
        direction = Direction.vertical

        DemoBooleanParam {
            name = "disabled"
            value = props.disabled
            onValueChanged = { props.onDisabledChanged(it) }
        }

        DemoParam {
            name = "size"
            changer = Radio.Group.create {
                setOptions(
                    Size.small.toString(),
                    Size.middle.toString(),
                    Size.large.toString(),
                )
                setValue(props.size.toString())

                optionType = RadioOptionType.button

                onChange = {
                    props.onSizeChanged(SizeFactory.ofValue(it.target.value))
                }
            }
        }
    }

}
