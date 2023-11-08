@file:JsModule("antd")
@file:JsNonModule

package antd

import react.ComponentClass
import react.Key
import react.Props
import react.ReactNode


/**
 * https://ant.design/components/menu
 */
@JsName("Menu")
external val Menu: ComponentClass<MenuProps>

external interface MenuProps : Props {

    /**
     * Menu item content
     */
    var items: Array<MenuItemTypeProps>

    /**
     * Called when a menu item is clicked
     */
    var onClick: (e: dynamic) -> Unit  // function({ item, key, keyPath, domEvent })

}


external interface MenuItemTypeProps : Props {

    /**
     * Display the danger style
     *
     * default: false
     */
    var danger: Boolean

    /**
     * Whether menu item is disabled
     *
     * default: false
     */
    var disabled: Boolean

    /**
     * The icon of the menu item
     */
    var icon: ReactNode

    /**
     * Unique ID of the menu item
     */
    override var key: Key?

    /**
     * Menu label
     */
    var label: dynamic  // string | ReactNode

    /**
     * Set display title for collapsed item
     */
    var title: String

}
