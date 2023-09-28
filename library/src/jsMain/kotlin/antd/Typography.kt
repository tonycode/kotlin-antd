@file:JsModule("antd")
@file:JsNonModule

package antd

import react.ComponentClass
import react.PropsWithClassName


/**
 * Basic text writing, including headings, body text, lists, and more
 *
 * https://ant.design/components/typography
 */
@JsName("Typography")
external object Typography {

    @JsName("Text")
    val Text: ComponentClass<TextProps>

    @JsName("Link")
    val Link: ComponentClass<LinkProps>

    @JsName("Title")
    val Title: ComponentClass<TitleProps>

}


/**
 * https://ant.design/components/typography#typographytext
 */
external interface TextProps : PropsWithClassName {

    /**
     * Code style
     *
     * default: false
     */
    var code: Boolean

    //todo copyable

    /**
     * Deleted line style
     *
     * default: false
     */
    var delete: Boolean

    /**
     * Disabled content
     *
     * default: false
     */
    var disabled: Boolean

    //todo editable

    //todo ellipsis

    /**
     * Keyboard style
     *
     * default: false
     */
    var keyboard: Boolean

    /**
     * Marked style
     *
     * default: false
     */
    var mark: Boolean

    /**
     * Set the handler to handle click event
     */
    var onClick: () -> Unit

    /**
     * Bold style
     *
     * default: false
     */
    var strong: Boolean

    /**
     * Italic style
     *
     * default: false
     */
    var italic: Boolean

    /**
     * Content type
     */
    var type: TypographyType

    /**
     * Underlined style
     *
     * default: false
     */
    var underline: Boolean

}


external interface LinkProps : PropsWithClassName {

    var href: String

    var target: String  //todo enumerate

}


external interface TitleProps : PropsWithClassName {

    var level: Int

    var code: Boolean

    var mark: Boolean

}
