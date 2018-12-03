package au.com.anthonybruno.md5;

import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.IOException;

public class Md5HasherTest {

    @Test
    public void hashString() throws IOException {
        String toHash = "abc";
        String hashed = Md5Hasher.hash(new ByteArrayInputStream(toHash.getBytes()));
        System.out.println(hashed);
    }

    @Test
    public void hashFile() throws IOException {
        String toHash = "abc";
        String hashed = Md5Hasher.hash(new ByteArrayInputStream(toHash.getBytes()));
        System.out.println(hashed);
    }
}
