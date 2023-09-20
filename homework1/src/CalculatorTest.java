import static org.assertj.core.api.Assertions.*;

public class CalculatorTest {
    public static void main(String[] args) {
        assertThat(Calculator.calculatingDiscount(3, 30)).isEqualTo(2.1);
        assertThat(Calculator.calculatingDiscount(10, 100)).isEqualTo(0.0);
        assertThat(Calculator.calculatingDiscount(0, 10)).isEqualTo(0.0);


        assertThatThrownBy(() -> Calculator.calculatingDiscount(12, -1))
                .isInstanceOf(ArithmeticException.class);
        assertThatThrownBy(() -> Calculator.calculatingDiscount(12, 101))
                .isInstanceOf(ArithmeticException.class);
    }

}
