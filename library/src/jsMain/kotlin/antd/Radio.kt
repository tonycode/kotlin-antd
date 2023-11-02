@file:JsModule("antd")
@file:JsNonModule

package antd

import react.ComponentClass
import react.PropsWithClassName
import react.dom.events.ChangeEventHandler
import web.html.HTMLInputElement


/**
 * https://ant.design/components/radio
 */
@JsName("Radio")
external object Radio {

    /**
     * https://ant.design/components/radio#radioradiobutton
     */
    @JsName("Button")
    val Button: ComponentClass<RadioButtonProps>

    /**
     * https://ant.design/components/radio#radiogroup
     */
    @JsName("Group")
    val Group: ComponentClass<RadioGroupProps>

}


external interface RadioButtonProps : PropsWithClassName {

    /**
     * Whether get focus when component mounted
     *
     * default: false
     */
    var autoFocus: Boolean

    /**
     * Specifies whether the radio is selected
     *
     * default: false
     */
    var checked: Boolean

    /**
     * Specifies the initial state: whether or not the radio is selected
     *
     * default: false
     */
    var defaultChecked: Boolean

    /**
     * Disable radio
     *
     * default: false
     */
    var disabled: Boolean

    /**
     * According to value for comparison, to determine whether the selected
     */
    var value: dynamic

}


external interface RadioGroupProps : PropsWithClassName {

    /**
     * The style type of radio button
     *
     * default: [RadioButtonStyle.outline]
     */
    var buttonStyle: RadioButtonStyle

    /**
     * Default selected value
     */
    var defaultValue: dynamic

    /**
     * Disable all radio buttons
     *
     * default: false
     */
    var disabled: Boolean

    /**
     * The `name` property of all `input[type="radio"]` children
     */
    var name: String

    /**
     * Set children optional
     *
     * see: Radio-ext.kt
     */
    var options: dynamic  // string[] | number[] | Array<{ label: ReactNode; value: string; disabled?: boolean; }>

    /**
     * Set Radio optionType
     *
     * @defaul [RadioOptionType.default]
     */
    var optionType: RadioOptionType

    /**
     * The size of radio button style
     *
     * default: [Size.middle]
     */
    var size: Size

    /**
     * Used for setting the currently selected value
     */
    var value: dynamic

    /**
     * The callback function that is triggered when the state changes
     */
    var onChange: ChangeEventHandler<HTMLInputElement>?

}
