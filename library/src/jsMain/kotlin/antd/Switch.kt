@file:JsModule("antd")
@file:JsNonModule

package antd

import org.w3c.dom.events.Event
import react.ComponentClass
import react.PropsWithClassName


/**
 * Switch Selector
 *
 * https://ant.design/components/switch
 */
@JsName("Switch")
external val Switch: ComponentClass<SwitchProps>

external interface SwitchProps : PropsWithClassName {

    /**
     * Determine whether the Switch is checked
     *
     * default: false
     */
    var checked: Boolean

    /**
     * Disable switch
     *
     * default: false
     */
    var disabled: Boolean

    /**
     * Loading state of switch
     *
     * default: false
     */
    var loading: Boolean

    /**
     * The size of the Switch, options: `default`, `small`
     *
     * default: [SwitchSize.default]
     */
    var size: SwitchSize

    /**
     * Trigger when the checked state is changing
     */
    var onChange: (checked: Boolean, event: Event) -> Unit

    /**
     * Trigger when clicked
     */
    var onClick: (checked: Boolean, event: Event) -> Unit

}
