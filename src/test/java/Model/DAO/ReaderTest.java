package Model.DAO;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

class ReaderTest {
    String path="src\\test\\resources\\write.txt";
    @Test
    void read() throws IOException {
        Reader reader=new Reader();
        String actual= reader.read(path);
        String expected="Write this text, please."+"\n";
        Assert.assertEquals(expected,actual);
    }
}