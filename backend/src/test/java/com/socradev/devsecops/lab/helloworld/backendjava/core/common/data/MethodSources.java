package com.socradev.devsecops.lab.helloworld.backendjava.core.common.data;

import java.util.stream.Stream;

public class MethodSources {

    private static final String BASE = "com.socradev.devsecops.lab.helloworld.backendjava.core.common.data.MethodSources#";

    public static final String NULL_EMPTY_WHITESPACE = BASE + "nullEmptyWhitespace";
    public static final String NEGATIVE_INTEGERS = BASE + "negativeIntegers";
    public static final String NON_POSITIVE_INTEGERS = BASE + "nonPositiveIntegers";
    public static final String NON_POSITIVE_LONGS = BASE + "nonPositiveLongs";
    public static Stream<String> nullEmptyWhitespace() {
        return Stream.of(null, "", " ", "   ");
    }

    public static Stream<Integer> negativeIntegers() {
        return Stream.of(-1, -2, -10);
    }

    public static Stream<Integer> nonPositiveIntegers() {
        return Stream.of(0, -1, -2, -10);
    }

    public static Stream<Long> nonPositiveLongs() {
        return Stream.of(0L, -1L, -2L, -435264236L);
    }
}
