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
                .forEach(i -> Assertions.assertEquals(Challenge.isOdd(i), i % 2 != 0));
    }
}
