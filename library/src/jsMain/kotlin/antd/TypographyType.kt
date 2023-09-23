package antd


@Suppress(
    "NAME_CONTAINS_ILLEGAL_CHARS",
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)
// language=JavaScript
@JsName("""(/*union*/{
    secondary: 'secondary', success: 'success', warning: 'warning', danger: 'danger'
}/*union*/)""")
sealed external interface TypographyType {

    companion object {
        val secondary: TypographyType
        val success: TypographyType
        val warning: TypographyType
        val danger: TypographyType
    }

}
