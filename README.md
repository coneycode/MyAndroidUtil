#MyAndroidUtil

##MyLogger
it will show you the tags'method name,class name even the lines!

just see the picture:

![demo](http://coney.qiniudn.com/android_log_tag.png?attname=&e=1413106188&token=gJq7XMKe61C7zF73uUsV1e9QYqD3-fJSyQAAZZZr:qGXoq_1YeFwtLx5r2o4eA-GEAvY)

###Usage
1.enable/disable log  

it is allows you to run some code only in debug mode. Builds now generate a class called BuildConfig containing a DEBUGconstant that is automatically set according to your build type. You can check the (BuildConfig.DEBUG) constant in your code to run debug-only functions.

2.set the Tag for the log  
```java
MyLogger.setMyTags("myTags");  
```
if you do not set the tags, default will be the class name.

just as next picture:

![lib](http://coney.qiniudn.com/android_log_tag.png?attname=&e=1413106188&token=gJq7XMKe61C7zF73uUsV1e9QYqD3-fJSyQAAZZZr:qGXoq_1YeFwtLx5r2o4eA-GEAvY)

3.log simple  
```java
MyLogger.d("test");  
MyLogger.v("test");  
MyLogger.i("test");  
MyLogger.w("test");  
MyLogger.e("test");  
```

4.log simple -- set custom tag  
```java
MyLogger.d("TAG","test");  
MyLogger.v("TAG","test");  
MyLogger.i("TAG","test");  
MyLogger.w("TAG","test");  
MyLogger.e("TAG","test");  
```

##Introduction
your can import the lib into your project.
just as next picture:

![libiry](http://coney.qiniudn.com/android_log_libraries.png?attname=&e=1413106449&token=gJq7XMKe61C7zF73uUsV1e9QYqD3-fJSyQAAZZZr:qNn57rQP3lI5tsbbkBBLC_UUepY)
or get the codesource, into your project.
just as next picture:

![lib](http://coney.qiniudn.com/android_log_lib.png?attname=&e=1413106449&token=gJq7XMKe61C7zF73uUsV1e9QYqD3-fJSyQAAZZZr:yDsMl1c7HTQDfsTYiTpnKBwNu5U)

##License
```

The MIT License (MIT)

Copyright (c) 2014 coney <coneylife@gmail.com>

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all
copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
SOFTWARE.
```
