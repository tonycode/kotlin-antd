@file:JsModule("antd")
@file:JsNonModule

package antd

import react.ComponentClass
import react.Props
import react.ReactNode


/**
 * A spinner for displaying loading state of a page or a section
 *
 * https://ant.design/components/spin
 */
@JsName("Spin")
external val Spin: ComponentClass<SpinProps>

external interface SpinProps : Props {

    /**
     * Specifies a delay in milliseconds for loading state (prevent flush)
     */
    var delay: Int

    /**
     * React node of the spinning indicator
     */
    var indicator: ReactNode

    /**
     * The size of Spin
     *
     * default [SpinSize.default]
     */
    var size: SpinSize

    /**
     * Whether Spin is visible
     *
     * default: true
     */
    var spinning: Boolean

}
