package dev.tonycode.kotlin_wrappers.kotlin_antd_demo.ui.screens.spin

import antd.LoadingOutlined
import antd.Spin
import antd.SpinSize
import antd.SyncOutlined
import dev.tonycode.kotlin_wrappers.kotlin_antd_demo.util.ifNotNull
import react.FC
import react.Props
import react.ReactNode
import react.create


external interface SpinDemoProps : Props {

    var size: SpinSize

    var spinning: Boolean

    var customIndicator: CustomIndicator

}

val SpinDemo = FC<SpinDemoProps> { props ->

    Spin {
        size = props.size
        spinning = props.spinning
        props.customIndicator.createInstance?.invoke()?.ifNotNull { indicator = it }
    }

}


enum class CustomIndicator(
    val title: String,
    val createInstance: (() -> ReactNode)? = null
) {
    NONE("none"),
    SYNC_OUTLINED("SyncOutlined", { SyncOutlined.create { spin = true } }),
    LOADING_OUTLINED("LoadingOutlined", { LoadingOutlined.create { spin = true } }),
}
