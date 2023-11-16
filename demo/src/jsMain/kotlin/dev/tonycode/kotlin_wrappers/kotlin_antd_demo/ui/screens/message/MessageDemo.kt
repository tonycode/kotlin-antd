package dev.tonycode.kotlin_wrappers.kotlin_antd_demo.ui.screens.message

import antd.Button
import antd.MessageApi
import antd.MessageType
import antd.message
import antd.open
import react.FC
import react.Props
import react.ReactElement
import react.createContext


external interface MessageDemoProps : Props {

    var messageType: MessageType

}

val MessageDemo = FC<MessageDemoProps>("MessageDemo") { props ->

    val useMessage = message.useMessage()

    val messageApi = useMessage[0].unsafeCast<MessageApi>()
    val contextHolder = useMessage[1].unsafeCast<ReactElement<Props>>()


    //console.dir(useMessage)  //DEBUG


    createContext("Default").Provider {
        +contextHolder

        Button {
            +"show message"

            onClick = {
                messageApi.open(props.messageType, "Some content")
            }
        }
    }

}
