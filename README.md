kotlin-antd
===========

Kotlin wrapper for **Ant Design** (React UI library `antd`, https://ant.design/docs/react/introduce)

based on **antd** version: [5.10.3](https://github.com/ant-design/ant-design/releases/tag/5.10.3)

## LIVE DEMO

https://tonycode.dev/demos/kotlin-antd-demo/

(this is a deployed `demo` module from this repository)

<hr />

<img src="docs/kotlin-antd-promo.png" alt="preview" title="preview" />


## Usage

**Work-In-Progress**: Initial release are not ready yet, but SNAPSHOT's are available

```kotlin
repositories {
    //...
    maven("https://s01.oss.sonatype.org/content/repositories/snapshots/")
}
```

```kotlin
implementation("dev.tonycode.kotlin-wrappers:kotlin-antd:0.1.0-SNAPSHOT") {
    isChanging = true  // instruct Gradle to check for SNAPSHOT updates
}
```

```kotlin
import antd.*


Space {
    direction = Direction.vertical
    size = Size.large

    Typography.Title {
        level = 3
        +"h3. Ant Design"
    }

    Typography.Text {
        code = true
        +"Ant Design (code)"
    }

    Alert {
        setMessage("some info")
    }

    Button {
        type = ButtonType.primary
        danger = false
        disabled = false
        ghost = false
        loading = false
        shape = ButtonShape.round
        size = Size.large

        +"default"
    }

    Radio.Group {
        setOptions("Apple", "Pear", "Orange")
        setValue("Apple")

        disabled = false
        optionType = RadioOptionType.button
        buttonStyle = RadioButtonStyle.outline
        size = Size.large

        onChange = { console.dir(it) }
    }

    Checkbox {
        checked = true

        onChange = {
            console.dir(it.target.checked)
        }

        +"Checkbox"
    }

    Select {
        options = arrayOf(
            Option("Item 1"),
            Option("Item 2"),
            Option("Item 3")
        )
        defaultValue = "Item 1"

        onChange = { console.log(it) }
    }

    Spin()
}
```

see usage examples here:

- [Alert](demo/src/jsMain/kotlin/dev/tonycode/kotlin_wrappers/kotlin_antd_demo/ui/screens/alert/AlertDemo.kt)
- [Button](demo/src/jsMain/kotlin/dev/tonycode/kotlin_wrappers/kotlin_antd_demo/ui/screens/button/ButtonDemo.kt)
- [Dropdown](demo/src/jsMain/kotlin/dev/tonycode/kotlin_wrappers/kotlin_antd_demo/ui/screens/dropdown/DropdownDemo.kt)
- [Icon](demo/src/jsMain/kotlin/dev/tonycode/kotlin_wrappers/kotlin_antd_demo/ui/screens/icon/IconDemo.kt)
- [Input](demo/src/jsMain/kotlin/dev/tonycode/kotlin_wrappers/kotlin_antd_demo/ui/screens/input/InputDemo.kt)
- [Message](demo/src/jsMain/kotlin/dev/tonycode/kotlin_wrappers/kotlin_antd_demo/ui/screens/message/MessageDemo.kt)
- [Popconfirm](demo/src/jsMain/kotlin/dev/tonycode/kotlin_wrappers/kotlin_antd_demo/ui/screens/popconfirm/PopconfirmDemo.kt)
- [Radio](demo/src/jsMain/kotlin/dev/tonycode/kotlin_wrappers/kotlin_antd_demo/ui/screens/radio/RadioDemo.kt)
- [Select](demo/src/jsMain/kotlin/dev/tonycode/kotlin_wrappers/kotlin_antd_demo/ui/screens/select/SelectDemo.kt)
- [Spin](demo/src/jsMain/kotlin/dev/tonycode/kotlin_wrappers/kotlin_antd_demo/ui/screens/spin/SpinDemo.kt)
- [Switch](demo/src/jsMain/kotlin/dev/tonycode/kotlin_wrappers/kotlin_antd_demo/ui/screens/switch/SwitchDemo.kt)
- [Table](demo/src/jsMain/kotlin/dev/tonycode/kotlin_wrappers/kotlin_antd_demo/ui/screens/table/TableDemo.kt)
- [Tabs](demo/src/jsMain/kotlin/dev/tonycode/kotlin_wrappers/kotlin_antd_demo/ui/screens/tabs/TabsDemo.kt)
- [Typography.Title](demo/src/jsMain/kotlin/dev/tonycode/kotlin_wrappers/kotlin_antd_demo/ui/screens/typography/TypographyTitleDemo.kt)
- [Typography.Text](demo/src/jsMain/kotlin/dev/tonycode/kotlin_wrappers/kotlin_antd_demo/ui/screens/typography/TypographyTextDemo.kt)


## Wrappers implemented

see [live demo](https://github.com/tonycode/kotlin-antd#live-demo)

Full list of original `antd` js-library Components: https://ant.design/components/overview


## License

[MIT](LICENSE)
