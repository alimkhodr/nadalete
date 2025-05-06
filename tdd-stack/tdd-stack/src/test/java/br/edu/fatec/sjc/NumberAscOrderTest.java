package br.edu.fatec.sjc;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
public class NumberAscOrderTest {
    @Mock
    CalculableStrategy<Integer> calculableStrategy;
    private CustomStack<Integer> stack;

    @BeforeEach
    public void setup() {
        stack = new CustomStack<>(6, calculableStrategy);
    }

    @Test
    public void testSortWithSixRandomNumbers() throws Exception {
        // Mock para retornar o próprio valor
        Mockito.when(calculableStrategy.calculateValue(Mockito.anyInt())).thenAnswer(inv -> inv.getArgument(0));
        int[] numbers = {42, 7, 23, 56, 15, 3};
        for (int n : numbers) {
            stack.push(n);
        }
        NumberAscOrder<Integer> sorter = new NumberAscOrder<>(stack);
        List<Integer> sorted = sorter.sort();
        assertEquals(6, sorted.size());
        assertIterableEquals(List.of(3, 7, 15, 23, 42, 56), sorted);
    }

    @Test
    public void testSortWithEmptyStack() {
        NumberAscOrder<Integer> sorter = new NumberAscOrder<>(stack);
        List<Integer> sorted = sorter.sort();
        assertTrue(sorted.isEmpty());
    }
}
