package com.seuusuario.triangulo;

public class Triangulo {

    public static String classificarTriangulo(int a, int b, int c) {
        if (a <= 0 || b <= 0 || c <= 0) {
            return "Valores inválidos";
        }

        if (a + b <= c || a + c <= b || b + c <= a) {
            return "Não é um triângulo";
        }

        if (a == b && b == c) {
            return "Equilátero";
        }

        if (a == b || b == c || a == c) {
            return "Isósceles";
        }

        return "Escaleno";
    }
}
