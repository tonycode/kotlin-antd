@file:JsModule("antd")
@file:JsNonModule

package antd

import react.ComponentClass
import react.PropsWithClassName
import react.ReactNode


@JsName("Tabs")
external val Tabs: ComponentClass<TabsProps>

external interface TabsProps : PropsWithClassName {

    /**
     * Current TabPane's key
     */
    var activeKey: String?

    var items: Array<TabItemType>

    /**
     * Callback executed when active tab is changed
     */
    var onChange: (activeKey: String) -> Unit

}


@JsName("TabItemType")
external interface TabItemType {

    var key: String

    var label: String

    var children: ReactNode

}
