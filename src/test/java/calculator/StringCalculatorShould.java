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
@Test
public void string_sum_Of_ThreeNumbers_Seperated_ByComma() {
assertEquals(StringCalculator.add("1,2,3"), 6);
}

@Test
public void Stringsums_Numbers_Delimited_ByNewline() {
assertEquals(StringCalculator.add("1\n2"), 3);
}

@Test
public void Stringsums_Numbers_Delimited_ByComma_Or_Newline() {
assertEquals(StringCalculator.add("1,2\n3"), 6);
}
@Rule
public ExpectedException expectedException = ExpectedException.none();

//single negative number
@Test
public void throwsOnNegativeNumber() {
expectedException.expect(IllegalArgumentException.class);
expectedException.expectMessage("negatives not allowed: -3");
StringCalculator.add("-3");
}

//multiple negative numbers
@Test
public void throwsOnNegativeNumbersWithAllNumbersInExceptionMessage() {
expectedException.expect(IllegalArgumentException.class);
expectedException.expectMessage("negatives not allowed: -3,-5,-13");
StringCalculator.add("1,-3,5,-5,-13");
}

@Test
public void String_Maps_Numbers_Above_1000To_LastThreeDigits() {
assertEquals(StringCalculator.add("1002"), 2);
assertEquals(StringCalculator.add("1040,10002"), 42);
    }

@Test
public void String_Accepts_Delimiter_Of_ArbitraryLength() {
assertEquals(StringCalculator.add("//[***]\n1***2***3"),6);
}
}







		
