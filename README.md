# AndroidBadge

[![](https://jitpack.io/v/gdky005/AndroidBadge.svg)](https://jitpack.io/#gdky005/AndroidBadge) [![Build Status](https://travis-ci.org/gdky005/AndroidBadge.svg?branch=master)](https://travis-ci.org/gdky005/AndroidBadge) [![CircleCI](https://circleci.com/gh/gdky005/AndroidBadge/tree/master.svg?style=svg)](https://circleci.com/gh/gdky005/AndroidBadge/tree/master) [![codecov](https://codecov.io/gh/gdky005/AndroidBadge/branch/master/graph/badge.svg)](https://codecov.io/gh/gdky005/AndroidBadge) [![API](https://img.shields.io/badge/API-14%2B-blue.svg?style=flat)](https://android-arsenal.com/api?level=14) [![Codacy Badge](https://api.codacy.com/project/badge/Grade/a7021936874e43448e605ef32c136669)](https://www.codacy.com/app/gdky005/AndroidBadge?utm_source=github.com&amp;utm_medium=referral&amp;utm_content=gdky005/AndroidBadge&amp;utm_campaign=Badge_Grade) [![作者](https://img.shields.io/badge/%E4%BD%9C%E8%80%85-gdky005-7AD6FD.svg)](http://www.gdky005.com)

写一个 android 项目用于展示 在开源项目中的徽章 shields。方便大伙提升技能。

### 个人博客


[http://www.gdky005.com/](http://www.gdky005.com/)


# 打造一个高逼格的android开源项目——小白攻略


### 小引子

在平时的开发过程中，我们经常会查阅很多的资料，最长使用的是 github 的开源项目。通常在项目的主页面能看到当前的项目的简介，并且时不时能在解决的最上面看到好多的彩色标签，看起来很酷，很专业，有逼格。一下子就能提升很多的好感度。


### 前言

本文又是一篇很长的文章，如之前写的谋篇文章一样，基本是一口气连续两三天的写。写啊写啊写，不知道不觉就写了好多，其实有很多是素材图片，务必做到每个细节我都实践一遍。

考虑到同学们的时间有限，各取所需，所以按照我的惯例，首先有一篇完整版，其次，有一篇缩略版。可是这次缩略版不好做，所以综合考虑，把每个单独的知识点拆分出来，抓住重点，尽量让大家看的开心。如有疑问，请 get 全文中提到的沟通交流方式。

**这里需要提醒的是：**

*看了完整版就不用看精简集合了，内容都一样。完整版具有一定的连贯性。*
*精简版就看的清爽哈，以备自己玩的时候，快速查找相关资料和步骤。*

这里优先汇总下：
完整版： <br>
[打造一个高逼格的android开源项目——小白全攻略](#) <br>

精简集合版： <br>
[徽章系列1： Top 30 android 开源项目徽章](#) <br>
[徽章系列2：JitPack 的使用](#) <br>
[徽章系列3： Travis CI 的使用](#) <br>
[徽章系列4： Circle CI 的使用](#) <br>
[徽章系列5： Codecov 的使用](#) <br>
[徽章系列6： Api\_Level 的使用](#) <br>
[徽章系列7： codacy 的使用](#) <br>
[徽章系列8：生成个性徽章](#) <br>
总分类： <br>
[徽章（shields ）系列文章总分类](#) <br>
github 地址： <br>
[徽章项目 Demo github 地址：](#) <br>
 [https://github.com/gdky005/AndroidBadge](#) <br>

**下面正文，正式开始。**


### 范例

我们以最流行的 android 开源项目 [MPAndroidChart](https://github.com/PhilJay/MPAndroidChart "MPAndroidChart") 为例来看看。

[![](http://7xlcno.com1.z0.glb.clouddn.com/gbg/kaiyuan/md/gbg-kaiyuan-md-0.png)](#)

1. 前两个蓝色的标签：开始两个蓝色的标签是开源项目主要贡献者 Twitter 的联系方式，点击后可以跳入到 Twitter 的主页，查看该大神的 动态。
2. 橘色的标签：是国外比较有名的 开源项目网站 [android-arsenal](https://android-arsenal.com)， 很多开源项目都会在这里找到，有该项目的详细介绍。包含组员，版本号，github 项目基础信息等等。点击后会进入 MPAndroidChart 项目的首页，能看到有好多想知道的，不想知道的各种信息。
3. release蓝色的标签： 点击后能进入到比较有名的 [jitpack.io](https://jitpack.io/#PhilJay/MPAndroidChart) 对应的MPAndroidChart 页面，直接获取 MPAndroidChart 的最新版本，也能看到之前的构建历史。下面会重点介绍 jitpack.io 的使用。
4. 绿色的标签： 这个比较有意思，是 当前想支持的最低版本，MPAndroidChart的最低版本是 api-8。 点击后会进入到Android 2.2–2.2.3 Froyo (API level 8) 的详细介绍。这个功能是 android-arsenal 专门提供 开发者使用的。 下面也会有所介绍。

下面我们将 这些标签称之为 徽章 （[shields](https://shields.io/)）。

### Top 30 android 开源项目徽章 

我们尝试在 github 里面搜索 以 android  关键字 开发语言为 java 的开源项目。
![](http://7xlcno.com1.z0.glb.clouddn.com/gbg/kaiyuan/md/gbg-kaiyuan-md-1.png)
统计情况如下：

1. Retrofit 0
2. okhttp 0
3. Butter Knife 0
4. MPAndroidChart 4 ![](http://7xlcno.com1.z0.glb.clouddn.com/gbg/kaiyuan/md/gbg-kaiyuan-md-2.png)
5. Android-Universal-Image-Loader 2 ![](http://7xlcno.com1.z0.glb.clouddn.com/gbg/kaiyuan/md/gbg-kaiyuan-md-3.png)
6. glide 1 ![](http://7xlcno.com1.z0.glb.clouddn.com/gbg/kaiyuan/md/gbg-kaiyuan-md-4.png)
7. leakcanary 0 
8. EventBus 1 ![](http://7xlcno.com1.z0.glb.clouddn.com/gbg/kaiyuan/md/gbg-kaiyuan-md-5.png)
9. picasso 0 
10. zxing 3 ![](http://7xlcno.com1.z0.glb.clouddn.com/gbg/kaiyuan/md/gbg-kaiyuan-md-6.png)
11. iosched 0
12. Fresco 1 ![](http://7xlcno.com1.z0.glb.clouddn.com/gbg/kaiyuan/md/gbg-kaiyuan-md-7.png)
13. lottie-android 0
14. RxAndroid 3 ![](http://7xlcno.com1.z0.glb.clouddn.com/gbg/kaiyuan/md/gbg-kaiyuan-md-8.png)
15. libgdx 1 ![](http://7xlcno.com1.z0.glb.clouddn.com/gbg/kaiyuan/md/gbg-kaiyuan-md-9.png)
16. SlidingMenu 0
17. PhotoView 1 ![](http://7xlcno.com1.z0.glb.clouddn.com/gbg/kaiyuan/md/gbg-kaiyuan-md-10.png)
18. android-async-http 1 ![](http://7xlcno.com1.z0.glb.clouddn.com/gbg/kaiyuan/md/gbg-kaiyuan-md-11.png)
19. material-dialogs 5 ![](http://7xlcno.com1.z0.glb.clouddn.com/gbg/kaiyuan/md/gbg-kaiyuan-md-12.png)
20. AndroidUtilCode 0
21. androidannotations 3 ![](http://7xlcno.com1.z0.glb.clouddn.com/gbg/kaiyuan/md/gbg-kaiyuan-md-13.png)
22. Material-Animations 1 ![](http://7xlcno.com1.z0.glb.clouddn.com/gbg/kaiyuan/md/gbg-kaiyuan-md-14.png)
23. fastjson 5 ![](http://7xlcno.com1.z0.glb.clouddn.com/gbg/kaiyuan/md/gbg-kaiyuan-md-15.png)
24. ViewPagerIndicator 0 
25. plaid 0 
26. PocketHub 1 ![](http://7xlcno.com1.z0.glb.clouddn.com/gbg/kaiyuan/md/gbg-kaiyuan-md-16.png)
27. tinker 4 ![](http://7xlcno.com1.z0.glb.clouddn.com/gbg/kaiyuan/md/gbg-kaiyuan-md-17.png)
28. Android-CleanArchitecture 2  ![](http://7xlcno.com1.z0.glb.clouddn.com/gbg/kaiyuan/md/gbg-kaiyuan-md-18.png) ![](http://7xlcno.com1.z0.glb.clouddn.com/gbg/kaiyuan/md/gbg-kaiyuan-md-19.png)
29. Android-PullToRefresh 0 
30. MaterialDesignLibrary 1 ![](http://7xlcno.com1.z0.glb.clouddn.com/gbg/kaiyuan/md/gbg-kaiyuan-md-20.png)

我们是筛选容器就是 30个，统计日期：2017年04月27日（随着时间推移，可能略微有变动）。使用标签的有 18个，未使用的有12个。 使用概率大约是：60%。如果筛选容器的范围再大一点可能更多，没有使用徽章的12个项目，可能由于历史原因，或者个人原因未使用，但是不管怎么说，使用徽章的人会越来越多。

### 为什么要使用徽章？
徽章 [shields](https://github.com/badges/shields)

徽章的使用不仅仅是为了装 B，而是为了让开源想更高效。进入项目主页一眼能看出需要的东西，例如该项目能否编译通过，当前最新的版本是什么等。

徽章能突出视野，github 默认给我们展示的是黑白世界，但是通过 徽章，将会得到改变。重要的信息可以一目了然。

### 最常用徽章有哪些？
一份不太靠谱的标准，不过你应该掌握:
![](http://7xlcno.com1.z0.glb.clouddn.com/gbg/kaiyuan/md/gbg-kaiyuan-md-21.png)
（PS: 上图中的图标顺序对应下面的顺序）

1. jitpack 徽章：[JitPack](https://jitpack.io) 是一个仓库，类似 maven，binary, 主要是帮我们生产 android 项目的 aar or jar 的平台。基于 GitHub，可以很方便将 library 发布到远程，然后可以用 gradle 依赖到任何一个项目中。
2. travis-ci 徽章：[Travis-CI](https://travis-ci.org) 是一个线托管的CI服务，不需要自己搭服务器，在网页上点几下就好，用起来更方便。最重要的是，它对开源项目是免费的。
3. circle-ci 徽章：[Cricle-CI](https://circleci.com/) 是也一个线托管的CI服务，和上面相同，不过这个相对来说比较好用一些，可以 SSH 到测试容器，方便在出问题的时候上去调试找原因，界面相对好看一些。
4. codecov 徽章：[Codecov](https://codecov.io) 是开源的测试结果展示平台，将测试结果可视化。Github上许多开源项目都使用了Codecov来展示单测结果。
5. api level 徽章：[Api-Leavel](https://android-arsenal.com/api) 是 android-arsenal 网站提供的 android api 展示的徽章。可以在项目主页中直接使用 badge 的内容。 
6. codacy 徽章：编程代码自动审查服务平台。帮助开发者及时发现代码中的 bug，提升软件运行质量，主要包括代码质量、语法规范、功能可用性方面的检查。
7. 个人专属 徽章：[shiedls](https://shields.io/) 根据自己的需求可以定制很多样式的徽章，全凭个人 爱好，怎么开心怎么玩。

### 环境说明
这里我用一个简单的 android 项目来做一个说明，其他语言也是可以的，这里仅仅展示一个实例。

我的本机的android环境说明如下：
- Mac
- Android Studio 2.4 preview 4
- gradle: 3.4.1
- java: 1.8.0\_73
- buildToolsVersion: 25.0.2
- compileSdkVersion: 25
- minSdkVersion: 14
- support: appcompat-v7:25.1.0
- constraint: constraint-layout:1.0.0-beta4
- classpath: com.android.tools.build:gradle:2.4.0-alpha4

用其他版本或者环境也是可以的, 这里只是说明。 如果任何遇到问题，可以在我的博客里面留言，联系详情为：[http://www.gdky005.com/about/](http://www.gdky005.com/about/) 因为该文的完整版真的很长，涉及到很多的技术，所以专门设立了 QQ群：621094999， 有疑问或非常感兴趣的同学，可以来次探讨，也许一些新功能就是你们发觉的呢。 （PS：本应该在文末尾添加联系方式的，但是无奈，很多网站都有爬虫系统，好不容易写的文章就被爬走了，导致很多小伙伴遇到问题后，各种留言，但是我就是看不到，所以这次采取特殊方式，见谅哈）



### JitPack 的使用 

官网： [https://jitpack.io](https://jitpack.io)

##### 创建 Android Library
1. 在 AS 中创建标准的 android 项目：![](http://7xlcno.com1.z0.glb.clouddn.com/gbg/kaiyuan/md/gbg-kaiyuan-md-22.png)
2. 创建 Library：![](http://7xlcno.com1.z0.glb.clouddn.com/gbg/kaiyuan/md/gbg-kaiyuan-md-23.png) ![](http://7xlcno.com1.z0.glb.clouddn.com/gbg/kaiyuan/md/gbg-kaiyuan-md-24.png) ![](http://7xlcno.com1.z0.glb.clouddn.com/gbg/kaiyuan/md/gbg-kaiyuan-md-25.png)
3. 创建 badge library 成功。
##### 配置相关文件
进入 [jitpack android](https://jitpack.io/docs/ANDROID/) 可以看到 jitpack 为我们提供的文档帮助。  ![](http://7xlcno.com1.z0.glb.clouddn.com/gbg/kaiyuan/md/gbg-kaiyuan-md-26.png)
1. 在项目的根目录下的 build.gradle 文件中添加：![](http://7xlcno.com1.z0.glb.clouddn.com/gbg/kaiyuan/md/gbg-kaiyuan-md-27.png)
2. 在 library 下的 build.gradle 中添加：![](http://7xlcno.com1.z0.glb.clouddn.com/gbg/kaiyuan/md/gbg-kaiyuan-md-28.png) ， 对应官网中说的 『group='com.github.YourUsername’』， 其实可以不写，写不写都会自动生成。 即使你写成了别的，最终还是以这样的格式输出。

AndroidBadge 中 的 build.gradle :

	classpath 'com.github.dcendents:android-maven-gradle-plugin:1.5' // Add this line

AndroidBadge 里面的 badge (library) :

	apply plugin: 'com.github.dcendents.android-maven'

##### 发布到 Github （这里直接展示 AS 中的界面图形操作，会命令行的同学随意）

1. 登录自己的 github 账号，然后创建一个 项目，在首页右边能看到：![](http://7xlcno.com1.z0.glb.clouddn.com/gbg/kaiyuan/md/gbg-kaiyuan-md-29.png)
2. 点击 大绿色 按钮，并填写信息：![](http://7xlcno.com1.z0.glb.clouddn.com/gbg/kaiyuan/md/gbg-kaiyuan-md-30.png)。 那个协议，你们随意，这里只是演示。
3. 创建成功后：![](http://7xlcno.com1.z0.glb.clouddn.com/gbg/kaiyuan/md/gbg-kaiyuan-md-31.png)，拷贝当前项目地址。
4. 在 AS 的项目中创建 git 仓库：![](http://7xlcno.com1.z0.glb.clouddn.com/gbg/kaiyuan/md/gbg-kaiyuan-md-32.png)， 点击后会让选择，直接 选择 ok 就行。将项目添加到 git 管理![](http://7xlcno.com1.z0.glb.clouddn.com/gbg/kaiyuan/md/gbg-kaiyuan-md-33.png)。 项目中的文件都变成绿色后：![](http://7xlcno.com1.z0.glb.clouddn.com/gbg/kaiyuan/md/gbg-kaiyuan-md-34.png)，耐心等待完成后， 本地项目已经被 git 管理起来了，然后把代码提交到 github 即可。可能会有冲突，自行解决即可。
5. 现在我们给 library 的 badge 项目添加一个工具类：![](http://7xlcno.com1.z0.glb.clouddn.com/gbg/kaiyuan/md/gbg-kaiyuan-md-35.png)， 并提交到 github。

##### Github 打 release or tag
![](http://7xlcno.com1.z0.glb.clouddn.com/gbg/kaiyuan/md/gbg-kaiyuan-md-36.png) ![](http://7xlcno.com1.z0.glb.clouddn.com/gbg/kaiyuan/md/gbg-kaiyuan-md-37.png)
创建第一个 release 分支：![](http://7xlcno.com1.z0.glb.clouddn.com/gbg/kaiyuan/md/gbg-kaiyuan-md-38.png)
发布成功以后就能看到: ![](http://7xlcno.com1.z0.glb.clouddn.com/gbg/kaiyuan/md/gbg-kaiyuan-md-39.png)

一般用 release 就可以了， 在适当的时候 用  tag。
##### 在 JitPack 上生成 aar
1. 进入 [https://jitpack.io/](https://jitpack.io/)。
2. 将 github 的项目地址： [https://github.com/gdky005/AndroidBadge](https://github.com/gdky005/AndroidBadge)， 直接拷贝 到 jitpack 网页中的文本框中。![](http://7xlcno.com1.z0.glb.clouddn.com/gbg/kaiyuan/md/gbg-kaiyuan-md-40.png)
3. 点击 Look Up 后：![](http://7xlcno.com1.z0.glb.clouddn.com/gbg/kaiyuan/md/gbg-kaiyuan-md-41.png)， 等里面的那个圈圈 转完 以后，出现 绿色的这个：![](http://7xlcno.com1.z0.glb.clouddn.com/gbg/kaiyuan/md/gbg-kaiyuan-md-42.png) 说明已经发布 aar 成功，那么我们 可以直接使用了。 如果点开这个东西，会看到编译的和发布的过程。![](http://7xlcno.com1.z0.glb.clouddn.com/gbg/kaiyuan/md/gbg-kaiyuan-md-43.png) 
4. 如果是红色的，说明有错误，点开查看，修改后重新构建。

##### 在 app Demo 中测试是否生效

点击 get 后，能看到： ![](http://7xlcno.com1.z0.glb.clouddn.com/gbg/kaiyuan/md/gbg-kaiyuan-md-44.png)

1. 给项目根目录下的 build.gradle 添加：![](http://7xlcno.com1.z0.glb.clouddn.com/gbg/kaiyuan/md/gbg-kaiyuan-md-45.png)
2. 给app 项目里面的 build.gradle 添加：![](http://7xlcno.com1.z0.glb.clouddn.com/gbg/kaiyuan/md/gbg-kaiyuan-md-46.png)

AndroidBadge 中 的 build.gradle :

	maven { url 'https://jitpack.io' }


AndroidBadge 里面的 app 的 build.gradle :

	compile 'com.github.gdky005:AndroidBadge:v1.0.0'



好的，现在我们已经添加成功了，在 MainActivity 里面是是吧，看能否调到之前在 library 里面的写的 Utils.getVersion()。很高兴的是我们调出来了：![](http://7xlcno.com1.z0.glb.clouddn.com/gbg/kaiyuan/md/gbg-kaiyuan-md-47.png)
在项目的最底下也能看到： ![](http://7xlcno.com1.z0.glb.clouddn.com/gbg/kaiyuan/md/gbg-kaiyuan-md-48.png)。 运行 app 项目：![](http://7xlcno.com1.z0.glb.clouddn.com/gbg/kaiyuan/md/gbg-kaiyuan-md-49.png)


##### 问题来了，我们修改library 后也能调用到吗？
让咱们一起试试吧：
1. 修改 badge 项目中的 1.0.0 为  1.0.1 ： ![](http://7xlcno.com1.z0.glb.clouddn.com/gbg/kaiyuan/md/gbg-kaiyuan-md-50.png)。
2. 提交代码后，push 到 github。 提交成功以后，我们重复上面的打 release 步骤 ![](http://7xlcno.com1.z0.glb.clouddn.com/gbg/kaiyuan/md/gbg-kaiyuan-md-51.png), ![](http://7xlcno.com1.z0.glb.clouddn.com/gbg/kaiyuan/md/gbg-kaiyuan-md-52.png), ![](http://7xlcno.com1.z0.glb.clouddn.com/gbg/kaiyuan/md/gbg-kaiyuan-md-53.png)
3. 然后再去 jitpack 上看看：![](http://7xlcno.com1.z0.glb.clouddn.com/gbg/kaiyuan/md/gbg-kaiyuan-md-54.png) 多了一个 v1.0.1, 点击 get 吧。![](http://7xlcno.com1.z0.glb.clouddn.com/gbg/kaiyuan/md/gbg-kaiyuan-md-55.png) ![](http://7xlcno.com1.z0.glb.clouddn.com/gbg/kaiyuan/md/gbg-kaiyuan-md-56.png) ![](http://7xlcno.com1.z0.glb.clouddn.com/gbg/kaiyuan/md/gbg-kaiyuan-md-57.png)
4. 发布成功后，我们去 app 里面试试。 ![](http://7xlcno.com1.z0.glb.clouddn.com/gbg/kaiyuan/md/gbg-kaiyuan-md-58.png)
5. 同步后，直接运行 app。非常好，我们的修改的东西已经变了：![](http://7xlcno.com1.z0.glb.clouddn.com/gbg/kaiyuan/md/gbg-kaiyuan-md-59.png)。

至此， jitpack 基本也差不多了，但是貌似缺少了最重要的一点吧。

##### jitpack 的徽章怎么弄

还是在刚刚的 jitpack 界面，只是我们把 页面拉倒底部。![](http://7xlcno.com1.z0.glb.clouddn.com/gbg/kaiyuan/md/gbg-kaiyuan-md-60.png) 点击后：![](http://7xlcno.com1.z0.glb.clouddn.com/gbg/kaiyuan/md/gbg-kaiyuan-md-61.png) 是不是看到了熟悉的 md 文档的格式呢？ 看不懂也没关系，下面会专门讲解。
1. 拷贝内容：![](http://7xlcno.com1.z0.glb.clouddn.com/gbg/kaiyuan/md/gbg-kaiyuan-md-62.png)
2. 打开 github 的 AndroidBridge 项目：![](http://7xlcno.com1.z0.glb.clouddn.com/gbg/kaiyuan/md/gbg-kaiyuan-md-63.png)，点击该文件。
3. 让我们在线编辑下： ![](http://7xlcno.com1.z0.glb.clouddn.com/gbg/kaiyuan/md/gbg-kaiyuan-md-64.png)
4. 给 github 中的 这个 readme.md 文件添加点东西吧。![](http://7xlcno.com1.z0.glb.clouddn.com/gbg/kaiyuan/md/gbg-kaiyuan-md-65.png)
5. 让我们 保存下。 ![](http://7xlcno.com1.z0.glb.clouddn.com/gbg/kaiyuan/md/gbg-kaiyuan-md-66.png)
6. 然后回到项目[首页](https://github.com/gdky005/AndroidBadge)看看：![](http://7xlcno.com1.z0.glb.clouddn.com/gbg/kaiyuan/md/gbg-kaiyuan-md-67.png) 棒棒的，添加成功。


### Travis CI 的使用

官网： [http://travis-ci.org/](http://travis-ci.org/)
ps: 这个是公开的，如果需要使用私有的，请使用 .com 域名。
需要提醒的是：每次提交代码后都会重新下载需要的资源文件哦，所以时间很长，耐心等待吧。

##### TravisCI 有什么用？
travis-ci 就是 自动化 CI 工具，类似于大公司经常使用的 Jenkins，但是 travis-ci 是在云端的，而是支持 github, 还免费，我们可以 用 travis-ci 做很多的事情，不仅仅是 编译看 项目有没有问题。例如在项目构建结束以后，我们可以打包，并发布 apk 到都 蒲公英， fir，也可以用邮件通知给相关的开发人员和业务任务。 做一些简单处理，轻轻松松。这部分内容到后面尽快整理，在写一篇。

##### 添加 github 项目到 travis-ci
1. 进入 Travis 官网后，使用 GitHub 账号 登录，成功后：![](http://7xlcno.com1.z0.glb.clouddn.com/gbg/kaiyuan/md/gbg-kaiyuan-md-68.png)。
2. 点击 加号 ，能看到你 GitHub 里面的所有：![](http://7xlcno.com1.z0.glb.clouddn.com/gbg/kaiyuan/md/gbg-kaiyuan-md-69.png)， 如果没有项目或者没有你新建的项目，请点击右上方的   Sync account  按钮。
3. 点击这里：![](http://7xlcno.com1.z0.glb.clouddn.com/gbg/kaiyuan/md/gbg-kaiyuan-md-70.png)，开启 Travis 构建。点击这个可以配置该项目：![](http://7xlcno.com1.z0.glb.clouddn.com/gbg/kaiyuan/md/gbg-kaiyuan-md-71.png)
4. 默认是空的：![](http://7xlcno.com1.z0.glb.clouddn.com/gbg/kaiyuan/md/gbg-kaiyuan-md-72.png)

##### 在 项目中添加 travis-ci 需要的 .travis.yml 文件
1. 在项目根目录下直接创建 一个 .travis.yml 的文件。![](http://7xlcno.com1.z0.glb.clouddn.com/gbg/kaiyuan/md/gbg-kaiyuan-md-73.png)
2. 直接在文件里面添加代码：![](http://7xlcno.com1.z0.glb.clouddn.com/gbg/kaiyuan/md/gbg-kaiyuan-md-74.png)

**.travis.yml 文件 源代码**

	language: android
	jdk: oraclejdk8
	sudo: false
	
	android:
	  components:
	    - tools
	    - build-tools-25.0.2
	    - android-25
	    - extra-android-m2repository
	    - extra-android-support
	  licenses:
	      - android-sdk-license-.+
	      - '.+'
	
	before_install:
	  - chmod +x gradlew
	  - mkdir "$ANDROID_HOME/licenses" || true
	  - echo -e "\n8933bad161af4178b1185d1a37fbf41ea5269c55" > "$ANDROID_HOME/licenses/android-sdk-license"
	  - echo -e "\n84831b9409646a918e30573bab4c9c91346d8abd" > "$ANDROID_HOME/licenses/android-sdk-preview-license"
	
	script:
	  - ./gradlew assembleRelease
	

因为该文很长很长，所以暂时就不解释具体含义了，可以看看官方文档。

##### push 项目到 github, travis-ci 自动监测构建
1. 提交到代码，并 push 到 github。会自动触发 Travis 的自动构建。![](http://7xlcno.com1.z0.glb.clouddn.com/gbg/kaiyuan/md/gbg-kaiyuan-md-75.png)
2. 下面黑色部分是构建的过程：![](http://7xlcno.com1.z0.glb.clouddn.com/gbg/kaiyuan/md/gbg-kaiyuan-md-76.png)，  黑框上的白色点点点击后会变成绿色，会自动滚动到最下面。![](http://7xlcno.com1.z0.glb.clouddn.com/gbg/kaiyuan/md/gbg-kaiyuan-md-77.png)

喝一杯咖啡，慢慢等待吧，最难熬的时候已经过去，此刻是享受的时候了。![](http://7xlcno.com1.z0.glb.clouddn.com/gbg/kaiyuan/md/gbg-kaiyuan-md-78.png)

回到首页刷新后，能看到：![](http://7xlcno.com1.z0.glb.clouddn.com/gbg/kaiyuan/md/gbg-kaiyuan-md-79.png) 说明我们已经构建成功了。

##### .travis.yml 需要注意的地方

初次使用  Travis 的试试，总遇到 说 android 的一些协议未接受而构建失败，导致耗费了一两天，曾经一度想放弃，但是最终坚持了下来，通过各种搜索，摸索，猜测，终于搞定。其实最初的项目是这个：[https://github.com/gdky005/TestJitpack](https://github.com/gdky005/TestJitpack) ，里面有很多辛酸史记录，从提交记录能看得出来，有兴趣的可以研究研究，也许能解决你现在的问题。

Travis CI 协议问题解决方法：[http://stackoverflow.com/questions/37615379/travis-ci-build-doesnt-work-with-android-constraint-layout](http://stackoverflow.com/questions/37615379/travis-ci-build-doesnt-work-with-android-constraint-layout)

最重要部分在这里：

	machine:
	  environment:
		  ANDROID_HOME: /usr/local/android-sdk-linux
	
	dependencies:
	  pre:
		- mkdir -p "$ANDROID_HOME/licenses"
		- echo -e "\n8933bad161af4178b1185d1a37fbf41ea5269c55" > "$ANDROID_HOME/licenses/android-sdk-license"
		- echo -e "\n84831b9409646a918e30573bab4c9c91346d8abd" > "$ANDROID_HOME/licenses/android-sdk-preview-license"


##### 添加 travis-ci 徽章到 github
激动的时刻再次到来，让我们找找徽章在哪里呢？
![](http://7xlcno.com1.z0.glb.clouddn.com/gbg/kaiyuan/md/gbg-kaiyuan-md-80.png)

让我们来选择 markdonw 格式：![](http://7xlcno.com1.z0.glb.clouddn.com/gbg/kaiyuan/md/gbg-kaiyuan-md-81.png) 并复制上。

同样如上修改 readme.md。 ![](http://7xlcno.com1.z0.glb.clouddn.com/gbg/kaiyuan/md/gbg-kaiyuan-md-82.png)

加空格后，直接贴上去：![](http://7xlcno.com1.z0.glb.clouddn.com/gbg/kaiyuan/md/gbg-kaiyuan-md-83.png)，这里需要说明的是，如果换成，图标也会换行哦。这样写就能保证所有的图标在一行了。

回到项目首页以后就能发现：![](http://7xlcno.com1.z0.glb.clouddn.com/gbg/kaiyuan/md/gbg-kaiyuan-md-84.png)

添加 Travis 徽章成功。


Bye the way! 上面是最初级的构建过程，如果遇到单元测试就不行了，还得参考 我的开源项目 [TestJitpack](https://github.com/gdky005/TestJitpack)。 不过有点乱，后面整理下。


### Circle CI 的使用

 官网: [https://circleci.com/](https://circleci.com/)

##### Circle CI 和 Travis CI 有什么区别？需要一起使用吗？
Circle CI 相对来说比 Travis CI 好一些，至少界面上来说哈。还提供 ssh 的连接，构建过程相对来说 比较透明直观。例如：![](http://7xlcno.com1.z0.glb.clouddn.com/gbg/kaiyuan/md/gbg-kaiyuan-md-85.png)

Travis CI 的文档资料相对 Circle CI 来说 比较多， Circle CI 资料少之又少。

Travis CI 的使用率还是很高的， 不过 Circle CI 相对来说比较 年轻化，符合主流的科技感，更智能。

说到是否需要一起使用，其实都行，不过我在观察 github 主流项目的时候 有不少项目都是同时使用的，多一个技能总没有坏处吧。其实会了 Travis CI，在加 Circle CI 真是简单不少呢，只是基本语法不太一样。

##### 添加项目到 Circle CI
1. 登录主页面：![](http://7xlcno.com1.z0.glb.clouddn.com/gbg/kaiyuan/md/gbg-kaiyuan-md-86.png)， 在 project 里面自己的账号下搜索刚创建的项目。
2. 一般直接选择 Ubuntu 即可:![](http://7xlcno.com1.z0.glb.clouddn.com/gbg/kaiyuan/md/gbg-kaiyuan-md-87.png),点击绿色  Build project.![](http://7xlcno.com1.z0.glb.clouddn.com/gbg/kaiyuan/md/gbg-kaiyuan-md-88.png)
3. 能看到：![](http://7xlcno.com1.z0.glb.clouddn.com/gbg/kaiyuan/md/gbg-kaiyuan-md-89.png)， 但是这次肯定会失败，因为我们还没有添加 Circle 需要的文件呢。

##### 在 项目中添加 Circle CI 需要的 circle.yml 文件

1. 在项目的根目录下 添加 circle.yml 文件；
2. 添加 circle 的代码到文件中：![](http://7xlcno.com1.z0.glb.clouddn.com/gbg/kaiyuan/md/gbg-kaiyuan-md-90.png)

**circle.yml 源代码：**

	machine:
	  java:
	      version: oraclejdk8
	  environment:
	      ANDROID_HOME: /usr/local/android-sdk-linux
	
	dependencies:
	  pre:
	    - mkdir -p "$ANDROID_HOME/licenses"
	    - echo -e "\n8933bad161af4178b1185d1a37fbf41ea5269c55" > "$ANDROID_HOME/licenses/android-sdk-license"
	    - echo -e "\n84831b9409646a918e30573bab4c9c91346d8abd" > "$ANDROID_HOME/licenses/android-sdk-preview-license"
	
	
	  override:
	    - echo y | android update sdk --no-ui --filter "android-25"
	    - echo y | android update sdk --no-ui --filter "build-tools-25.0.2"
	    - echo y | android update sdk --no-ui --filter "extra-android-m2repository"
	    - echo y | android update sdk --no-ui --filter "extra-android-support"
	    - echo y | android update sdk --no-ui --filter "extra-google-m2repositor"
	    - ./gradlew dependencies || true
	
	test:
	  override:
	    - ./gradlew build

##### push 项目到 github, Circle CI 自动监测构建

1. 提交代码后，发布到 github，Circle CI 会自动执行。
2. ![](http://7xlcno.com1.z0.glb.clouddn.com/gbg/kaiyuan/md/gbg-kaiyuan-md-91.png) 点击进来后，会看到：![](http://7xlcno.com1.z0.glb.clouddn.com/gbg/kaiyuan/md/gbg-kaiyuan-md-92.png)， 说明已经开始 构建了， 下载需要的东西：![](http://7xlcno.com1.z0.glb.clouddn.com/gbg/kaiyuan/md/gbg-kaiyuan-md-93.png)。
3. 构建中的一些步骤：![](http://7xlcno.com1.z0.glb.clouddn.com/gbg/kaiyuan/md/gbg-kaiyuan-md-94.png)， 相对 Travis 来说展示更直观。
4. 看到 ![](http://7xlcno.com1.z0.glb.clouddn.com/gbg/kaiyuan/md/gbg-kaiyuan-md-95.png) 说明构建成功。

##### 添加 Circle CI 徽章到 github
我们再来把 Circle CI 的徽章找到，并添加到我们的 github 上去吧。![](http://7xlcno.com1.z0.glb.clouddn.com/gbg/kaiyuan/md/gbg-kaiyuan-md-96.png)![](http://7xlcno.com1.z0.glb.clouddn.com/gbg/kaiyuan/md/gbg-kaiyuan-md-97.png)

我们把 徽章的 markdown 链接拷贝下来放入到我们的 主项目页面的里面。![](http://7xlcno.com1.z0.glb.clouddn.com/gbg/kaiyuan/md/gbg-kaiyuan-md-98.png)

回项目主页刷新后：![](http://7xlcno.com1.z0.glb.clouddn.com/gbg/kaiyuan/md/gbg-kaiyuan-md-99.png) 非常 happy, 已经添加成功了。


### 接下来添加什么呢？
Github上许多开源项目都使用了Codecov来展示单元测试结果， 就它了。

### Codecov 的使用

根据文中的指示：我们能看到一个开源的 github 项目 [https://github.com/codecov/example-android](https://github.com/codecov/example-android)， 不过看起来点晕晕的，但是还是看下了。

我们之后都直接使用 Trivas CI 构建了。

添加项目就不说了，进入后，点击 project changes, 找到自己的项目：![](http://7xlcno.com1.z0.glb.clouddn.com/gbg/kaiyuan/md/gbg-kaiyuan-md-100.png)，等生产报告后，进入该网站就能看见结果。

##### 利用 Jacoco 生成报告

Codecov不支持自己生成Android的测试覆盖率报告，它能做的是接收Jacoco生成的报告并进行可视化

1） 在 app 的 build.gradle 文件中 添加依赖

			//Jacoco 生成报告的依赖
	    androidTestCompile('com.android.support.test:runner:0.5', {
	        exclude group: 'com.android.support', module: 'support-annotations'
	    })
	    // Set this dependency to use JUnit 4 rules
	    androidTestCompile('com.android.support.test:rules:0.5', {
	        exclude group: 'com.android.support', module: 'support-annotations'
	    })
	    // Espresso-contrib for DatePicker, RecyclerView, Drawer actions, Accessibility checks, CountingIdlingResource
	    androidTestCompile('com.android.support.test.espresso:espresso-contrib:2.2.2', {
	        exclude group: 'com.android.support', module: 'support-annotations'
	        exclude group: 'com.android.support', module: 'support-v4'
	        exclude group: 'com.android.support', module: 'appcompat-v7'
	        exclude group: 'com.android.support', module: 'design'
	        exclude group: 'com.android.support', module: 'recyclerview-v7'
	    })
	    androidTestCompile('com.android.support.test.espresso:espresso-core:2.2.2', {
	        exclude group: 'com.android.support', module: 'support-annotations'
	    })

2) 在 需要构建测试覆盖率报告的Module  （AndroidBadge 项目中的 app）  的gradle文件中设置。 ![](http://7xlcno.com1.z0.glb.clouddn.com/gbg/kaiyuan/md/gbg-kaiyuan-md-101.png)

	debug{
	        testCoverageEnabled true
	}

3) 可以在尝试在本地生成报告：

	./gradlew :app:createDebugAndroidTestCoverageReport 生成测试报告。  app 就是咱们项目中要测试的 module

测试报告地址：app/build/reports/coverage/debug/index.html。 

##### 上报数据给 Codecov
1. 使用Github账号登录 https://codecov.io/， 并提供授权给该应用。
2. 在.travis.yml文件中添加命令将测试覆盖率报告上传给Codecov。

	after_success:
	    - bash <(curl -s https://codecov.io/bash)
	

![](http://7xlcno.com1.z0.glb.clouddn.com/gbg/kaiyuan/md/gbg-kaiyuan-md-102.png)



##### Codecov 需要用到 单元测试，所以必须要在 配置文件中添加模拟器
因为之前修改过很多次，过程很繁琐，直接给配置文件了，相信大家一眼就能看出来。

完整的配置文件是：

	language: android
	jdk: oraclejdk8
	sudo: false
	
	env:
	  global:
	      - ANDROID_API_LEVEL=25
	      - ANDROID_BUILD_TOOLS_VERSION=25.0.2
	      - ANDROID_ABI=armeabi-v7a
	      - ANDROID_TAG=google_apis
	      - ADB_INSTALL_TIMEOUT=20 # minutes (2 minutes by default)
	
	android:
	  components:
	    - platform-tools
	    - tools # to install Android SDK tools 25.1.x
	    - build-tools-$ANDROID_BUILD_TOOLS_VERSION
	    - android-$ANDROID_API_LEVEL
	    - sys-img-armeabi-v7a-google_apis-$ANDROID_API_LEVEL
	
	  licenses:
	      - android-sdk-license-.+
	      - '.+'
	
	before_install:
	  - chmod +x gradlew
	  - mkdir "$ANDROID_HOME/licenses" || true
	  - echo -e "\n8933bad161af4178b1185d1a37fbf41ea5269c55" > "$ANDROID_HOME/licenses/android-sdk-license"
	  - echo -e "\n84831b9409646a918e30573bab4c9c91346d8abd" > "$ANDROID_HOME/licenses/android-sdk-preview-license"
	
	before_script:
	  # Create and start emulator
	  - echo no | android create avd --force -n test -t "android-"$ANDROID_API_LEVEL --abi $ANDROID_ABI --tag $ANDROID_TAG
	  - emulator -avd test -no-skin -no-window &
	  - android-wait-for-emulator
	  - adb shell input keyevent 82 &
	
	script:
	  - ./gradlew assembleRelease
	  - ./gradlew :app:createDebugAndroidTestCoverageReport --info --stacktrace
	
	after_success:
	  - bash <(curl -s https://codecov.io/bash)


##### codecov 总结

Travis-CI 对 android 的单元测试支持不是很好，因为需要开启虚拟机，开启这个过程就得10分钟（我的测试时间），很耗费时间。有时候也连接不上，一次跑下来估计得个 20分钟左右吧。所以，稳定性确实不是很高。如果不做单元测试，而只是做发布之类的，稳定性还是高的。 

单元测试应都会吧， 这里检测的标准就是说 每个类和方法都必须检测到，否则就算没有覆盖。我这里也就简单在项目中写过例子，剩下的你们自己玩吧。 ![](http://7xlcno.com1.z0.glb.clouddn.com/gbg/kaiyuan/md/gbg-kaiyuan-md-103.png)

**所以 要不要使用单元测试 还是根据项目决定吧。 **


##### 获取 codecov 的徽章

![](http://7xlcno.com1.z0.glb.clouddn.com/gbg/kaiyuan/md/gbg-kaiyuan-md-104.png)

### Api\_Level 的使用
让 codecov 慢慢构建吧，我们先继续。

官网：[https://android-arsenal.com/api](https://android-arsenal.com/api)

##### Api\_Level 有什么用？
Api\_Level 是 arsenal 网站给各位开发者的一个福利，我们的 android 开源项目一般都有一个最低的构建版本。平时我们都是在 md 文件中写上 支持版本是 14+等很多样式，但是 不够醒目，有了 Api\_Level 后，打开开源项目主页就知道，最低版本是多少。 不用看文档也能明白，轻松不少。 对应的 api 的一些特性和修改也能在这里展现。
##### Api\_Level 怎么玩？
如果你的开源项目最低支持版本是：14，那么就选择这里：![](http://7xlcno.com1.z0.glb.clouddn.com/gbg/kaiyuan/md/gbg-kaiyuan-md-105.png) ![](http://7xlcno.com1.z0.glb.clouddn.com/gbg/kaiyuan/md/gbg-kaiyuan-md-106.png)

把这个拷贝下来，放入我们的 md 文档中吧。 ![](http://7xlcno.com1.z0.glb.clouddn.com/gbg/kaiyuan/md/gbg-kaiyuan-md-107.png)


### codacy 的使用

官网： [https://www.codacy.com](https://www.codacy.com)

##### codacy 是什么？
codacy 编程代码自动审查服务平台，可以帮我们分析存在的问题 或者说是 bug,主要包括代码质量、语法规范、功能可用性方面的检查。

##### codacy 怎么使用？

进入官网，添加自己的需要的 project。![](http://7xlcno.com1.z0.glb.clouddn.com/gbg/kaiyuan/md/gbg-kaiyuan-md-108.png)

完成后，等待一段时间就好了，会给你发邮件通知，已经完成。

完成后的效果是：![](http://7xlcno.com1.z0.glb.clouddn.com/gbg/kaiyuan/md/gbg-kaiyuan-md-109.png)，咱们的这个项目评级是 B。

##### codacy 徽章呢？

![](http://7xlcno.com1.z0.glb.clouddn.com/gbg/kaiyuan/md/gbg-kaiyuan-md-110.png)

拷贝下来，手动放到 咱们的项目的 md 文档中把。比较放心一些，如果点击后面的 add badge ,会自动加到项目中，需要我们 pull request 里面处理下。

搞定。

### 生成个性徽章
官网： [https://shields.io/](https://shields.io/)

##### 有什么用？
彰显个人魅力，体现某种功能。例如咱们做一个跳转到我的博客的 个人徽章。
##### 怎么玩？
滚动网页到最下面：![](http://7xlcno.com1.z0.glb.clouddn.com/gbg/kaiyuan/md/gbg-kaiyuan-md-111.png)

在对应的地方填写相应的东西（也支持中文哦）， 完成后点击后面的 Make Badge 按钮试试看。

我想我的个人图标是这种浅蓝色： ![](http://7xlcno.com1.z0.glb.clouddn.com/gbg/kaiyuan/md/gbg-kaiyuan-md-112.png) ，那么我就在 color 中直接写：7AD6FD

![](http://7xlcno.com1.z0.glb.clouddn.com/gbg/kaiyuan/md/gbg-kaiyuan-md-113.png) 点击生成 一个地址， 先保存下面。



##### 这个原理是什么呢？ （回答最开始的问题）
徽章的格式即是 markdown 的格式: 

	[![A\](B)\](D)

A 表示的页面中需要显示的内容， B 表示的是图片的地址，D 表示的是点击后需要跳转的链接的地址。

##### 合成我的个人专属图标吧
图片地址是上面存下来的。 前面显示内容：作者。按照上面的规范出来的结果就是：

	[![作者\](https:\//img.shields.io\/badge\/%E4%BD%9C%E8%80%85-gdky005-7AD6FD.svg)\](http:\//www.gdky005.com)


把这段代码 粘贴到 我们的 md 文档中，个性专属徽章就出来了，而且点击后能到我们想去的地方。

![](http://7xlcno.com1.z0.glb.clouddn.com/gbg/kaiyuan/md/gbg-kaiyuan-md-114.png)

很酷吧，其实还可以做很多这样的事情。



本文的 中的 项目地址是： [https://github.com/gdky005/AndroidBadge](https://github.com/gdky005/AndroidBadge)
需要逐步了解项目的过程或者 根据步骤出现问题的话，可以check 对应的节点，看看代码是否不同，然后自行修改，我特意保存了该进度。如果下图中 git提交的记录：![](http://7xlcno.com1.z0.glb.clouddn.com/gbg/kaiyuan/md/gbg-kaiyuan-md-115.png)  ![](http://7xlcno.com1.z0.glb.clouddn.com/gbg/kaiyuan/md/gbg-kaiyuan-md-116.png) 

相信小伙伴们肯定能做出更有意思的东西，到时候记得与我和大家分享，比较有特色的，我会将你们的链接挂载到 github 项目里面。

因为该文真的很长，涉及到很多的技术，所以专门设立了 QQ群：621094999， 有需要帮助或许分享新技能的小伙伴请进入。


本文完整地址请在 [我的博客](http://www.gdky005.com/) 里面查看，会修复 文章存在的问题，并补充一些相关细节。针对 小伙伴们提出的问题，将在博客中修改和增加。如果大家觉得不错，并且很喜欢的话，麻烦 GitHub 中 start 下，不胜感激。

### 最后真想说一句
咱们不玩虚的，玩点有技术含量的东西。
















