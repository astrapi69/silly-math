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
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;

/**
 * The unit test class for the class {@link Fibonacci}
 */
public class FibonacciTest
{

	/**
	 * Test method for {@link Fibonacci#get(long)}
	 */
	@Test
	public void testGetFibonacciWithLong()
	{
		long actual;
		long expected;
		long input;
		// new scenario ...
		input = 1L;
		actual = Fibonacci.get(input);
		assertNotNull(actual);
		expected = 1L;
		assertEquals(expected, actual);
		// new scenario ...
		input = 2L;
		actual = Fibonacci.get(input);
		assertNotNull(actual);
		expected = 2L;
		// new scenario ...
		input = 3L;
		actual = Fibonacci.get(input);
		assertNotNull(actual);
		expected = 2L;
		assertEquals(expected, actual);
		// new scenario ...
		input = 4L;
		actual = Fibonacci.get(input);
		assertNotNull(actual);
		expected = 3L;
		assertEquals(expected, actual);
		// new scenario ...
		input = 5L;
		actual = Fibonacci.get(input);
		assertNotNull(actual);
		expected = 5L;
		assertEquals(expected, actual);
		// new scenario ...
		input = 6L;
		actual = Fibonacci.get(input);
		assertNotNull(actual);
		expected = 8L;
		assertEquals(expected, actual);
	}

	/**
	 * Test method for {@link Fibonacci#get(Number)}
	 */
	@Test
	public void testGetFibonacciWithNumber()
	{
		Number actual;
		Number expected;
		Number input;
		// new scenario ...
		input = 1L;
		actual = Fibonacci.get(input);
		assertNotNull(actual);
		expected = 1L;
		assertEquals(expected, actual);
		// new scenario ...
		input = 2L;
		actual = Fibonacci.get(input);
		assertNotNull(actual);
		expected = 2L;
		// new scenario ...
		input = 3L;
		actual = Fibonacci.get(input);
		assertNotNull(actual);
		expected = 3L;
		assertEquals(expected, actual);
		// new scenario ...
		input = 4L;
		actual = Fibonacci.get(input);
		assertNotNull(actual);
		expected = 5L;
		assertEquals(expected, actual);
		// new scenario ...
		input = 5L;
		actual = Fibonacci.get(input);
		assertNotNull(actual);
		expected = 8L;
		assertEquals(expected, actual);
		input = 6;
		actual = Fibonacci.get(input);
		assertNotNull(actual);
		expected = 13L;
		assertEquals(expected, actual);
	}

}
