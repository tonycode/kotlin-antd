package dev.tonycode.kotlin_wrappers.kotlin_antd_demo.ui.screens.alert

import antd.Alert
import antd.AlertType
import antd.Button
import antd.ButtonType
import antd.Size
import antd.setDescription
import antd.setMessage
import dev.tonycode.kotlin_wrappers.kotlin_antd_demo.util.ifNotNull
import react.FC
import react.Props
import react.ReactNode
import react.create
import react.dom.html.ReactHTML.div


external interface AlertDemoProps : Props {

    var alertType: AlertType

    var message: String

    var description: String?

    var banner: Boolean

    var showIcon: Boolean

    var action: AlertAction

    var closeIcon: CloseIcon

}

val AlertDemo = FC<AlertDemoProps>("AlertDemo") { props ->

    Alert {
        type = props.alertType
        banner = props.banner

        showIcon = props.showIcon

        val action1 = props.action
        if (action1 != AlertAction.NONE) {
            action = when (action1) {
                AlertAction.UNDO -> Button.create {
                    type = ButtonType.text
                    size = Size.small
                    +"UNDO"
                }

                AlertAction.DETAIL -> Button.create {
                    size = Size.small
                    +"Detail"
                }

//                AlertAction.ACCEPT_DECLINE -> Space.create {
//                    direction = Direction.vertical
//
//                    Button.create {
//                        type = ButtonType.primary
//                        size = Size.small
//                        +"Accept"
//                    }
//
//                    Button.create {
//                        ghost = true
//                        size = Size.small
//                        +"Decline"
//                    }
//                }

                else -> /* this shouldn't be called */ div.create()
            }
        }

        closeIcon = props.closeIcon.let { when (it) {
            CloseIcon.Disabled -> false
            CloseIcon.Default -> true
            is CloseIcon.Custom -> it.icon
        } }

        setMessage(props.message)
        props.description?.ifNotNull { setDescription(it) }

        onClose = { console.dir(it) }
        afterClose = { console.log("afterClose invoked") }
    }

}

sealed class CloseIcon(var label: String) {
    object Disabled : CloseIcon("false")
    object Default : CloseIcon("true")
    class Custom(label: String, var icon: ReactNode) : CloseIcon(label)
}

enum class AlertAction {
    NONE,
    UNDO,
    DETAIL,
    //ACCEPT_DECLINE,  //todo investigate why this (Space with 2 buttons) isn't working
}
