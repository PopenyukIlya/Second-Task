package Model.DAO;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.io.*;

/**Method for reading text from file
 *
 */
public class Reader {
    static final Logger logger = LogManager.getLogger(Reader.class);
    String text="";
   public String path="src\\main\\resources\\read.txt";
    public String read(String path) throws IOException {
     logger.info("Reading text from file by path: "+path);
        FileReader fr = new FileReader(new File(path));
        int ch;
        while ((ch = fr.read()) != -1) {
            text=text+(char) ch;
        }
     logger.info("Text from file: "+text);
        return text;
    }
}

