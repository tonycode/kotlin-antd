package antd


@Suppress(
    "NAME_CONTAINS_ILLEGAL_CHARS",
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)
// language=JavaScript
@JsName("""(/*union*/{
    value: 'value', label: 'label'
}/*union*/)""")
sealed external interface OptionFilterProp {

    companion object {
        val value: OptionFilterProp
        val label: OptionFilterProp
    }

}
