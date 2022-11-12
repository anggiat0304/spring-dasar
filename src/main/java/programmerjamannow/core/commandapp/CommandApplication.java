package programmerjamannow.core.commandapp;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Slf4j
@SpringBootApplication
public class CommandApplication {

    @Component
    public class LogCommandLineRunner implements CommandLineRunner {
        @Override
        public void run(String... args) throws Exception {
            log.info("Run with args : {}", Arrays.toString(args));
        }
    }

//    public static void main(String[] args) {
//        SpringApplication.run(CommandApplication.class , args);
//    }
}
