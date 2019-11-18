package Service;

import Model.Sentence;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ParseToSentencesTest extends Sentence {


    @Test
    void testParseToSentences() {
        ParseToSentences parseToSentences=new ParseToSentences();
        String text="What's up. How are you? " +
                "I'm fine! ";
        List<Sentence> list=new ArrayList<>();
        list.add(new Sentence("What's up.  "));
        list.add(new Sentence("How are you?  "));
        list.add(new Sentence("I'm fine!  "));

        for (int i=0;i<list.size();i++) {
            List<Sentence> actual = parseToSentences.parseToSentences(text);
            List<Sentence> expected = list;
            Assert.assertEquals( getS(expected.get(i)), getS(actual.get(i)));
        }
    }
}