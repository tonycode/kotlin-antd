package dev.tonycode.kotlin_wrappers.kotlin_antd_demo.ui.screens.typography

import antd.Direction
import antd.Space
import antd.Typography
import antd.TypographyType
import react.FC
import react.Props


val TypographyTextDemo = FC<Props>("TypographyTextDemo") {

    Space {
        direction = Direction.vertical

        Typography.Text {
            +"Ant Design (default)"
        }

        Typography.Text {
            type = TypographyType.secondary

            +"Ant Design (secondary)"
        }

        Typography.Text {
            type = TypographyType.success

            +"Ant Design (success)"
        }

        Typography.Text {
            type = TypographyType.warning

            +"Ant Design (warning)"
        }

        Typography.Text {
            type = TypographyType.danger

            +"Ant Design (danger)"
        }

        Typography.Text {
            disabled = true

            +"Ant Design (disabled)"
        }

        Typography.Text {
            mark = true

            +"Ant Design (mark)"
        }

        Typography.Text {
            code = true

            +"Ant Design (code)"
        }

        Typography.Text {
            keyboard = true

            +"Ant Design (keyboard)"
        }

        Typography.Text {
            underline = true

            +"Ant Design (underline)"
        }

        Typography.Text {
            delete = true

            +"Ant Design (delete)"
        }

        Typography.Text {
            strong = true

            +"Ant Design (strong)"
        }

        Typography.Text {
            italic = true

            +"Ant Design (italic)"
        }

        Typography.Link {
            href = "https://ant.design"
            target = "_blank"

            +"Ant Design (Link)"
        }
    }

}
