@file:JsModule("antd")
@file:JsNonModule

package antd

import react.ComponentClass
import react.PropsWithClassName


/**
 * https://ant.design/components/table
 */
@JsName("Table")
external val Table: ComponentClass<TableProps<Any>>

external interface TableProps<T> : PropsWithClassName {

    var columns: Array<ColumnType<T>>

    var dataSource: Array<T>

    /**
     * Size of table
     *
     * default: [Size.large]
     */
    var size: Size

    // see: https://ant.design/components/pagination
    var pagination: dynamic

    // function(pagination, filters, sorter, extra: { currentDataSource: [], action: paginate | sort | filter })
    var onChange: (pagination: dynamic, filters: dynamic, sorter: dynamic, extra: dynamic) -> Unit

}
