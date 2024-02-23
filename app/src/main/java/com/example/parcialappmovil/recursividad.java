package com.example.parcialappmovil;

public class recursividad {

    public static void main(String[] args) {
        int numerador = 16;
        int divisor = 2;

        int resultado = dividirRecursivo(numerador, divisor);

        System.out.println("Resultado de la división: " + resultado);
    }

    public static int dividirRecursivo(int numerador, int divisor) {

        if (numerador < divisor) {
            return 0;
        } else {
            return 1 + dividirRecursivo(numerador - divisor, divisor);
        }
    }
}
