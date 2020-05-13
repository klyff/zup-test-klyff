package org.br.zup.test.klyff;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

/**
 * @author klyff harlley
 */

@SpringBootApplication
@Slf4j
public class MainInvertInteger {

    public static void main(String[] args) {

        scannUserInput();
    }

    /**
     * This Method is used to scan user input at console
     */
    private static void scannUserInput() {

        try {

            log.info("Type a Integer Number (e.g. 10, -541 or X to exit): ");
            Scanner scanIn = new Scanner(System.in);
            String inputString = scanIn.nextLine();

            scanIn.close();
            log.info("Input Number : " + inputString);
            if (inputString.equalsIgnoreCase("X")) {
                System.exit(0);
            }

            reverseInteger(Integer.valueOf(inputString));

        } catch (NumberFormatException e) {
            log.error("Error to convert the input value to a valid Integer. ", e);
        }

    }

    public static int reverseInteger(int inputNumber) {

        int invertedNumber = 0;

        while (inputNumber != 0) {
            int digit = inputNumber % 10;
            invertedNumber = invertedNumber * 10 + digit;
            inputNumber /= 10;
        }

        log.info("Reversed Number: " + invertedNumber);

        return invertedNumber;
    }


}
