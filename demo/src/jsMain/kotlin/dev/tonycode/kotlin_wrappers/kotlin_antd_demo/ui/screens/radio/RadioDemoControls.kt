package dev.tonycode.kotlin_wrappers.kotlin_antd_demo.ui.screens.radio

import antd.Direction
import antd.Option
import antd.Select
import antd.Size
import antd.SizeFactory
import antd.Space
import dev.tonycode.kotlin_wrappers.kotlin_antd_demo.ui.components.DemoBooleanParam
import dev.tonycode.kotlin_wrappers.kotlin_antd_demo.ui.components.DemoParam
import react.FC
import react.create


external interface RadioDemoControlsProps : RadioDemoProps {

    var onDisabledChanged: (value: Boolean) -> Unit

    var onSizeChanged: (value: Size) -> Unit

}

val RadioDemoControls = FC<RadioDemoControlsProps> { props ->

    Space {
        direction = Direction.vertical

        DemoBooleanParam {
            name = "disabled"
            value = props.disabled
            onValueChanged = { props.onDisabledChanged(it) }
        }

        DemoParam {
            name = "size"
            changer = Select.create {
                options = arrayOf(
                    Option(Size.small.toString()),
                    Option(Size.middle.toString()),
                    Option(Size.large.toString()),
                )

                defaultValue = props.size.toString()

                onChange = { value ->
                    props.onSizeChanged(SizeFactory.ofValue(value))
                }
            }
        }
    }

}
