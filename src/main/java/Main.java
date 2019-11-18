import Model.DAO.Writer;
import Service.Controller;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.IOException;

public class Main {
    static final Logger logger = LogManager.getLogger(Main.class);
    public static void main(String[] args) throws IOException {
        logger.info("App started");
        Controller controller=new Controller();
        controller.readTextFromFile();
        controller.parseToSentences();
        controller.parseToWords();
        controller.sortSentences();
        controller.writeText();
        logger.info("App ended");
    }
}
