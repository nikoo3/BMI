package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj swoją wage: ");
        float waga = scanner.nextFloat();

        System.out.println("Podaj swoj wzrost: ");
        int wzrost = scanner.nextInt()/100;

        float BMI = waga/(wzrost * wzrost);
        System.out.println(BMI);
        System.out.println(BMI > 18.5 || BMI < 24.9 ? "BMI jest optymalne" : "BMI jest nieoptymalne"); }}
