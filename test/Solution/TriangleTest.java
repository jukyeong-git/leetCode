package Solution;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class TriangleTest {

    // 1. 테스트 케이스 데이터를 제공하는 메서드
    static Stream<Arguments> input() {
        Object[][] testCases = {
            {
                List.of(
                    List.of(2),
                    List.of(3, 4),
                    List.of(6, 5, 7),
                    List.of(4, 1, 8, 3)
                ),
                11
            },
            {
                List.of(
                    List.of(-10)
                ),
                -10
            }
        };

        return Arrays.stream(testCases).map(Arguments::of);
    }

    // 2. 실제 테스트를 수행하는 메서드
    @ParameterizedTest(name = "Case {index}")
    @MethodSource("input")
    void TestCases(List<List<Integer>> triangle, int expected) {
        // 실행 (When)
        int actual = Triangle.minimumTotal(triangle);

        // 검증 (Then)
        assertEquals(expected, actual, "Failed for input: " + triangle);
    }
}