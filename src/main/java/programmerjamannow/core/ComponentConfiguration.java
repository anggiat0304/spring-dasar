/**
 * Alipay.com Inc.
 * Copyright (c) 2004‐2022 All Rights Reserved.
 */
package programmerjamannow.core;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import programmerjamannow.core.service.ProductService;

/**
 * @author anggiat.pangaribuan (anggiat.pangaribuan@dana.id)
 * @version $Id: ComponentConfiguration.java, v 0.1 2022‐10‐29 11.15 anggiat.pangaribuan Exp $$
 */
@Configuration
@ComponentScan(basePackages={
        "programmerjamannow.core.service",
        "programmerjamannow.core.repository"
})
public class ComponentConfiguration {

}