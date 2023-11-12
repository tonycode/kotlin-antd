package dev.tonycode.kotlin_wrappers.kotlin_antd_demo.ui.screens.alert

import antd.AlertType
import dev.tonycode.kotlin_wrappers.kotlin_antd_demo.ui.components.DemoCard
import react.FC
import react.Props
import react.create
import react.useState


val AlertDemoCard = FC<Props>("AlertDemoCard") {

    var alertType: AlertType by useState(AlertType.info)

    var message: String by useState("lorem ipsum")

    var description: String? by useState(null)

    var banner: Boolean by useState(false)

    var showIcon: Boolean by useState(false)

    var action: AlertAction by useState(AlertAction.NONE)

    var closeIcon: CloseIcon by useState(CloseIcon.Default)


    DemoCard {
        title = "Alert"
        demoSrcLink = "alert/AlertDemo.kt"

        showcase = AlertDemo.create {
            this.alertType = alertType
            this.message = message
            this.description = description
            this.banner = banner
            this.showIcon = showIcon
            this.action = action
            this.closeIcon = closeIcon
        }

        controls = AlertDemoControls.create {
            this.alertType = alertType
            this.message = message
            this.description = description
            this.banner = banner
            this.showIcon = showIcon
            this.action = action
            this.closeIcon = closeIcon

            onAlertTypeChanged = { alertType = it }
            onMessageChanged = { message = it }
            onDescriptionChanged = { description = it }
            onBannerChanged = { banner = it }
            onShowIconChanged = { showIcon = it }
            onActionChanged = { action = it }
            onCloseIconChanged = { closeIcon = it }
        }
    }

}
