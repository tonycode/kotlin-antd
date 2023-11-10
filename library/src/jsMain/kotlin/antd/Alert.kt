@file:JsModule("antd")
@file:JsNonModule

package antd

import react.ComponentClass
import react.PropsWithClassName
import react.ReactNode
import web.uievents.MouseEvent


/**
 * https://ant.design/components/alert
 */
@JsName("Alert")
external val Alert: ComponentClass<AlertProps>

external interface AlertProps : PropsWithClassName {

    /**
     * The action of Alert
     *
     * e.g. "UNDO" button
     */
    var action: ReactNode

    /**
     * Called when close animation is finished
     */
    var afterClose: () -> Unit

    /**
     * Whether to show as banner
     *
     * default: false
     */
    var banner: Boolean

    /**
     * Custom close icon
     *
     * - close button will be hidden when setting to null or false
     *
     * see: [AlertProps.setCloseIcon]
     *
     * default: false && [CloseOutlined]
     */
    var closeIcon: dynamic  // boolean | ReactNode

    /**
     * Additional content of Alert
     *
     * see: [AlertProps.setDescription]
     */
    var description: dynamic  // string | ReactNode

    /**
     * Custom icon, effective when [showIcon] is true
     */
    var icon: ReactNode

    /**
     * Content of Alert
     *
     * see: [AlertProps.setMessage]
     */
    var message: dynamic  // string | ReactNode

    /**
     * Whether to show icon
     *
     * default: false
     *
     * default(`banner` mode): true
     */
    var showIcon: Boolean

    /**
     * Type of Alert styles
     *
     * default: [AlertType.info]
     *
     * default(`banner` mode): [AlertType.warning]
     */
    var type: AlertType

    /**
     * Callback when Alert is closed
     */
    var onClose: (e: MouseEvent) -> Unit

}
