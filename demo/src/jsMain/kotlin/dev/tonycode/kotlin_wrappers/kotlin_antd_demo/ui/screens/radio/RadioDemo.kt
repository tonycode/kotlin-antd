package dev.tonycode.kotlin_wrappers.kotlin_antd_demo.ui.screens.radio

import antd.Direction
import antd.Option
import antd.Radio
import antd.RadioButtonStyle
import antd.RadioOptionType
import antd.Size
import antd.Space
import antd.setOptions
import react.FC
import react.Props
import react.useState


external interface RadioDemoProps : Props {

    var disabled: Boolean

    var size: Size

}

val RadioDemo = FC<RadioDemoProps> { props ->

    val options = listOf(
        Option("Apple"),
        Option("Pear"),
        Option("Orange"),
    )

    val optionsWithDisabled = listOf(
        Option("Apple"),
        Option("Pear"),
        Option("Orange", disabled = true),
    )

    var selectedValue: String by useState("Apple")


    Space {
        direction = Direction.vertical

        Radio.Group {
            setOptions("Apple", "Pear", "Orange")
            value = selectedValue

            size = props.size
            disabled = props.disabled

            onChange = { selectedValue = it.target.value }
        }

        Radio.Group {
            setOptions(optionsWithDisabled)
            value = selectedValue

            size = props.size
            disabled = props.disabled

            onChange = { selectedValue = it.target.value }
        }

        Radio.Group {
            setOptions(options)
            value = selectedValue

            optionType = RadioOptionType.button
            size = props.size
            disabled = props.disabled

            onChange = { selectedValue = it.target.value }
        }

        Radio.Group {
            setOptions(optionsWithDisabled)
            value = selectedValue

            optionType = RadioOptionType.button
            buttonStyle = RadioButtonStyle.solid
            size = props.size
            disabled = props.disabled

            onChange = { selectedValue = it.target.value }
        }
    }

}
