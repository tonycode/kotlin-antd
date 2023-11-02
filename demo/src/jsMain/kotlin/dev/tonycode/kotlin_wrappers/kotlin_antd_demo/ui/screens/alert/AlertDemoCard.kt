package dev.tonycode.kotlin_wrappers.kotlin_antd_demo.ui.screens.alert

import antd.AlertType
import dev.tonycode.kotlin_wrappers.kotlin_antd_demo.ui.components.DemoCard
import react.FC
import react.Props
import react.create
import react.useState


val AlertDemoCard = FC<Props>("AlertDemoCard") {

    var alertType: AlertType by useState(AlertType.info)


    DemoCard {
        title = "Alert"

        showcase = AlertDemo.create {
            this.alertType = alertType
        }

        controls = AlertDemoControls.create {
            this.alertType = alertType
            onAlertTypeChanged = { alertType = it }
        }
    }

}
