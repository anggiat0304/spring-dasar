/**
 * Alipay.com Inc.
 * Copyright (c) 2004‐2022 All Rights Reserved.
 */
package programmerjamannow.core.data;

import lombok.extern.slf4j.Slf4j;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * @author anggiat.pangaribuan (anggiat.pangaribuan@dana.id)
 * @version $Id: Data.java, v 0.1 2022‐10‐29 09.45 anggiat.pangaribuan Exp $$
 */
@Slf4j
public class Server {
    @PostConstruct
    public void start(){
        log.info("start server");
    }
    @PreDestroy
    public void stop(){
        log.info("stop server");
    }
}