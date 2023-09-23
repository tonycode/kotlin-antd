package dev.tonycode.kotlin_wrappers.kotlin_antd_demo.ui.screens.typography

import antd.Typography
import react.FC
import react.Fragment
import react.Props


val TypographyTitleDemo = FC<Props> {

    Fragment {
        Typography.Title {
            level = 1
            +"h1. Ant Design"
        }

        Typography.Title {
            level = 2
            +"h2. Ant Design"
        }

        Typography.Title {
            level = 3
            +"h3. Ant Design"
        }

        Typography.Title {
            level = 4
            +"h4. Ant Design"
        }

        Typography.Title {
            level = 5
            +"h5. Ant Design"
        }
    }

}
