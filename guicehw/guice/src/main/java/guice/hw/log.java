package guice.hw;

import com.google.inject.Inject;
import org.jetbrains.annotations.NotNull;

import java.io.IOException;
import java.util.logging.Logger;

public class log implements Helper{
    @Inject
    private @NotNull
    Logger logger= Logger.getLogger("java.guice.hw");

    @Override
    public void run() throws IOException {        logger.info(logger.getName());

    }
}
