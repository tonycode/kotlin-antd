package dev.tonycode.kotlin_wrappers.kotlin_antd_demo.ui.screens.select

import antd.Direction
import antd.Option
import antd.OptionFilterProp
import antd.Select
import antd.Space
import antd.Typography
import antd.setDefaultValue
import antd.setPlaceholder
import emotion.react.css
import react.FC
import react.Props
import web.cssom.px


val SelectDemo = FC<Props>("SelectDemo") {

    val stubOptions = arrayOf(
        Option(value = "item-1", label = "Jack"),
        Option(value = "item-2", label = "Lucy"),
        Option(value = "item-3", label = "yiminghe"),
        Option(value = "item-4", label = "Disabled", disabled = true),
    )

    Space {
        direction = Direction.vertical

        Typography.Title {
            level = 5
            +"Basic usage"
        }

        Space {
            Select {
                options = stubOptions
                setDefaultValue("lucy")

                onChange = { value ->
                    console.log("Select.onChange: value = ", value)
                }
            }

            Select {
                options = stubOptions
                setDefaultValue("lucy")

                disabled = true
            }

            Select {
                options = stubOptions
                setDefaultValue("lucy")

                loading = true
            }

            Select {
                options = stubOptions
                setDefaultValue("lucy")

                allowClear = true
            }
        }

        Typography.Title {
            css { marginTop = 16.px }
            level = 5
            +"Select with search field"
        }

        Select {
            options = stubOptions

            showSearch = true
            optionFilterProp = OptionFilterProp.label
            setPlaceholder("Select a person")
        }
    }

}
