package antd


@Suppress(
    "NAME_CONTAINS_ILLEGAL_CHARS",
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)
// language=JavaScript
@JsName("""(/*union*/{
    start: 'start', end: 'end', center: 'center', baseline: 'baseline'
}/*union*/)""")
/**
 * Align items
 *
 * see: https://ant.design/components/space#api "align" property
 */
sealed external interface Align {

    companion object {
        val start: Align
        val end: Align
        val center: Align
        val baseline: Align
    }

}
