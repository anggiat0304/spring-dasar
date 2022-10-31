/**
 * Alipay.com Inc.
 * Copyright (c) 2004‐2022 All Rights Reserved.
 */
package programmerjamannow.core;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import programmerjamannow.core.data.Bar;
import programmerjamannow.core.data.Foo;
import programmerjamannow.core.data.FooBar;

/**
 * @author anggiat.pangaribuan (anggiat.pangaribuan@dana.id)
 * @version $Id: DependencyInjectionConfiguration.java, v 0.1 2022‐10‐28 20.34 anggiat.pangaribuan Exp $$
 */
@Configuration public class DependencyInjectionConfiguration {
    @Primary
    @Bean public Foo fooFirst() {
        return new Foo();
    }

    @Bean public Foo fooSecond() {
        return new Foo();
    }

    @Bean public Bar bar() {
        return new Bar();
    }

    @Bean
    public FooBar fooBar (@Qualifier("fooSecond")Foo foo , Bar bar){
        return new FooBar(foo , bar);
    }
}