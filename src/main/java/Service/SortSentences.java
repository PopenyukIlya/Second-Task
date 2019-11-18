package Service;

import Model.DAO.Writer;
import Model.Sentence;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**Method for sorting sentences by word quantity ascending
 *
 */

public class SortSentences extends Sentence {
    static final Logger logger = LogManager.getLogger(Writer.class);
    public List<Sentence> sort(List<Sentence> sentences1)  {
        logger.info("Start sorting by quantity of words in sentences. List of sentences-"+sentences1);
        Collections.sort(sentences1, new Comparator<Sentence>() {
                    public int compare(Sentence o1, Sentence o2) {
                        if (o1.getQuantity() == o2.getQuantity())
                            return 0;
                        return o1.getQuantity() < o2.getQuantity() ? -1 : 1;
                    }
                }
        );
        logger.info("Before sorting list of sentences have view-"+sentences1);
        return sentences1;
    }
}
