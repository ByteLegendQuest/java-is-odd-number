package com.bytelegend;

import com.github.hcsp.test.helper.JavaASTReader;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.stream.IntStream;

public class ChallengeTest {
    @Test
    public void assertContainsTernaryOperator() {
        JavaASTReader.assertContains(
                Challenge.class, com.github.javaparser.ast.expr.ConditionalExpr.class);
    }

    @Test
    public void test() {
        IntStream.range(-10, 10)
                .filter(i -> i % 2 == 0)
                .forEach(i -> Assertions.assertEquals("even", Challenge.isOdd(i)));
        IntStream.range(-10, 10)
                .filter(i -> i % 2 != 0)
                .forEach(i -> Assertions.assertEquals("odd", Challenge.isOdd(i)));
    }
}
