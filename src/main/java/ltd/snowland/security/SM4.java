package ltd.snowland.security;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.util.Base64;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import ltd.snowland.security.utils.SM4Base;
import ltd.snowland.security.utils.SM4_Context;
import ltd.snowland.utils.NumberTool;
import ltd.snowland.utils.StreamTool;


public class SM4 {
	
	private String secretKey = "";
	private String iv = "";
	private boolean hexString = false;
	
	public static void main(String[] args) throws IOException {
		String plainText = "ererfeiisgod";

		SM4 sm4 = new SM4();
		sm4.secretKey = "JeF8U9wHFOMfs2Y8";
		sm4.hexString = false;

		System.out.println("ECB模式");
		String cipherText = sm4.encryptDataToString_ECB(plainText);
		System.out.println("密文: " + cipherText);
		System.out.println("");

		plainText = sm4.decryptDataToString_ECB(cipherText);
		System.out.println("明文: " + plainText);
		System.out.println("");

		System.out.println("CBC模式");
		sm4.iv = "UISwD9fW6cFh9SNS";
		cipherText = sm4.encryptDataToString_CBC(plainText);
		System.out.println("密文: " + cipherText);
		System.out.println("");

		plainText = sm4.decryptDataToString_CBC(cipherText);
		System.out.println("明文: " + plainText);
	}
	
	public String decryptDataToString_CBC(String cipherText) {
		return decryptDataToString_CBC(cipherText, "GBK");
	}

	public String decryptDataToString_CBC(String cipherText, String charset) {
		try {
			SM4_Context ctx = new SM4_Context();
			ctx.isPadding = true;
			ctx.mode = SM4Base.SM4_DECRYPT;

			byte[] keyBytes;
			byte[] ivBytes;
			if (hexString) {
				keyBytes = NumberTool.hexStringToBytes(secretKey);
				ivBytes = NumberTool.hexStringToBytes(iv);
			} else {
				keyBytes = secretKey.getBytes();
				ivBytes = iv.getBytes();
			}

			SM4Base sm4 = new SM4Base();
			sm4.sm4_setkey_dec(ctx, keyBytes);
			byte[] decrypted = sm4.sm4_crypt_cbc(ctx, ivBytes, Base64.getDecoder().decode(cipherText));
			return new String(decrypted, charset);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	public byte[] decryptData_CBC(String cipherText) {
		try {
			SM4_Context ctx = new SM4_Context();
			ctx.isPadding = true;
			ctx.mode = SM4Base.SM4_DECRYPT;

			byte[] keyBytes;
			byte[] ivBytes;
			if (hexString) {
				keyBytes = NumberTool.hexStringToBytes(secretKey);
				ivBytes = NumberTool.hexStringToBytes(iv);
			} else {
				keyBytes = secretKey.getBytes();
				ivBytes = iv.getBytes();
			}

			SM4Base sm4 = new SM4Base();
			sm4.sm4_setkey_dec(ctx, keyBytes);
			return sm4.sm4_crypt_cbc(ctx, ivBytes, Base64.getDecoder().decode(cipherText));
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	public String decryptDataToString_CBC(byte[] bytes) {
		try {
			SM4_Context ctx = new SM4_Context();
			ctx.isPadding = true;
			ctx.mode = SM4Base.SM4_DECRYPT;

			byte[] keyBytes;
			byte[] ivBytes;
			if (hexString) {
				keyBytes = NumberTool.hexStringToBytes(secretKey);
				ivBytes = NumberTool.hexStringToBytes(iv);
			} else {
				keyBytes = secretKey.getBytes();
				ivBytes = iv.getBytes();
			}

			SM4Base sm4 = new SM4Base();
			sm4.sm4_setkey_dec(ctx, keyBytes);
			byte[] decrypted = sm4.sm4_crypt_cbc(ctx, ivBytes, bytes);
			return new String(decrypted, "GBK");
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
		
	public byte[] decryptData_ECB(byte[] bytes) {
		try {
			SM4_Context ctx = new SM4_Context();
			ctx.isPadding = true;
			ctx.mode = SM4Base.SM4_DECRYPT;

			byte[] keyBytes;
			if (hexString) {
				keyBytes = NumberTool.hexStringToBytes(secretKey);
			} else {
				keyBytes = secretKey.getBytes();
			}

			SM4Base sm4 = new SM4Base();
			sm4.sm4_setkey_dec(ctx, keyBytes);
			return sm4.sm4_crypt_ecb(ctx, bytes);

		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	public byte[] decryptData_ECB(String cipherText) {
		try {
			SM4_Context ctx = new SM4_Context();
			ctx.isPadding = true;
			ctx.mode = SM4Base.SM4_DECRYPT;

			byte[] keyBytes;
			if (hexString) {
				keyBytes = NumberTool.hexStringToBytes(secretKey);
			} else {
				keyBytes = secretKey.getBytes();
			}

			SM4Base sm4 = new SM4Base();
			sm4.sm4_setkey_dec(ctx, keyBytes);
			return sm4.sm4_crypt_ecb(ctx, Base64.getDecoder().decode(cipherText));

		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	public String decryptDataToString_ECB(String cipherText) {
		return decryptDataToString_ECB(cipherText, "GBK");
	}
	
	public String decryptDataToString_ECB(String cipherText, String charset) {
		try {
			SM4_Context ctx = new SM4_Context();
			ctx.isPadding = true;
			ctx.mode = SM4Base.SM4_DECRYPT;

			byte[] keyBytes;
			if (hexString) {
				keyBytes = NumberTool.hexStringToBytes(secretKey);
			} else {
				keyBytes = secretKey.getBytes();
			}

			SM4Base sm4 = new SM4Base();
			sm4.sm4_setkey_dec(ctx, keyBytes);
			byte[] decrypted = sm4.sm4_crypt_ecb(ctx, Base64.getDecoder().decode(cipherText));
			return new String(decrypted, charset);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	public String encryptDataToString_CBC(byte[] bytes) {
		try {
			SM4_Context ctx = new SM4_Context();
			ctx.isPadding = true;
			ctx.mode = SM4Base.SM4_ENCRYPT;

			byte[] keyBytes;
			byte[] ivBytes;
			if (hexString) {
				keyBytes = NumberTool.hexStringToBytes(secretKey);
				ivBytes = NumberTool.hexStringToBytes(iv);
			} else {
				keyBytes = secretKey.getBytes();
				ivBytes = iv.getBytes();
			}

			SM4Base sm4 = new SM4Base();
			sm4.sm4_setkey_enc(ctx, keyBytes);
			byte[] encrypted = sm4.sm4_crypt_cbc(ctx, ivBytes, bytes);
			String cipherText = Base64.getEncoder().encodeToString(encrypted);
			if (cipherText != null && cipherText.trim().length() > 0) {
				Pattern p = Pattern.compile("\\s*|\t|\r|\n");
				Matcher m = p.matcher(cipherText);
				cipherText = m.replaceAll("");
			}
			return cipherText;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	public String encryptDataToString_CBC(String plainText) {
		return encryptDataToString_CBC(plainText, "GBK");
	}
	public String encryptDataToString_CBC(String plainText, String charset) {
		try {
			SM4_Context ctx = new SM4_Context();
			ctx.isPadding = true;
			ctx.mode = SM4Base.SM4_ENCRYPT;

			byte[] keyBytes;
			byte[] ivBytes;
			if (hexString) {
				keyBytes = NumberTool.hexStringToBytes(secretKey);
				ivBytes = NumberTool.hexStringToBytes(iv);
			} else {
				keyBytes = secretKey.getBytes();
				ivBytes = iv.getBytes();
			}

			SM4Base sm4 = new SM4Base();
			sm4.sm4_setkey_enc(ctx, keyBytes);
			byte[] encrypted = sm4.sm4_crypt_cbc(ctx, ivBytes, plainText.getBytes(charset));
			String cipherText = Base64.getEncoder().encodeToString(encrypted);
			if (cipherText != null && cipherText.trim().length() > 0) {
				Pattern p = Pattern.compile("\\s*|\t|\r|\n");
				Matcher m = p.matcher(cipherText);
				cipherText = m.replaceAll("");
			}
			return cipherText;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	public byte[] encryptData_CBC(String plainText, String charset) {
		try {
			return encryptData_CBC(plainText.getBytes(charset));
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
			return null;
		}		
	}

	public byte[] encryptData_CBC(byte[] bytes) {
		try {
			SM4_Context ctx = new SM4_Context();
			ctx.isPadding = true;
			ctx.mode = SM4Base.SM4_ENCRYPT;

			byte[] keyBytes;
			byte[] ivBytes;
			if (hexString) {
				keyBytes = NumberTool.hexStringToBytes(secretKey);
				ivBytes = NumberTool.hexStringToBytes(iv);
			} else {
				keyBytes = secretKey.getBytes();
				ivBytes = iv.getBytes();
			}

			SM4Base sm4 = new SM4Base();
			sm4.sm4_setkey_enc(ctx, keyBytes);
			return sm4.sm4_crypt_cbc(ctx, ivBytes, bytes);		
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	public byte[] encryptData_ECB(byte[] bytes) {
//		SM4_Context ctx = new SM4_Context();
//		SM4Base sm4 = new SM4Base();
//		try {
//			return sm4.sm4_crypt_ecb(ctx, bytes);
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//			return null;
//		}
		
		try {
			SM4_Context ctx = new SM4_Context();
			ctx.isPadding = true;
			ctx.mode = SM4Base.SM4_ENCRYPT;

			byte[] keyBytes;
			if (hexString) {
				keyBytes = NumberTool.hexStringToBytes(secretKey);
			} else {
				keyBytes = secretKey.getBytes();
			}

			SM4Base sm4 = new SM4Base();
			sm4.sm4_setkey_enc(ctx, keyBytes);
			return sm4.sm4_crypt_ecb(ctx, bytes);			
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	public byte[] encryptData_ECB(File f) throws IOException {
		if(f.exists()) {
			InputStream inStream = new FileInputStream(f);
			return encryptData_ECB(StreamTool.readInputStream2ByteArray(inStream));
		} else {
			throw new IOException("File not Found");
		}
		
	}
	
	public byte[] encryptData_ECB(String plainText) {
		return encryptData_ECB(plainText, "GBK");
	}

	public byte[] encryptData_ECB(String plainText, String charset) {
		try {
			return encryptData_ECB(plainText.getBytes(charset));
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
			return null;
		}
	}
	
	public String encryptDataToString_ECB(String plainText) {
			return encryptDataToString_ECB(plainText, "GBK");
	}

	public String encryptDataToString_ECB(String plainText, String charset) {
		try {
			SM4_Context ctx = new SM4_Context();
			ctx.isPadding = true;
			ctx.mode = SM4Base.SM4_ENCRYPT;

			byte[] keyBytes;
			if (hexString) {
				keyBytes = NumberTool.hexStringToBytes(secretKey);
			} else {
				keyBytes = secretKey.getBytes();
			}

			SM4Base sm4 = new SM4Base();
			sm4.sm4_setkey_enc(ctx, keyBytes);
			byte[] encrypted = sm4.sm4_crypt_ecb(ctx, plainText.getBytes(charset));
			String cipherText = Base64.getEncoder().encodeToString(encrypted);
			if (cipherText != null && cipherText.trim().length() > 0) {
				Pattern p = Pattern.compile("\\s*|\t|\r|\n");
				Matcher m = p.matcher(cipherText);
				cipherText = m.replaceAll("");
			}
			return cipherText;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}


	/**
	 * @return the iv
	 */
	public String getIv() {
		return iv;
	}

	/**
	 * @return the secretKey
	 */
	public String getSecretKey() {
		return secretKey;
	}

	/**
	 * @return the hexString
	 */
	public boolean isHexString() {
		return hexString;
	}

	/**
	 * @param hexString the hexString to set
	 */
	public void setHexString(boolean hexString) {
		this.hexString = hexString;
	}

	/**
	 * @param iv the iv to set
	 */
	public void setIv(String iv) {
		this.iv = iv;
	}

	/**
	 * @param secretKey the secretKey to set
	 */
	public void setSecretKey(String secretKey) {
		this.secretKey = secretKey;
	}
	
	
}