package pl.edu.agh.rest.auth;

import javax.crypto.spec.SecretKeySpec;
import java.security.Key;

public class KeyGenerator implements KeyGenInterface {

    public Key generateKey() {
        String keyString = "rWtYv3jQmTqVsXv2x4z7C9z6B8DbGdJgNEcHeKgPkRnTy5A8DaFcJfMhPmSpUrXuZw4z6B8EbGdJgNjQ";
        return new SecretKeySpec(keyString.getBytes(), 0, keyString.getBytes().length, "DES");
    }
}
