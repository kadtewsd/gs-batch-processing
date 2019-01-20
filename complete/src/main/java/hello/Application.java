package hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

    public static void main(String[] args) throws Exception {
        // CommandLineJobRunner ではなく、JobLauncherCommandLineRunner から起動する
        SpringApplication.run(Application.class, args);
//        CommandLineJobRunner.main(args);
    }
}
