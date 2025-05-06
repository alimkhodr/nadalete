package br.edu.fatec.sjc;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class NumberAscOrder<T extends Number & Comparable<T>> {
    private final CustomStack<T> stack;

    public NumberAscOrder(CustomStack<T> stack) {
        this.stack = stack;
    }

    public List<T> sort() {
        List<T> sortedList = new ArrayList<>();
        if (stack == null || stack.isEmpty()) {
            return sortedList;
        }
        // Copia os elementos da pilha para a lista
        int size = stack.size();
        for (int i = 0; i < size; i++) {
            try {
                sortedList.add(stack.pop());
            } catch (StackEmptyException e) {
                // Não deve acontecer, mas se acontecer, retorna o que já coletou
                break;
            }
        }
        Collections.sort(sortedList);
        return sortedList;
    }
}
