package antd


fun RadioGroupProps.setOptions(options: List<String>) {
    this.options = options.toTypedArray()
}

fun RadioGroupProps.setOptions(vararg options: String) {
    this.options = options
}

fun RadioGroupProps.setOptions(options: List<Number>) {
    this.options = options.toTypedArray()
}

fun RadioGroupProps.setOptions(options: List<Option>) {
    this.options = options.toTypedArray()
}