package org.br.zup.test.klyff;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;
import java.util.List;

import static java.util.stream.Collectors.summingInt;

/**
 * @author klyff harlley
 * Sum products values using functional interface and lambda
 */
@SpringBootApplication
@Slf4j
public class MainProductSumFuncionalInterface {

    public static void main(String[] args) {
        sumProductValues();
    }

    public static int sumProductValues(){

        List<Product> products = getProducts();
        int amount = products.stream().collect(summingInt(Product::getPrice));

        log.info("========================");
        log.info("\tProduct List ");
        log.info("========================");

        products.forEach(p->log.info("\t{}",p.getPrice()));
        log.info("Sum of Product Values: {}", amount);
        return amount;
    }

    private static List<Product> getProducts(){
        Product p1 = () -> 200;
        Product p2 = () -> 280;
        Product p3= () -> 134;
        Product p4= () -> 501;

        return Arrays.asList(p1,p2,p3,p4);
    }

    /**
     * Functional Interface Product
     */
    static interface Product {
        public Integer getPrice();
    }

}
