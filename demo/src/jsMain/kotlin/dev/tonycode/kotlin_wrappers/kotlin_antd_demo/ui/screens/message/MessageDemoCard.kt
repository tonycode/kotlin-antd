package dev.tonycode.kotlin_wrappers.kotlin_antd_demo.ui.screens.message

import antd.MessageType
import dev.tonycode.kotlin_wrappers.kotlin_antd_demo.ui.components.DemoCard
import react.FC
import react.Props
import react.create
import react.useState


val MessageDemoCard = FC<Props>("MessageDemoCard") {

    var messageType: MessageType by useState(MessageType.INFO)


    DemoCard {
        title = "message"
        demoSrcLink = "message/MessageDemo.kt"

        showcase = MessageDemo.create {
            this.messageType = messageType
        }

        controls = MessageDemoControls.create {
            this.messageType = messageType

            onMessageTypeChanged = {
                messageType = it
            }
        }
    }

}
