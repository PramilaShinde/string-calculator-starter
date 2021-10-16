package calculator;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StringCalculator {

	private String delimiter;
	private String numbers;

	private StringCalculator(String delimiter, String numbers) {
		this.delimiter = delimiter;
		this.numbers = numbers;
	}

	private int sum() {
		ensureNoNegativeNumbers();
		return getNumbers().sum();
	}
		private void ensureNoNegativeNumbers() {
		String negativeNumberSequence = getNumbers().filter(n -> n < 0)
				.mapToObj(Integer::toString)
				.collect(Collectors.joining(","));
		if (!negativeNumberSequence.isEmpty()) {
			throw new IllegalArgumentException("negatives not allowed: " + negativeNumberSequence);
		}
	}

	private IntStream getNumbers() {
		if (numbers.isEmpty()) {
			return IntStream.empty();
		} else {
			return Stream.of(numbers.split(delimiter))
					.mapToInt(Integer::parseInt)
					.map(n -> n % 1000);
		}
	}

	public static int add(String input) {
		return parseInput(input).sum();
	}
