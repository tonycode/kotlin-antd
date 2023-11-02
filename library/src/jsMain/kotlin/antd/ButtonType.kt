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

        /**
         * Primary button: indicate the main action, one primary button at most in one section
         */
        val primary: ButtonType

        /**
         * Default button: indicate a series of actions without priority
         */
        val default: ButtonType

        /**
         * Dashed button: commonly used for adding more actions
         */
        val dashed: ButtonType

        /**
         * Text button: used for the most secondary action
         */
        val text: ButtonType

        /**
         * Link button: used for external links
         */
        val link: ButtonType

    }

}
