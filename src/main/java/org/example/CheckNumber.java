package org.example;

public class CheckNumber {

    public String check(int number)
    {
        if((number != 'a' && number != 'z') && (number != 'A' && number != 'Z')) {
            if (number % 2 == 0) {
                return "even";
            } else if (number % 2 != 0) {
                return "odd";
            }
        }
        return "Invalid Input";
    }
}
