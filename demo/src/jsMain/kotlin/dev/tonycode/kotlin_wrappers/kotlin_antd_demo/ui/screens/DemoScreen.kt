package dev.tonycode.kotlin_wrappers.kotlin_antd_demo.ui.screens

import antd.Direction
import antd.Size
import antd.Space
import antd.TabItemType
import antd.Tabs
import dev.tonycode.kotlin_wrappers.kotlin_antd_demo.ui.screens.alert.AlertDemoCard
import dev.tonycode.kotlin_wrappers.kotlin_antd_demo.ui.screens.button.ButtonDemoCard
import dev.tonycode.kotlin_wrappers.kotlin_antd_demo.ui.screens.dropdown.DropdownDemoCard
import dev.tonycode.kotlin_wrappers.kotlin_antd_demo.ui.screens.icon.IconDemoCard
import dev.tonycode.kotlin_wrappers.kotlin_antd_demo.ui.screens.radio.RadioDemoCard
import dev.tonycode.kotlin_wrappers.kotlin_antd_demo.ui.screens.select.SelectDemoCard
import dev.tonycode.kotlin_wrappers.kotlin_antd_demo.ui.screens.spin.SpinDemoCard
import dev.tonycode.kotlin_wrappers.kotlin_antd_demo.ui.screens.switch.SwitchDemoCard
import dev.tonycode.kotlin_wrappers.kotlin_antd_demo.ui.screens.table.TableDemoCard
import dev.tonycode.kotlin_wrappers.kotlin_antd_demo.ui.screens.tabs.TabsDemoCard
import dev.tonycode.kotlin_wrappers.kotlin_antd_demo.ui.screens.typography.TypographyTextDemoCard
import dev.tonycode.kotlin_wrappers.kotlin_antd_demo.ui.screens.typography.TypographyTitleDemoCard
import emotion.react.css
import js.core.jso
import react.FC
import react.Fragment
import react.Props
import react.ReactNode
import react.create
import react.useState
import web.cssom.pct


val DemoScreen = FC<Props>("DemoScreen") {

    var activeTab: Section by useState(Section.GENERAL)


    Tabs {
        activeKey = activeTab.name

        items = Section.entries.map { section ->
            jso<TabItemType> {
                key = section.name
                label = section.title

                children = Space.create {
                    css { width = 100.pct }
                    direction = Direction.vertical
                    size = Size.large

                    +section.createContentFunc.invoke()
                }
            }
        }.toTypedArray()

        onChange = { activeTab = Section.valueOf(it) }
    }

}


enum class Section(val title: String, val createContentFunc: () -> ReactNode) {

    GENERAL("General", { Fragment.create {
        ButtonDemoCard()
        IconDemoCard()
        TypographyTitleDemoCard()
        TypographyTextDemoCard()
    } }),

    NAVIGATION("Navigation", { Fragment.create {
        DropdownDemoCard()
    } }),

    DATA_ENTRY("Data Entry", { Fragment.create {
        RadioDemoCard()
        SelectDemoCard()
        SwitchDemoCard()
    } }),

    DATA_DISPLAY("Data Display", { Fragment.create {
        TableDemoCard()
        TabsDemoCard()
    } }),

    FEEDBACK("Feedback", { Fragment.create {
        AlertDemoCard()
        SpinDemoCard()
    } }),

}
