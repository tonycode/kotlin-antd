@file:Suppress(
    "NAME_CONTAINS_ILLEGAL_CHARS",
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package antd


// language=JavaScript
@JsName("""(/*union*/{
    default: 'default', circle: 'circle', round: 'round'
}/*union*/)""")
sealed external interface ButtonShape {

    companion object {
        val default: ButtonShape
        val circle: ButtonShape
        val round: ButtonShape
    }

}
