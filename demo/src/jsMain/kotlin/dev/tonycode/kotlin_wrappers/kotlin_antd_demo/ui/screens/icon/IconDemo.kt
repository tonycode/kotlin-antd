package dev.tonycode.kotlin_wrappers.kotlin_antd_demo.ui.screens.icon

import antd.CheckCircleTwoTone
import antd.Direction
import antd.HeartTwoTone
import antd.HomeOutlined
import antd.LoadingOutlined
import antd.SettingFilled
import antd.Size
import antd.SmileOutlined
import antd.SmileTwoTone
import antd.Space
import antd.StarFilled
import antd.StarOutlined
import antd.StarTwoTone
import antd.SyncOutlined
import react.FC
import react.Props
import web.cssom.Color
import web.cssom.NamedColor


val IconDemo = FC<Props>("IconDemo") {

    Space {
        direction = Direction.vertical
        size = Size.middle

        Space {
            HomeOutlined()
            SettingFilled()
            SyncOutlined { spin = true }
            SmileOutlined { rotate = 180 }
            LoadingOutlined()
        }

        Space {
            SmileTwoTone()
            HeartTwoTone { twoToneColor = Color("#eb2f96") }
            CheckCircleTwoTone { twoToneColor = NamedColor.orange }
        }

        Space {
            StarOutlined()
            StarFilled()
            StarTwoTone { twoToneColor = NamedColor.red }
        }
    }

}
