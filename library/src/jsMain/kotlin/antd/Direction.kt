@file:Suppress(
    "NAME_CONTAINS_ILLEGAL_CHARS",
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package antd


// language=JavaScript
@JsName("""(/*union*/{
    vertical: 'vertical', horizontal: 'horizontal'
}/*union*/)""")
sealed external interface Direction {

    companion object {
        val vertical: Direction
        val horizontal: Direction
    }

}
