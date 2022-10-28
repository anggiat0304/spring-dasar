/**
 * Alipay.com Inc.
 * Copyright (c) 2004‐2022 All Rights Reserved.
 */
package programmerjamannow.core;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;
import programmerjamannow.core.data.Foo;

/**
 * @author anggiat.pangaribuan (anggiat.pangaribuan@dana.id)
 * @version $Id: BeanNameConfiguration.java, v 0.1 2022‐10‐28 16.47 anggiat.pangaribuan Exp $$
 */
public class BeanNameConfiguration {
    @Primary @Bean(name = "fooFirst") public Foo foo1() {
        Foo foo = new Foo();
        return foo;
    }

    @Bean(name = "fooSecond") public Foo foo2() {
        Foo foo = new Foo();
        return foo;
    }
}