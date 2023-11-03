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

/**
 * The class {@link Fibonacci} provides algorithms for get fibonacci numbers
 */
public final class Fibonacci
{
	private Fibonacci()
	{
	}

	/**
	 * Resolves the fibonacci number from the given number
	 *
	 * @param number
	 *            the number
	 * @return the fibonacci number from the given number
	 */
	public static long get(final long number)
	{
		if (number < 2)
		{
			return number;
		}
		return Fibonacci.get(number - 1) + Fibonacci.get(number - 2);
	}

	/**
	 * Resolves the fibonacci number from the given {@link Number} object
	 *
	 * @param number
	 *            the number
	 * @return the fibonacci number from the given number
	 */
	public static Number get(final Number number)
	{
		Number previous;
		Number next;
		Number lastPrevious;

		previous = 0;
		next = 1;
		long i;
		for (i = 0; i < number.longValue(); i++)
		{
			lastPrevious = previous;
			previous = next;
			next = lastPrevious.longValue() + next.longValue();
		}
		return next;
	}

}
