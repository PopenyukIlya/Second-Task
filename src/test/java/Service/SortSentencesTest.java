package Service;

import Model.Sentence;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SortSentencesTest extends Sentence {

    @Test
    void sort() {
        SortSentences sortSentences=new SortSentences();
        List<Sentence> list=new ArrayList<>();
        List<Sentence> list1=new ArrayList<>();
        Sentence sentence=new Sentence("Where are you from Vanya?",5);
        Sentence sentence1=new Sentence("How are you?",3);
        Sentence sentence2=new Sentence("I'm fine!",2);

        list.add(sentence);
        list.add(sentence1);
        list.add(sentence2);

        list1.add(sentence2);
        list1.add(sentence1);
        list1.add(sentence);

        for (int i=0;i<list.size();i++) {
            List<Sentence> actual=sortSentences.sort(list);
            List<Sentence> expected = list1;
            Assert.assertEquals( getS(expected.get(i)), getS(actual.get(i)));
        }

    }
}