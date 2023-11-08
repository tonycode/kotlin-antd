@file:JsModule("antd")
@file:JsNonModule

package antd

import react.CSSProperties
import react.ComponentClass
import react.PropsWithChildren
import react.ReactNode


/**
 * https://ant.design/components/dropdown
 */
@JsName("Dropdown")
external val Dropdown: ComponentClass<DropdownProps>

external interface DropdownProps : PropsWithChildren {

    /**
     * Whether the dropdown arrow should be visible
     *
     * default: false
     */
    var arrow: Boolean

    /**
     * Whether to adjust dropdown placement automatically when dropdown is off screen
     *
     * default: true
     */
    var autoAdjustOverflow: Boolean

    /**
     * Focus element in `overlay` when opened
     *
     * default: false
     */
    var autoFocus: Boolean

    /**
     * Whether the dropdown menu is disabled
     */
    var disabled: Boolean

    /**
     * Whether destroy dropdown when hidden
     *
     * default: false
     */
    var destroyPopupOnHide: Boolean

    /**
     * Customize dropdown content
     */
    var dropdownRender: (menu: ReactNode) -> ReactNode

    //getPopupContainer

    /**
     * The menu props
     */
    var menu: MenuProps

    /**
     * The class name of the dropdown root element
     */
    var overlayClassName: String

    /**
     * The style of the dropdown root element
     */
    var overlayStyle: CSSProperties

    /**
     * Placement of popup menu
     *
     * default: [Placement.bottomLeft]
     */
    var placement: Placement

    /**
     * The trigger mode which executes the dropdown action. Note that `hover` can't be used on touchscreens
     *
     * default: [Trigger.hover]
     */
    var trigger: Array<Trigger>

    /**
     * Whether the dropdown menu is currently open
     */
    var open: Boolean

    /**
     * Called when the open state is changed. Not trigger when hidden by click item.
     */
    //(open: boolean, info: { source: 'trigger' | 'menu' }) => void
    var onOpenChange: (open: Boolean, info: Any) -> Unit

}
