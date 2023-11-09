package dev.tonycode.kotlin_wrappers.kotlin_antd_demo.ui.screens.select

import antd.Direction
import antd.Option
import antd.Select
import antd.Space
import antd.setDefaultValue
import react.FC
import react.Props


val SelectDemo = FC<Props>("SelectDemo") {

    val stubOptions = arrayOf(
        Option(value = "jack", label = "Jack"),
        Option(value = "lucy", label = "Lucy"),
        Option(value = "Yiminghe", label = "yiminghe"),
        Option(value = "disabled", label = "Disabled", disabled = true),
    )

    Space {
        direction = Direction.vertical

        Space {
            Select {
                setDefaultValue("lucy")

                options = stubOptions

                onChange = { value ->
                    console.log("Select.onChange: value = ", value)
                }
            }
        }
    }

}
