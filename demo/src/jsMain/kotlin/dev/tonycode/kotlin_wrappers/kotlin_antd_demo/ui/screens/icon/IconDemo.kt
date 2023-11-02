package dev.tonycode.kotlin_wrappers.kotlin_antd_demo.ui.screens.icon

import antd.Direction
import antd.HomeOutlined
import antd.LoadingOutlined
import antd.SettingFilled
import antd.Size
import antd.Space
import antd.StarFilled
import antd.StarOutlined
import antd.StarTwoTone
import antd.SyncOutlined
import react.FC
import react.Props
import web.cssom.Color


val IconDemo = FC<Props> {

    Space {
        direction = Direction.vertical
        size = Size.middle

        // row 1
        Space {
            HomeOutlined()
            SettingFilled()
            SyncOutlined { spin = true }
            LoadingOutlined()
        }

        // row 2
        Space {
            StarOutlined()
            StarFilled()
            StarTwoTone { twoToneColor = Color("#eb2f96") }
        }
    }

}
