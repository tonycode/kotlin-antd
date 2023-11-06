package dev.tonycode.kotlin_wrappers.kotlin_antd_demo.ui.screens.table

import antd.ColumnType
import antd.Pagination
import antd.Size
import antd.Table
import js.core.jso
import react.FC
import react.Props


val TableDemo = FC<Props> {

    Table {
        size = Size.middle
        pagination = jso<Pagination> {
            pageSize = 5
        }
        onChange = { pagination, filters, sorter, extra ->
            console.log("pagination", pagination)
            console.log("filters", filters)
            console.log("sorter", sorter)
            console.log("extra", extra)
        }

        columns = arrayOf(
            ColumnType(
                title = "id",
                dataIndex = User::id.name,
                width = "10%"
            ),
            ColumnType(
                title = "name",
                dataIndex = User::name.name,
            ),
            ColumnType(
                title = "age",
                dataIndex = User::age.name,
                width = "20%"
            ),
            ColumnType(
                title = "country",
                dataIndex = User::country.name,
                width = "20%"
            )
        )

        dataSource = dummyUsers
    }

}


@OptIn(ExperimentalJsExport::class)
@JsExport
data class User(

    val id: Int,

    val name: String,

    val age: Int,

    val country: String?

)

private val dummyUsers = arrayOf<Any>(
    User(1, "Antonio", 23, "Italy"),
    User(2, "Mike", 16, "Spain"),
    User(3, "George", 32, "France"),
    User(4, "Mary", 36, "Austria"),
    User(5, "Max", 18, "Poland"),
    User(6, "Henry", 42, "Hungary"),
    User(7, "Jeff", 58, "Canada"),
)
