@file:JsModule("antd")
@file:JsNonModule

package antd

import react.ComponentClass
import react.Props
import react.ReactNode


@JsName("Space")
external val Space : ComponentClass<SpaceProps>

external interface SpaceProps : Props {

    /**
     * Align items
     *
     * default: null
     */
    var align: Align?

    /**
     * The space direction
     *
     * default: [Direction.horizontal]
     */
    var direction: Direction

    /**
     * The space size
     *
     * default: [Size.small]
     */
    var size: Size
    //todo Size[]

    /**
     * Set split
     *
     * default: null
     */
    var split: ReactNode?

    /**
     * Auto wrap line, when `horizontal` effective
     *
     * default: false
     */
    var wrap: Boolean

}
