package com.seuusuario.calculadora;

public class CalculadoraDeSalario {

    public double calcula(Funcionario funcionario) {
        double salario = funcionario.getSalarioBase();
        Cargo cargo = funcionario.getCargo();

        switch (cargo) {
            case DESENVOLVEDOR:
                return (salario >= 3000.0) ? salario * 0.8 : salario * 0.9;
            case DBA:
            case TESTADOR:
                return (salario >= 2000.0) ? salario * 0.75 : salario * 0.85;
            case GERENTE:
                return (salario >= 5000.0) ? salario * 0.7 : salario * 0.8;
            default:
                throw new IllegalArgumentException("Cargo desconhecido: " + cargo);
        }
    }
}
