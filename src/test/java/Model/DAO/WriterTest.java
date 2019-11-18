package Model.DAO;

import Model.Sentence;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class WriterTest extends Sentence{

    @Test
    void write() throws IOException {
        Writer writer=new Writer();
        String path="src\\test\\resources\\write.txt";
        List<Sentence> sentenceList=new ArrayList<>();
       Sentence sentence= new Sentence("Write this text, please.");
        sentenceList.add(sentence);
        String textRead="";

        writer.write(sentenceList,path);

        FileReader fr = new FileReader(new File(path));
        int ch;
        while ((ch = fr.read()) != -1) {
            textRead=textRead+(char) ch;
        }
        String actual= textRead;
        String expected="Write this text, please."+"\n";
        Assert.assertEquals(expected,actual);
    }
}