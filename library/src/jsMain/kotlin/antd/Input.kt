@file:JsModule("antd")
@file:JsNonModule

package antd

import org.w3c.dom.events.Event
import react.ComponentClass
import react.PropsWithClassName
import react.dom.events.ChangeEvent
import web.html.HTMLInputElement
import web.html.InputType


/**
 * https://ant.design/components/input
 */
@JsName("Input")
external val Input: ComponentClass<InputProps>

external interface InputProps : PropsWithClassName {

    /**
     * The label text displayed after (on the right side of) the input field
     *
     * use: [InputProps.setAddonAfter]
     */
    var addonAfter: dynamic  // string | ReactNode

    /**
     * The label text displayed before (on the left side of) the input field
     *
     * use: [InputProps.setAddonBefore]
     */
    var addonBefore: dynamic  // string | ReactNode

    /**
     * If allow to remove input content with clear icon
     *
     * use: [InputProps.setAllowClear]
     *
     * default: false
     */
    var allowClear: dynamic

    /**
     * Whether has border style
     *
     * default: true
     */
    var bordered: Boolean

    /**
     * The initial input content
     */
    var defaultValue: String

    /**
     * Whether the input is disabled
     *
     * default: false
     */
    var disabled: Boolean

    /**
     * The ID for input
     */
    var id: String

    /**
     * The maximum number of characters in Input
     */
    var maxLength: Number

    var placeholder: String

    /**
     * The prefix icon for the Input
     *
     * use: [InputProps.setPrefix]
     */
    var prefix: dynamic  // string | ReactNode

    /**
     * Whether to show character count
     *
     * default: false
     */
    // boolean | { formatter: (info: { value: string, count: number, maxLength?: number }) => ReactNode }
    var showCount: Boolean

    /**
     * Set validation status
     */
    var status: Status

    /**
     * The size of the input box. Note: in the context of a form, the [Size.middle] size is used
     */
    var size: Size

    /**
     * The suffix icon for the Input
     *
     * use: [InputProps.setSuffix]
     */
    var suffix: dynamic  // string | ReactNode

    /**
     * The type of input
     *
     * default: [InputType.text]
     */
    var type: InputType

    /**
     * The input content value
     */
    var value: String

    /**
     * Callback when user input
     */
    var onChange: (e: ChangeEvent<HTMLInputElement>) -> Unit

    /**
     * The callback function that is triggered when Enter key is pressed
     */
    var onPressEnter: (e: Event) -> Unit

}
