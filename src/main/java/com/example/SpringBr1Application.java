package com.example;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.io.IOException;

@SpringBootApplication
public class SpringBr1Application {

    public static void main(String[] args) throws IOException {
        org.springframework.boot.SpringApplication.run(SpringBr1Application.class, args);
        openHomePage();
    }
    private static void openHomePage() throws IOException {
        Runtime rt = Runtime.getRuntime();
        rt.exec("rundll32 url.dll,FileProtocolHandler " + "http://localhost:8080/");
    }
}