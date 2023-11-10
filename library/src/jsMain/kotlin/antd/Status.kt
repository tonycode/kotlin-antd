package antd


@Suppress(
    "NAME_CONTAINS_ILLEGAL_CHARS",
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)
// language=JavaScript
@JsName("""(/*union*/{
    error: 'error', warning: 'warning'
}/*union*/)""")
sealed external interface Status {

    companion object {
        val error: Status
        val warning: Status
    }

}
