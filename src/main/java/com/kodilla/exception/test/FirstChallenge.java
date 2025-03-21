package com.kodilla.exception.test;

public class FirstChallenge {

    public double divide(double a, double b) throws ArithmeticException {
        if (b == 0) {
            throw new ArithmeticException("Nie można dzielić przez zero!");
        }
        return a / b;
    }

    public static void main(String[] args) {
        FirstChallenge firstChallenge = new FirstChallenge();

        try {
            double result = firstChallenge.divide(3, 0);
            System.out.println("Wynik dzielenia: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Błąd: " + e.getMessage());
        } finally {
            System.out.println("Operacja dzielenia została zakończona.");
        }
    }
}
