//
//  https://github.com/WelkinXie/AESCipher-Java
//

import java.io.UnsupportedEncodingException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;

import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;

public class Tester {

	public static void main(String[] args) throws InvalidKeyException, NoSuchAlgorithmException, NoSuchPaddingException, UnsupportedEncodingException, InvalidAlgorithmParameterException, IllegalBlockSizeException, BadPaddingException {
		String string = AESCipher.encryptAES("IAmThePlainText", "16BytesLengthKey");
		System.out.println(string);
		System.out.println(AESCipher.decryptAES(string, "16BytesLengthKey"));
	}

}
