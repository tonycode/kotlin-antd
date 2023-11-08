package antd


@Suppress(
    "NAME_CONTAINS_ILLEGAL_CHARS",
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)
// language=JavaScript
@JsName("""(/*union*/{
    bottom: 'bottom', bottomLeft: 'bottomLeft', bottomRight: 'bottomRight',
    top: 'top', topLeft: 'topLeft', topRight: 'topRight'
}/*union*/)""")
sealed external interface Placement {

    companion object {
        val bottom: Placement
        val bottomLeft: Placement
        val bottomRight: Placement
        val top: Placement
        val topLeft: Placement
        val topRight: Placement
    }

}
