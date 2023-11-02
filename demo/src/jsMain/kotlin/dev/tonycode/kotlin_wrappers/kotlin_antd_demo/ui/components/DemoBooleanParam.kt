package dev.tonycode.kotlin_wrappers.kotlin_antd_demo.ui.components

import antd.Switch
import antd.SwitchSize
import react.FC
import react.Props
import react.create


external interface DemoBooleanParamProps : Props {

    var name: String

    var value: Boolean

    var onValueChanged: (value: Boolean) -> Unit

}

val DemoBooleanParam = FC<DemoBooleanParamProps>("DemoBooleanParam") { props ->

    DemoParam {
        name = props.name

        changer = Switch.create {
            size = SwitchSize.small
            checked = props.value

            onChange = { checked, _ ->
                props.onValueChanged(checked)
            }
        }
    }

}
