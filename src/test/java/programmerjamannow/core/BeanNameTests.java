/**
 * Alipay.com Inc.
 * Copyright (c) 2004‐2022 All Rights Reserved.
 */
package programmerjamannow.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import programmerjamannow.core.data.Foo;

/**
 * @author anggiat.pangaribuan (anggiat.pangaribuan@dana.id)
 * @version $Id: BeanNameTests.java, v 0.1 2022‐10‐28 16.49 anggiat.pangaribuan Exp $$
 */
public class BeanNameTests {
        @Test
        void getBeanNameTests(){
            ApplicationContext context = new AnnotationConfigApplicationContext(BeanNameConfiguration.class);

            Foo foo = context.getBean(Foo.class);
            Foo foo1 = context.getBean("fooFirst",Foo.class);
            Foo foo2 = context.getBean("fooSecond",Foo.class);

            Assertions.assertSame(foo , foo1);
            Assertions.assertNotSame(foo1, foo2);
            Assertions.assertNotSame(foo , foo2);
        }
}