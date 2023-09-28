package antd


//region SpaceProps.size setters
//region size = Size | Number
fun SpaceProps.setSize(size: Size) {
    this.size = size
}

fun SpaceProps.setSize(px: Number) {
    this.size = px
}
//endregion

//region size = (Size|Number)[]
fun SpaceProps.setSize(horizontalSize: Size, verticalSize: Size) {
    this.size = arrayOf(horizontalSize, verticalSize)
}

fun SpaceProps.setSize(horizontalSize: Size, verticalSize: Number) {
    this.size = arrayOf(horizontalSize, verticalSize)
}

fun SpaceProps.setSize(horizontalSize: Number, verticalSize: Size) {
    this.size = arrayOf(horizontalSize, verticalSize)
}

fun SpaceProps.setSize(horizontalSize: Number, verticalSize: Number) {
    this.size = arrayOf(horizontalSize, verticalSize)
}
//endregion
//endregion
