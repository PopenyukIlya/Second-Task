package Service;

import Model.Sentence;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**Method for parsing text from file to sentences
 *
 */

public class ParseToSentences extends Sentence {
    static final Logger logger = LogManager.getLogger(ParseToSentences.class);
    public List<Sentence> parseToSentences(String text) {

        final Pattern pattern = Pattern.compile(SENTENCE_SPLIT_REGEX, Pattern.MULTILINE);
        logger.info("Parse text on sentences");
            final Matcher matcher = pattern.matcher(text);
            while (matcher.find()) {
                sentences.add(new Sentence(matcher.group(0)+" ",0));
            }
        logger.info("Quantity sentences: "+sentences.size());
        logger.info("Sentences: "+sentences);
        logger.info("We have list of sentences from file");
        return sentences;
    }
}
