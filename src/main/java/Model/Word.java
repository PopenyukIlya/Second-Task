package Model;

import java.util.ArrayList;
import java.util.List;

public class Word{
    public String word;
    public List<Word> words=new ArrayList<>();
    public static final String WORD_SPLIT_REGEX ="(\\s+)";
    public Word(String word) { this.word = word; }
    public Word() { }


    @Override
    public String toString() {
        return "Word{" +
                "word='" + word + '\'' +
                '}';
    }
}
