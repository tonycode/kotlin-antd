package dev.tonycode.kotlin_wrappers.kotlin_antd_demo.ui.screens.icon

import antd.HomeOutlined
import antd.LoadingOutlined
import antd.SettingFilled
import antd.Space
import antd.SyncOutlined
import react.FC
import react.Props


val IconDemo = FC<Props> {

    Space {
        HomeOutlined()
        SettingFilled()
        SyncOutlined { spin = true }
        LoadingOutlined()
    }

}
