package dev.tonycode.kotlin_wrappers.kotlin_antd_demo.ui.components

import antd.Checkbox
import react.FC
import react.Props
import react.create


external interface DemoBooleanParamProps : Props {

    var name: String

    var value: Boolean

    var onValueChanged: (value: Boolean) -> Unit

}

val DemoBooleanParam = FC<DemoBooleanParamProps> { props ->

    DemoParam {
        name = props.name

        changer = Checkbox.create {
            checked = props.value

            +(if (props.value) "true" else "false")

            onChange = {
                props.onValueChanged(it.target.checked)
            }
        }
    }

}
