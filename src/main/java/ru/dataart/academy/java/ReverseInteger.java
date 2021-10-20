package ru.dataart.academy.java;

public class ReverseInteger {
    /**
     * @param inputNumber - any integer value
     * @return - inputNumber in reversed order
     * Example: 1234 -> 4321
     * -23 -> -32
     * 120 -> 21
     * -2,147,483,648 -> exception and error message
     * If result (number in reversed order) is out of int range [-2,147,483,648,  2,147,483,647] throw custom
     * unchecked exception. In main method (Main class) if exception happened output message with problem to user.
     */
    public int reverse(int inputNumber) {
        //Task implementation
        int result = 0;
        //Число, равное Integer.MIN_VALUE, нельзя представить в виде положительного, так как
        //оно выходит за пределы диапазона int
        if (inputNumber == Integer.MIN_VALUE) {
            throw new RuntimeException("Incorrect number");
        }
        int temp = Math.abs(inputNumber);
        while (temp > 0) {
            if (result > Integer.MAX_VALUE / 10) {
                throw new RuntimeException("Incorrect number");
            }
            result = result * 10 + temp % 10;
            temp /= 10;
        }
        if (inputNumber < 0) {
            result *= -1;
        }
        return result;
    }
}
