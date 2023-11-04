package antd

import react.ReactNode


//region AlertProps.closeIcon setters
/**
 * @param value if false - close icon will be hidden
 */
fun AlertProps.setCloseIcon(value: Boolean) {
    this.closeIcon = value
}

fun AlertProps.setCloseIcon(value: ReactNode) {
    this.closeIcon = value
}
//endregion

//region AlertProps.message setters
fun AlertProps.setMessage(message: String) {
    this.message = message
}

fun AlertProps.setMessage(message: ReactNode) {
    this.message = message
}
//endregion

//region AlertProps.message setters
fun AlertProps.setDescription(description: String) {
    this.description = description
}

fun AlertProps.setDescription(description: ReactNode) {
    this.description = description
}
//endregion
