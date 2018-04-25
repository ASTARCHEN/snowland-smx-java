package ltd.snowland.security;

import java.io.IOException;

/**
 * @author A.Star
 *
 */
public class TestSM4 {
	public static void main(String[] args) throws IOException {
		String plainText = "ererfeiisgod";

		SM4 sm4 = new SM4();
		sm4.setSecretKey("JeF8U9wHFOMfs2Y8");
		sm4.setHexString(false);

		System.out.println("ECB模式");
		String cipherText = sm4.encryptDataToString_ECB(plainText);
		System.out.println("密文: " + cipherText);
		System.out.println("");

		plainText = sm4.decryptDataToString_ECB(cipherText);
		System.out.println("明文: " + plainText);
		System.out.println("");

		System.out.println("CBC模式");
		sm4.setIv("UISwD9fW6cFh9SNS");
		cipherText = sm4.encryptDataToString_CBC(plainText);
		System.out.println("密文: " + cipherText);
		System.out.println("");

		plainText = sm4.decryptDataToString_CBC(cipherText);
		System.out.println("明文: " + plainText);
	}
}
