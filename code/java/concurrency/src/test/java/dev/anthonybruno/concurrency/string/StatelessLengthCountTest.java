package dev.anthonybruno.concurrency.string;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;


public class StatelessLengthCountTest {

    @Test
    void basic() {
        StatelessLength statelessLengthCount = new StatelessLength();
        assertThat(statelessLengthCount.apply("abc")).isEqualTo(3);
        assertThat(statelessLengthCount.apply("abcd")).isEqualTo(4);
    }

}
