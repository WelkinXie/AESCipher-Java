# AESCipher-Java

### 用 Java 实现的 AES 加密。

与 [AESCipher-iOS](https://github.com/WelkinXie/AESCipher-iOS) 一并使用能达到 在iOS、Android、Java后台产生相同密文、正确解密成明文的目的。

加密方法：

```
public static String encryptAES(String content, String key);
```

解密方法：

```
public static String decryptAES(String content, String key);
```


#### 另附源码详解一份：

[AES加密 - iOS与Java的同步实现](http://www.welkinx.com/2016/07/30/10/)