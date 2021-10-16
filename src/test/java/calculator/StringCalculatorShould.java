package calculator;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import com.demo.beans.StringCalculator;
import static org.junit.Assert.assertEquals;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringCalculatorShould {

    @Test
    void empty_string_should_return_0() {
        StringCalculator stringCalculator = new StringCalculator();
        assertEquals(0, stringCalculator.add(""));
    }

    @Test
    void string_with_single_number_should_return_number_as_int() {
        StringCalculator stringCalculator = new StringCalculator();
        assertEquals(1, stringCalculator.add("1"));
    }

   @Test
  public void string_sum_Of_TwoNumbers_Seperated_ByComma() {
  assertEquals(StringCalculator.add("1,2"), 3);
}

}







		
