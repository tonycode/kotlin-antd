package dev.tonycode.kotlin_wrappers.kotlin_antd_demo.ui.screens.dropdown

import dev.tonycode.kotlin_wrappers.kotlin_antd_demo.ui.components.DemoCard
import react.FC
import react.Props
import react.create


val DropdownDemoCard = FC<Props>("DropdownDemoCard") {

    DemoCard {
        title = "Dropdown"
        demoSrcLink = "dropdown/DropdownDemo.kt"

        showcase = DropdownDemo.create()
    }

}
