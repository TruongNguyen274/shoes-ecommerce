package vn.billbooking;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@SpringBootApplication
public class WebappApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(WebappApplication.class, args);
    }

    @Autowired
    private BCryptPasswordEncoder passwordEncoder;

    @Override
    public void run(String... args) throws Exception {
        String password = "123456";
        String encodedPassword = passwordEncoder.encode(password);
        System.out.println(encodedPassword);
    }
}
