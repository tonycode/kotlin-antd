package dev.tonycode.kotlin_wrappers.kotlin_antd_demo.ui.screens.spin

import antd.SpinSize
import dev.tonycode.kotlin_wrappers.kotlin_antd_demo.ui.components.DemoCard
import react.FC
import react.Props
import react.create
import react.useState


val SpinDemoCard = FC<Props> {

    var size: SpinSize by useState(SpinSize.default)

    var spinning: Boolean by useState(true)


    DemoCard {
        title = "Spin"

        showcase = SpinDemo.create {
            this.size = size
            this.spinning = spinning
        }

        controls = SpinDemoControls.create {
            this.size = size
            this.spinning = spinning
            onSizeChanged = { size = it }
            onSpinningChanged = { spinning = it }
        }
    }

}
