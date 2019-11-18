package Service;

import Model.DAO.Reader;
import Model.DAO.Writer;
import Model.Sentence;
import Model.Text;

import java.io.IOException;
import java.util.List;

public class Controller {

    Reader reader=new Reader();
    Text text=new Text();
    Sentence sentence=new Sentence();

    public void readTextFromFile() throws IOException {
       text.setText(reader.read(reader.path));
    }

    public void parseToSentences() throws IOException {
    ParseToSentences parseToSentences=new ParseToSentences();
        sentence.setSentences(parseToSentences.parseToSentences(text.getText()));
    }
    public List<Sentence> parseToWords() {
        ParseToWords parseToWords=new ParseToWords();
      return parseToWords.parseToWords(sentence.getSentences());
    }

    public List<Sentence> sortSentences() throws IOException {
SortSentences sortSentences=new SortSentences();
      return sortSentences.sort(parseToWords());
    }

    public void writeText() throws IOException {
        Writer writer=new Writer();
        writer.write(sortSentences(),writer.path);
    }

}
