@file:JsModule("antd")
@file:JsNonModule

package antd

import react.ComponentClass
import react.Props
import react.ReactNode
import web.uievents.MouseEvent


@JsName("Button")
external val Button : ComponentClass<ButtonProps>

external interface ButtonProps : Props {

    /**
     * Option to fit button width to its parent width
     *
     * default: false
     */
    var block: Boolean

    //todo classNames

    /**
     * Set the danger status of button
     *
     * default: false
     */
    var danger: Boolean

    /**
     * Disabled state of button
     *
     * default: false
     */
    var disabled: Boolean

    /**
     * Make background transparent and invert text and border colors
     *
     * default: false
     */
    var ghost: Boolean

    /**
     * Redirect url of link button
     *
     * default: null
     */
    var href: String?

    /**
     * Set the original html type of button
     *
     * see: https://developer.mozilla.org/en-US/docs/Web/HTML/Element/button#attr-type
     *
     * default: [ButtonHtmlType.button]
     */
    var htmlType: ButtonHtmlType

    /**
     * Set the icon component of button
     *
     * default: null
     */
    var icon: ReactNode?

    /**
     * Set the loading status of button
     *
     * default: false
     */
    var loading: Boolean
    //todo { delay: number }

    /**
     * Can be set button shape
     *
     * default: [ButtonShape.default]
     */
    var shape: ButtonShape

    /**
     * Set the size of button
     *
     * default: [Size.middle]
     */
    var size: Size

    //todo styles

    /**
     * Same as target attribute of a, works when href is specified
     *
     * default: null
     */
    var target: String?

    /**
     * Set button type
     *
     * default: [ButtonType.default]
     */
    var type: ButtonType

    /**
     * Set the handler to handle `click` event
     *
     * default: null
     */
    var onClick: ((event: MouseEvent) -> Unit)?

}
