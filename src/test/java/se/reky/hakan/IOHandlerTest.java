package se.reky.hakan;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Scanner;

class IOHandlerTest {


    private IOHandler ioHandlerScanner(String dataForScanner) {
        Scanner scanner = new Scanner(dataForScanner);
        return new IOHandler(scanner);
    }

    @Test
    public void testScannerString() {
        IOHandler scannerInput = ioHandlerScanner("Bye");
        Assertions.assertEquals("Bye", scannerInput.nextLine());

    }



    @Test
    public void testScannerInt() {
        IOHandler ioHandler = ioHandlerScanner("8");
        Assertions.assertTrue(ioHandler.hasNextInt());

    }




}