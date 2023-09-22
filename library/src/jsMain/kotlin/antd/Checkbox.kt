@file:JsModule("antd")
@file:JsNonModule

package antd

import react.ComponentClass
import react.Props


@JsName("Checkbox")
external val Checkbox : ComponentClass<CheckboxProps>

external interface CheckboxProps : Props {

    /**
     * If get focus when component mounted
     *
     * default: false
     */
    var autoFocus: Boolean

    /**
     *
     */
    var checked: Boolean

}
