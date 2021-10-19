package guice.hw;

import com.google.inject.AbstractModule;
import com.google.inject.name.Names;

public final class MainModule extends AbstractModule {
    @Override
    protected void configure(){
           // bind(Helper.class).to(log.class);
             bind(Helper.class).annotatedWith(Names.named("app")).to(Application.class);
    }
}
