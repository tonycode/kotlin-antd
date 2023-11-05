#!/bin/bash

mkdir tmp  \
  && pushd tmp || exit

git clone https://github.com/ant-design/ant-design-icons.git  \
  && pushd ant-design-icons/packages/icons-react/src/icons || exit


for iconType in Outlined Filled TwoTone
do
    echo
    echo "// $iconType"

    for filename in $(ls | grep $iconType)
    do
        className="${filename/.tsx/}"
        echo "@JsName(\"$className\") external val $className: ComponentClass<IconProps>"
    done  # filename
done  # iconType

popd || exit


popd && rm -rf tmp
