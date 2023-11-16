@file:JsModule("antd")
@file:JsNonModule

package antd

import react.ComponentClass
import react.PropsWithChildren
import web.uievents.MouseEvent


/**
 * https://ant.design/components/popconfirm
 */
@JsName("Popconfirm")
external val Popconfirm: ComponentClass<PopconfirmProps>

external interface PopconfirmProps : PropsWithChildren {

    var title: String

    var description: String

    var onConfirm: (e: MouseEvent) -> Unit

    var onCancel: (e: MouseEvent) -> Unit

    var okText: String

    var cancelText: String

}
