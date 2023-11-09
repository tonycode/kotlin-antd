package antd


//region SelectProps.defaultValue setters
fun SelectProps.setDefaultValue(value: String) {
    this.defaultValue = value
}

fun SelectProps.setDefaultValue(value: Array<String>) {
    this.defaultValue = value
}

fun SelectProps.setDefaultValue(value: Number) {
    this.defaultValue = value
}

fun SelectProps.setDefaultValue(value: Array<Number>) {
    this.defaultValue = value
}

fun SelectProps.setDefaultValue(value: LabeledValue) {
    this.defaultValue = value
}

fun SelectProps.setDefaultValue(value: Array<LabeledValue>) {
    this.defaultValue = value
}
//endregion

//region LabeledValue.value setters
fun LabeledValue.setValue(value: String) {
    this.value = value
}

fun LabeledValue.setValue(value: Number) {
    this.value = value
}
//endregion
