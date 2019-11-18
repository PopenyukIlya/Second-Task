package Service;

import Model.Sentence;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ParseToWordsTest extends Sentence {

    @Test
    void parseToWords() {
        ParseToWords parseToWords=new ParseToWords();
        List<Sentence> sentenceList=new ArrayList<>();
        Sentence sentence= new Sentence("Write this text, please.");
        sentenceList.add(sentence);
        List<Sentence> sentenceList1=new ArrayList<>();
        Sentence sentence1= new Sentence("Write this text, please. ",4);
        sentenceList1.add(sentence1);
        Sentence actual=(parseToWords.parseToWords(sentenceList)).get(0);;
        Sentence expected=sentenceList1.get(0);
        Assert.assertEquals(getS(expected),getS(actual));
        Assert.assertEquals(getQuantity(expected),getQuantity(actual));
    }
}