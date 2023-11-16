package dev.tonycode.kotlin_wrappers.kotlin_antd_demo.ui.screens.message

import antd.Direction
import antd.MessageType
import antd.MessageTypeFactory
import antd.Radio
import antd.RadioOptionType
import antd.Space
import antd.setOptions
import antd.setValue
import dev.tonycode.kotlin_wrappers.kotlin_antd_demo.ui.components.DemoParam
import react.FC
import react.create


external interface MessageDemoControlsProps : MessageDemoProps {

    var onMessageTypeChanged: (value : MessageType) -> Unit

}

val MessageDemoControls = FC<MessageDemoControlsProps>("MessageDemoControls") { props ->

    Space {
        direction = Direction.vertical

        DemoParam {
            name = "type"

            changer = Radio.Group.create {
                setOptions(MessageType.entries.map { it.name })
                setValue(props.messageType.name)

                optionType = RadioOptionType.button

                onChange = {
                    props.onMessageTypeChanged(MessageTypeFactory.ofValue(it.target.value))
                }
            }
        }
    }

}
