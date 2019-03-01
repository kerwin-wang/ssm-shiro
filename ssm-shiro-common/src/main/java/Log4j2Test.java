import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * @ClassName: Log4j2Test
 * @Description:
 * @version: v1.0.0
 * @Author: d.wang
 * @Date: 2019-02-28 11:04
 */
public class Log4j2Test
{
    static Logger logger = LogManager.getLogger(LogManager.ROOT_LOGGER_NAME);

    public static void main(String[] args) {
        logger.trace("trace message");
        logger.debug("debug message");
        logger.info("info message");
        logger.warn("warn message");
        logger.error("error message");
        logger.fatal("fatal message");
        System.out.println("Hello World!");
    }
}
