package org.ecaterina.exceptionsservicetask;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        int result2 = ArithmeticOperationService.divideIntWithExceptionHandling(10, 0);
        System.out.println(result2);
        System.out.println("The code is running till the end");

        String stringValue = "Homework";
        String stringValue2 = null;

        System.out.println(TextManager.getTheTextLengthTryCatchFinally(stringValue2));
        System.out.println(TextManager.getTheTextLength(stringValue));
        System.out.println(TextManager.getTheTextLengthIfElse(stringValue2));

        String filePath = "org/ecaterina/exceptionsservicetask/test.file";
        try {
            ReadDataManager.readDataFromFileWithoutTryAndCatch(filePath);
        } catch (IOException exceptionObject) {
            System.out.println("The file does not exist, the execution of the code is not interrupted");
        }
        System.out.println("The code is running");
        ReadDataManager.readDataFromFileWithTryAndCatch(filePath);
    }
}
