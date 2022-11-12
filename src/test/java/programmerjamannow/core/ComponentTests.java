/**
 * Alipay.com Inc.
 * Copyright (c) 2004‐2022 All Rights Reserved.
 */
package programmerjamannow.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import programmerjamannow.core.data.MultiFoo;
import programmerjamannow.core.repository.CategoryRepository;
import programmerjamannow.core.repository.CustomerRepository;
import programmerjamannow.core.repository.ProductRepository;
import programmerjamannow.core.service.CategoryService;
import programmerjamannow.core.service.CustomerService;
import programmerjamannow.core.service.ProductService;

/**
 * @author anggiat.pangaribuan (anggiat.pangaribuan@dana.id)
 * @version $Id: ComponentTests.java, v 0.1 2022‐10‐29 11.16 anggiat.pangaribuan Exp $$
 */
public class ComponentTests {
    private ConfigurableApplicationContext context;

    @BeforeEach
    void setUp(){
        context = new AnnotationConfigApplicationContext(ComponentConfiguration.class);
        context.registerShutdownHook();
    }

    @Test
    void testComponent(){
        ProductService productService1 = context.getBean(ProductService.class);
        ProductService productService2 = context.getBean("productService",ProductService.class);
        Assertions.assertNotNull(productService1);
        Assertions.assertSame(productService1, productService2);
    }

    @Test
    void testConstructorDependencyInjection(){
        ProductService productService = context.getBean(ProductService.class);
        ProductRepository productRepository = context.getBean(ProductRepository.class);

        Assertions.assertSame(productService.getProductRepository() , productRepository);
    }

    @Test
    void testSetterDependencyInjection(){
        CategoryService categoryService = context.getBean(CategoryService.class);
        CategoryRepository categoryRepository = context.getBean(CategoryRepository.class);

        Assertions.assertSame(categoryRepository, categoryService.getCategoryRepository());
    }

    @Test
    void testFieldDependencyInjection(){
        CustomerService customerService = context.getBean(CustomerService.class);
        Assertions.assertNotNull(customerService);
        CustomerRepository normalCustomerRepository = context.getBean("normalCustomerRepository",CustomerRepository.class);
        CustomerRepository premiumCustomerRepository = context.getBean("premiumCustomerRepository",CustomerRepository.class);

        Assertions.assertSame(normalCustomerRepository,customerService.getNormalCustomerRepository());
        Assertions.assertSame(premiumCustomerRepository , customerService.getPremiumCustomerRepository());
    }

    @Test
    void testObjectProvider(){
        MultiFoo multiFoo = context.getBean(MultiFoo.class);

        Assertions.assertSame(3, multiFoo.getFoos().size());
    }
}