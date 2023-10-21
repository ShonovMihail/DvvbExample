package tests.simple;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

public class PositiveTests {
    @Test
    void test1 () {
        assert(true);
    }

    @Test
    @Disabled("!")
    void test2 () {
        assert(true);
    }
}
