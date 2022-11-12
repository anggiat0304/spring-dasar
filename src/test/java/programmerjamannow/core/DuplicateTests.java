/**
 * Alipay.com Inc.
 * Copyright (c) 2004‐2022 All Rights Reserved.
 */
package programmerjamannow.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.NoUniqueBeanDefinitionException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import programmerjamannow.core.data.Foo;

/**
 * @author anggiat.pangaribuan (anggiat.pangaribuan@dana.id)
 * @version $Id: DuplicateTests.java, v 0.1 2022‐10‐27 13.36 anggiat.pangaribuan Exp $$
 */
public class DuplicateTests {

//    @Test
//    void testDuplicate() {
//        ApplicationContext context = new AnnotationConfigApplicationContext(
//                DuplicateConfiguration.class);
//
//        Assertions.assertThrows(NoUniqueBeanDefinitionException.class, () -> {
//            Foo foo = context.getBean(Foo.class);
//        });
//    }

    @Test
    void getBean() {
        ApplicationContext context = new AnnotationConfigApplicationContext(DuplicateConfiguration.class);
        Foo foo = context.getBean(Foo.class);
        Foo foo1 = context.getBean("foo1", Foo.class);
        Foo foo2 = context.getBean("foo2", Foo.class);
        Assertions.assertSame(foo, foo1);
        Assertions.assertNotSame(foo1, foo2);
    }

}