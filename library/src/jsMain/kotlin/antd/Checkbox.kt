@file:JsModule("antd")
@file:JsNonModule

package antd

import react.ComponentClass
import react.Props
import react.dom.events.ChangeEventHandler
import web.html.HTMLInputElement


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
     * Specifies whether the checkbox is selected
     *
     * default: false
     */
    var checked: Boolean

    /**
     * Specifies the initial state: whether or not the checkbox is selected
     *
     * default: false
     */
    var defaultChecked: Boolean

    /**
     * If disable checkbox
     *
     * default: false
     */
    var disabled: Boolean

    /**
     * The indeterminate checked state of checkbox
     *
     * default: false
     */
    var indeterminate: Boolean

    /**
     * The callback function that is triggered when the state changes
     *
     * default: null
     */
    //todo ((e: CheckboxChangeEvent) -> Unit)
    var onChange: ChangeEventHandler<HTMLInputElement>?

}
