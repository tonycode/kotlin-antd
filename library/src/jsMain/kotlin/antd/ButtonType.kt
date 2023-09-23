package antd


@Suppress(
    "NAME_CONTAINS_ILLEGAL_CHARS",
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)
// language=JavaScript
@JsName("""(/*union*/{
    primary: 'primary', dashed: 'dashed', link: 'link', text: 'text', default: 'default'
}/*union*/)""")
sealed external interface ButtonType {

    companion object {
        val primary: ButtonType
        val dashed: ButtonType
        val link: ButtonType
        val text: ButtonType
        val default: ButtonType
    }

}
