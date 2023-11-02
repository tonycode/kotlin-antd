package dev.tonycode.kotlin_wrappers.kotlin_antd_demo.ui.screens.spin

import antd.SpinSize
import dev.tonycode.kotlin_wrappers.kotlin_antd_demo.ui.components.DemoCard
import react.FC
import react.Props
import react.create
import react.useState


val SpinDemoCard = FC<Props>("SpinDemoCard") {

    var size: SpinSize by useState(SpinSize.default)

    var spinning: Boolean by useState(true)

    var customIndicator: CustomIndicator by useState(CustomIndicator.NONE)


    DemoCard {
        title = "Spin"

        showcase = SpinDemo.create {
            this.size = size
            this.spinning = spinning
            this.customIndicator = customIndicator
        }

        controls = SpinDemoControls.create {
            this.size = size
            this.spinning = spinning
            this.customIndicator = customIndicator
            onSizeChanged = { size = it }
            onSpinningChanged = { spinning = it }
            onCustomIndicatorChanged = { customIndicator = it }
        }
    }

}
