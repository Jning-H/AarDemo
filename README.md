# AarDemo
aar、proguard

##  在Android studio3.0中，compile依赖关系已被implementation和api替代，provided被compile only替代，apk被runtime only替代。
    compile（api）
    这种是我们最常用的方式，使用该方式依赖的库将会参与编译和打包。
    当我们依赖一些第三方的库时，可能会遇到com.android.support冲突的问题，就是因为开发者使用的compile依赖的com.android.support包，而他所依赖的包与我们本地所依赖的com.android.support包版本不一样，所以就会报All com.android.support libraries must use the exact same version specification (mixing versions can lead to runtime crashes这个错误。
    (解决办法可以看这篇博客：com.android.support冲突的解决办法)

    provided（compileOnly）
    只在编译时有效，不会参与打包
    可以在自己的moudle中使用该方式依赖一些比如com.android.support，gson这些使用者常用的库，避免冲突。

    apk（runtimeOnly）
    只在生成apk的时候参与打包，编译时不会参与，很少用。

    testCompile（testImplementation）
    testCompile 只在单元测试代码的编译以及最终打包测试apk时有效。

    debugCompile（debugImplementation）
    debugCompile 只在 debug 模式的编译和最终的 debug apk 打包时有效

    releaseCompile（releaseImplementation）
    Release compile仅仅针对 Release 模式的编译和最终的 Release apk 打包。

##  com.android.support冲突的解决办法
    group:表示只要包含com.android.support的都排除
        api("com.afollestad.material-dialogs:core:0.9.5.0") {
            exclude group: 'com.android.support'
        }

    module：删排除group中的指定module
        api("com.afollestad.material-dialogs:core:0.9.5.0") {
            exclude group: 'com.android.support', module: 'support-v13'
            exclude group: 'com.android.support', module: 'support-vector-drawable'
        }
    需要依赖com.android.support的话，建议用provided的方式依赖（android studio3.0中更改为compileOnly），这样只会在编译时有效，不会参与打包。以免给使用者带来不便。

