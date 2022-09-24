package com.interviews.hexacta.questionTest2;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class CombinacoesTest {

    private Combinacoes combinacoes = new Combinacoes();

    @ParameterizedTest
    @MethodSource("paramsProvider")
    void testRetornaCombinacoes(List<Integer> lista, int soma, List<Integer> expected) {
        List<List<Integer>> resultado = combinacoes.retornaCombinacoes(lista, soma);
        assertThat(resultado).isEqualTo(expected);
    }

    static Stream<Arguments> paramsProvider() {
        return Stream.of(
                arguments(List.of(1, 2, 3), 3, List.of(3, 3))
        );
    }
}