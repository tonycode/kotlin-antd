package dev.tonycode.kotlin_wrappers.kotlin_antd_demo.ui.screens.alert

import antd.Alert
import antd.AlertType
import antd.setDescription
import antd.setMessage
import dev.tonycode.kotlin_wrappers.kotlin_antd_demo.util.ifNotNull
import react.FC
import react.Props


external interface AlertDemoProps : Props {

    var alertType: AlertType

    var message: String

    var description: String?

    var banner: Boolean

    var showIcon: Boolean

    var closeIcon: Boolean

}

val AlertDemo = FC<AlertDemoProps>("AlertDemo") { props ->

    Alert {
        type = props.alertType
        banner = props.banner
        showIcon = props.showIcon
        closeIcon = props.closeIcon

        setMessage(props.message)
        props.description?.ifNotNull { setDescription(it) }

        onClose = { console.dir(it) }
        afterClose = { console.log("afterClose invoked") }
    }

}
