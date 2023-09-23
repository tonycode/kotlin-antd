package antd


@Suppress(
    "NAME_CONTAINS_ILLEGAL_CHARS",
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)
// language=JavaScript
@JsName("""(/*union*/{
    submit: 'submit', reset: 'reset', button: 'button'
}/*union*/)""")
sealed external interface ButtonHtmlType {

    companion object {
        /**
         * The button submits the form data to the server.
         * This is the default if the attribute is not specified for buttons associated with a <form>,
         * or if the attribute is an empty or invalid value.
         */
        val submit: ButtonHtmlType

        /**
         * The button resets all the controls to their initial values, like <input type="reset">.
         * (This behavior tends to annoy users.)
         */
        val reset: ButtonHtmlType

        /**
         * The button has no default behavior, and does nothing when pressed by default.
         * It can have client-side scripts listen to the element's events,
         * which are triggered when the events occur.
         */
        val button: ButtonHtmlType
    }

}
