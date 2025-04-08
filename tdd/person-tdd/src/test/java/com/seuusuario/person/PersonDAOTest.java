// src/test/java/com/seuusuario/person/PersonDAOTest.java
package com.seuusuario.person;

import com.seuusuario.person.model.Email;
import com.seuusuario.person.model.Person;
import org.junit.jupiter.api.Test;
import com.seuusuario.person.dao.PersonDAO;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class PersonDAOTest {

    PersonDAO dao = new PersonDAO();

    @Test
    public void testNomeComUmaParte() {
        Person p = new Person(1, "Maria", 30);
        p.addEmail(new Email(1, "maria@email.com"));
        List<String> erros = dao.isValidToInclude(p);
        assertTrue(erros.contains("Nome deve conter pelo menos duas partes."));
    }

    @Test
    public void testNomeComNumeros() {
        Person p = new Person(1, "Joao 123", 25);
        p.addEmail(new Email(1, "joao@email.com"));
        List<String> erros = dao.isValidToInclude(p);
        assertTrue(erros.contains("Nome deve conter apenas letras."));
    }

    @Test
    public void testIdadeInvalida() {
        Person p = new Person(1, "Joao Silva", 0);
        p.addEmail(new Email(1, "joao@email.com"));
        List<String> erros = dao.isValidToInclude(p);
        assertTrue(erros.contains("Idade deve estar entre 1 e 200."));
    }

    @Test
    public void testSemEmails() {
        Person p = new Person(1, "Joao Silva", 30);
        List<String> erros = dao.isValidToInclude(p);
        assertTrue(erros.contains("Pessoa deve possuir ao menos um email."));
    }

    @Test
    public void testEmailInvalido() {
        Person p = new Person(1, "Joao Silva", 30);
        p.addEmail(new Email(1, "joaoemail.com"));
        List<String> erros = dao.isValidToInclude(p);
        assertTrue(erros.contains("Email inválido: joaoemail.com"));
    }

    @Test
    public void testPessoaValida() {
        Person p = new Person(1, "Joao Silva", 30);
        p.addEmail(new Email(1, "joao@teste.com"));
        List<String> erros = dao.isValidToInclude(p);
        assertTrue(erros.isEmpty());
    }
}
