/**
 * Alipay.com Inc.
 * Copyright (c) 2004‐2022 All Rights Reserved.
 */
package programmerjamannow.core;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import programmerjamannow.core.data.cyclic.CyclicA;
import programmerjamannow.core.data.cyclic.CyclicB;
import programmerjamannow.core.data.cyclic.CyclicC;

/**
 * @author anggiat.pangaribuan (anggiat.pangaribuan@dana.id)
 * @version $Id: CyclicConfiguration.java, v 0.1 2022‐10‐28 21.20 anggiat.pangaribuan Exp $$
 */
@Configuration
public class CyclicConfiguration {

    @Bean
    public CyclicA cyclicA (CyclicB cyclicB){
        return new CyclicA(cyclicB);
    }

    @Bean
    public CyclicB cyclicB (CyclicC cyclicC){
        return new CyclicB(cyclicC);
    }

    @Bean
    public CyclicC cyclicC (CyclicA cyclicA){
        return new CyclicC(cyclicA);
    }

}