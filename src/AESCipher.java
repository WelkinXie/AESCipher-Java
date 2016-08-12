//
//  https://github.com/WelkinXie/AESCipher-Java
//

import java.io.UnsupportedEncodingException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.Base64;
import java.util.Base64.Decoder;
import java.util.Base64.Encoder;

import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class AESCipher {

private static final String IV_STRING = "16-Bytes--String";
	
	public static String encryptAES(String content, String key) 
			throws InvalidKeyException, NoSuchAlgorithmException, 
			NoSuchPaddingException, UnsupportedEncodingException, 
			InvalidAlgorithmParameterException, IllegalBlockSizeException, BadPaddingException {

		byte[] byteContent = content.getBytes("UTF-8");

	    // 注意，为了能与 iOS 统一
	    // 这里的 key 不可以使用 KeyGenerator、SecureRandom、SecretKey 生成
		byte[] enCodeFormat = key.getBytes();
	    SecretKeySpec secretKeySpec = new SecretKeySpec(enCodeFormat, "AES");
			
	    byte[] initParam = IV_STRING.getBytes();
	    IvParameterSpec ivParameterSpec = new IvParameterSpec(initParam);
			
	    // 指定加密的算法、工作模式和填充方式
	    Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
	    cipher.init(Cipher.ENCRYPT_MODE, secretKeySpec, ivParameterSpec);
		
	    byte[] encryptedBytes = cipher.doFinal(byteContent);
		
	    // 同样对加密后数据进行 base64 编码
	    Encoder encoder = Base64.getEncoder();
	    return encoder.encodeToString(encryptedBytes);
	}

	public static String decryptAES(String content, String key) 
			throws InvalidKeyException, NoSuchAlgorithmException, 
			NoSuchPaddingException, InvalidAlgorithmParameterException, 
			IllegalBlockSizeException, BadPaddingException, UnsupportedEncodingException {
			
	    // base64 解码
	    Decoder decoder = Base64.getDecoder();
	    byte[] encryptedBytes = decoder.decode(content);
		
	    byte[] enCodeFormat = key.getBytes();
	    SecretKeySpec secretKey = new SecretKeySpec(enCodeFormat, "AES");
		
	    byte[] initParam = IV_STRING.getBytes();
	    IvParameterSpec ivParameterSpec = new IvParameterSpec(initParam);

	    Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
	    cipher.init(Cipher.DECRYPT_MODE, secretKey, ivParameterSpec);

	    byte[] result = cipher.doFinal(encryptedBytes);
		
	    return new String(result, "UTF-8");
	}
	
}
