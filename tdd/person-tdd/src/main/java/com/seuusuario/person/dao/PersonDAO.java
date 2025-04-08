package com.seuusuario.person.dao;

import com.seuusuario.person.model.Email;
import com.seuusuario.person.model.Person;

import java.util.ArrayList;
import java.util.List;

public class PersonDAO {

    public void save(Person p) {
        // Implementar se necessário
    }

    public List<String> isValidToInclude(Person p) {
        List<String> erros = new ArrayList<>();

        // Validação do nome
        String[] partes = p.getName().trim().split("\\s+");
        if (partes.length < 2) {
            erros.add("Nome deve conter pelo menos duas partes.");
        }

        if (!p.getName().matches("^[A-Za-zÀ-ú\\s]+$")) {
            erros.add("Nome deve conter apenas letras.");
        }

        // Idade entre 1 e 200
        if (p.getAge() < 1 || p.getAge() > 200) {
            erros.add("Idade deve estar entre 1 e 200.");
        }

        // Pelo menos um e-mail
        if (p.getEmails().isEmpty()) {
            erros.add("Pessoa deve possuir ao menos um email.");
        }

        // Validar e-mails
        for (Email e : p.getEmails()) {
            if (!e.getName().matches(".+@.+\\..+")) {
                erros.add("Email inválido: " + e.getName());
            }
        }

        return erros;
    }
}
