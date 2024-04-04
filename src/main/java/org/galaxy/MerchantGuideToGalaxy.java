package org.galaxy;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MerchantGuideToGalaxy {
    private static final Map<Character, Integer> ROMAN_VALUES = new HashMap<>();

    static {
        ROMAN_VALUES.put('I', 1);
        ROMAN_VALUES.put('V', 5);
        ROMAN_VALUES.put('X', 10);
        ROMAN_VALUES.put('L', 50);
        ROMAN_VALUES.put('C', 100);
        ROMAN_VALUES.put('D', 500);
        ROMAN_VALUES.put('M', 1000);
    }

    public static String romanToIntergalactic(String roman) {
        if (!isValidRoman(roman)) {
            return "No es un número romano válido";
        }
        int result = 0;
        int prevValue = 0;
        int repeatCount = 1;

        for (int i = roman.length() - 1; i >= 0; i--) {
            int currentValue = ROMAN_VALUES.get(roman.charAt(i));
            if (currentValue == prevValue) {
                repeatCount++;
                if (repeatCount > 3) {
                    return "No es un número romano válido";
                }
            } else {
                repeatCount = 1;
            }

            if (currentValue < prevValue ) {
                if (canSubtract(roman.charAt(i), prevValue))
                    result -= currentValue;
                else
                    return "No es un número romano válido";
            } else {
                result += currentValue;
            }
            prevValue = currentValue;
        }

        return String.valueOf(result);
    }

    private static boolean isValidRoman(String roman) {
        // Validar que la cadena solo contenga caracteres válidos de números romanos
        return roman.matches("[IVXLCDM]+");
    }

    private static boolean canSubtract(char currentSymbol, int prevValue) {
        if (prevValue == 0) {
            return false;
        }
        switch (currentSymbol) {
            case 'I':
                return (prevValue == ROMAN_VALUES.get('V') || prevValue == ROMAN_VALUES.get('X'));
            case 'X':
                return (prevValue == ROMAN_VALUES.get('L') || prevValue == ROMAN_VALUES.get('C'));
            case 'C':
                return (prevValue == ROMAN_VALUES.get('D') || prevValue == ROMAN_VALUES.get('M'));
            default:
                return false;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String romanNumber;

        while (true) {
            System.out.print("Ingrese un número romano (presione '0' para salir): ");
            romanNumber = scanner.nextLine().toUpperCase();

            if (romanNumber.equals("0")) {
                System.out.println("Saliendo del programa...");
                break;
            }

            String intergalacticNumber = romanToIntergalactic(romanNumber);
            System.out.println("Número romano: " + romanNumber + ", Número intergaláctico: " + intergalacticNumber);
        }

        scanner.close();
    }
}
