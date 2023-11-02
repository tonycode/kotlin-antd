@file:JsModule("antd")
@file:JsNonModule

package antd

import react.ComponentClass
import react.PropsWithChildren
import react.PropsWithClassName
import react.ReactNode


/**
 * Set components spacing
 *
 * https://ant.design/components/space
 */
@JsName("Space")
external val Space: ComponentClass<SpaceProps>

external interface SpaceProps : PropsWithClassName, PropsWithChildren {

    /**
     * Align items
     */
    var align: Align

    /**
     * The space direction
     *
     * default: [Direction.horizontal]
     */
    var direction: Direction

    /**
     * The space size
     *
     * use [SpaceProps.setSize]
     *
     * default: [Size.small]
     */
    var size: dynamic  // Size | Number | Size[] | Number[]

    /**
     * Set split
     */
    var split: ReactNode

    /**
     * Auto wrap line, when [direction] "horizontal" effective
     *
     * default: false
     */
    var wrap: Boolean

}


//todo Space.Compact - https://ant.design/components/space#spacecompact
