@file:JsModule("antd")
@file:JsNonModule

package antd

import react.ComponentClass
import react.PropsWithClassName


@JsName("Select")
external val Select: ComponentClass<SelectProps>

external interface SelectProps : PropsWithClassName {

    var defaultValue: String

    var options: Array<Option>

    var onChange: ((value: String) -> Unit)

}
