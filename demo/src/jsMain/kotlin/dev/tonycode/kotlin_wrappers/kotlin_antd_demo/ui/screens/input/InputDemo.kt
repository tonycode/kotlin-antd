package dev.tonycode.kotlin_wrappers.kotlin_antd_demo.ui.screens.input

import antd.Direction
import antd.Input
import antd.Option
import antd.Select
import antd.SettingOutlined
import antd.Space
import antd.Typography
import antd.setAddonAfter
import antd.setAddonBefore
import antd.setDefaultValue
import antd.setSuffix
import emotion.react.css
import react.FC
import react.Props
import react.create
import web.cssom.px


val InputDemo = FC<Props>("InputDemo") {

    Space {
        direction = Direction.vertical

        Typography.Title {
            level = 5
            +"Basic usage"
        }

        Input {
            placeholder = "Basic usage"

            onChange = {
                console.log(it.target.value)
            }
        }

        Typography.Title {
            css { marginTop = 16.px }
            level = 5
            +"Pre / Post tab"
        }

        Input {
            setAddonBefore("http://")
            defaultValue = "mysite"
            setAddonAfter(".com")
        }

        Input {
            setAddonBefore(Select.create {
                options = arrayOf(
                    Option("http://"),
                    Option("https://"),
                )
                setDefaultValue("http://")
            })
            defaultValue = "mysite"
            setAddonAfter(Select.create {
                options = arrayOf(
                    Option(".com"),
                    Option(".net"),
                    Option(".org"),
                )
                setDefaultValue(".com")
            })
        }

        Input {
            defaultValue = "mysite"
            setAddonAfter(SettingOutlined.create())
        }

        Input {
            setAddonBefore("http://")
            defaultValue = "mysite"
            setSuffix(".com")
        }

    }

}
