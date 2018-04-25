package ltd.snowland.security;

import java.io.IOException;

/**
 * @author A.Star
 *
 */
public class TestSM3 {
	public static void main(String[] args) throws IOException {
        System.out.println(SM3.byteArrayToHexString(SM3.hash("test sm3 hash".getBytes())));
    }
}
