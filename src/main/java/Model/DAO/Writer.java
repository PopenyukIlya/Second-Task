package Model.DAO;

import Model.Sentence;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

/**Method for writing text to file
 *
 */

public class Writer extends Sentence {
    public String path="src\\main\\resources\\write.txt";
    static final Logger logger = LogManager.getLogger(Writer.class);
    public void write(List<Sentence> sentences1,String path){
        try(FileWriter writer = new FileWriter(path, false))
        {
            // запись всей строки
            logger.info("Writing text to file by path: "  +path );
            for (int i=0;i<sentences1.size();i++){
                logger.info("Writing this text: "  +getS(sentences1.get(i)) );
            String text = getS(sentences1.get(i));
            writer.write(text);
            // запись по символам
          writer.append('\n');
            writer.flush();
        }}
        catch(IOException ex){
            System.out.println(ex.getMessage());
        }
        logger.info("Recorded!" );
    }
}
