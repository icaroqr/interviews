package com.interviews.hexacta.questionTest1;

import com.sun.tools.javac.util.List;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class MenorIntTest {

    private MenorInt menorInt;
    @Test
    void solucaoTest1() {
        assertThat(menorInt.solucao(new int[]{ 0, 1, 2 })).isEqualTo(3);
        assertThat(menorInt.solucao(new int[]{ 1, 2 })).isEqualTo(0);
        assertThat(menorInt.solucao(new int[]{ 0, 1, 5 })).isEqualTo(2);
        assertThat(menorInt.solucao(new int[]{ 0, 1, 100000})).isEqualTo(2);

    }

    @Test
    void solucaoTest2() {
        int[] bigArray = new int[Integer.MAX_VALUE - 1];
        for (int i = 0; i < bigArray.length; i++) {
            bigArray[i] = i;
        }
        assertThat(menorInt.solucao(new int[]{ 0, 1, 100000})).isEqualTo(Integer.MAX_VALUE);
    }
}