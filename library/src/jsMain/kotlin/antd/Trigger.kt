package antd


@Suppress(
    "NAME_CONTAINS_ILLEGAL_CHARS",
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)
// language=JavaScript
@JsName("""(/*union*/{
    click: 'click', hover: 'hover', contextMenu: 'contextMenu'
}/*union*/)""")
sealed external interface Trigger {

    companion object {
        val click: Trigger
        val hover: Trigger
        val contextMenu: Trigger
    }

}
