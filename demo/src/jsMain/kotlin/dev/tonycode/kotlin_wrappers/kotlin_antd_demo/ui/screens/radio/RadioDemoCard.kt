package dev.tonycode.kotlin_wrappers.kotlin_antd_demo.ui.screens.radio

import antd.Size
import dev.tonycode.kotlin_wrappers.kotlin_antd_demo.ui.components.DemoCard
import react.FC
import react.Props
import react.create
import react.useState


val RadioDemoCard = FC<Props>("RadioDemoCard") {

    var areGroupsDisabled: Boolean by useState(false)

    var radioSize: Size by useState(Size.middle)


    DemoCard {
        title = "Radio.Group"
        demoSrcLink = "radio/RadioDemo.kt"

        showcase = RadioDemo.create {
            disabled = areGroupsDisabled
            size = radioSize
        }

        controls = RadioDemoControls.create {
            disabled = areGroupsDisabled
            size = radioSize

            onDisabledChanged = { areGroupsDisabled = it }
            onSizeChanged = { radioSize = it }
        }
    }

}
