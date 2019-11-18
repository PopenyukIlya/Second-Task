package Service;

import Model.DAO.Writer;
import Model.Sentence;
import Model.Word;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.util.List;

/**Method for parsing sentences to words and getting sentences with this words and quantity of words
 *
 */

public class ParseToWords extends Word {
    static final Logger logger = LogManager.getLogger(Writer.class);
    public List<Sentence> parseToWords(List sentences) {

        Sentence sentence=new Sentence();
        logger.info("Parse sentences on words");
        for (int i = 0; i < sentences.size();  i++) {
            int quantity=0;
            String text="";
            word= String.valueOf(sentence.getS((Sentence) sentences.get(i)));
            String[] wordArray = word.split(WORD_SPLIT_REGEX);
            for (int j = 0; j < wordArray.length; j++) {
                words.add(new Word(wordArray[j]));
               text=text+wordArray[j]+" ";
               quantity++;
            }
            sentence.sentences1.add(new Sentence(text,quantity));
        }
        logger.info("Sentences parsed on words and we know quantity words in every sentence");
        return sentence.sentences1;
        }
    }