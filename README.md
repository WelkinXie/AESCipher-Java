# AESCipher-Java

### AES Encryption For Java

Using this code for __Android__ and __Java back-end__ and [AESCipher-iOS](https://github.com/WelkinXie/AESCipher-iOS) for __iOS__ lets you encrypt and decrypt with AES accurately.

Encryption:

```
// For String
public static String aesEncryptString(String content, String key)
// For Bytes
public static byte[] aesEncryptBytes(byte[] contentBytes, byte[] keyBytes)
```

Decryption:

```
// For String
public static String aesDecryptString(String content, String key)
// For Bytes
public static byte[] aesDecryptBytes(byte[] contentBytes, byte[] keyBytes)
```

Additionally you can modify the __IV_STRING__ with another 16 bytes string in line 23 of __AESCipher.java__ , but you should make sure to keep it the same with __kInitVector__ in line 14 of [AESCipher-iOS](https://github.com/WelkinXie/AESCipher-iOS).

---

### 用 Java 实现的 AES 加密。

与 [AESCipher-iOS](https://github.com/WelkinXie/AESCipher-iOS) 一并使用能达到 在iOS、Android、Java后台产生相同密文、正确解密成明文的目的。

加密方法：

```
// For String
public static String aesEncryptString(String content, String key)
// For Bytes
public static byte[] aesEncryptBytes(byte[] contentBytes, byte[] keyBytes)
```

解密方法：

```
// For String
public static String aesDecryptString(String content, String key)
// For Bytes
public static byte[] aesDecryptBytes(byte[] contentBytes, byte[] keyBytes)
```

另外你也可以将 __AESCipher.java__ 第 23 行中的 __IV_STRING__ 修改为其他 16 字节的字符串，但请确保其与 [AESCipher-iOS](https://github.com/WelkinXie/AESCipher-iOS) 第 14 行处的 __kInitVector__ 保持一致。

#### 另附源码详解一份：

[AES加密 - iOS与Java的同步实现](http://www.welkinx.com/2016/07/30/10/)