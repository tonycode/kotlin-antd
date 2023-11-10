package antd

import react.ReactNode


//region InputProps.addonBefore setters
fun InputProps.setAddonBefore(value: String) {
    this.addonBefore = value
}

fun InputProps.setAddonBefore(value: ReactNode) {
    this.addonBefore = value
}
//endregion

//region InputProps.addonAfter setters
fun InputProps.setAddonAfter(value: String) {
    this.addonAfter = value
}

fun InputProps.setAddonAfter(value: ReactNode) {
    this.addonAfter = value
}
//endregion

//region InputProps.allowClear setters
fun InputProps.setAllowClear(value: Boolean) {
    this.allowClear = value
}

fun InputProps.setAllowClear(value: ClearIcon) {
    this.allowClear = value
}
//endregion

//region InputProps.prefix setters
fun InputProps.setPrefix(value: String) {
    this.prefix = value
}

fun InputProps.setPrefix(value: ReactNode) {
    this.prefix = value
}
//endregion

//region InputProps.suffix setters
fun InputProps.setSuffix(value: String) {
    this.suffix = value
}

fun InputProps.setSuffix(value: ReactNode) {
    this.suffix = value
}
//endregion
