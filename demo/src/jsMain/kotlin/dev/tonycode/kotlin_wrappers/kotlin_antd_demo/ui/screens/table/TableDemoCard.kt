package dev.tonycode.kotlin_wrappers.kotlin_antd_demo.ui.screens.table

import dev.tonycode.kotlin_wrappers.kotlin_antd_demo.ui.components.DemoCard
import react.FC
import react.Props
import react.create


val TableDemoCard = FC<Props>("TableDemoCard") {

    DemoCard {
        title = "Table"
        demoSrcLink = "table/TableDemo.kt"

        showcase = TableDemo.create()
    }

}
