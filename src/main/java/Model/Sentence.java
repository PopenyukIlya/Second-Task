package Model;
import java.util.ArrayList;
import java.util.List;

public class Sentence extends Word{

    public String s;
    public int quantity;
    public static final String SENTENCE_SPLIT_REGEX = "[\\S]+?[\\S\\s]+?[.?!]+(\\s)";
    public List<Sentence> sentences = new ArrayList<>();
    public List<Sentence> sentences1 = new ArrayList<>();

    public Sentence(String s,int quantity) {
        this.s=s;
        this.quantity=quantity;
    }

    public Sentence(String s) {
        this.s=s;
    }

    public List<Sentence> getSentences() {
        return sentences;
    }

    public String getS(Sentence sentence) {
        return sentence.s;
    }

    public void setSentences(List<Sentence> sentences) {
        this.sentences = sentences;
    }

    public  int getQuantity() {
        return quantity;
    }
    public  int getQuantity(Sentence sentence) {
        return quantity;
    }

    public Sentence() {
    }
    @Override
    public String toString() {
        return "Sentence{" +
                "s='" + s + '\'' +
                ", quantity=" + quantity +
                '}';
    }
}
