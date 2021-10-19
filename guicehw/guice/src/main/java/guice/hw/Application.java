package guice.hw;

import com.google.inject.Inject;
import org.jetbrains.annotations.NotNull;

import java.io.IOException;
import java.util.NoSuchElementException;
import java.util.Scanner;
import java.util.logging.FileHandler;
import java.util.logging.Logger;

public final class Application implements Helper{
    @Inject
    private @NotNull
    Logger logger= Logger.getLogger("java.guice.hw");
    @Override
    public void run() throws IOException {

    }
    public Application waitForInput() throws IOException {
        String str = "";
        int id = 0;
       // log logger;
        FileHandler handler = new FileHandler("log", true);
        //Logger logger = Logger.getLogger("java.guice.hw");
        logger.addHandler(handler);
        //logger.info(logger.getName());
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Waiting for new lines. Key in Ctrl+D to exit.");
            while (true) {
                 id++;
                 logger.info("id: " + id +" msg: "+ scanner.nextLine());
            }
        } catch (IllegalStateException | NoSuchElementException e) {
        }
        return null;
    }
}
