package dev.tonycode.kotlin_wrappers.kotlin_antd_demo.ui.screens.radio

import antd.Checkbox
import antd.Option
import antd.Select
import antd.Size
import antd.SizeFactory
import antd.Space
import react.FC
import react.dom.html.ReactHTML.p


external interface RadioDemoControlsProps : RadioDemoProps {

    var onDisabledChanged: (value: Boolean) -> Unit

    var onSizeChanged: (value: Size) -> Unit

}

val RadioDemoControls = FC<RadioDemoControlsProps> { props ->

    Space {
        // disabled
        Checkbox {
            checked = props.disabled

            onChange = {
                props.onDisabledChanged(it.target.checked)
            }

            +"disabled"
        }

        // size
        p { +"size:" }
        Select {
            options = arrayOf(
                Option(Size.small.toString()),
                Option(Size.middle.toString()),
                Option(Size.large.toString()),
            )
            defaultValue = props.size.toString()

            onChange = { value ->
                props.onSizeChanged(SizeFactory.ofValue(value))
            }
        }
    }

}
