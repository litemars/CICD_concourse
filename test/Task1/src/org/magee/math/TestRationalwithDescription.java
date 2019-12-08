/*
 * This file was automatically generated by EvoSuite
 */
package org.magee.math;

import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.magee.math.Rational;

/** 
 * The main class under test is Rational.
 *  It describes a single rational and maintains information regarding: 
 *  - the numerator of the rational;
 *  - the denominator of the rational;
 * */

public class TestRationalwithDescription {

    @Test
    public void test0() throws Throwable {
        // This statement instantiates a class "Rational"  with "explicit arguments:"
         ////-> " numerator" equal to -450L, and "  denominator" equal to -450L
        // The execution of this constructor implicitly covers the following 1 conditions:
        // - the condition  " denominator equals to 0L" is FALSE;
        Rational rational0 = new  Rational((-450L), (-450L));
        // The test case declares an object of the class "Rational"     whose value is equal to the absolute value of "rational0"
        Rational rational1 = rational0.abs();
        // Then, it tests:
        //1) whether the integer value of "rational1" is equal to -1;
        assertEquals(-1, rational1.intValue());
        //2) whether the denominator of rational1 is equal to (-450L);
        assertEquals((-450L), rational1.denominator);
    }

    @Test
    public void test1() throws Throwable {
        // This statement instantiates a class "Rational"  with "explicit arguments:"
         ////-> " numerator" equal to -848L, and "  denominator" equal to 2326L
        // The execution of this constructor implicitly covers the following 1 conditions:
        // - the condition  " denominator equals to 0L" is FALSE;
        Rational rational0 = new  Rational((-848L), 2326L);
        // The test case declares an object of the class "Rational"     whose value is equal to the absolute value of "rational0"
        Rational rational1 = rational0.abs();
        // Then, it tests: //1) whether the double value of "rational1" is equal to 0.3645743766122098 with delta equal to 0.01D;
        assertEquals(0.3645743766122098, rational1.doubleValue(), 0.01D);
        //2) whether the numerator of rational1 is equal to 848L;
        assertEquals(848L, rational1.numerator);
    }

    @Test
    public void test2() throws Throwable {
        // This statement instantiates a class "Rational"  with "explicit arguments:"
         ////-> " numerator" equal to 1L, and "  denominator" equal to 2338L
        // The execution of this constructor implicitly covers the following 1 conditions:
        // - the condition  " denominator equals to 0L" is FALSE;
        Rational rational0 = new  Rational(1L, 2338L);
        // The test case declares an object of the class "Rational"     whose value is equal to the absolute value of "rational0"
        Rational rational1 = rational0.abs();
        // Then, it tests:
        //1) whether the numerator of rational0 is equal to 1L;
        assertEquals(1L, rational0.numerator);
        //2) whether the float value of "rational1" is equal to 4.27716E-4F with delta equal to 0.01F;
        assertEquals(4.27716E-4F, rational1.floatValue(), 0.01F);
    }

    @Test
    public void test3() throws Throwable {
        // This statement instantiates a class "Rational"  with "explicit arguments:"
         ////-> " numerator" equal to -1L, and "  denominator" equal to 140L
        // The execution of this constructor implicitly covers the following 1 conditions:
        // - the condition  " denominator equals to 0L" is FALSE;
        Rational rational0 = new  Rational((-1L), 140L);
        try {
            //  The next method call the add long integer -626L to rational0
            rational0.add((-626L));
            fail("Expecting exception: NumberFormatException");
        } catch (NumberFormatException e) {
        }
    }

    @Test
    public void test4() throws Throwable {
        // This statement instantiates a class "Rational"  with "explicit arguments:"
         ////-> " numerator" equal to 1L, and "  denominator" equal to 1L
        // The execution of this constructor implicitly covers the following 1 conditions:
        // - the condition  " denominator equals to 0L" is FALSE;
        Rational rational0 = new  Rational(1L, 1L);
        // The test case declares a float     whose value is equal to the float value of "rational0"
        float float0 = rational0.floatValue();
        // Then, it tests:
        //1) whether "float0" is equal to 1.0F with delta equal to 0.01F;
        assertEquals(1.0F, float0, 0.01F);
    }

    @Test
    public void test5() throws Throwable {
        // This statement instantiates a class "Rational"  with "explicit arguments:"
         ////-> " numerator" equal to 1L, and "  denominator" equal to 1L
        // The execution of this constructor implicitly covers the following 1 conditions:
        // - the condition  " denominator equals to 0L" is FALSE;
        Rational rational0 = new  Rational(1L, 1L);
        // The test case declares a long     whose value is equal to the long value of "rational0"
        long long0 = rational0.longValue();
        // Then, it tests:
        //1) whether "long0" is equal to 1L;
        assertEquals(1L, long0);
    }

    @Test
    public void test6() throws Throwable {
        // This statement instantiates a class "Rational"  with "explicit arguments:"
         ////-> " numerator" equal to 2851L, and "  denominator" equal to 2851L
        // The execution of this constructor implicitly covers the following 1 conditions:
        // - the condition  " denominator equals to 0L" is FALSE;
        Rational rational0 = new  Rational(2851L, 2851L);
        // The test case declares a byte    equal to the  byte value of "rational0"
        byte byte0 = rational0.byteValue();
        // Then, it tests:
        //1) whether "byte0" is equal to (byte) 1;
        assertEquals((byte) 1, byte0);
    }

    @Test
    public void test7() throws Throwable {
        // This statement instantiates a class "Rational"  with "explicit arguments:"
         ////-> " numerator" equal to -20L, and "  denominator" equal to -20L
        // The execution of this constructor implicitly covers the following 1 conditions:
        // - the condition  " denominator equals to 0L" is FALSE;
        Rational rational0 = new  Rational((-20L), (-20L));
        // The test case declares an object of the class "Rational"     whose value is the pow of "rational0"
        Rational rational1 = rational0.pow(3131);
        // Then, it tests:
        //1) whether the long value of "rational1" is equal to 1L;
        assertEquals(1L, rational1.longValue());
    }

    @Test
    public void test8() throws Throwable {
        // This statement instantiates a class "Rational"  with "explicit arguments:"
         ////-> " numerator" equal to 1151L, and "  denominator" equal to 233L
        // The execution of this constructor implicitly covers the following 1 conditions:
        // - the condition  " denominator equals to 0L" is FALSE;
        Rational rational0 = new  Rational(1151L, 233L);
        // The test case declares an object of the class "Rational"     whose value is obtained by multiplying long scalar to rational0
        Rational rational1 = rational0.multiply(1151L);
        // Then, it tests: //1) whether the float value of "rational1" is equal to 0.0042918455F with delta equal to 0.01F;
        assertEquals(0.0042918455F, rational1.floatValue(), 0.01F);
        //2) whether short value for the object "rational0" is equal to 4;
        assertEquals(4, rational0.shortValue());
    }

    @Test
    public void test9() throws Throwable {
        // This statement instantiates a class "Rational"  with "explicit arguments:"
         ////-> " numerator" equal to 348L, and "  denominator" equal to -177L
        // The execution of this constructor implicitly covers the following 1 conditions:
        // - the condition  " denominator equals to 0L" is FALSE;
        Rational rational0 = new  Rational(348L, (-177L));
        // The test case declares an object of the class "String"    the string form of rational
        String string0 = rational0.toString();
        // Then, it tests:
        //1) whether "string0" is equal to "348 / -177";
        assertEquals("348 / -177", string0);
    }

    @Test
    public void test10() throws Throwable {
        // This statement instantiates a class "Rational"  with "explicit arguments:"
         ////-> " numerator" equal to 2851L, and "  denominator" equal to 2851L
        // The execution of this constructor implicitly covers the following 1 conditions:
        // - the condition  " denominator equals to 0L" is FALSE;
        Rational rational0 = new  Rational(2851L, 2851L);
        // The test case declares an object of the class "Rational"     whose value is the divide of "rational0"
        Rational rational1 = rational0.divide(2851L);
        // Then, it tests:
        //1) whether the numerator of rational1 is equal to 2851L;
        assertEquals(2851L, rational1.numerator);
        //2) whether the double value of "rational0" is equal to 1.0 with delta equal to 0.01D;
        assertEquals(1.0, rational0.doubleValue(), 0.01D);
        //3) whether the double value of "rational1" is equal to 3.5075412136092597E-4 with delta equal to 0.01D;
        assertEquals(3.5075412136092597E-4, rational1.doubleValue(), 0.01D);
    }

    @Test
    public void test11() throws Throwable {
        // This statement instantiates a class "Rational"  with "explicit arguments:"
         ////-> " numerator" equal to 67L, and "  denominator" equal to 67L
        // The execution of this constructor implicitly covers the following 1 conditions:
        // - the condition  " denominator equals to 0L" is FALSE;
        Rational rational0 = new  Rational(67L, 67L);
        // The test case declares an object of the class "Rational"     whose value is obtained by subtracting long integer to rational0
        Rational rational1 = rational0.subtract((-154L));
        // Then, it tests:
        //1) whether the numerator of rational1 is equal to 10251L;
        assertEquals(10251L, rational1.numerator);
        //2) whether the float value of "rational1" is equal to (-153.0F) with delta equal to 0.01F;
        assertEquals((-153.0F), rational1.floatValue(), 0.01F);
    }

    /**
	 * OVERVIEW: The test case "test12" covers around 1.0% (low percentage) of
	 * statements in "Rational"
	 **/
    @Test
    public void test12() throws Throwable {
        // This statement instantiates a class "Rational"  with "explicit arguments:"
         ////-> " numerator" equal to -1L, and "  denominator" equal to 140L
        // The execution of this constructor implicitly covers the following 1 conditions:
        // - the condition  " denominator equals to 0L" is FALSE;
        Rational rational0 = new  Rational((-1L), 140L);
        // The test case declares a double     whose value is equal to the double value of "rational0"
        double double0 = rational0.doubleValue();
        // Then, it tests:
        //1) whether "double0" is equal to (-0.007142857142857143) with delta equal to 0.01D;
        assertEquals((-0.007142857142857143), double0, 0.01D);
    }
}

