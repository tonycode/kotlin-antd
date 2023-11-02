package antd


@OptIn(ExperimentalJsExport::class)
@JsExport
data class Option(

    val value: String,

    val label: String = value,

    val id: String? = null,

    val disabled: Boolean = false

)
