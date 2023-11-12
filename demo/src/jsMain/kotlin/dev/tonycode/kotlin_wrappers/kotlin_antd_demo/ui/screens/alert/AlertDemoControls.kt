package dev.tonycode.kotlin_wrappers.kotlin_antd_demo.ui.screens.alert

import antd.AlertType
import antd.AlertTypeFactory
import antd.CloseCircleOutlined
import antd.CloseSquareTwoTone
import antd.Direction
import antd.Input
import antd.Option
import antd.Radio
import antd.RadioOptionType
import antd.Space
import antd.setOptions
import dev.tonycode.kotlin_wrappers.kotlin_antd_demo.ui.components.DemoBooleanParam
import dev.tonycode.kotlin_wrappers.kotlin_antd_demo.ui.components.DemoParam
import react.FC
import react.create
import web.cssom.NamedColor


external interface AlertDemoControlsProps : AlertDemoProps {

    var onAlertTypeChanged: (alertType: AlertType) -> Unit

    var onMessageChanged: (message: String) -> Unit

    var onDescriptionChanged: (description: String) -> Unit

    var onBannerChanged: (banner: Boolean) -> Unit

    var onShowIconChanged: (showIcon: Boolean) -> Unit

    var onActionChanged: (action: AlertAction) -> Unit

    var onCloseIconChanged: (closeIcon: CloseIcon) -> Unit

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

            changer = Input.create {
                value = props.message
                onChange = { props.onMessageChanged(it.target.value) }
            }
        }

        DemoParam {
            name = "description"

            changer = Input.create {
                value = props.description.orEmpty()
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

        DemoParam {
            name = "action"

            changer = Radio.Group.create {
                setOptions(AlertAction.entries.map { Option(it.name) })
                value = props.action.name

                optionType = RadioOptionType.button

                onChange = {
                    props.onActionChanged(
                        AlertAction.valueOf(it.target.value)
                    )
                }
            }
        }

        DemoParam {
            name = "closeIcon"

            changer = Radio.Group.create {
                setOptions(listOf(
                    Option(CloseIcon.Disabled.label),
                    Option(CloseIcon.Default.label),
                    Option(CUSTOM_CLOSE_ICON_CIRCLE),
                    Option(CUSTOM_CLOSE_ICON_SQUARE),
                ))
                value = props.closeIcon.label

                optionType = RadioOptionType.button

                onChange = { props.onCloseIconChanged(
                    when (it.target.value) {
                        "false" -> CloseIcon.Disabled

                        CUSTOM_CLOSE_ICON_CIRCLE -> CloseIcon.Custom(
                            CUSTOM_CLOSE_ICON_CIRCLE,
                            CloseCircleOutlined.create()
                        )

                        CUSTOM_CLOSE_ICON_SQUARE -> CloseIcon.Custom(
                            CUSTOM_CLOSE_ICON_SQUARE,
                            CloseSquareTwoTone.create { twoToneColor = NamedColor.orange }
                        )

                        else -> CloseIcon.Default
                    }
                ) }
            }
        }
    }

}

private const val CUSTOM_CLOSE_ICON_CIRCLE = "CloseCircleOutlined"
private const val CUSTOM_CLOSE_ICON_SQUARE = "CloseSquareTwoTone"
