@file:JsModule("antd")
@file:JsNonModule

package antd


/**
 * https://ant.design/components/message
 */
@JsName("message")
external val message: Message

external interface Message {

    /**
     * - result[0] - instance of [MessageApi]
     * - result[1] - instance of [react.ReactElement]
     */
    fun useMessage(): Array<dynamic>

}


external interface MessageApi {

    fun success(content: String)

    fun error(content: String)

    fun info(content: String)

    fun warning(content: String)

    fun loading(content: String)

}
