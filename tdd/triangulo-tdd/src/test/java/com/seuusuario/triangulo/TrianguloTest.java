package com.seuusuario.triangulo;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TrianguloTest {

    @Test
    public void testTrianguloEscalenoValido() {
        assertEquals("Escaleno", Triangulo.classificarTriangulo(3, 4, 5));
    }

    @Test
    public void testTrianguloEquilateroValido() {
        assertEquals("Equilátero", Triangulo.classificarTriangulo(5, 5, 5));
    }

    @Test
    public void testTrianguloIsoscelesValido1() {
        assertEquals("Isósceles", Triangulo.classificarTriangulo(5, 5, 3));
    }

    @Test
    public void testTrianguloIsoscelesValido2() {
        assertEquals("Isósceles", Triangulo.classificarTriangulo(5, 3, 5));
    }

    @Test
    public void testTrianguloIsoscelesValido3() {
        assertEquals("Isósceles", Triangulo.classificarTriangulo(3, 5, 5));
    }

    @Test
    public void testValorZero() {
        assertEquals("Valores inválidos", Triangulo.classificarTriangulo(0, 4, 5));
    }

    @Test
    public void testValorNegativo() {
        assertEquals("Valores inválidos", Triangulo.classificarTriangulo(-1, 4, 5));
    }

    @Test
    public void testSomaIgualAoTerceiro1() {
        assertEquals("Não é um triângulo", Triangulo.classificarTriangulo(2, 3, 5));
    }

    @Test
    public void testSomaIgualAoTerceiro2() {
        assertEquals("Não é um triângulo", Triangulo.classificarTriangulo(5, 2, 3));
    }

    @Test
    public void testSomaIgualAoTerceiro3() {
        assertEquals("Não é um triângulo", Triangulo.classificarTriangulo(3, 5, 2));
    }

    @Test
    public void testSomaMenorQueTerceiro1() {
        assertEquals("Não é um triângulo", Triangulo.classificarTriangulo(1, 2, 5));
    }

    @Test
    public void testSomaMenorQueTerceiro2() {
        assertEquals("Não é um triângulo", Triangulo.classificarTriangulo(5, 1, 2));
    }

    @Test
    public void testSomaMenorQueTerceiro3() {
        assertEquals("Não é um triângulo", Triangulo.classificarTriangulo(2, 5, 1));
    }

    @Test
    public void testTodosZeros() {
        assertEquals("Valores inválidos", Triangulo.classificarTriangulo(0, 0, 0));
    }
}
