package dev.tonycode.kotlin_wrappers.kotlin_antd_demo.ui.screens.switch

import antd.SwitchSize
import dev.tonycode.kotlin_wrappers.kotlin_antd_demo.ui.components.DemoCard
import react.FC
import react.Props
import react.create
import react.useState


val SwitchDemoCard = FC<Props>("SwitchDemoCard") {

    var isSwitchDisabled: Boolean by useState(false)

    var isSwitchLoading: Boolean by useState(false)

    var switchSize: SwitchSize by useState(SwitchSize.default)


    DemoCard {
        title = "Switch"
        demoSrcLink = "switch/SwitchDemo.kt"

        showcase = SwitchDemo.create {
            disabled = isSwitchDisabled
            loading = isSwitchLoading
            size = switchSize
        }

        controls = SwitchDemoControls.create {
            disabled = isSwitchDisabled
            loading = isSwitchLoading
            size = switchSize

            onDisabledChanged = { isSwitchDisabled = it }
            onLoadingChanged = { isSwitchLoading = it }
            onSizeChanged = { switchSize = it }
        }
    }

}
