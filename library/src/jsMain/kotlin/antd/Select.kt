@file:JsModule("antd")
@file:JsNonModule

package antd

import react.ComponentClass
import react.Props


@JsName("Select")
external val Select: ComponentClass<SelectProps>

external interface SelectProps : Props {

    var defaultValue: String

    var options: Array<Option>

    var onChange: ((value: String) -> Unit)

}
