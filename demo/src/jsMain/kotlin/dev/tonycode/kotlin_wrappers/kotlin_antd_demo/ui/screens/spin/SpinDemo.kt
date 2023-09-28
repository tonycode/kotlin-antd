package dev.tonycode.kotlin_wrappers.kotlin_antd_demo.ui.screens.spin

import antd.Spin
import antd.SpinSize
import react.FC
import react.Props


external interface SpinDemoProps : Props {

    var size: SpinSize

    var spinning: Boolean

}

val SpinDemo = FC<SpinDemoProps> { props ->

    Spin {
        size = props.size
        spinning = props.spinning
    }

}
