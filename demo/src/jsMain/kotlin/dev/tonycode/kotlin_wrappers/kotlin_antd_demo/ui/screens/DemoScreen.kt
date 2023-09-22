package dev.tonycode.kotlin_wrappers.kotlin_antd_demo.ui.screens

import antd.Button
import antd.ButtonType
import antd.Space
import react.FC
import react.Fragment
import react.Props
import react.dom.html.ReactHTML.h3


val DemoScreen = FC<Props> {

    Fragment {
        h3 { +"Button" }

        Space {
            Button {
                type = ButtonType.default

                +"default"
            }

            Button {
                type = ButtonType.primary

                +"primary"
            }

            Button {
                type = ButtonType.dashed

                +"dashed"
            }

            Button {
                type = ButtonType.text

                +"text"
            }

            Button {
                type = ButtonType.link

                +"link"
            }
        }
    }

}
