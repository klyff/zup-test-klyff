package org.br.zup.test.klyff;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;
import java.util.List;

/**
 * @author klyff harlley
 * Sum products values using POJO bean and Lambda
 */
@SpringBootApplication
@Slf4j
public class MainProductSumPojo {

    public static void main(String[] args) {
        sumProductValues();
    }

    public static int sumProductValues(){

        List<Product> products = getProducts();
        int amount = products.stream().filter(o -> o.getPrice() > 0).mapToInt(Product::getPrice).sum();

        log.info("========================");
        log.info("\tProduct List ");
        log.info("========================");

        products.forEach(p->log.info("\t{} : {}",p.getName(),p.getPrice()));
        log.info("Sum of Product Values: {}", amount);
        return amount;
    }

    private static List<Product> getProducts(){
        Product p1 = Product.of("Playstation", 2100);
        Product p2 = Product.of("XBoxOne", 1997);
        Product p3 = Product.of("Switch", 1800);
        Product p4 = Product.of("Super Nintendo", 4983);

        return Arrays.asList(p1,p2,p3,p4);
    }

    /**
     * POJO Class Product
     */
    static class Product {
        private String name;
        private Integer price;

        private Product(String name, Integer price) {
            this.name = name;
            this.price = price;
        }

        public static Product of(String name, Integer price){
            return new Product(name, price);
        }

        public String getName() {
            return name;
        }

        public Integer getPrice() {
            return price;
        }
    }

}
