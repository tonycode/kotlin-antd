@file:JsModule("antd")
@file:JsNonModule

package antd

import react.ComponentClass
import react.PropsWithChildren
import react.PropsWithClassName
import react.ReactNode
import web.uievents.MouseEvent
import web.window.WindowTarget


/**
 * To trigger an operation
 *
 * https://ant.design/components/button
 *
 * see: https://ant.design/components/button#when-to-use
 */
@JsName("Button")
external val Button: ComponentClass<ButtonProps>

external interface ButtonProps : PropsWithClassName, PropsWithChildren {

    /**
     * Option to fit button width to its parent width
     *
     * default: false
     */
    var block: Boolean

    //todo classNames - Record<SemanticDOM, string>

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
     */
    var href: String

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
     */
    var icon: ReactNode

    /**
     * Set the loading status of button
     *
     * use: [ButtonProps.setLoading]
     *
     * default: false
     */
    var loading: dynamic  // Boolean | { delay: Number }

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

    //todo styles - Record<SemanticDOM, CSSProperties>

    /**
     * Same as target attribute of `a`, works when href is specified
     */
    var target: WindowTarget

    /**
     * Set button type
     *
     * default: [ButtonType.default]
     */
    var type: ButtonType

    /**
     * Set the handler to handle `click` event
     */
    var onClick: (event: MouseEvent) -> Unit

}
