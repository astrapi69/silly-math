/**
 * The MIT License
 *
 * Copyright (C) 2015 Asterios Raptis
 *
 * Permission is hereby granted, free of charge, to any person obtaining
 * a copy of this software and associated documentation files (the
 * "Software"), to deal in the Software without restriction, including
 * without limitation the rights to use, copy, modify, merge, publish,
 * distribute, sublicense, and/or sell copies of the Software, and to
 * permit persons to whom the Software is furnished to do so, subject to
 * the following conditions:
 *
 * The above copyright notice and this permission notice shall be
 * included in all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND,
 * EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF
 * MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND
 * NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE
 * LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION
 * OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION
 * WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 */
package io.github.astrapi69.math;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

/**
 * The parameterized unit test class for the class {@link MathExtensions}
 */
public class MathExtensionsParameterizedTest
{

	/**
	 * Parameterized test method for {@link MathExtensions#percentageOf(double, double)}
	 */
	@ParameterizedTest
	@CsvSource({ "100.0d, 12.8d, 12.8d", "100.0d, 100.0d, 100.0d",
			"1000000.0d, 15.0d, 150000.0d", })
	public void testPercentageOf(double value, double percentage, double expected)
	{
		assertEquals(expected, MathExtensions.percentageOf(value, percentage));
	}

	/**
	 * Parameterized test method for {@link MathExtensions#percentageOf(float, float)}
	 */
	@ParameterizedTest
	@CsvSource({ "100.0f, 12.8f, 12.800000190734863", "100.0f, 100.0f, 100.0",
			"1000000.0f, 15.0f, 150000.0", })
	public void testPercentageOf(float value, float percentage, float expected)
	{
		assertEquals(expected, MathExtensions.percentageOf(value, percentage));
	}

	/**
	 * Parameterized test method for {@link MathExtensions#isNegative(int)}
	 */
	@ParameterizedTest
	@ValueSource(ints = { -1, -2, -5, -8, -15 })
	public void testIsNegative(final int number)
	{
		assertTrue(MathExtensions.isNegative(number));
	}

	/**
	 * Parameterized test method for
	 * {@link MathExtensions#ruleOfThreeProportional(double, double, double)}
	 */
	@ParameterizedTest
	@MethodSource("provideRuleOfThreeProportionalInputData")
	public void testRuleOfThreeProportional(double a, double b, double c, double expected)
	{
		assertEquals(expected, MathExtensions.ruleOfThreeProportional(a, b, c));
	}

	/**
	 * Factory method for test data for Parameterized tests for the method
	 * {@link MathExtensions#ruleOfThreeProportional(double, double, double)}
	 * 
	 * @return test data for Parameterized tests for the method
	 *         {@link MathExtensions#ruleOfThreeProportional(double, double, double)}
	 */
	private static Stream<Arguments> provideRuleOfThreeProportionalInputData()
	{
		return Stream.of(Arguments.of(2.0d, 8.0d, 5.0d, 20.0d),
			Arguments.of(2.0d, 7.0d, 1.0d, 3.5d));
	}

}
