package dev.tonycode.kotlin_wrappers.kotlin_antd_demo.ui.screens.button

import antd.ButtonShape
import antd.Size
import dev.tonycode.kotlin_wrappers.kotlin_antd_demo.ui.components.DemoCard
import react.FC
import react.Props
import react.create
import react.useState


val ButtonDemoCard = FC<Props>("ButtonDemoCard") {

    var areButtonsDanger: Boolean by useState(false)
    var areButtonsDisabled: Boolean by useState(false)
    var areButtonsGhost: Boolean by useState(false)
    var areButtonsLoading: Boolean by useState(false)
    var buttonsShape: ButtonShape by useState(ButtonShape.default)
    var buttonsSize: Size by useState(Size.middle)

    DemoCard {
        title = "Button"
        demoSrcLink = "button/ButtonDemo.kt"

        showcase = ButtonDemo.create {
            this.areButtonsDanger = areButtonsDanger
            this.areButtonsDisabled = areButtonsDisabled
            this.areButtonsGhost = areButtonsGhost
            this.areButtonsLoading = areButtonsLoading
            this.buttonsShape = buttonsShape
            this.buttonsSize = buttonsSize
        }

        controls = ButtonDemoControls.create {
            this.areButtonsDanger = areButtonsDanger
            this.areButtonsDisabled = areButtonsDisabled
            this.areButtonsGhost = areButtonsGhost
            this.areButtonsLoading = areButtonsLoading
            this.buttonsShape = buttonsShape
            this.buttonsSize = buttonsSize

            onButtonsDangerChanged = { areButtonsDanger = it }
            onButtonsDisabledChanged = { areButtonsDisabled = it }
            onButtonsGhostChanged = { areButtonsGhost = it }
            onButtonsLoadingChanged = { areButtonsLoading = it }
            onButtonsShapeChanged = { buttonsShape = it }
            onButtonsSizeChanged = { buttonsSize = it }
        }
    }

}
