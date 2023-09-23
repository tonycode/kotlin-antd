package antd


@Suppress(
    "NAME_CONTAINS_ILLEGAL_CHARS",
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)
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


object ButtonShapeFactory {
    fun ofValue(value: String): ButtonShape {
        return when (value) {
            ButtonShape.circle.toString() -> ButtonShape.circle
            ButtonShape.round.toString() -> ButtonShape.round
            else -> ButtonShape.default
        }
    }
}
