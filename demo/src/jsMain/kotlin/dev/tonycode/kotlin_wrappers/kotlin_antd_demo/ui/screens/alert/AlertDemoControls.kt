package dev.tonycode.kotlin_wrappers.kotlin_antd_demo.ui.screens.alert

import antd.AlertType
import antd.AlertTypeFactory
import antd.Direction
import antd.Radio
import antd.RadioOptionType
import antd.Space
import antd.setOptions
import dev.tonycode.kotlin_wrappers.kotlin_antd_demo.ui.components.DemoBooleanParam
import dev.tonycode.kotlin_wrappers.kotlin_antd_demo.ui.components.DemoParam
import react.FC
import react.create
import react.dom.html.ReactHTML.input


external interface AlertDemoControlsProps : AlertDemoProps {

    var onAlertTypeChanged: (alertType: AlertType) -> Unit

    var onMessageChanged: (message: String) -> Unit

    var onDescriptionChanged: (description: String) -> Unit

    var onBannerChanged: (banner: Boolean) -> Unit

    var onShowIconChanged: (showIcon: Boolean) -> Unit

    var onCloseIconChanged: (closeIcon: Boolean) -> Unit

}

val AlertDemoControls = FC<AlertDemoControlsProps>("AlertDemoControls") { props ->

    Space {
        direction = Direction.vertical

        DemoParam {
            name = "type"

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

        DemoParam {
            name = "message"

            changer = input.create {
                value = props.message
                onChange = { props.onMessageChanged(it.target.value) }
            }
        }

        DemoParam {
            name = "description"

            changer = input.create {
                value = props.description
                onChange = { props.onDescriptionChanged(it.target.value) }
            }
        }

        DemoBooleanParam {
            name = "banner"
            value = props.banner
            onValueChanged = props.onBannerChanged
        }

        DemoBooleanParam {
            name = "showIcon"
            value = props.showIcon
            onValueChanged = props.onShowIconChanged
        }

        DemoBooleanParam {
            name = "closeIcon"
            value = props.closeIcon
            onValueChanged = props.onCloseIconChanged
        }
    }

}
