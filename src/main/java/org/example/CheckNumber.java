package org.example;

public class CheckNumber {

    public String check(int number)
    {
        System.out.println(" CHECK IF NUMBER IS EVEN OR ODD ");
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
