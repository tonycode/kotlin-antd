package dev.tonycode.kotlin_wrappers.kotlin_antd_demo.ui.screens.popconfirm

import antd.Button
import antd.MessageApi
import antd.Popconfirm
import antd.message
import react.FC
import react.Props
import react.ReactElement
import react.createContext


val PopconfirmDemo = FC<Props>("PopconfirmDemo") {

    val useMessage = message.useMessage()

    val messageApi = useMessage[0].unsafeCast<MessageApi>()
    val contextHolder = useMessage[1].unsafeCast<ReactElement<Props>>()


    createContext("Default").Provider {
        value = ""  // suppress console warning
        +contextHolder

        Popconfirm {
            title = "Delete the task"
            description = "Are you sure to delete this task?"

            onConfirm = {
                console.log(it)  //DEBUG
                messageApi.success("You have confirmed")
            }
            onCancel = {
                console.log(it)
                messageApi.warning("You have cancelled")
            }

            okText = "Yes"
            cancelText = "No"

            Button {
                danger = true
                +"Delete"
            }
        }
    }

}
