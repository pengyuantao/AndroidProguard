####简介
基本上Release版本的都是需要混淆的，Android也提供了相关混淆的工具，只不过需要开发者，自己去定义混淆规则而已，很多的规则都是大同小异的，而且现在项目使用的开源库也很多，这样就得去收集很多的混淆规则，为了方便这样的收集的过程，开发这样的插件 。不过，我认为将来所有的提交到jcent的开源库，需要提供混淆规则，AndroidStudio在编译开源库的时候，自动添加的开源库的规则，那样的话将大大减少开发者的工作量。
####使用
1. 下载插件[下载地址](https://raw.githubusercontent.com/pengyuantao/AndroidProguard/master/MyProguard.jar)
2. 在AndroidStudio中安装插件，选择下载的jar包，安装后，进行重启。
![image.png](http://upload-images.jianshu.io/upload_images/1460021-cedd1d8ff488478a.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240)

3. 安装后可以在主菜单栏中找到Proguard的选项（Alt+D拷贝混淆规则或者直接点击）

![image.png](http://upload-images.jianshu.io/upload_images/1460021-0ee5c1654f7d4e7d.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240)

####拓展
目前使用的是比较普遍的项目库的混淆，当然如果你自己有很多自己的框架，那么基本上你们自己公司使用的都是一套混淆规则，这个时候，你可以自己定义混淆规则的来源。

![image.png](http://upload-images.jianshu.io/upload_images/1460021-516c8fa1f867528e.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240)

####开源
[AndroidProguard]( https://github.com/pengyuantao/AndroidProguard)
感觉不错的兄弟，来一波start！


![录像9.gif](http://upload-images.jianshu.io/upload_images/1460021-d91a5af669f96f1b.gif?imageMogr2/auto-orient/strip)
