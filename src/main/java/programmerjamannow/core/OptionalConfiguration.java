package programmerjamannow.core;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import programmerjamannow.core.data.Bar;
import programmerjamannow.core.data.Foo;
import programmerjamannow.core.data.FooBar;

import java.util.Optional;

@Configuration
public class OptionalConfiguration {
    @Bean
    public Foo foo() {
        return new Foo();
    }

    @Bean
    public FooBar fooBar (Optional<Foo> foo , Optional<Bar> bar){
        return  new FooBar(foo.orElse(null) , bar.orElse(null));
    }
}



