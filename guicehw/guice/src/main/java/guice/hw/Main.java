package guice.hw;

import com.google.inject.Guice;
import com.google.inject.Injector;
import org.jetbrains.annotations.NotNull;

import java.io.IOException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Main {
    public static void main(@NotNull String[] args) throws IOException {
        final Injector injector = Guice.createInjector(new MainModule());
        final Application app = injector.getInstance(Application.class).waitForInput();


    }

}
