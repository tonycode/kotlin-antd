package dev.tonycode.kotlin_wrappers.kotlin_antd_demo.ui.screens.alert

import antd.AlertType
import antd.AlertTypeFactory
import antd.Direction
import antd.Radio
import antd.RadioOptionType
import antd.Space
import antd.setOptions
import dev.tonycode.kotlin_wrappers.kotlin_antd_demo.ui.components.DemoParam
import react.FC
import react.create


external interface AlertDemoControlsProps : AlertDemoProps {

    var onAlertTypeChanged: (alertType: AlertType) -> Unit

}

val AlertDemoControls = FC<AlertDemoControlsProps>("AlertDemoControls") { props ->

    Space {
        direction = Direction.vertical

        DemoParam {
            name = "alertType"

            changer = Radio.Group.create {
                setOptions(listOf(
                    AlertType.success.toString(),
                    AlertType.info.toString(),
                    AlertType.warning.toString(),
                    AlertType.error.toString(),
                ))
                value = props.alertType

                optionType = RadioOptionType.button

                onChange = {
                    props.onAlertTypeChanged(AlertTypeFactory.ofValue(it.target.value))
                }
            }
        }
    }

}
