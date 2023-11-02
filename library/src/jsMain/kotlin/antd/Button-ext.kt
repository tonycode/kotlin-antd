package antd

import js.core.jso


//region ButtonProps.loading setter
fun ButtonProps.setLoading(isLoading: Boolean) {
    this.loading = isLoading
}

fun ButtonProps.setLoading(delay: Number) {
    this.loading = jso<Loading> {
        this.delay = delay
    }
}

external interface Loading {
    var delay: Number
}
//endregion
