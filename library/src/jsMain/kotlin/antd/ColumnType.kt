package antd

import react.ReactNode


@OptIn(ExperimentalJsExport::class)
@JsExport
data class ColumnType<T>(

    val title: String,

    val dataIndex: String,

    val key: String = dataIndex,

    val render: ((text: String?, record: T) -> ReactNode)? = null,

    /**
     * Width of this column
     *
     * see: https://github.com/ant-design/ant-design/issues/13825#issuecomment-449889241
     *
     * e.g.: "30%"
     */
    val width: dynamic = null,  // string | number

    /**
     * Filter menu config
     */
    val filters: Array<FilterItem>? = null,

    /**
     * Function that determines if the row is displayed when filtered
     */
    val onFilter: ((value: String?, record: T) -> Boolean)? = null

)

@OptIn(ExperimentalJsExport::class)
@JsExport
data class FilterItem(

    val text: String,

    val value: String = text

)
