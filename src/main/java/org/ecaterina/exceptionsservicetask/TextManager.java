package org.ecaterina.exceptionsservicetask;

public class TextManager {
    public static int getTheTextLength(String inputString) {
        return inputString.length();
    }

    public static int getTheTextLengthTryCatchFinally(String inputString) {
        try {
            return inputString.length();
        } catch (NullPointerException capturedExceptionInTryBlock) {
            System.out.println("An Exception has been captured with the following message: " + capturedExceptionInTryBlock.getMessage());
            return 0;
        } finally {
            System.out.println("This code block is executed even though an error was captured or not");
        }
    }

    public static int getTheTextLengthIfElse(String inputString) {
        if (inputString == null) {
            System.out.println("Input string is a null value, pay attention!");
            return 0;
        } else {
            return inputString.length();
        }
    }
}
