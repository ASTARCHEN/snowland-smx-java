package ltd.snowland.security;

import java.math.BigInteger;

import org.bouncycastle.math.ec.ECPoint;

import ltd.snowland.security.SM2.Signature;
import ltd.snowland.security.utils.SM2KeyPair;


/**
 * @author A.Star
 *
 */
public class TestSM2 {
	public static void main(String[] args) {
		SM2 sm02 = new SM2();
//		 BigInteger px = new BigInteger(
//		 "0AE4C779 8AA0F119 471BEE11 825BE462 02BB79E2 A5844495 E97C04FF"+
//		 "4DF2548A".replace(" ", ""), 16);
//		 BigInteger py = new BigInteger(
//		 "7C0240F8 8F1CD4E1 6352A73C 17B7F16F 07353E53 A176D684 A9FE0C6B"+
//		 "B798E857".replace(" ", ""), 16);
//		 ECPoint publicKey = sm02.curve.createPoint(px, py);
//		 BigInteger privateKey = new BigInteger(
//		 "128B2FA8 BD433C6C 068C8D80 3DFF7979 2A519A55 171B1B65 0C23661D"+
//		 "15897263".replace(" ", ""), 16);

		 SM2KeyPair keyPair = sm02.generateKeyPair();
		 ECPoint publicKey=keyPair.getPublicKey();
		 BigInteger privateKey=keyPair.getPrivateKey();
		 sm02.exportPublicKey(publicKey, "E:/publickey.pem");
		 sm02.exportPrivateKey(privateKey, "E:/privatekey.pem");

		System.out.println("-----------------公钥加密与解密-----------------");
//		ECPoint publicKey = sm02.importPublicKey("E:/publickey.pem");
//		BigInteger privateKey = sm02.importPrivateKey("E:/privatekey.pem");
		byte[] data = sm02.encrypt("测试加密aaaaaaaaaaa123aabb", publicKey);
		System.out.print("密文:");
		SM2.printHexString(data);
		System.out.println("解密后明文:" + sm02.decrypt(data, privateKey));

		System.out.println("-----------------签名与验签-----------------");
		String IDA = "Heartbeats";
		String M = "要签名的信息";
		Signature signature = sm02.sign(M, IDA, new SM2KeyPair(publicKey, privateKey));
		System.out.println("用户标识:" + IDA);
		System.out.println("签名信息:" + M);
		System.out.println("数字签名:" + signature);
		System.out.println("验证签名:" + sm02.verify(M, signature, IDA, publicKey));

	}
}
