package ltd.snowland.security;

import java.io.IOException;
import java.util.Calendar;

import org.bouncycastle.util.encoders.Base64Encoder;

import ltd.snowland.utils.NumberTool;

/**
 * @author A.Star
 *
 */
public class TestSM4 {
	public static void main(String[] args) throws IOException {
		String plainText = "1";
		StringBuffer sb = new StringBuffer();
		for (int i=0; i< 128; i++) {
			sb.append(plainText);
		}
		plainText = sb.toString();
		String cipherText = null;
		long start = System.nanoTime();
		SM4 sm4 = new SM4();
		sm4.setSecretKey("JeF8U9wHFOMfs2Y8");
		sm4.setHexString(false);
		
		System.out.println("ECB模式");
		byte[] cip = sm4.encryptData_ECB(plainText.getBytes());
//		cipherText = sm4.encryptDataToString_ECB(plainText);
		cipherText = NumberTool.encodeHexString(cip);
		System.out.println("密文: " + cipherText);
		System.out.println("");

//		plainText = sm4.decryptDataToString_ECB(cipherText);
		cip = sm4.decryptData_ECB(cip);
		System.out.println("明文: " + (new String(cip)));
		System.out.println("");
		long end = System.nanoTime();
		System.out.println("time" +(end-start));
		
		
		System.out.println("CBC模式");
		sm4.setIv("UISwD9fW6cFh9SNS");
		cipherText = sm4.encryptDataToString_CBC(plainText);
		System.out.println("密文: " + cipherText);
		System.out.println("");

		plainText = sm4.decryptDataToString_CBC(cipherText);
		System.out.println("明文: " + plainText);
		
		
		System.out.println("PCBC模式");
		sm4.setIv("UISwD9fW6cFh9SNS");
		cip = sm4.encryptData_PCBC(plainText.getBytes());
		cipherText = NumberTool.encodeHexString(cip);
		System.out.println("密文: " + cipherText);
		System.out.println();

		plainText = new String(sm4.decryptData_PCBC(cip));
		System.out.println("明文: " + plainText);
		
		
		System.out.println("CFB模式");
		sm4.setIv("UISwD9fW6cFh9SNS");
		cip = sm4.encryptData_CFB(plainText.getBytes());
		cipherText = NumberTool.encodeHexString(cip);
		System.out.println("密文: " + cipherText);
		System.out.println();

		plainText = new String(sm4.decryptData_CFB(cip));
		System.out.println("明文: " + plainText);
		
		System.out.println("OFB模式");
		sm4.setIv("UISwD9fW6cFh9SNS");
		cip = sm4.encryptData_OFB(plainText.getBytes());
		cipherText = NumberTool.encodeHexString(cip);
		System.out.println("密文: " + cipherText);
		System.out.println();

		plainText = new String(sm4.decryptData_OFB(cip));
		System.out.println("明文: " + plainText);
	}

}
