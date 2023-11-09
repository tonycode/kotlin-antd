package dev.tonycode.kotlin_wrappers.kotlin_antd_demo.ui.screens.switch

import antd.Switch
import antd.SwitchSize
import react.FC
import react.Props
import react.useState


external interface SwitchDemoProps : Props {

    var disabled: Boolean

    var loading: Boolean

    var size: SwitchSize

}

val SwitchDemo = FC<SwitchDemoProps>("SwitchDemo") { props ->

    var isChecked: Boolean by useState(true)


    Switch {
        checked = isChecked

        disabled = props.disabled
        loading = props.loading
        size = props.size

        onChange = { checked, event ->
            console.log("Switch.onChange: checked, event = ", checked, event)
            isChecked = checked
        }
        onClick = { checked, event ->
            console.log("Switch.onClick: checked, event = ", checked, event)
        }
    }

}
