@file:Suppress(
    "NAME_CONTAINS_ILLEGAL_CHARS",
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package antd


// language=JavaScript
@JsName("""(/*union*/{
    large: 'large', middle: 'middle', small: 'small'
}/*union*/)""")
sealed external interface Size {

    companion object {
        val large: Size
        val middle: Size
        val small: Size
    }

}
