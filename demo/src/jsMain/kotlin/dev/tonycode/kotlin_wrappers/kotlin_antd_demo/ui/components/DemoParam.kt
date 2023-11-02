package dev.tonycode.kotlin_wrappers.kotlin_antd_demo.ui.components

import antd.Align
import antd.Size
import antd.Space
import antd.Typography
import antd.setSize
import react.FC
import react.Props
import react.ReactNode


external interface DemoParamProps : Props {

    var name: String

    var changer: ReactNode

}

val DemoParam = FC<DemoParamProps> { props ->

    Space {
        align = Align.center
        setSize(0)  // no space between title and colon

        Typography.Text {
            code = true
            +props.name
        }

        Space {
            align = Align.center
            setSize(Size.small)  // space between color and changer

            Typography.Text {
                +":"
            }

            +props.changer
        }
    }

}
