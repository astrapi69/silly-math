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
package de.alpharogroup.math;

import org.junit.jupiter.api.AfterEach;
import org.meanbean.test.BeanTester;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * The unit test class for the class {@link MathExtensions}.
 */
public class MathExtensionsTest
{

	boolean actual;
	boolean expected;
	@AfterEach
	public void cleanUpEach(){
		actual = false;
	}

	/**
	 * Test method for {@link MathExtensions#ruleOfThreeProportional(double, double, double)}
	 */
	@Test public void testruleOfThreeProportional()
	{
		double actual;
		double expected;
		// new scenario...
		actual = MathExtensions.ruleOfThreeProportional(2.0d, 8.0d, 5.0d);
		expected = 20.0d;
		assertEquals(actual, expected);
		// new scenario...
		actual = MathExtensions.ruleOfThreeProportional(2.0d, 7.0d, 1.0d);
		expected = 3.5d;
		assertEquals(actual, expected);
	}

	/**
	 * Test method for {@link MathExtensions#percentageOf(double, double)}
	 */
	@Test public void testPercentageOfDoubleDouble()
	{
		double actual;
		double expected;

		// new scenario...
		actual = MathExtensions.percentageOf( 100.0d, 12.8d);
		expected = 12.8d;
		assertEquals(actual, expected);

		// new scenario...
		actual = MathExtensions.percentageOf( 100.0d, 100.0d);
		expected = 100.0d;
		assertEquals(actual, expected);

		// new scenario...
		actual = MathExtensions.percentageOf( 1000000.0d, 1.0d);
		expected = 10000.0d;
		assertEquals(actual, expected);
	}

	/**
	 * Test method for {@link MathExtensions#percentageOf(float, float)}
	 */
	@Test public void testPercentageOfFloatFloat()
	{
		double actual;
		double expected;

		// new scenario...
		actual = MathExtensions.percentageOf( 100.0f, 12.8f);
		expected = 12.800000190734863;
		assertEquals(actual, expected);

		// new scenario...
		actual = MathExtensions.percentageOf( 100.0f, 100.0f);
		expected = 100.0;
		assertEquals(actual, expected);

		// new scenario...
		actual = MathExtensions.percentageOf( 1000000.0f, 15.0f);
		expected = 150000.0;
		assertEquals(actual, expected);
	}

	/**
	 * Test method for {@link MathExtensions#percentageOf(int, int)}
	 */
	@Test public void testPercentageOfIntInt()
	{
		double actual;
		double expected;

		// new scenario...
		actual = MathExtensions.percentageOf( 100, 12);
		expected = 12.0;
		assertEquals(actual, expected);

		// new scenario...
		actual = MathExtensions.percentageOf( 100, 100);
		expected = 100.0;
		assertEquals(actual, expected);

		// new scenario...
		actual = MathExtensions.percentageOf( 1000000, 15);
		expected = 150000.0;
		assertEquals(actual, expected);
	}

	/**
	 * Test method for {@link MathExtensions#percentageOf(long, long)}
	 */
	@Test public void testPercentageOfLongLong()
	{
		double actual;
		double expected;

		// new scenario...
		actual = MathExtensions.percentageOf( 100l, 12l);
		expected = 12.0;
		assertEquals(actual, expected);

		// new scenario...
		actual = MathExtensions.percentageOf( 100l, 100l);
		expected = 100.0;
		assertEquals(actual, expected);

		// new scenario...
		actual = MathExtensions.percentageOf( 1000000l, 15l);
		expected = 150000.0;
		assertEquals(actual, expected);
	}

	/**
	 * Test method for {@link MathExtensions#percentageOf(long, long)}
	 */
	@Test public void testPercentageOfLongLongValueOfHowMuchPercentageOf()
	{
		double actual;
		double expected;

		// new scenario...
		actual = MathExtensions.percentageOf( 100l, 12l, 40l);
		expected = 0.2;
		assertEquals(actual, expected);

		// new scenario...
		actual = MathExtensions.percentageOf( 100l, 100l, 50l);
		expected = 0.02;
		assertEquals(actual, expected);

		// new scenario...
		actual = MathExtensions.percentageOf( 1000000l, 15l, 10000l);
		expected = 6.6666;
		assertEquals(actual, expected);
	}

	/**
	 * Test method for {@link MathExtensions#getNumberOfDigits(int)}.
	 */
	@Test
	public void testGetNumberOfDigits()
	{
		int actual;
		int expected;

		// new scenario...
		actual = MathExtensions.getNumberOfDigits(1);
		expected = 1;
		assertEquals(actual, expected);

		// new scenario...
		actual = MathExtensions.getNumberOfDigits(-1);
		expected = 1;
		assertEquals(actual, expected);

		// new scenario...
		actual = MathExtensions.getNumberOfDigits(10);
		expected = 2;
		assertEquals(actual, expected);

		// new scenario...
		actual = MathExtensions.getNumberOfDigits(-10);
		expected = 2;
		assertEquals(actual, expected);

		// new scenario...
		actual = MathExtensions.getNumberOfDigits(100);
		expected = 3;
		assertEquals(actual, expected);

		// new scenario...
		actual = MathExtensions.getNumberOfDigits(-100);
		expected = 3;
		assertEquals(actual, expected);

		// new scenario...
		actual = MathExtensions.getNumberOfDigits(1000);
		expected = 4;
		assertEquals(actual, expected);

		// new scenario...
		actual = MathExtensions.getNumberOfDigits(-1000);
		expected = 4;
		assertEquals(actual, expected);

		// new scenario...
		actual = MathExtensions.getNumberOfDigits(10000);
		expected = 5;
		assertEquals(actual, expected);

		// new scenario...
		actual = MathExtensions.getNumberOfDigits(-10000);
		expected = 5;
		assertEquals(actual, expected);

		// new scenario...
		actual = MathExtensions.getNumberOfDigits(100000);
		expected = 6;
		assertEquals(actual, expected);

		// new scenario...
		actual = MathExtensions.getNumberOfDigits(-100000);
		expected = 6;
		assertEquals(actual, expected);

		// new scenario...
		actual = MathExtensions.getNumberOfDigits(1000000);
		expected = 7;
		assertEquals(actual, expected);

		// new scenario...
		actual = MathExtensions.getNumberOfDigits(-1000000);
		expected = 7;
		assertEquals(actual, expected);

		// new scenario...
		actual = MathExtensions.getNumberOfDigits(10000000);
		expected = 8;
		assertEquals(actual, expected);

		// new scenario...
		actual = MathExtensions.getNumberOfDigits(-10000000);
		expected = 8;
		assertEquals(actual, expected);

		// new scenario...
		actual = MathExtensions.getNumberOfDigits(100000000);
		expected = 9;
		assertEquals(actual, expected);

		// new scenario...
		actual = MathExtensions.getNumberOfDigits(-100000000);
		expected = 9;
		assertEquals(actual, expected);

		// new scenario...
		actual = MathExtensions.getNumberOfDigits(1000000000);
		expected = 10;
		assertEquals(actual, expected);

		// new scenario...
		actual = MathExtensions.getNumberOfDigits(-1000000000);
		expected = 10;
		assertEquals(actual, expected);

		// new scenario with Integer.MAX_VALUE
		actual = MathExtensions.getNumberOfDigits(2147483647);
		expected = 10;
		assertEquals(actual, expected);

		// new scenario with Integer.MIN_VALUE
		actual = MathExtensions.getNumberOfDigits(-2147483648);
		expected = 10;
		assertEquals(actual, expected);


	}

	/**
	 * Test method for {@link MathExtensions#getPrimeNumbers(int)}.
	 */
	@Test
	public void testGetPrimeNumbers()
	{
		final int[] expected = { 2, 3, 5, 7, 11, 13, 17, 19 };
		final int[] compare = MathExtensions.getPrimeNumbers(8);
		for (int i = 0; i < compare.length; i++)
		{
			actual = expected[i] == compare[i];
			assertTrue(actual);
		}
	}

	/**
	 * Test method for {@link MathExtensions#isBetween(double, double, double)}.
	 */
	@Test
	public void testIsBetweenDoubleDoubleDouble()
	{
		double min;
		double max;
		double index;

		final double primitiveOne = 1.0D;
		min = 0.0D;
		max = 10.0D;
		index = min;

		actual = MathExtensions.isBetween(min, max, index);
		expected = false;
		assertEquals(actual, expected);
		for (index = min + primitiveOne; index < max; index++)
		{
			actual = MathExtensions.isBetween(min, max, index);
			expected = true;
			assertEquals(actual, expected);
		}
		index = max;
		actual = MathExtensions.isBetween(min, max, index);
		expected = false;
		assertEquals(actual, expected);

		// Now check negative cases
		index = min - primitiveOne;
		actual = MathExtensions.isBetween(min, max, index);
		expected = false;
		assertEquals(actual, expected);
		index = max + primitiveOne;
		actual = MathExtensions.isBetween(min, max, index);
		expected = false;
		assertEquals(actual, expected);
	}

	/**
	 * Test method for {@link MathExtensions#isBetween(double, double, double, boolean, boolean)}.
	 */
	@Test
	public void testIsBetweenDoubleDoubleDoubleBooleanBoolean()
	{
		double min;
		double max;
		double index;

		final double primitiveOne = 1.0D;
		min = 0.0D;
		max = 10.0D;

		boolean includeMin;
		boolean includeMax;
		// first test case
		index = min;
		includeMin = false;
		includeMax = false;
		actual = MathExtensions.isBetween(min, max, index, includeMin, includeMax);
		expected = false;
		assertEquals(actual, expected);
		for (index = min + primitiveOne; index < max; index++)
		{
			actual = MathExtensions.isBetween(min, max, index, includeMin, includeMax);
			expected = true;
			assertEquals(actual, expected);
		}
		index = max;
		actual = MathExtensions.isBetween(min, max, index, includeMin, includeMax);
		expected = false;
		assertEquals(actual, expected);

		// Now check negative cases
		index = min - primitiveOne;
		actual = MathExtensions.isBetween(min, max, index, includeMin, includeMax);
		expected = false;
		assertEquals(actual, expected);
		index = max + primitiveOne;
		actual = MathExtensions.isBetween(min, max, index, includeMin, includeMax);
		expected = false;
		assertEquals(actual, expected);

		// second test case
		index = min;
		includeMin = true;
		includeMax = true;
		actual = MathExtensions.isBetween(min, max, index, includeMin, includeMax);
		expected = true;
		assertEquals(actual, expected);
		for (index = min + primitiveOne; index < max; index++)
		{
			actual = MathExtensions.isBetween(min, max, index, includeMin, includeMax);
			expected = true;
			assertEquals(actual, expected);
		}
		index = max;
		actual = MathExtensions.isBetween(min, max, index, includeMin, includeMax);
		expected = true;
		assertEquals(actual, expected);
		// Now check negative cases
		index = min - primitiveOne;
		actual = MathExtensions.isBetween(min, max, index, includeMin, includeMax);
		expected = false;
		assertEquals(actual, expected);
		index = max + primitiveOne;
		actual = MathExtensions.isBetween(min, max, index, includeMin, includeMax);
		expected = false;
		assertEquals(actual, expected);

		// third test case
		index = min;
		includeMin = false;
		includeMax = true;
		actual = MathExtensions.isBetween(min, max, index, includeMin, includeMax);
		expected = false;
		assertEquals(actual, expected);
		for (index = min + primitiveOne; index < max; index++)
		{
			actual = MathExtensions.isBetween(min, max, index, includeMin, includeMax);
			expected = true;
			assertEquals(actual, expected);
		}
		index = max;
		actual = MathExtensions.isBetween(min, max, index, includeMin, includeMax);
		expected = true;
		assertEquals(actual, expected);
		// Now check negative cases
		index = min - primitiveOne;
		actual = MathExtensions.isBetween(min, max, index, includeMin, includeMax);
		expected = false;
		assertEquals(actual, expected);
		index = max + primitiveOne;
		actual = MathExtensions.isBetween(min, max, index, includeMin, includeMax);
		expected = false;
		assertEquals(actual, expected);

		// fourth test case
		index = min;
		includeMin = true;
		includeMax = false;
		actual = MathExtensions.isBetween(min, max, index, includeMin, includeMax);
		expected = true;
		assertEquals(actual, expected);
		for (index = min + primitiveOne; index < max; index++)
		{
			actual = MathExtensions.isBetween(min, max, index, includeMin, includeMax);
			expected = true;
			assertEquals(actual, expected);
		}
		index = max;
		actual = MathExtensions.isBetween(min, max, index, includeMin, includeMax);
		expected = false;
		assertEquals(actual, expected);
		// Now check negative cases
		index = min - primitiveOne;
		actual = MathExtensions.isBetween(min, max, index, includeMin, includeMax);
		expected = false;
		assertEquals(actual, expected);
		index = max + primitiveOne;
		actual = MathExtensions.isBetween(min, max, index, includeMin, includeMax);
		expected = false;
		assertEquals(actual, expected);
	}

	/**
	 * Test method for {@link MathExtensions#isBetween(float, float, float)}.
	 */
	@Test
	public void testIsBetweenFloatFloatFloat()
	{
		float min;
		float max;
		float index;

		final float primitiveOne = 1.0F;
		min = 0.0F;
		max = 10.0F;
		index = min;

		actual = MathExtensions.isBetween(min, max, index);
		expected = false;
		assertEquals(actual, expected);
		for (index = min + primitiveOne; index < max; index++)
		{
			actual = MathExtensions.isBetween(min, max, index);
			expected = true;
			assertEquals(actual, expected);
		}
		index = max;
		actual = MathExtensions.isBetween(min, max, index);
		expected = false;
		assertEquals(actual, expected);

		// Now check negative cases
		index = min - primitiveOne;
		actual = MathExtensions.isBetween(min, max, index);
		expected = false;
		assertEquals(actual, expected);
		index = max + primitiveOne;
		actual = MathExtensions.isBetween(min, max, index);
		expected = false;
		assertEquals(actual, expected);
	}

	/**
	 * Test method for {@link MathExtensions#isBetween(float, float, float, boolean, boolean)}.
	 */
	@Test
	public void testIsBetweenFloatFloatFloatBooleanBoolean()
	{
		float min;
		float max;
		float index;

		final float primitiveOne = 1.0F;
		min = 0.0F;
		max = 10.0F;

		boolean includeMin;
		boolean includeMax;
		// first test case
		index = min;
		includeMin = false;
		includeMax = false;
		actual = MathExtensions.isBetween(min, max, index, includeMin, includeMax);
		expected = false;
		assertEquals(actual, expected);
		for (index = min + primitiveOne; index < max; index++)
		{
			actual = MathExtensions.isBetween(min, max, index, includeMin, includeMax);
			expected = true;
			assertEquals(actual, expected);
		}
		index = max;
		actual = MathExtensions.isBetween(min, max, index, includeMin, includeMax);
		expected = false;
		assertEquals(actual, expected);

		// Now check negative cases
		index = min - primitiveOne;
		actual = MathExtensions.isBetween(min, max, index, includeMin, includeMax);
		expected = false;
		assertEquals(actual, expected);
		index = max + primitiveOne;
		actual = MathExtensions.isBetween(min, max, index, includeMin, includeMax);
		expected = false;
		assertEquals(actual, expected);

		// second test case
		index = min;
		includeMin = true;
		includeMax = true;
		actual = MathExtensions.isBetween(min, max, index, includeMin, includeMax);
		expected = true;
		assertEquals(actual, expected);
		for (index = min + primitiveOne; index < max; index++)
		{
			actual = MathExtensions.isBetween(min, max, index, includeMin, includeMax);
			expected = true;
			assertEquals(actual, expected);
		}
		index = max;
		actual = MathExtensions.isBetween(min, max, index, includeMin, includeMax);
		expected = true;
		assertEquals(actual, expected);
		// Now check negative cases
		index = min - primitiveOne;
		actual = MathExtensions.isBetween(min, max, index, includeMin, includeMax);
		expected = false;
		assertEquals(actual, expected);
		index = max + primitiveOne;
		actual = MathExtensions.isBetween(min, max, index, includeMin, includeMax);
		expected = false;
		assertEquals(actual, expected);

		// third test case
		index = min;
		includeMin = false;
		includeMax = true;
		actual = MathExtensions.isBetween(min, max, index, includeMin, includeMax);
		expected = false;
		assertEquals(actual, expected);
		for (index = min + primitiveOne; index < max; index++)
		{
			actual = MathExtensions.isBetween(min, max, index, includeMin, includeMax);
			expected = true;
			assertEquals(actual, expected);
		}
		index = max;
		actual = MathExtensions.isBetween(min, max, index, includeMin, includeMax);
		expected = true;
		assertEquals(actual, expected);
		// Now check negative cases
		index = min - primitiveOne;
		actual = MathExtensions.isBetween(min, max, index, includeMin, includeMax);
		expected = false;
		assertEquals(actual, expected);
		index = max + primitiveOne;
		actual = MathExtensions.isBetween(min, max, index, includeMin, includeMax);
		expected = false;
		assertEquals(actual, expected);

		// fourth test case
		index = min;
		includeMin = true;
		includeMax = false;
		actual = MathExtensions.isBetween(min, max, index, includeMin, includeMax);
		expected = true;
		assertEquals(actual, expected);
		for (index = min + primitiveOne; index < max; index++)
		{
			actual = MathExtensions.isBetween(min, max, index, includeMin, includeMax);
			expected = true;
			assertEquals(actual, expected);
		}
		index = max;
		actual = MathExtensions.isBetween(min, max, index, includeMin, includeMax);
		expected = false;
		assertEquals(actual, expected);
		// Now check negative cases
		index = min - primitiveOne;
		actual = MathExtensions.isBetween(min, max, index, includeMin, includeMax);
		expected = false;
		assertEquals(actual, expected);
		index = max + primitiveOne;
		actual = MathExtensions.isBetween(min, max, index, includeMin, includeMax);
		expected = false;
		assertEquals(actual, expected);
	}

	/**
	 * Test method for {@link MathExtensions#isBetween(int, int, int)}.
	 */
	@Test
	public void testIsBetweenIntIntInt()
	{
		int min;
		int max;
		int index;

		final int primitiveOne = 1;
		min = 0;
		max = 10;
		index = min;

		actual = MathExtensions.isBetween(min, max, index);
		expected = false;
		assertEquals(actual, expected);
		for (index = min + primitiveOne; index < max; index++)
		{
			actual = MathExtensions.isBetween(min, max, index);
			expected = true;
			assertEquals(actual, expected);
		}
		index = max;
		actual = MathExtensions.isBetween(min, max, index);
		expected = false;
		assertEquals(actual, expected);

		// Now check negative cases
		index = min - primitiveOne;
		actual = MathExtensions.isBetween(min, max, index);
		expected = false;
		assertEquals(actual, expected);
		index = max + primitiveOne;
		actual = MathExtensions.isBetween(min, max, index);
		expected = false;
		assertEquals(actual, expected);

	}

	/**
	 * Test method for {@link MathExtensions#isBetween(int, int, int, boolean, boolean)}.
	 */
	@Test
	public void testIsBetweenIntIntIntBooleanBoolean()
	{
		int min;
		int max;
		int index;
		final int primitiveOne = 1;
		boolean includeMin;
		boolean includeMax;
		min = 0;
		max = 10;
		// first test case
		index = min;
		includeMin = false;
		includeMax = false;
		actual = MathExtensions.isBetween(min, max, index, includeMin, includeMax);
		expected = false;
		assertEquals(actual, expected);
		for (index = min + primitiveOne; index < max; index++)
		{
			actual = MathExtensions.isBetween(min, max, index, includeMin, includeMax);
			expected = true;
			assertEquals(actual, expected);
		}
		index = max;
		actual = MathExtensions.isBetween(min, max, index, includeMin, includeMax);
		expected = false;
		assertEquals(actual, expected);

		// Now check negative cases
		index = min - primitiveOne;
		actual = MathExtensions.isBetween(min, max, index, includeMin, includeMax);
		expected = false;
		assertEquals(actual, expected);
		index = max + primitiveOne;
		actual = MathExtensions.isBetween(min, max, index, includeMin, includeMax);
		expected = false;
		assertEquals(actual, expected);

		// second test case
		index = min;
		includeMin = true;
		includeMax = true;
		actual = MathExtensions.isBetween(min, max, index, includeMin, includeMax);
		expected = true;
		assertEquals(actual, expected);
		for (index = min + primitiveOne; index < max; index++)
		{
			actual = MathExtensions.isBetween(min, max, index, includeMin, includeMax);
			expected = true;
			assertEquals(actual, expected);
		}
		index = max;
		actual = MathExtensions.isBetween(min, max, index, includeMin, includeMax);
		expected = true;
		assertEquals(actual, expected);
		// Now check negative cases
		index = min - primitiveOne;
		actual = MathExtensions.isBetween(min, max, index, includeMin, includeMax);
		expected = false;
		assertEquals(actual, expected);
		index = max + primitiveOne;
		actual = MathExtensions.isBetween(min, max, index, includeMin, includeMax);
		expected = false;
		assertEquals(actual, expected);

		// third test case
		index = min;
		includeMin = false;
		includeMax = true;
		actual = MathExtensions.isBetween(min, max, index, includeMin, includeMax);
		expected = false;
		assertEquals(actual, expected);
		for (index = min + primitiveOne; index < max; index++)
		{
			actual = MathExtensions.isBetween(min, max, index, includeMin, includeMax);
			expected = true;
			assertEquals(actual, expected);
		}
		index = max;
		actual = MathExtensions.isBetween(min, max, index, includeMin, includeMax);
		expected = true;
		assertEquals(actual, expected);
		// Now check negative cases
		index = min - primitiveOne;
		actual = MathExtensions.isBetween(min, max, index, includeMin, includeMax);
		expected = false;
		assertEquals(actual, expected);
		index = max + primitiveOne;
		actual = MathExtensions.isBetween(min, max, index, includeMin, includeMax);
		expected = false;
		assertEquals(actual, expected);

		// fourth test case
		index = min;
		includeMin = true;
		includeMax = false;
		actual = MathExtensions.isBetween(min, max, index, includeMin, includeMax);
		expected = true;
		assertEquals(actual, expected);
		for (index = min + primitiveOne; index < max; index++)
		{
			actual = MathExtensions.isBetween(min, max, index, includeMin, includeMax);
			expected = true;
			assertEquals(actual, expected);
		}
		index = max;
		actual = MathExtensions.isBetween(min, max, index, includeMin, includeMax);
		expected = false;
		assertEquals(actual, expected);
		// Now check negative cases
		index = min - primitiveOne;
		actual = MathExtensions.isBetween(min, max, index, includeMin, includeMax);
		expected = false;
		assertEquals(actual, expected);
		index = max + primitiveOne;
		actual = MathExtensions.isBetween(min, max, index, includeMin, includeMax);
		expected = false;
		assertEquals(actual, expected);
	}

	/**
	 * Test method for {@link MathExtensions#isBetween(long, long, long)}.
	 */
	@Test
	public void testIsBetweenLongLongLong()
	{
		long min;
		long max;
		long index;

		final long primitiveOne = 1L;
		min = 0L;
		max = 10L;
		index = min;

		actual = MathExtensions.isBetween(min, max, index);
		expected = false;
		assertEquals(actual, expected);
		for (index = min + primitiveOne; index < max; index++)
		{
			actual = MathExtensions.isBetween(min, max, index);
			expected = true;
			assertEquals(actual, expected);
		}
		index = max;
		actual = MathExtensions.isBetween(min, max, index);
		expected = false;
		assertEquals(actual, expected);

		// Now check negative cases
		index = min - primitiveOne;
		actual = MathExtensions.isBetween(min, max, index);
		expected = false;
		assertEquals(actual, expected);
		index = max + primitiveOne;
		actual = MathExtensions.isBetween(min, max, index);
		expected = false;
		assertEquals(actual, expected);
	}

	/**
	 * Test method for {@link MathExtensions#isBetween(long, long, long, boolean, boolean)}.
	 */
	@Test
	public void testIsBetweenLongLongLongBooleanBoolean()
	{
		long min;
		long max;
		long index;
		final long primitiveOne = 1L;
		min = 0L;
		max = 10L;
		boolean includeMin;
		boolean includeMax;
		// first test case
		index = min;
		includeMin = false;
		includeMax = false;
		actual = MathExtensions.isBetween(min, max, index, includeMin, includeMax);
		expected = false;
		assertEquals(actual, expected);
		for (index = min + primitiveOne; index < max; index++)
		{
			actual = MathExtensions.isBetween(min, max, index, includeMin, includeMax);
			expected = true;
			assertEquals(actual, expected);
		}
		index = max;
		actual = MathExtensions.isBetween(min, max, index, includeMin, includeMax);
		expected = false;
		assertEquals(actual, expected);

		// Now check negative cases
		index = min - primitiveOne;
		actual = MathExtensions.isBetween(min, max, index, includeMin, includeMax);
		expected = false;
		assertEquals(actual, expected);
		index = max + primitiveOne;
		actual = MathExtensions.isBetween(min, max, index, includeMin, includeMax);
		expected = false;
		assertEquals(actual, expected);

		// second test case
		index = min;
		includeMin = true;
		includeMax = true;
		actual = MathExtensions.isBetween(min, max, index, includeMin, includeMax);
		expected = true;
		assertEquals(actual, expected);
		for (index = min + primitiveOne; index < max; index++)
		{
			actual = MathExtensions.isBetween(min, max, index, includeMin, includeMax);
			expected = true;
			assertEquals(actual, expected);
		}
		index = max;
		actual = MathExtensions.isBetween(min, max, index, includeMin, includeMax);
		expected = true;
		assertEquals(actual, expected);
		// Now check negative cases
		index = min - primitiveOne;
		actual = MathExtensions.isBetween(min, max, index, includeMin, includeMax);
		expected = false;
		assertEquals(actual, expected);
		index = max + primitiveOne;
		actual = MathExtensions.isBetween(min, max, index, includeMin, includeMax);
		expected = false;
		assertEquals(actual, expected);

		// third test case
		index = min;
		includeMin = false;
		includeMax = true;
		actual = MathExtensions.isBetween(min, max, index, includeMin, includeMax);
		expected = false;
		assertEquals(actual, expected);
		for (index = min + primitiveOne; index < max; index++)
		{
			actual = MathExtensions.isBetween(min, max, index, includeMin, includeMax);
			expected = true;
			assertEquals(actual, expected);
		}
		index = max;
		actual = MathExtensions.isBetween(min, max, index, includeMin, includeMax);
		expected = true;
		assertEquals(actual, expected);
		// Now check negative cases
		index = min - primitiveOne;
		actual = MathExtensions.isBetween(min, max, index, includeMin, includeMax);
		expected = false;
		assertEquals(actual, expected);
		index = max + primitiveOne;
		actual = MathExtensions.isBetween(min, max, index, includeMin, includeMax);
		expected = false;
		assertEquals(actual, expected);

		// fourth test case
		index = min;
		includeMin = true;
		includeMax = false;
		actual = MathExtensions.isBetween(min, max, index, includeMin, includeMax);
		expected = true;
		assertEquals(actual, expected);
		for (index = min + primitiveOne; index < max; index++)
		{
			actual = MathExtensions.isBetween(min, max, index, includeMin, includeMax);
			expected = true;
			assertEquals(actual, expected);
		}
		index = max;
		actual = MathExtensions.isBetween(min, max, index, includeMin, includeMax);
		expected = false;
		assertEquals(actual, expected);
		// Now check negative cases
		index = min - primitiveOne;
		actual = MathExtensions.isBetween(min, max, index, includeMin, includeMax);
		expected = false;
		assertEquals(actual, expected);
		index = max + primitiveOne;
		actual = MathExtensions.isBetween(min, max, index, includeMin, includeMax);
		expected = false;
		assertEquals(actual, expected);
	}

	/**
	 * Test method for {@link MathExtensions#isInRange(int, int, int)}.
	 */
	@Test
	public void testIsInRange()
	{

		actual = MathExtensions.isInRange(13, 24, 12);
		expected = false;
		assertEquals(actual, expected);

		actual = MathExtensions.isInRange(13, 24, 13);
		expected = false;
		assertEquals(actual, expected);

		actual = MathExtensions.isInRange(13, 24, 14);
		expected = true;
		assertEquals(actual, expected);

		actual = MathExtensions.isInRange(13, 24, 23);
		expected = true;
		assertEquals(actual, expected);

		actual = MathExtensions.isInRange(13, 24, 24);
		expected = false;
		assertEquals(actual, expected);

		actual = MathExtensions.isInRange(13, 24, 25);
		expected = false;
		assertEquals(actual, expected);
	}

	// ===================================================================================== //

	/**
	 * Test method for {@link MathExtensions#isNegative(int)}.
	 */
	@Test
	public void testIsNegative()
	{
		final int negative = -10;
		actual = MathExtensions.isNegative(negative);
		expected = true;
		assertEquals(actual, expected);

		final int ambisious = 0;
		actual = MathExtensions.isNegative(ambisious);
		expected = true;
		assertEquals(actual, expected);

		final int positive = 1;
		actual = MathExtensions.isNegative(positive);
		expected = false;
		assertEquals(actual, expected);
	}

	/**
	 * Test method for {@link MathExtensions#isNegative(double)}.
	 */
	@Test
	public void testIsNegativeDouble()
	{
		final double negative = -10.0D;
		actual = MathExtensions.isNegative(negative);
		expected = true;
		assertEquals(actual, expected);

		final double ambisious = 0.0D;
		actual = MathExtensions.isNegative(ambisious);
		expected = true;
		assertEquals(actual, expected);

		final double positive = 1.0D;
		actual = MathExtensions.isNegative(positive);
		expected = false;
		assertEquals(actual, expected);
	}

	/**
	 * Test method for {@link MathExtensions#isNegative(float)}.
	 */
	@Test
	public void testIsNegativeFloat()
	{
		final float negative = -10.0F;
		actual = MathExtensions.isNegative(negative);
		expected = true;
		assertEquals(actual, expected);

		final float ambisious = 0.0F;
		actual = MathExtensions.isNegative(ambisious);
		expected = true;
		assertEquals(actual, expected);

		final float positive = 1.0F;
		actual = MathExtensions.isNegative(positive);
		expected = false;
		assertEquals(actual, expected);
	}

	/**
	 * Test method for {@link MathExtensions#isNegative(long)}.
	 */
	@Test
	public void testIsNegativeLong()
	{
		final long negative = -10L;
		actual = MathExtensions.isNegative(negative);
		expected = true;
		assertEquals(actual, expected);

		final long ambisious = 0L;
		actual = MathExtensions.isNegative(ambisious);
		expected = true;
		assertEquals(actual, expected);

		final long positive = 1L;
		actual = MathExtensions.isNegative(positive);
		expected = false;
		assertEquals(actual, expected);
	}

	/**
	 * Test method for {@link MathExtensions#isNext(Integer, Integer)}.
	 */
	@Test
	public void testIsNext()
	{
		actual = MathExtensions.isNext(0, -1);
		expected = false;
		assertEquals(actual, expected);

		actual = MathExtensions.isNext(0, 0);
		expected = false;
		assertEquals(actual, expected);

		actual = MathExtensions.isNext(0, 1);
		expected = true;
		assertEquals(actual, expected);
	}

	/**
	 * Test method for {@link MathExtensions#isPositive(int)}.
	 */
	@Test
	public void testIsPositive()
	{
		final int negative = -10;
		actual = MathExtensions.isPositive(negative);
		expected = false;
		assertEquals(actual, expected);

		final int ambisious = 0;
		actual = MathExtensions.isPositive(ambisious);
		expected = false;
		assertEquals(actual, expected);

		final int positive = 1;
		actual = MathExtensions.isPositive(positive);
		expected = true;
		assertEquals(actual, expected);
	}

	/**
	 * Test method for {@link MathExtensions#isPositive(double)}.
	 */
	@Test
	public void testIsPositiveDouble()
	{
		final double negative = -10.D;
		actual = MathExtensions.isPositive(negative);
		expected = false;
		assertEquals(actual, expected);

		final double ambisious = 0.D;
		actual = MathExtensions.isPositive(ambisious);
		expected = false;
		assertEquals(actual, expected);

		final double positive = 1.D;
		actual = MathExtensions.isPositive(positive);
		expected = true;
		assertEquals(actual, expected);
	}

	/**
	 * Test method for {@link MathExtensions#isPositive(float)}.
	 */
	@Test
	public void testIsPositiveFloat()
	{
		final float negative = -10.F;
		actual = MathExtensions.isPositive(negative);
		expected = false;
		assertEquals(actual, expected);

		final float ambisious = 0.F;
		actual = MathExtensions.isPositive(ambisious);
		expected = false;
		assertEquals(actual, expected);

		final float positive = 1.F;
		actual = MathExtensions.isPositive(positive);
		expected = true;
		assertEquals(actual, expected);
	}

	/**
	 * Test method for {@link MathExtensions#isPositive(long)}.
	 */
	@Test
	public void testIsPositiveLong()
	{
		final long negative = -10L;
		actual = MathExtensions.isPositive(negative);
		expected = false;
		assertEquals(actual, expected);

		final long ambisious = 0L;
		actual = MathExtensions.isPositive(ambisious);
		expected = false;
		assertEquals(actual, expected);

		final long positive = 1L;
		actual = MathExtensions.isPositive(positive);
		expected = true;
		assertEquals(actual, expected);
	}

	/**
	 * Test method for {@link MathExtensions#isPrevious(Integer, Integer)}.
	 */
	@Test
	public void testIsPrevious()
	{
		actual = MathExtensions.isPrevious(0, -1);
		expected = true;
		assertEquals(actual, expected);

		actual = MathExtensions.isPrevious(0, 0);
		expected = false;
		assertEquals(actual, expected);

		actual = MathExtensions.isPrevious(0, 1);
		expected = false;
		assertEquals(actual, expected);
	}

	/**
	 * Test method for {@link MathExtensions#isPrime(double)}.
	 */
	@Test
	public void testIsPrimeDouble()
	{
		actual = MathExtensions.isPrime(0.0D);

		actual = MathExtensions.isPrime(0.0D);
		expected = true;
		assertEquals(actual, expected);

		actual = MathExtensions.isPrime(1.0D);
		expected = true;
		assertEquals(actual, expected);

		actual = MathExtensions.isPrime(2.0D);
		expected = true;
		assertEquals(actual, expected);

		actual = MathExtensions.isPrime(3.0D);
		expected = true;
		assertEquals(actual, expected);

		actual = MathExtensions.isPrime(4.0D);
		expected = false;
		assertEquals(actual, expected);

		actual = MathExtensions.isPrime(5.0D);
		expected = true;
		assertEquals(actual, expected);

		actual = MathExtensions.isPrime(6.0D);
		expected = false;
		assertEquals(actual, expected);

		actual = MathExtensions.isPrime(7.0D);
		expected = true;
		assertEquals(actual, expected);

		actual = MathExtensions.isPrime(8.0D);
		expected = false;
		assertEquals(actual, expected);

		actual = MathExtensions.isPrime(9.0D);
		expected = false;
		assertEquals(actual, expected);

		actual = MathExtensions.isPrime(10.0D);
		expected = false;
		assertEquals(actual, expected);

		actual = MathExtensions.isPrime(11.0D);
		expected = true;
		assertEquals(actual, expected);

		actual = MathExtensions.isPrime(12.0D);
		expected = false;
		assertEquals(actual, expected);

		actual = MathExtensions.isPrime(13.0D);
		expected = true;
		assertEquals(actual, expected);

		actual = MathExtensions.isPrime(14.0D);
		assertFalse(actual);

		actual = MathExtensions.isPrime(15.0D);
		expected = false;
		assertEquals(actual, expected);

		actual = MathExtensions.isPrime(16.0D);
		expected = false;
		assertEquals(actual, expected);

		actual = MathExtensions.isPrime(17.0D);
		expected = true;
		assertEquals(actual, expected);

		actual = MathExtensions.isPrime(18.0D);
		expected = false;
		assertEquals(actual, expected);

		actual = MathExtensions.isPrime(19.0D);
		expected = true;
		assertEquals(actual, expected);
	}

	/**
	 * Test method for {@link MathExtensions#isPrime(float)}.
	 */
	@Test
	public void testIsPrimeFloat()
	{
		actual = MathExtensions.isPrime(0.0F);

		actual = MathExtensions.isPrime(0.0F);
		expected = true;
		assertEquals(actual, expected);

		actual = MathExtensions.isPrime(1.0F);
		expected = true;
		assertEquals(actual, expected);

		actual = MathExtensions.isPrime(2.0F);
		expected = true;
		assertEquals(actual, expected);

		actual = MathExtensions.isPrime(3.0F);
		expected = true;
		assertEquals(actual, expected);

		actual = MathExtensions.isPrime(4.0F);
		expected = false;
		assertEquals(actual, expected);

		actual = MathExtensions.isPrime(5.0F);
		expected = true;
		assertEquals(actual, expected);

		actual = MathExtensions.isPrime(6.0F);
		expected = false;
		assertEquals(actual, expected);

		actual = MathExtensions.isPrime(7.0F);
		expected = true;
		assertEquals(actual, expected);

		actual = MathExtensions.isPrime(8.0F);
		expected = false;
		assertEquals(actual, expected);

		actual = MathExtensions.isPrime(9.0F);
		expected = false;
		assertEquals(actual, expected);

		actual = MathExtensions.isPrime(10.0F);
		expected = false;
		assertEquals(actual, expected);

		actual = MathExtensions.isPrime(11.0F);
		expected = true;
		assertEquals(actual, expected);

		actual = MathExtensions.isPrime(12.0F);
		expected = false;
		assertEquals(actual, expected);

		actual = MathExtensions.isPrime(13.0F);
		expected = true;
		assertEquals(actual, expected);

		actual = MathExtensions.isPrime(14.0F);
		assertFalse(actual);

		actual = MathExtensions.isPrime(15.0F);
		expected = false;
		assertEquals(actual, expected);

		actual = MathExtensions.isPrime(16.0F);
		expected = false;
		assertEquals(actual, expected);

		actual = MathExtensions.isPrime(17.0F);
		expected = true;
		assertEquals(actual, expected);

		actual = MathExtensions.isPrime(18.0F);
		expected = false;
		assertEquals(actual, expected);

		actual = MathExtensions.isPrime(19.0F);
		expected = true;
		assertEquals(actual, expected);
	}

	/**
	 * Test method for {@link MathExtensions#isPrime(int)}.
	 */
	@Test
	public void testIsPrimeInt()
	{
		actual = MathExtensions.isPrime(0);
		expected = true;
		assertEquals(actual, expected);

		actual = MathExtensions.isPrime(1);
		expected = true;
		assertEquals(actual, expected);

		actual = MathExtensions.isPrime(2);
		expected = true;
		assertEquals(actual, expected);

		actual = MathExtensions.isPrime(3);
		expected = true;
		assertEquals(actual, expected);

		actual = MathExtensions.isPrime(4);
		expected = false;
		assertEquals(actual, expected);

		actual = MathExtensions.isPrime(5);
		expected = true;
		assertEquals(actual, expected);

		actual = MathExtensions.isPrime(6);
		expected = false;
		assertEquals(actual, expected);

		actual = MathExtensions.isPrime(7);
		expected = true;
		assertEquals(actual, expected);

		actual = MathExtensions.isPrime(8);
		expected = false;
		assertEquals(actual, expected);

		actual = MathExtensions.isPrime(9);
		expected = false;
		assertEquals(actual, expected);

		actual = MathExtensions.isPrime(10);
		expected = false;
		assertEquals(actual, expected);

		actual = MathExtensions.isPrime(11);
		expected = true;
		assertEquals(actual, expected);

		actual = MathExtensions.isPrime(12);
		expected = false;
		assertEquals(actual, expected);

		actual = MathExtensions.isPrime(13);
		expected = true;
		assertEquals(actual, expected);

		actual = MathExtensions.isPrime(14);
		assertFalse(actual);

		actual = MathExtensions.isPrime(15);
		expected = false;
		assertEquals(actual, expected);

		actual = MathExtensions.isPrime(16);
		expected = false;
		assertEquals(actual, expected);

		actual = MathExtensions.isPrime(17);
		expected = true;
		assertEquals(actual, expected);

		actual = MathExtensions.isPrime(18);
		expected = false;
		assertEquals(actual, expected);

		actual = MathExtensions.isPrime(19);
		expected = true;
		assertEquals(actual, expected);
	}

	/**
	 * Test method for {@link MathExtensions#isPrime(long)}.
	 */
	@Test
	public void testIsPrimeLong()
	{
		actual = MathExtensions.isPrime(0L);

		actual = MathExtensions.isPrime(0L);
		expected = true;
		assertEquals(actual, expected);

		actual = MathExtensions.isPrime(1L);
		expected = true;
		assertEquals(actual, expected);

		actual = MathExtensions.isPrime(2L);
		expected = true;
		assertEquals(actual, expected);

		actual = MathExtensions.isPrime(3L);
		expected = true;
		assertEquals(actual, expected);

		actual = MathExtensions.isPrime(4L);
		expected = false;
		assertEquals(actual, expected);

		actual = MathExtensions.isPrime(5L);
		expected = true;
		assertEquals(actual, expected);

		actual = MathExtensions.isPrime(6L);
		expected = false;
		assertEquals(actual, expected);

		actual = MathExtensions.isPrime(7L);
		expected = true;
		assertEquals(actual, expected);

		actual = MathExtensions.isPrime(8L);
		expected = false;
		assertEquals(actual, expected);

		actual = MathExtensions.isPrime(9L);
		expected = false;
		assertEquals(actual, expected);

		actual = MathExtensions.isPrime(10L);
		expected = false;
		assertEquals(actual, expected);

		actual = MathExtensions.isPrime(11L);
		expected = true;
		assertEquals(actual, expected);

		actual = MathExtensions.isPrime(12L);
		expected = false;
		assertEquals(actual, expected);

		actual = MathExtensions.isPrime(13L);
		expected = true;
		assertEquals(actual, expected);

		actual = MathExtensions.isPrime(14L);
		assertFalse(actual);

		actual = MathExtensions.isPrime(15L);
		expected = false;
		assertEquals(actual, expected);

		actual = MathExtensions.isPrime(16L);
		expected = false;
		assertEquals(actual, expected);

		actual = MathExtensions.isPrime(17L);
		expected = true;
		assertEquals(actual, expected);

		actual = MathExtensions.isPrime(18L);
		expected = false;
		assertEquals(actual, expected);

		actual = MathExtensions.isPrime(19L);
		expected = true;
		assertEquals(actual, expected);
	}

	/**
	 * Test method for {@link MathExtensions#isPrimeNumber(int)}.
	 */
	@Test
	public void testIsPrimeNumber()
	{
		actual = MathExtensions.isPrimeNumber(0);
		expected = true;
		assertEquals(actual, expected);

		actual = MathExtensions.isPrimeNumber(1);
		expected = true;
		assertEquals(actual, expected);

		actual = MathExtensions.isPrimeNumber(2);
		expected = true;
		assertEquals(actual, expected);

		actual = MathExtensions.isPrimeNumber(3);
		expected = true;
		assertEquals(actual, expected);

		actual = MathExtensions.isPrimeNumber(4);
		expected = false;
		assertEquals(actual, expected);

		actual = MathExtensions.isPrimeNumber(5);
		expected = true;
		assertEquals(actual, expected);

		actual = MathExtensions.isPrimeNumber(6);
		expected = false;
		assertEquals(actual, expected);

		actual = MathExtensions.isPrimeNumber(7);
		expected = true;
		assertEquals(actual, expected);

		actual = MathExtensions.isPrimeNumber(8);
		expected = false;
		assertEquals(actual, expected);

		actual = MathExtensions.isPrimeNumber(9);
		expected = false;
		assertEquals(actual, expected);

		actual = MathExtensions.isPrimeNumber(10);
		expected = false;
		assertEquals(actual, expected);

		actual = MathExtensions.isPrimeNumber(11);
		expected = true;
		assertEquals(actual, expected);

		actual = MathExtensions.isPrimeNumber(12);
		expected = false;
		assertEquals(actual, expected);

		actual = MathExtensions.isPrimeNumber(13);
		expected = true;
		assertEquals(actual, expected);

		actual = MathExtensions.isPrimeNumber(14);
		assertFalse(actual);

		actual = MathExtensions.isPrimeNumber(15);
		expected = false;
		assertEquals(actual, expected);

		actual = MathExtensions.isPrimeNumber(16);
		expected = false;
		assertEquals(actual, expected);

		actual = MathExtensions.isPrimeNumber(17);
		expected = true;
		assertEquals(actual, expected);

		actual = MathExtensions.isPrimeNumber(18);
		expected = false;
		assertEquals(actual, expected);

		actual = MathExtensions.isPrimeNumber(19);
		expected = true;
		assertEquals(actual, expected);
	}

	/**
	 * Test method for {@link MathExtensions#printAllPrimeNumbersTill(int)}.
	 */
	@Test
	public void testPrintAllPrimeNumbersTill()
	{
		final int[] expected = { 2, 3, 5, 7, 11, 13, 17, 19 };
		final int[] compare = MathExtensions.printAllPrimeNumbersTill(8);
		for (int i = 0; i < compare.length; i++)
		{
			actual = expected[i] == compare[i];
			assertTrue(actual);
		}
	}

	/**
	 * Test method for {@link MathExtensions}
	 */
	@Test
	public void testWithBeanTester()
	{
		final BeanTester beanTester = new BeanTester();
		beanTester.testBean(MathExtensions.class);
	}

}
