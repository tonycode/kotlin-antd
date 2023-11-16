package dev.tonycode.kotlin_wrappers.kotlin_antd_demo.ui.screens.spin

import antd.Direction
import antd.Radio
import antd.RadioOptionType
import antd.Space
import antd.SpinSize
import antd.SpinSizeFactory
import antd.setOptions
import antd.setValue
import dev.tonycode.kotlin_wrappers.kotlin_antd_demo.ui.components.DemoBooleanParam
import dev.tonycode.kotlin_wrappers.kotlin_antd_demo.ui.components.DemoParam
import react.FC
import react.create


external interface SpinDemoControlsProps : SpinDemoProps {

    var onSizeChanged: (size: SpinSize) -> Unit

    var onSpinningChanged: (spinning: Boolean) -> Unit

    var onCustomIndicatorChanged: (customIndicator: CustomIndicator) -> Unit

}

val SpinDemoControls = FC<SpinDemoControlsProps>("SpinDemoControls") { props ->

    Space {
        direction = Direction.vertical

        DemoParam {
            name = "size"

            changer = Radio.Group.create {
                setOptions(
                    SpinSize.small.toString(),
                    SpinSize.default.toString(),
                    SpinSize.large.toString(),
                )
                setValue(props.size.toString())

                optionType = RadioOptionType.button

                onChange = {
                    props.onSizeChanged(SpinSizeFactory.ofValue(it.target.value))
                }
            }
        }

        DemoBooleanParam {
            name = "spinning"
            value = props.spinning
            onValueChanged = { props.onSpinningChanged(it) }
        }

        DemoParam {
            name = "indicator"

            changer = Radio.Group.create {
                setOptions(CustomIndicator.entries.toList().map { it.title })
                setValue(props.customIndicator.title)

                optionType = RadioOptionType.button

                onChange = {event ->
                    props.onCustomIndicatorChanged(
                        CustomIndicator.entries.find { it.title == event.target.value } ?: CustomIndicator.NONE
                    )
                }
            }
        }
    }

}
