@file:JsModule("antd")
@file:JsNonModule

package antd

import react.ComponentClass
import react.PropsWithClassName
import react.ReactNode


/**
 * Select component to select value from options
 *
 * https://ant.design/components/select
 */
@JsName("Select")
external val Select: ComponentClass<SelectProps>

external interface SelectProps : PropsWithClassName {

    /**
     * Initial selected option
     *
     * see: [SelectProps.setDefaultValue]
     */
    var defaultValue: dynamic  // string | string[] | number | number[] | LabeledValue | LabeledValue[]

    /**
     * Select options. Will get better perf than jsx definition
     */
    var options: Array<Option>

    var onChange: ((value: String) -> Unit)

}


/**
 * https://github.com/ant-design/ant-design/blob/f22f61db8ad3e200a00cba43d1de8411131d1b83/components/select/index.tsx#L33
 */
external interface LabeledValue {

    var key: String?

    var value: dynamic  // string | number

    var label: ReactNode

}
