package au.com.anthonybruno.md5;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class Md5Hasher {


    public static String hash(InputStream inputStream) throws IOException {
        MessageDigest md5Digest;
        try {
            md5Digest = MessageDigest.getInstance("MD5");
        } catch (NoSuchAlgorithmException e) { //Should never happen!
            throw new RuntimeException(e);
        }
        try {
            int read;
            while ((read = inputStream.read()) != -1) {
                md5Digest.update((byte) read);
            }
        } finally {
            inputStream.close();
        }
        String hash = String.format("%032x", new BigInteger(1, md5Digest.digest()));
        return hash;
    }
}
