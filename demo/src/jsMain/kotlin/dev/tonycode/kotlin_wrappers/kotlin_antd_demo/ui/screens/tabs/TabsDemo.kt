package dev.tonycode.kotlin_wrappers.kotlin_antd_demo.ui.screens.tabs

import antd.Tabs
import antd.Typography
import js.core.jso
import react.FC
import react.Props
import react.create
import react.useState


val TabsDemo = FC<Props> {

    var activeTab: DummyTabs by useState(DummyTabs.TAB1)


    Tabs {
        activeKey = activeTab.name

        items = arrayOf(
            jso {
                key = DummyTabs.TAB1.name
                label = DummyTabs.TAB1.label
                children = Typography.Text.create {
                    +"Content for ${ DummyTabs.TAB1.name }"
                }
            },
            jso {
                key = DummyTabs.TAB2.name
                label = DummyTabs.TAB2.label
                children = Typography.Text.create {
                    +"Content for ${ DummyTabs.TAB2.name }"
                }
            },
        )

        onChange = { activeTab = DummyTabs.valueOf(it) }
    }

}

enum class DummyTabs(val label: String) {
    TAB1("Tab 1"),
    TAB2("Tab 2")
}
