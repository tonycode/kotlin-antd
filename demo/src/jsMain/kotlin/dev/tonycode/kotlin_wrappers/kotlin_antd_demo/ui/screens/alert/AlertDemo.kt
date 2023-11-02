package dev.tonycode.kotlin_wrappers.kotlin_antd_demo.ui.screens.alert

import antd.Alert
import antd.AlertType
import react.FC
import react.Props


external interface AlertDemoProps : Props {

    var alertType: AlertType

}

val AlertDemo = FC<AlertDemoProps>("AlertDemo") { props ->

    Alert {
        type = props.alertType
        message = "lorem ipsum"
    }

}
