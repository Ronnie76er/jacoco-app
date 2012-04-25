package models;

import org.junit.Test;
import static org.fest.assertions.Assertions.assertThat;


public class SimpleModelTest {


    @Test
    public void test() {
        int i = 1 + 1;

        assertThat(i).isEqualTo(2);
    }
}