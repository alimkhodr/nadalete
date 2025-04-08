package com.seuusuario.calculadora;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculadoraDeSalarioTest {

    @Test
    public void deveCalcularSalarioParaDesenvolvedorComSalarioAbaixoDe3000() {
        Funcionario f = new Funcionario("João", "joao@email.com", 2500.0, Cargo.DESENVOLVEDOR);
        double salario = new CalculadoraDeSalario().calcula(f);
        assertEquals(2500.0 * 0.9, salario);
    }

    @Test
    public void deveCalcularSalarioParaDesenvolvedorComSalarioAcimaDe3000() {
        Funcionario f = new Funcionario("Maria", "maria@email.com", 3500.0, Cargo.DESENVOLVEDOR);
        double salario = new CalculadoraDeSalario().calcula(f);
        assertEquals(3500.0 * 0.8, salario);
    }

    @Test
    public void deveCalcularSalarioParaDBAComSalarioAbaixoDe2000() {
        Funcionario f = new Funcionario("Carlos", "carlos@email.com", 1500.0, Cargo.DBA);
        double salario = new CalculadoraDeSalario().calcula(f);
        assertEquals(1500.0 * 0.85, salario);
    }

    @Test
    public void deveCalcularSalarioParaDBAComSalarioAcimaDe2000() {
        Funcionario f = new Funcionario("Ana", "ana@email.com", 2500.0, Cargo.DBA);
        double salario = new CalculadoraDeSalario().calcula(f);
        assertEquals(2500.0 * 0.75, salario);
    }

    @Test
    public void deveCalcularSalarioParaTestadorComSalarioAbaixoDe2000() {
        Funcionario f = new Funcionario("Beto", "beto@email.com", 1800.0, Cargo.TESTADOR);
        double salario = new CalculadoraDeSalario().calcula(f);
        assertEquals(1800.0 * 0.85, salario);
    }

    @Test
    public void deveCalcularSalarioParaTestadorComSalarioAcimaDe2000() {
        Funcionario f = new Funcionario("Júlia", "julia@email.com", 2200.0, Cargo.TESTADOR);
        double salario = new CalculadoraDeSalario().calcula(f);
        assertEquals(2200.0 * 0.75, salario);
    }

    @Test
    public void deveCalcularSalarioParaGerenteComSalarioAbaixoDe5000() {
        Funcionario f = new Funcionario("Laura", "laura@email.com", 4500.0, Cargo.GERENTE);
        double salario = new CalculadoraDeSalario().calcula(f);
        assertEquals(4500.0 * 0.8, salario);
    }

    @Test
    public void deveCalcularSalarioParaGerenteComSalarioAcimaDe5000() {
        Funcionario f = new Funcionario("Fernando", "fernando@email.com", 6000.0, Cargo.GERENTE);
        double salario = new CalculadoraDeSalario().calcula(f);
        assertEquals(6000.0 * 0.7, salario);
    }
}
