@file:JsModule("antd")
@file:JsNonModule

package antd

import react.ComponentClass
import react.PropsWithClassName


@JsName("Typography")
external object Typography {

    @JsName("Text")
    val Text: ComponentClass<TextProps>

    @JsName("Title")
    val Title: ComponentClass<TitleProps>

}


external interface TextProps : PropsWithClassName {

    var code: Boolean

    var mark: Boolean

}


external interface TitleProps : PropsWithClassName {

    var level: Int

    var code: Boolean

    var mark: Boolean

}
