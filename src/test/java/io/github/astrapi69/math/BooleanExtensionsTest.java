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

import org.junit.jupiter.api.Test;
import org.meanbean.test.BeanTester;

/**
 * The unit test class for the class {@link BooleanExtensions}.
 */
public class BooleanExtensionsTest
{

	/**
	 * Test method for {@link BooleanExtensions#toBoolean(Boolean)}
	 */
	@Test
	public final void testToBoolean()
	{

		boolean expected;
		boolean actual;

		actual = BooleanExtensions.toBoolean(Boolean.TRUE);
		expected = true;
		assertEquals(expected, actual);

		actual = BooleanExtensions.toBoolean(Boolean.FALSE);
		expected = false;
		assertEquals(expected, actual);

		actual = BooleanExtensions.toBoolean(null);
		expected = false;
		assertEquals(expected, actual);
	}

	/**
	 * Test method for {@link BooleanExtensions#trueOrFalse(Object, Object, boolean...)}
	 */
	@Test
	public final void testTrueOrFalse()
	{
		String expected;
		String actual;
		expected = "where";
		actual = BooleanExtensions.trueOrFalse("and", "where");
		assertEquals(expected, actual);

		expected = "and";
		actual = BooleanExtensions.trueOrFalse("and", "where", true);
		assertEquals(expected, actual);

		expected = "where";
		actual = BooleanExtensions.trueOrFalse("and", "where", false, false);
		assertEquals(expected, actual);

		expected = "and";
		actual = BooleanExtensions.trueOrFalse("and", "where", true, false);
		assertEquals(expected, actual);

		expected = "and";
		actual = BooleanExtensions.trueOrFalse("and", "where", true, false, false);
		assertEquals(expected, actual);

		expected = "and";
		actual = BooleanExtensions.trueOrFalse("and", "where", true, true, false);
		assertEquals(expected, actual);

		expected = "where";
		actual = BooleanExtensions.trueOrFalse("and", "where", false, false, false);
		assertEquals(expected, actual);
	}

	/**
	 * Test method for {@link BooleanExtensions}
	 */
	@Test
	public void testWithBeanTester()
	{
		final BeanTester beanTester = new BeanTester();
		beanTester.testBean(BooleanExtensions.class);
	}

}
