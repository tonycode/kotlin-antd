@file:JsModule("antd")
@file:JsNonModule

package antd

import react.ComponentClass
import react.PropsWithClassName


/**
 * https://ant.design/components/alert
 */
@JsName("Alert")
external val Alert: ComponentClass<AlertProps>

external interface AlertProps : PropsWithClassName {

    var type: AlertType

    var message: String

}
