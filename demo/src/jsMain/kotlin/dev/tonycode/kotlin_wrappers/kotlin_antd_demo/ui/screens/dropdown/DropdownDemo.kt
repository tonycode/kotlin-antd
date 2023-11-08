package dev.tonycode.kotlin_wrappers.kotlin_antd_demo.ui.screens.dropdown

import antd.Button
import antd.Dropdown
import antd.Placement
import antd.Size
import antd.Space
import antd.Trigger
import antd.Typography
import js.core.jso
import react.FC
import react.Props


val DropdownDemo = FC<Props>("DropdownDemo") {

    Space {
        size = Size.large

        Dropdown {
            menu = jso {
                items = arrayOf(
                    jso {
                        key = "1"
                        label = "Item 1"
                    },
                    jso {
                        key = "2"
                        label = "Item 2"
                    },
                )
                onClick = {
                    console.log(it.key)
                }
            }

            placement = Placement.bottom

            Typography.Text {
                +"Hover me"
            }
        }

        Dropdown {
            menu = jso {
                items = arrayOf(
                    jso {
                        key = "1"
                        label = "Item 1"
                    },
                    jso {
                        key = "2"
                        label = "Item 2"
                    },
                )
                onClick = {
                    console.log(it.key)
                }
            }

            placement = Placement.bottomRight
            trigger = arrayOf(Trigger.click)

            Button {
                +"Click me"
            }
        }
    }

}
