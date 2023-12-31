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
     * Customize clear icon
     *
     * use: [SelectProps.setAllowClear]
     *
     * default: false
     */
    var allowClear: dynamic  // boolean | { clearIcon?: ReactNode }

    /**
     * Initial selected option
     *
     * use: [SelectProps.setDefaultValue]
     */
    var defaultValue: dynamic  // string | string[] | number | number[] | LabeledValue | LabeledValue[]

    /**
     * Whether disabled select
     *
     * default: false
     */
    var disabled: Boolean

    /**
     * Indicate loading state
     *
     * default: false
     */
    var loading: Boolean

    /**
     * Which prop value of option will be used for filter if filterOption is true
     *
     * If [options] is set, it should be set to [OptionFilterProp.label]
     *
     * default: [OptionFilterProp.value]
     */
    var optionFilterProp: OptionFilterProp

    /**
     * Select options. Will get better perf than jsx definition
     */
    var options: Array<Option>

    /**
     * Placeholder of select
     *
     * use: [SelectProps.setPlaceholder]
     */
    var placeholder: dynamic  // string | ReactNode

    /**
     * Whether select is searchable
     *
     * default(single): false
     * default(multiple): true
     */
    var showSearch: Boolean

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
