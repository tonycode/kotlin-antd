@file:JsModule("@ant-design/icons")
@file:JsNonModule

package antd

import react.CSSProperties
import react.ComponentClass
import react.PropsWithClassName
import web.cssom.Color


//
// Semantic vector graphics
//
// https://ant.design/components/icon
//

// outlined
@JsName("HomeOutlined") external val HomeOutlined: ComponentClass<IconProps>
@JsName("LoadingOutlined") external val LoadingOutlined: ComponentClass<IconProps>
@JsName("StarOutlined") external val StarOutlined: ComponentClass<IconProps>
@JsName("SyncOutlined") external val SyncOutlined: ComponentClass<IconProps>

// filled
@JsName("SettingFilled") external val SettingFilled: ComponentClass<IconProps>
@JsName("StarFilled") external val StarFilled: ComponentClass<IconProps>

// twotone
@JsName("StarTwoTone") external val StarTwoTone: ComponentClass<IconProps>


external interface IconProps : PropsWithClassName {

    /**
     * Rotate by n degrees (not working in IE9)
     */
    var rotate: Number

    /**
     * Rotate icon with animation
     *
     * default: false
     */
    var spin: Boolean

    /**
     * The style properties of icon, like `fontSize` and `color`
     */
    var style: CSSProperties

    /**
     * Only supports the two-tone icon. Specify the primary color
     */
    var twoToneColor: Color

}
