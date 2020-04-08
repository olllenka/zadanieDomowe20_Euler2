import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class EulerTest {

    Euler systemUnderTest = new Euler();

    @Test
    void shouldReturnTenWhenMaxElValueIsTen(){
        //given
        int maxElValue = 10;
        //when
        int result = systemUnderTest.sum(maxElValue);
        //then
        int expectedResult = 10;
        assertThat(result)
                .isEqualTo(expectedResult);
    }

    @Test
    void shouldReturnZeroWhenMaxElValueIsZero(){
        //given
        int maxElValue = 0;
        //when
        int result = systemUnderTest.sum(maxElValue);
        //then
        assertThat(result)
                .isZero();
    }

    @Test
    void shouldReturnZeroWhenMaxElValueIsNegativeInt(){
        //given
        int maxElValue = -5;
        //when
        int result = systemUnderTest.sum(maxElValue);
        //then
        assertThat(result)
                .isZero();
    }

    @Test
    void shouldReturnCorrectValueWhenMaxElValueIsFourMillion(){
        //given
        int maxElValue = 4000000;
        //when
        int result = systemUnderTest.sum(maxElValue);
        //then
        int expectedResult = 4613732;
        assertThat(result)
                .isGreaterThan(maxElValue)
                .isEqualTo(expectedResult);
    }
}
