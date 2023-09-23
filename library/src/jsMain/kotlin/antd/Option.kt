package antd


@OptIn(ExperimentalJsExport::class)
@JsExport
data class Option(

    val value: String,

    val label: String = value,

    val disabled: Boolean = false

)
