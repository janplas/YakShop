package nl.craftsmen.yak.shop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;

@SpringBootApplication
@EnableCircuitBreaker
public class YakShopApplication {

    public static void main(String[] args) {
        SpringApplication.run(YakShopApplication.class, args);
    }
}
