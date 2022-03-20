import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

    public static boolean debug = false;

    @Test
    public void test001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test001");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test002");
        TestClass1 testClass1_0 = new TestClass1();
        java.lang.Class<?> wildcardClass1 = testClass1_0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test003");
        TestClass1 testClass1_0 = new TestClass1();
        // The following exception was thrown during execution in test generation
        try {
            int int3 = testClass1_0.add((int) '4', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test004");
        TestClass1 testClass1_0 = new TestClass1();
        // The following exception was thrown during execution in test generation
        try {
            int int3 = testClass1_0.add((int) 'a', (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test005");
        TestClass1 testClass1_0 = new TestClass1();
        // The following exception was thrown during execution in test generation
        try {
            int int3 = testClass1_0.add((int) (short) 100, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test006");
        TestClass1 testClass1_0 = new TestClass1();
        // The following exception was thrown during execution in test generation
        try {
            int int3 = testClass1_0.add(1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
        TestClass1 testClass1_0 = new TestClass1();
        // The following exception was thrown during execution in test generation
        try {
            int int3 = testClass1_0.add((int) (byte) -1, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
        TestClass1 testClass1_0 = new TestClass1();
        // The following exception was thrown during execution in test generation
        try {
            int int3 = testClass1_0.add((int) ' ', (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
        TestClass1 testClass1_0 = new TestClass1();
        // The following exception was thrown during execution in test generation
        try {
            int int3 = testClass1_0.add((int) (byte) 100, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        TestClass1 testClass1_0 = new TestClass1();
        // The following exception was thrown during execution in test generation
        try {
            int int3 = testClass1_0.add((int) (byte) -1, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        TestClass1 testClass1_0 = new TestClass1();
        // The following exception was thrown during execution in test generation
        try {
            int int3 = testClass1_0.add((int) (byte) 100, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        TestClass1 testClass1_0 = new TestClass1();
        // The following exception was thrown during execution in test generation
        try {
            int int3 = testClass1_0.add((int) (short) 0, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        TestClass1 testClass1_0 = new TestClass1();
        // The following exception was thrown during execution in test generation
        try {
            int int3 = testClass1_0.add((int) (byte) 10, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        TestClass1 testClass1_0 = new TestClass1();
        // The following exception was thrown during execution in test generation
        try {
            int int3 = testClass1_0.add(0, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        TestClass1 testClass1_0 = new TestClass1();
        // The following exception was thrown during execution in test generation
        try {
            int int3 = testClass1_0.add((int) ' ', (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        TestClass1 testClass1_0 = new TestClass1();
        // The following exception was thrown during execution in test generation
        try {
            int int3 = testClass1_0.add((int) (short) -1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        TestClass1 testClass1_0 = new TestClass1();
        // The following exception was thrown during execution in test generation
        try {
            int int3 = testClass1_0.add((-1), (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        TestClass1 testClass1_0 = new TestClass1();
        // The following exception was thrown during execution in test generation
        try {
            int int3 = testClass1_0.add(0, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        TestClass1 testClass1_0 = new TestClass1();
        // The following exception was thrown during execution in test generation
        try {
            int int3 = testClass1_0.add((int) '4', (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        TestClass1 testClass1_0 = new TestClass1();
        // The following exception was thrown during execution in test generation
        try {
            int int3 = testClass1_0.add((int) (byte) 1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        TestClass1 testClass1_0 = new TestClass1();
        // The following exception was thrown during execution in test generation
        try {
            int int3 = testClass1_0.add((int) (byte) 1, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        TestClass1 testClass1_0 = new TestClass1();
        // The following exception was thrown during execution in test generation
        try {
            int int3 = testClass1_0.add((int) (short) -1, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        TestClass1 testClass1_0 = new TestClass1();
        // The following exception was thrown during execution in test generation
        try {
            int int3 = testClass1_0.add((int) (byte) 100, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        TestClass1 testClass1_0 = new TestClass1();
        // The following exception was thrown during execution in test generation
        try {
            int int3 = testClass1_0.add(100, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        TestClass1 testClass1_0 = new TestClass1();
        // The following exception was thrown during execution in test generation
        try {
            int int3 = testClass1_0.add((int) (short) 1, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        TestClass1 testClass1_0 = new TestClass1();
        // The following exception was thrown during execution in test generation
        try {
            int int3 = testClass1_0.add((int) 'a', (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        TestClass1 testClass1_0 = new TestClass1();
        // The following exception was thrown during execution in test generation
        try {
            int int3 = testClass1_0.add((int) ' ', (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        TestClass1 testClass1_0 = new TestClass1();
        // The following exception was thrown during execution in test generation
        try {
            int int3 = testClass1_0.add((int) (short) 1, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        TestClass1 testClass1_0 = new TestClass1();
        // The following exception was thrown during execution in test generation
        try {
            int int3 = testClass1_0.add((int) (byte) 100, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        TestClass1 testClass1_0 = new TestClass1();
        // The following exception was thrown during execution in test generation
        try {
            int int3 = testClass1_0.add((int) ' ', (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        TestClass1 testClass1_0 = new TestClass1();
        // The following exception was thrown during execution in test generation
        try {
            int int3 = testClass1_0.add((int) (byte) 10, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        TestClass1 testClass1_0 = new TestClass1();
        // The following exception was thrown during execution in test generation
        try {
            int int3 = testClass1_0.add(100, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        TestClass1 testClass1_0 = new TestClass1();
        // The following exception was thrown during execution in test generation
        try {
            int int3 = testClass1_0.add((int) (short) 1, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        TestClass1 testClass1_0 = new TestClass1();
        // The following exception was thrown during execution in test generation
        try {
            int int3 = testClass1_0.add((int) ' ', (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        TestClass1 testClass1_0 = new TestClass1();
        // The following exception was thrown during execution in test generation
        try {
            int int3 = testClass1_0.add(100, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        TestClass1 testClass1_0 = new TestClass1();
        // The following exception was thrown during execution in test generation
        try {
            int int3 = testClass1_0.add((int) (byte) 1, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        TestClass1 testClass1_0 = new TestClass1();
        // The following exception was thrown during execution in test generation
        try {
            int int3 = testClass1_0.add(0, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        TestClass1 testClass1_0 = new TestClass1();
        // The following exception was thrown during execution in test generation
        try {
            int int3 = testClass1_0.add((int) 'a', 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        TestClass1 testClass1_0 = new TestClass1();
        // The following exception was thrown during execution in test generation
        try {
            int int3 = testClass1_0.add(1, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        TestClass1 testClass1_0 = new TestClass1();
        // The following exception was thrown during execution in test generation
        try {
            int int3 = testClass1_0.add((int) (short) 10, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        TestClass1 testClass1_0 = new TestClass1();
        // The following exception was thrown during execution in test generation
        try {
            int int3 = testClass1_0.add(0, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        TestClass1 testClass1_0 = new TestClass1();
        // The following exception was thrown during execution in test generation
        try {
            int int3 = testClass1_0.add((int) '#', (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        TestClass1 testClass1_0 = new TestClass1();
        // The following exception was thrown during execution in test generation
        try {
            int int3 = testClass1_0.add((int) (byte) -1, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        TestClass1 testClass1_0 = new TestClass1();
        // The following exception was thrown during execution in test generation
        try {
            int int3 = testClass1_0.add(100, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        TestClass1 testClass1_0 = new TestClass1();
        // The following exception was thrown during execution in test generation
        try {
            int int3 = testClass1_0.add((-1), (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        TestClass1 testClass1_0 = new TestClass1();
        // The following exception was thrown during execution in test generation
        try {
            int int3 = testClass1_0.add((int) 'a', (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        TestClass1 testClass1_0 = new TestClass1();
        // The following exception was thrown during execution in test generation
        try {
            int int3 = testClass1_0.add((int) ' ', (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        TestClass1 testClass1_0 = new TestClass1();
        // The following exception was thrown during execution in test generation
        try {
            int int3 = testClass1_0.add(0, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        TestClass1 testClass1_0 = new TestClass1();
        // The following exception was thrown during execution in test generation
        try {
            int int3 = testClass1_0.add((int) (byte) 100, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        TestClass1 testClass1_0 = new TestClass1();
        // The following exception was thrown during execution in test generation
        try {
            int int3 = testClass1_0.add((int) (short) -1, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        TestClass1 testClass1_0 = new TestClass1();
        // The following exception was thrown during execution in test generation
        try {
            int int3 = testClass1_0.add((int) (short) 10, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        TestClass1 testClass1_0 = new TestClass1();
        // The following exception was thrown during execution in test generation
        try {
            int int3 = testClass1_0.add(0, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        TestClass1 testClass1_0 = new TestClass1();
        // The following exception was thrown during execution in test generation
        try {
            int int3 = testClass1_0.add(10, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        TestClass1 testClass1_0 = new TestClass1();
        // The following exception was thrown during execution in test generation
        try {
            int int3 = testClass1_0.add((int) (short) 0, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        TestClass1 testClass1_0 = new TestClass1();
        // The following exception was thrown during execution in test generation
        try {
            int int3 = testClass1_0.add((int) (byte) 10, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        TestClass1 testClass1_0 = new TestClass1();
        // The following exception was thrown during execution in test generation
        try {
            int int3 = testClass1_0.add(1, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        TestClass1 testClass1_0 = new TestClass1();
        // The following exception was thrown during execution in test generation
        try {
            int int3 = testClass1_0.add((int) '#', (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        TestClass1 testClass1_0 = new TestClass1();
        // The following exception was thrown during execution in test generation
        try {
            int int3 = testClass1_0.add(10, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        TestClass1 testClass1_0 = new TestClass1();
        // The following exception was thrown during execution in test generation
        try {
            int int3 = testClass1_0.add((int) (byte) 10, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        TestClass1 testClass1_0 = new TestClass1();
        // The following exception was thrown during execution in test generation
        try {
            int int3 = testClass1_0.add((int) 'a', (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        TestClass1 testClass1_0 = new TestClass1();
        // The following exception was thrown during execution in test generation
        try {
            int int3 = testClass1_0.add(10, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        TestClass1 testClass1_0 = new TestClass1();
        // The following exception was thrown during execution in test generation
        try {
            int int3 = testClass1_0.add((int) ' ', (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        TestClass1 testClass1_0 = new TestClass1();
        // The following exception was thrown during execution in test generation
        try {
            int int3 = testClass1_0.add((int) (byte) 0, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        TestClass1 testClass1_0 = new TestClass1();
        // The following exception was thrown during execution in test generation
        try {
            int int3 = testClass1_0.add((int) 'a', (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        TestClass1 testClass1_0 = new TestClass1();
        // The following exception was thrown during execution in test generation
        try {
            int int3 = testClass1_0.add((int) (short) 10, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        TestClass1 testClass1_0 = new TestClass1();
        // The following exception was thrown during execution in test generation
        try {
            int int3 = testClass1_0.add(0, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        TestClass1 testClass1_0 = new TestClass1();
        // The following exception was thrown during execution in test generation
        try {
            int int3 = testClass1_0.add((int) (short) 1, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        TestClass1 testClass1_0 = new TestClass1();
        // The following exception was thrown during execution in test generation
        try {
            int int3 = testClass1_0.add((int) ' ', (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        TestClass1 testClass1_0 = new TestClass1();
        // The following exception was thrown during execution in test generation
        try {
            int int3 = testClass1_0.add((int) (short) -1, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        TestClass1 testClass1_0 = new TestClass1();
        // The following exception was thrown during execution in test generation
        try {
            int int3 = testClass1_0.add((int) (byte) 1, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        TestClass1 testClass1_0 = new TestClass1();
        // The following exception was thrown during execution in test generation
        try {
            int int3 = testClass1_0.add((int) ' ', (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        TestClass1 testClass1_0 = new TestClass1();
        // The following exception was thrown during execution in test generation
        try {
            int int3 = testClass1_0.add((int) (byte) 0, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        TestClass1 testClass1_0 = new TestClass1();
        // The following exception was thrown during execution in test generation
        try {
            int int3 = testClass1_0.add((int) (byte) -1, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        TestClass1 testClass1_0 = new TestClass1();
        // The following exception was thrown during execution in test generation
        try {
            int int3 = testClass1_0.add((int) (byte) 100, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        TestClass1 testClass1_0 = new TestClass1();
        // The following exception was thrown during execution in test generation
        try {
            int int3 = testClass1_0.add(100, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        TestClass1 testClass1_0 = new TestClass1();
        // The following exception was thrown during execution in test generation
        try {
            int int3 = testClass1_0.add(0, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        TestClass1 testClass1_0 = new TestClass1();
        // The following exception was thrown during execution in test generation
        try {
            int int3 = testClass1_0.add((int) (short) 100, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        TestClass1 testClass1_0 = new TestClass1();
        // The following exception was thrown during execution in test generation
        try {
            int int3 = testClass1_0.add((int) '#', (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        TestClass1 testClass1_0 = new TestClass1();
        // The following exception was thrown during execution in test generation
        try {
            int int3 = testClass1_0.add((int) (short) 0, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        TestClass1 testClass1_0 = new TestClass1();
        // The following exception was thrown during execution in test generation
        try {
            int int3 = testClass1_0.add((int) (short) 100, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        TestClass1 testClass1_0 = new TestClass1();
        // The following exception was thrown during execution in test generation
        try {
            int int3 = testClass1_0.add((int) ' ', 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        TestClass1 testClass1_0 = new TestClass1();
        // The following exception was thrown during execution in test generation
        try {
            int int3 = testClass1_0.add((-1), 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        TestClass1 testClass1_0 = new TestClass1();
        // The following exception was thrown during execution in test generation
        try {
            int int3 = testClass1_0.add((-1), (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        TestClass1 testClass1_0 = new TestClass1();
        // The following exception was thrown during execution in test generation
        try {
            int int3 = testClass1_0.add((int) (byte) -1, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        TestClass1 testClass1_0 = new TestClass1();
        // The following exception was thrown during execution in test generation
        try {
            int int3 = testClass1_0.add(1, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        TestClass1 testClass1_0 = new TestClass1();
        // The following exception was thrown during execution in test generation
        try {
            int int3 = testClass1_0.add((int) (short) 100, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        TestClass1 testClass1_0 = new TestClass1();
        // The following exception was thrown during execution in test generation
        try {
            int int3 = testClass1_0.add((int) (short) 100, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        TestClass1 testClass1_0 = new TestClass1();
        // The following exception was thrown during execution in test generation
        try {
            int int3 = testClass1_0.add(0, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        TestClass1 testClass1_0 = new TestClass1();
        // The following exception was thrown during execution in test generation
        try {
            int int3 = testClass1_0.add((int) (short) -1, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        TestClass1 testClass1_0 = new TestClass1();
        // The following exception was thrown during execution in test generation
        try {
            int int3 = testClass1_0.add((int) (short) -1, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        TestClass1 testClass1_0 = new TestClass1();
        // The following exception was thrown during execution in test generation
        try {
            int int3 = testClass1_0.add(100, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        TestClass1 testClass1_0 = new TestClass1();
        // The following exception was thrown during execution in test generation
        try {
            int int3 = testClass1_0.add((int) (short) -1, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        TestClass1 testClass1_0 = new TestClass1();
        // The following exception was thrown during execution in test generation
        try {
            int int3 = testClass1_0.add((int) '#', (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        TestClass1 testClass1_0 = new TestClass1();
        // The following exception was thrown during execution in test generation
        try {
            int int3 = testClass1_0.add((int) (byte) 1, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        TestClass1 testClass1_0 = new TestClass1();
        // The following exception was thrown during execution in test generation
        try {
            int int3 = testClass1_0.add((int) (byte) 10, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        TestClass1 testClass1_0 = new TestClass1();
        // The following exception was thrown during execution in test generation
        try {
            int int3 = testClass1_0.add((int) (byte) 1, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        TestClass1 testClass1_0 = new TestClass1();
        // The following exception was thrown during execution in test generation
        try {
            int int3 = testClass1_0.add((-1), (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        TestClass1 testClass1_0 = new TestClass1();
        // The following exception was thrown during execution in test generation
        try {
            int int3 = testClass1_0.add((int) (byte) -1, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        TestClass1 testClass1_0 = new TestClass1();
        // The following exception was thrown during execution in test generation
        try {
            int int3 = testClass1_0.add((int) (byte) -1, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        TestClass1 testClass1_0 = new TestClass1();
        // The following exception was thrown during execution in test generation
        try {
            int int3 = testClass1_0.add((int) (byte) 0, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        TestClass1 testClass1_0 = new TestClass1();
        // The following exception was thrown during execution in test generation
        try {
            int int3 = testClass1_0.add((int) (byte) 0, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        TestClass1 testClass1_0 = new TestClass1();
        // The following exception was thrown during execution in test generation
        try {
            int int3 = testClass1_0.add((int) (short) -1, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        TestClass1 testClass1_0 = new TestClass1();
        // The following exception was thrown during execution in test generation
        try {
            int int3 = testClass1_0.add((int) 'a', (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        TestClass1 testClass1_0 = new TestClass1();
        // The following exception was thrown during execution in test generation
        try {
            int int3 = testClass1_0.add((int) (short) 0, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        TestClass1 testClass1_0 = new TestClass1();
        // The following exception was thrown during execution in test generation
        try {
            int int3 = testClass1_0.add((int) ' ', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        TestClass1 testClass1_0 = new TestClass1();
        // The following exception was thrown during execution in test generation
        try {
            int int3 = testClass1_0.add((int) (byte) 0, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
        TestClass1 testClass1_0 = new TestClass1();
        // The following exception was thrown during execution in test generation
        try {
            int int3 = testClass1_0.add((int) (byte) 0, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
        TestClass1 testClass1_0 = new TestClass1();
        // The following exception was thrown during execution in test generation
        try {
            int int3 = testClass1_0.add((int) (byte) 0, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
        TestClass1 testClass1_0 = new TestClass1();
        // The following exception was thrown during execution in test generation
        try {
            int int3 = testClass1_0.add(0, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test110");
        TestClass1 testClass1_0 = new TestClass1();
        // The following exception was thrown during execution in test generation
        try {
            int int3 = testClass1_0.add((int) (byte) 0, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test111");
        TestClass1 testClass1_0 = new TestClass1();
        // The following exception was thrown during execution in test generation
        try {
            int int3 = testClass1_0.add(100, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test112");
        TestClass1 testClass1_0 = new TestClass1();
        // The following exception was thrown during execution in test generation
        try {
            int int3 = testClass1_0.add((int) (byte) 1, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test113");
        TestClass1 testClass1_0 = new TestClass1();
        // The following exception was thrown during execution in test generation
        try {
            int int3 = testClass1_0.add((int) 'a', (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test114");
        TestClass1 testClass1_0 = new TestClass1();
        // The following exception was thrown during execution in test generation
        try {
            int int3 = testClass1_0.add(100, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test115");
        TestClass1 testClass1_0 = new TestClass1();
        // The following exception was thrown during execution in test generation
        try {
            int int3 = testClass1_0.add((int) '4', (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test116");
        TestClass1 testClass1_0 = new TestClass1();
        // The following exception was thrown during execution in test generation
        try {
            int int3 = testClass1_0.add((int) (short) 100, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test117");
        TestClass1 testClass1_0 = new TestClass1();
        // The following exception was thrown during execution in test generation
        try {
            int int3 = testClass1_0.add((int) (short) 1, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test118");
        TestClass1 testClass1_0 = new TestClass1();
        // The following exception was thrown during execution in test generation
        try {
            int int3 = testClass1_0.add((int) (byte) 100, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test119");
        TestClass1 testClass1_0 = new TestClass1();
        // The following exception was thrown during execution in test generation
        try {
            int int3 = testClass1_0.add((int) (short) 100, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test120");
        TestClass1 testClass1_0 = new TestClass1();
        // The following exception was thrown during execution in test generation
        try {
            int int3 = testClass1_0.add(0, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test121");
        TestClass1 testClass1_0 = new TestClass1();
        // The following exception was thrown during execution in test generation
        try {
            int int3 = testClass1_0.add(100, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test122");
        TestClass1 testClass1_0 = new TestClass1();
        // The following exception was thrown during execution in test generation
        try {
            int int3 = testClass1_0.add((int) '4', (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test123");
        TestClass1 testClass1_0 = new TestClass1();
        // The following exception was thrown during execution in test generation
        try {
            int int3 = testClass1_0.add((int) (short) 100, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test124");
        TestClass1 testClass1_0 = new TestClass1();
        // The following exception was thrown during execution in test generation
        try {
            int int3 = testClass1_0.add((int) '#', (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test125");
        TestClass1 testClass1_0 = new TestClass1();
        // The following exception was thrown during execution in test generation
        try {
            int int3 = testClass1_0.add((-1), (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test126");
        TestClass1 testClass1_0 = new TestClass1();
        // The following exception was thrown during execution in test generation
        try {
            int int3 = testClass1_0.add(0, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test127");
        TestClass1 testClass1_0 = new TestClass1();
        // The following exception was thrown during execution in test generation
        try {
            int int3 = testClass1_0.add((int) (short) -1, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test128");
        TestClass1 testClass1_0 = new TestClass1();
        // The following exception was thrown during execution in test generation
        try {
            int int3 = testClass1_0.add((int) '4', (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test129");
        TestClass1 testClass1_0 = new TestClass1();
        // The following exception was thrown during execution in test generation
        try {
            int int3 = testClass1_0.add((int) '#', (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test130");
        TestClass1 testClass1_0 = new TestClass1();
        // The following exception was thrown during execution in test generation
        try {
            int int3 = testClass1_0.add((int) 'a', (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test131");
        TestClass1 testClass1_0 = new TestClass1();
        // The following exception was thrown during execution in test generation
        try {
            int int3 = testClass1_0.add((int) ' ', 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test132");
        TestClass1 testClass1_0 = new TestClass1();
        // The following exception was thrown during execution in test generation
        try {
            int int3 = testClass1_0.add((int) '4', (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test133");
        TestClass1 testClass1_0 = new TestClass1();
        // The following exception was thrown during execution in test generation
        try {
            int int3 = testClass1_0.add((int) ' ', (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test134");
        TestClass1 testClass1_0 = new TestClass1();
        // The following exception was thrown during execution in test generation
        try {
            int int3 = testClass1_0.add(0, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test135");
        TestClass1 testClass1_0 = new TestClass1();
        // The following exception was thrown during execution in test generation
        try {
            int int3 = testClass1_0.add((int) (short) 1, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test136");
        TestClass1 testClass1_0 = new TestClass1();
        // The following exception was thrown during execution in test generation
        try {
            int int3 = testClass1_0.add(0, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test137");
        TestClass1 testClass1_0 = new TestClass1();
        // The following exception was thrown during execution in test generation
        try {
            int int3 = testClass1_0.add((int) (short) -1, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test138");
        TestClass1 testClass1_0 = new TestClass1();
        // The following exception was thrown during execution in test generation
        try {
            int int3 = testClass1_0.add((int) (short) 10, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test139");
        TestClass1 testClass1_0 = new TestClass1();
        // The following exception was thrown during execution in test generation
        try {
            int int3 = testClass1_0.add((int) (byte) 10, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test140");
        TestClass1 testClass1_0 = new TestClass1();
        // The following exception was thrown during execution in test generation
        try {
            int int3 = testClass1_0.add((-1), (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test141");
        TestClass1 testClass1_0 = new TestClass1();
        // The following exception was thrown during execution in test generation
        try {
            int int3 = testClass1_0.add((int) (short) 100, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test142");
        TestClass1 testClass1_0 = new TestClass1();
        // The following exception was thrown during execution in test generation
        try {
            int int3 = testClass1_0.add((int) (short) -1, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test143");
        TestClass1 testClass1_0 = new TestClass1();
        // The following exception was thrown during execution in test generation
        try {
            int int3 = testClass1_0.add((int) (byte) 100, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test144");
        TestClass1 testClass1_0 = new TestClass1();
        // The following exception was thrown during execution in test generation
        try {
            int int3 = testClass1_0.add((int) (short) 0, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test145");
        TestClass1 testClass1_0 = new TestClass1();
        // The following exception was thrown during execution in test generation
        try {
            int int3 = testClass1_0.add((int) ' ', (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test146");
        TestClass1 testClass1_0 = new TestClass1();
        // The following exception was thrown during execution in test generation
        try {
            int int3 = testClass1_0.add(100, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test147");
        TestClass1 testClass1_0 = new TestClass1();
        // The following exception was thrown during execution in test generation
        try {
            int int3 = testClass1_0.add(1, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test148");
        TestClass1 testClass1_0 = new TestClass1();
        // The following exception was thrown during execution in test generation
        try {
            int int3 = testClass1_0.add((int) (short) 1, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test149");
        TestClass1 testClass1_0 = new TestClass1();
        // The following exception was thrown during execution in test generation
        try {
            int int3 = testClass1_0.add((int) (short) 1, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test150");
        TestClass1 testClass1_0 = new TestClass1();
        // The following exception was thrown during execution in test generation
        try {
            int int3 = testClass1_0.add((int) (byte) 1, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test151");
        TestClass1 testClass1_0 = new TestClass1();
        // The following exception was thrown during execution in test generation
        try {
            int int3 = testClass1_0.add((int) (byte) 0, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test152");
        TestClass1 testClass1_0 = new TestClass1();
        // The following exception was thrown during execution in test generation
        try {
            int int3 = testClass1_0.add((int) ' ', (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test153");
        TestClass1 testClass1_0 = new TestClass1();
        // The following exception was thrown during execution in test generation
        try {
            int int3 = testClass1_0.add(100, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test154");
        TestClass1 testClass1_0 = new TestClass1();
        // The following exception was thrown during execution in test generation
        try {
            int int3 = testClass1_0.add((int) (byte) 0, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test155");
        TestClass1 testClass1_0 = new TestClass1();
        // The following exception was thrown during execution in test generation
        try {
            int int3 = testClass1_0.add(0, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test156");
        TestClass1 testClass1_0 = new TestClass1();
        // The following exception was thrown during execution in test generation
        try {
            int int3 = testClass1_0.add((int) (byte) 100, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test157");
        TestClass1 testClass1_0 = new TestClass1();
        // The following exception was thrown during execution in test generation
        try {
            int int3 = testClass1_0.add((int) (byte) 0, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test158");
        TestClass1 testClass1_0 = new TestClass1();
        // The following exception was thrown during execution in test generation
        try {
            int int3 = testClass1_0.add((-1), (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test159");
        TestClass1 testClass1_0 = new TestClass1();
        // The following exception was thrown during execution in test generation
        try {
            int int3 = testClass1_0.add((int) (short) 1, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test160");
        TestClass1 testClass1_0 = new TestClass1();
        // The following exception was thrown during execution in test generation
        try {
            int int3 = testClass1_0.add(1, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test161");
        TestClass1 testClass1_0 = new TestClass1();
        // The following exception was thrown during execution in test generation
        try {
            int int3 = testClass1_0.add((int) (byte) 10, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test162");
        TestClass1 testClass1_0 = new TestClass1();
        // The following exception was thrown during execution in test generation
        try {
            int int3 = testClass1_0.add((int) (byte) 1, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test163");
        TestClass1 testClass1_0 = new TestClass1();
        // The following exception was thrown during execution in test generation
        try {
            int int3 = testClass1_0.add((int) (byte) -1, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test164");
        TestClass1 testClass1_0 = new TestClass1();
        // The following exception was thrown during execution in test generation
        try {
            int int3 = testClass1_0.add((int) (byte) 10, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test165");
        TestClass1 testClass1_0 = new TestClass1();
        // The following exception was thrown during execution in test generation
        try {
            int int3 = testClass1_0.add((int) (byte) -1, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test166");
        TestClass1 testClass1_0 = new TestClass1();
        // The following exception was thrown during execution in test generation
        try {
            int int3 = testClass1_0.add((int) (byte) -1, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test167");
        TestClass1 testClass1_0 = new TestClass1();
        // The following exception was thrown during execution in test generation
        try {
            int int3 = testClass1_0.add((int) 'a', (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test168");
        TestClass1 testClass1_0 = new TestClass1();
        // The following exception was thrown during execution in test generation
        try {
            int int3 = testClass1_0.add(1, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test169");
        TestClass1 testClass1_0 = new TestClass1();
        // The following exception was thrown during execution in test generation
        try {
            int int3 = testClass1_0.add((int) (short) 1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test170");
        TestClass1 testClass1_0 = new TestClass1();
        // The following exception was thrown during execution in test generation
        try {
            int int3 = testClass1_0.add((int) '4', (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test171");
        TestClass1 testClass1_0 = new TestClass1();
        // The following exception was thrown during execution in test generation
        try {
            int int3 = testClass1_0.add((int) (byte) 1, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test172");
        TestClass1 testClass1_0 = new TestClass1();
        // The following exception was thrown during execution in test generation
        try {
            int int3 = testClass1_0.add((-1), 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test173");
        TestClass1 testClass1_0 = new TestClass1();
        // The following exception was thrown during execution in test generation
        try {
            int int3 = testClass1_0.add((int) '#', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test174");
        TestClass1 testClass1_0 = new TestClass1();
        // The following exception was thrown during execution in test generation
        try {
            int int3 = testClass1_0.add((int) '4', 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test175");
        TestClass1 testClass1_0 = new TestClass1();
        // The following exception was thrown during execution in test generation
        try {
            int int3 = testClass1_0.add((int) (byte) -1, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test176");
        TestClass1 testClass1_0 = new TestClass1();
        // The following exception was thrown during execution in test generation
        try {
            int int3 = testClass1_0.add((int) (short) 0, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test177");
        TestClass1 testClass1_0 = new TestClass1();
        // The following exception was thrown during execution in test generation
        try {
            int int3 = testClass1_0.add((int) (byte) 0, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test178");
        TestClass1 testClass1_0 = new TestClass1();
        // The following exception was thrown during execution in test generation
        try {
            int int3 = testClass1_0.add((int) (short) 10, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test179");
        TestClass1 testClass1_0 = new TestClass1();
        // The following exception was thrown during execution in test generation
        try {
            int int3 = testClass1_0.add((int) (short) 0, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test180");
        TestClass1 testClass1_0 = new TestClass1();
        // The following exception was thrown during execution in test generation
        try {
            int int3 = testClass1_0.add((int) '#', (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test181");
        TestClass1 testClass1_0 = new TestClass1();
        // The following exception was thrown during execution in test generation
        try {
            int int3 = testClass1_0.add(100, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test182");
        TestClass1 testClass1_0 = new TestClass1();
        // The following exception was thrown during execution in test generation
        try {
            int int3 = testClass1_0.add((int) (short) 0, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test183");
        TestClass1 testClass1_0 = new TestClass1();
        // The following exception was thrown during execution in test generation
        try {
            int int3 = testClass1_0.add(1, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test184");
        TestClass1 testClass1_0 = new TestClass1();
        // The following exception was thrown during execution in test generation
        try {
            int int3 = testClass1_0.add((int) (short) 10, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test185");
        TestClass1 testClass1_0 = new TestClass1();
        // The following exception was thrown during execution in test generation
        try {
            int int3 = testClass1_0.add((int) '4', (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test186");
        TestClass1 testClass1_0 = new TestClass1();
        // The following exception was thrown during execution in test generation
        try {
            int int3 = testClass1_0.add((int) (short) 0, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test187");
        TestClass1 testClass1_0 = new TestClass1();
        // The following exception was thrown during execution in test generation
        try {
            int int3 = testClass1_0.add(10, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test188");
        TestClass1 testClass1_0 = new TestClass1();
        // The following exception was thrown during execution in test generation
        try {
            int int3 = testClass1_0.add(0, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test189");
        TestClass1 testClass1_0 = new TestClass1();
        // The following exception was thrown during execution in test generation
        try {
            int int3 = testClass1_0.add((int) (short) 0, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test190");
        TestClass1 testClass1_0 = new TestClass1();
        // The following exception was thrown during execution in test generation
        try {
            int int3 = testClass1_0.add((int) ' ', (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test191");
        TestClass1 testClass1_0 = new TestClass1();
        // The following exception was thrown during execution in test generation
        try {
            int int3 = testClass1_0.add((int) (short) 1, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test192");
        TestClass1 testClass1_0 = new TestClass1();
        // The following exception was thrown during execution in test generation
        try {
            int int3 = testClass1_0.add(100, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test193");
        TestClass1 testClass1_0 = new TestClass1();
        // The following exception was thrown during execution in test generation
        try {
            int int3 = testClass1_0.add(1, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test194");
        TestClass1 testClass1_0 = new TestClass1();
        // The following exception was thrown during execution in test generation
        try {
            int int3 = testClass1_0.add((-1), (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test195");
        TestClass1 testClass1_0 = new TestClass1();
        // The following exception was thrown during execution in test generation
        try {
            int int3 = testClass1_0.add(0, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test196");
        TestClass1 testClass1_0 = new TestClass1();
        // The following exception was thrown during execution in test generation
        try {
            int int3 = testClass1_0.add((int) 'a', (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test197");
        TestClass1 testClass1_0 = new TestClass1();
        // The following exception was thrown during execution in test generation
        try {
            int int3 = testClass1_0.add((int) (short) -1, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test198");
        TestClass1 testClass1_0 = new TestClass1();
        // The following exception was thrown during execution in test generation
        try {
            int int3 = testClass1_0.add((int) '4', (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test199");
        TestClass1 testClass1_0 = new TestClass1();
        // The following exception was thrown during execution in test generation
        try {
            int int3 = testClass1_0.add((int) (byte) 10, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test200");
        TestClass1 testClass1_0 = new TestClass1();
        // The following exception was thrown during execution in test generation
        try {
            int int3 = testClass1_0.add((int) '#', (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test201");
        TestClass1 testClass1_0 = new TestClass1();
        // The following exception was thrown during execution in test generation
        try {
            int int3 = testClass1_0.add((int) (byte) 1, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test202");
        TestClass1 testClass1_0 = new TestClass1();
        // The following exception was thrown during execution in test generation
        try {
            int int3 = testClass1_0.add((int) (short) 10, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test203");
        TestClass1 testClass1_0 = new TestClass1();
        // The following exception was thrown during execution in test generation
        try {
            int int3 = testClass1_0.add((int) (short) 10, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test204");
        TestClass1 testClass1_0 = new TestClass1();
        // The following exception was thrown during execution in test generation
        try {
            int int3 = testClass1_0.add((int) (short) 100, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test205");
        TestClass1 testClass1_0 = new TestClass1();
        // The following exception was thrown during execution in test generation
        try {
            int int3 = testClass1_0.add((int) (byte) 0, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test206");
        TestClass1 testClass1_0 = new TestClass1();
        // The following exception was thrown during execution in test generation
        try {
            int int3 = testClass1_0.add(1, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test207");
        TestClass1 testClass1_0 = new TestClass1();
        // The following exception was thrown during execution in test generation
        try {
            int int3 = testClass1_0.add((int) (short) 100, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test208");
        TestClass1 testClass1_0 = new TestClass1();
        // The following exception was thrown during execution in test generation
        try {
            int int3 = testClass1_0.add((int) (short) 0, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test209");
        TestClass1 testClass1_0 = new TestClass1();
        // The following exception was thrown during execution in test generation
        try {
            int int3 = testClass1_0.add((int) (short) 0, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test210");
        TestClass1 testClass1_0 = new TestClass1();
        // The following exception was thrown during execution in test generation
        try {
            int int3 = testClass1_0.add((int) (short) 10, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test211");
        TestClass1 testClass1_0 = new TestClass1();
        // The following exception was thrown during execution in test generation
        try {
            int int3 = testClass1_0.add(1, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test212");
        TestClass1 testClass1_0 = new TestClass1();
        // The following exception was thrown during execution in test generation
        try {
            int int3 = testClass1_0.add((int) (short) 10, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test213");
        TestClass1 testClass1_0 = new TestClass1();
        // The following exception was thrown during execution in test generation
        try {
            int int3 = testClass1_0.add((int) (short) -1, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test214");
        TestClass1 testClass1_0 = new TestClass1();
        // The following exception was thrown during execution in test generation
        try {
            int int3 = testClass1_0.add((int) (short) 10, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test215");
        TestClass1 testClass1_0 = new TestClass1();
        // The following exception was thrown during execution in test generation
        try {
            int int3 = testClass1_0.add((int) (short) 100, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test216");
        TestClass1 testClass1_0 = new TestClass1();
        // The following exception was thrown during execution in test generation
        try {
            int int3 = testClass1_0.add((int) (byte) 10, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test217");
        TestClass1 testClass1_0 = new TestClass1();
        // The following exception was thrown during execution in test generation
        try {
            int int3 = testClass1_0.add((int) 'a', (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test218");
        TestClass1 testClass1_0 = new TestClass1();
        // The following exception was thrown during execution in test generation
        try {
            int int3 = testClass1_0.add((int) 'a', (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test219");
        TestClass1 testClass1_0 = new TestClass1();
        // The following exception was thrown during execution in test generation
        try {
            int int3 = testClass1_0.add((int) (short) -1, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test220");
        TestClass1 testClass1_0 = new TestClass1();
        // The following exception was thrown during execution in test generation
        try {
            int int3 = testClass1_0.add((int) (byte) 0, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test221");
        TestClass1 testClass1_0 = new TestClass1();
        // The following exception was thrown during execution in test generation
        try {
            int int3 = testClass1_0.add(10, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test222");
        TestClass1 testClass1_0 = new TestClass1();
        // The following exception was thrown during execution in test generation
        try {
            int int3 = testClass1_0.add((int) (short) -1, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test223");
        TestClass1 testClass1_0 = new TestClass1();
        // The following exception was thrown during execution in test generation
        try {
            int int3 = testClass1_0.add((int) (short) -1, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test224");
        TestClass1 testClass1_0 = new TestClass1();
        // The following exception was thrown during execution in test generation
        try {
            int int3 = testClass1_0.add((int) '4', (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test225");
        TestClass1 testClass1_0 = new TestClass1();
        // The following exception was thrown during execution in test generation
        try {
            int int3 = testClass1_0.add((int) (byte) -1, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test226");
        TestClass1 testClass1_0 = new TestClass1();
        // The following exception was thrown during execution in test generation
        try {
            int int3 = testClass1_0.add((int) '#', 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test227");
        TestClass1 testClass1_0 = new TestClass1();
        // The following exception was thrown during execution in test generation
        try {
            int int3 = testClass1_0.add(10, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test228");
        TestClass1 testClass1_0 = new TestClass1();
        // The following exception was thrown during execution in test generation
        try {
            int int3 = testClass1_0.add((int) '#', 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test229");
        TestClass1 testClass1_0 = new TestClass1();
        // The following exception was thrown during execution in test generation
        try {
            int int3 = testClass1_0.add(10, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test230");
        TestClass1 testClass1_0 = new TestClass1();
        // The following exception was thrown during execution in test generation
        try {
            int int3 = testClass1_0.add((int) '4', 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test231");
        TestClass1 testClass1_0 = new TestClass1();
        // The following exception was thrown during execution in test generation
        try {
            int int3 = testClass1_0.add((int) (short) 1, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test232");
        TestClass1 testClass1_0 = new TestClass1();
        // The following exception was thrown during execution in test generation
        try {
            int int3 = testClass1_0.add((int) (short) 1, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test233");
        TestClass1 testClass1_0 = new TestClass1();
        // The following exception was thrown during execution in test generation
        try {
            int int3 = testClass1_0.add((int) (short) 0, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test234");
        TestClass1 testClass1_0 = new TestClass1();
        // The following exception was thrown during execution in test generation
        try {
            int int3 = testClass1_0.add(1, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test235");
        TestClass1 testClass1_0 = new TestClass1();
        // The following exception was thrown during execution in test generation
        try {
            int int3 = testClass1_0.add(100, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test236");
        TestClass1 testClass1_0 = new TestClass1();
        // The following exception was thrown during execution in test generation
        try {
            int int3 = testClass1_0.add((int) (short) 10, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test237");
        TestClass1 testClass1_0 = new TestClass1();
        // The following exception was thrown during execution in test generation
        try {
            int int3 = testClass1_0.add((int) '#', (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test238");
        TestClass1 testClass1_0 = new TestClass1();
        // The following exception was thrown during execution in test generation
        try {
            int int3 = testClass1_0.add((int) (byte) 0, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test239");
        TestClass1 testClass1_0 = new TestClass1();
        // The following exception was thrown during execution in test generation
        try {
            int int3 = testClass1_0.add(10, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test240");
        TestClass1 testClass1_0 = new TestClass1();
        // The following exception was thrown during execution in test generation
        try {
            int int3 = testClass1_0.add((int) (byte) 100, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test241");
        TestClass1 testClass1_0 = new TestClass1();
        // The following exception was thrown during execution in test generation
        try {
            int int3 = testClass1_0.add((int) (short) -1, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test242");
        TestClass1 testClass1_0 = new TestClass1();
        // The following exception was thrown during execution in test generation
        try {
            int int3 = testClass1_0.add((int) '#', (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test243");
        TestClass1 testClass1_0 = new TestClass1();
        // The following exception was thrown during execution in test generation
        try {
            int int3 = testClass1_0.add((int) (short) 0, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test244");
        TestClass1 testClass1_0 = new TestClass1();
        // The following exception was thrown during execution in test generation
        try {
            int int3 = testClass1_0.add(1, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test245");
        TestClass1 testClass1_0 = new TestClass1();
        // The following exception was thrown during execution in test generation
        try {
            int int3 = testClass1_0.add((int) (byte) 100, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test246");
        TestClass1 testClass1_0 = new TestClass1();
        // The following exception was thrown during execution in test generation
        try {
            int int3 = testClass1_0.add((int) (byte) 100, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test247");
        TestClass1 testClass1_0 = new TestClass1();
        // The following exception was thrown during execution in test generation
        try {
            int int3 = testClass1_0.add((int) (byte) -1, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test248");
        TestClass1 testClass1_0 = new TestClass1();
        // The following exception was thrown during execution in test generation
        try {
            int int3 = testClass1_0.add((int) (byte) 100, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test249");
        TestClass1 testClass1_0 = new TestClass1();
        // The following exception was thrown during execution in test generation
        try {
            int int3 = testClass1_0.add((int) (byte) 100, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test250");
        TestClass1 testClass1_0 = new TestClass1();
        // The following exception was thrown during execution in test generation
        try {
            int int3 = testClass1_0.add((int) (short) 10, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test251");
        TestClass1 testClass1_0 = new TestClass1();
        // The following exception was thrown during execution in test generation
        try {
            int int3 = testClass1_0.add((int) '#', (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test252");
        TestClass1 testClass1_0 = new TestClass1();
        // The following exception was thrown during execution in test generation
        try {
            int int3 = testClass1_0.add((-1), (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test253");
        TestClass1 testClass1_0 = new TestClass1();
        // The following exception was thrown during execution in test generation
        try {
            int int3 = testClass1_0.add(10, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test254");
        TestClass1 testClass1_0 = new TestClass1();
        // The following exception was thrown during execution in test generation
        try {
            int int3 = testClass1_0.add((int) (byte) 10, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test255");
        TestClass1 testClass1_0 = new TestClass1();
        // The following exception was thrown during execution in test generation
        try {
            int int3 = testClass1_0.add((int) (short) 1, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test256");
        TestClass1 testClass1_0 = new TestClass1();
        // The following exception was thrown during execution in test generation
        try {
            int int3 = testClass1_0.add((int) (byte) 1, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test257");
        TestClass1 testClass1_0 = new TestClass1();
        // The following exception was thrown during execution in test generation
        try {
            int int3 = testClass1_0.add(10, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test258");
        TestClass1 testClass1_0 = new TestClass1();
        // The following exception was thrown during execution in test generation
        try {
            int int3 = testClass1_0.add((int) 'a', 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test259");
        TestClass1 testClass1_0 = new TestClass1();
        // The following exception was thrown during execution in test generation
        try {
            int int3 = testClass1_0.add((int) (byte) -1, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test260");
        TestClass1 testClass1_0 = new TestClass1();
        // The following exception was thrown during execution in test generation
        try {
            int int3 = testClass1_0.add((int) (short) 10, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test261");
        TestClass1 testClass1_0 = new TestClass1();
        // The following exception was thrown during execution in test generation
        try {
            int int3 = testClass1_0.add((int) '#', (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test262");
        TestClass1 testClass1_0 = new TestClass1();
        // The following exception was thrown during execution in test generation
        try {
            int int3 = testClass1_0.add((int) (byte) 100, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test263");
        TestClass1 testClass1_0 = new TestClass1();
        // The following exception was thrown during execution in test generation
        try {
            int int3 = testClass1_0.add((int) (byte) -1, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test264");
        TestClass1 testClass1_0 = new TestClass1();
        // The following exception was thrown during execution in test generation
        try {
            int int3 = testClass1_0.add((int) (short) 10, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test265");
        TestClass1 testClass1_0 = new TestClass1();
        // The following exception was thrown during execution in test generation
        try {
            int int3 = testClass1_0.add(10, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test266");
        TestClass1 testClass1_0 = new TestClass1();
        // The following exception was thrown during execution in test generation
        try {
            int int3 = testClass1_0.add(10, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test267");
        TestClass1 testClass1_0 = new TestClass1();
        // The following exception was thrown during execution in test generation
        try {
            int int3 = testClass1_0.add((int) (byte) -1, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test268");
        TestClass1 testClass1_0 = new TestClass1();
        // The following exception was thrown during execution in test generation
        try {
            int int3 = testClass1_0.add((int) 'a', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test269");
        TestClass1 testClass1_0 = new TestClass1();
        // The following exception was thrown during execution in test generation
        try {
            int int3 = testClass1_0.add((int) (short) 1, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test270");
        TestClass1 testClass1_0 = new TestClass1();
        // The following exception was thrown during execution in test generation
        try {
            int int3 = testClass1_0.add((int) (short) 100, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test271");
        TestClass1 testClass1_0 = new TestClass1();
        // The following exception was thrown during execution in test generation
        try {
            int int3 = testClass1_0.add((int) (byte) 10, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test272");
        TestClass1 testClass1_0 = new TestClass1();
        // The following exception was thrown during execution in test generation
        try {
            int int3 = testClass1_0.add((int) (short) 1, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test273");
        TestClass1 testClass1_0 = new TestClass1();
        // The following exception was thrown during execution in test generation
        try {
            int int3 = testClass1_0.add(100, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test274");
        TestClass1 testClass1_0 = new TestClass1();
        // The following exception was thrown during execution in test generation
        try {
            int int3 = testClass1_0.add(100, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test275");
        TestClass1 testClass1_0 = new TestClass1();
        // The following exception was thrown during execution in test generation
        try {
            int int3 = testClass1_0.add((int) (byte) 10, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test276");
        TestClass1 testClass1_0 = new TestClass1();
        // The following exception was thrown during execution in test generation
        try {
            int int3 = testClass1_0.add((int) (byte) 10, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test277");
        TestClass1 testClass1_0 = new TestClass1();
        // The following exception was thrown during execution in test generation
        try {
            int int3 = testClass1_0.add((int) '#', (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test278");
        TestClass1 testClass1_0 = new TestClass1();
        // The following exception was thrown during execution in test generation
        try {
            int int3 = testClass1_0.add(10, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test279");
        TestClass1 testClass1_0 = new TestClass1();
        // The following exception was thrown during execution in test generation
        try {
            int int3 = testClass1_0.add((int) ' ', (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test280");
        TestClass1 testClass1_0 = new TestClass1();
        // The following exception was thrown during execution in test generation
        try {
            int int3 = testClass1_0.add((-1), (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test281");
        TestClass1 testClass1_0 = new TestClass1();
        // The following exception was thrown during execution in test generation
        try {
            int int3 = testClass1_0.add(0, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test282");
        TestClass1 testClass1_0 = new TestClass1();
        // The following exception was thrown during execution in test generation
        try {
            int int3 = testClass1_0.add((int) 'a', (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test283");
        TestClass1 testClass1_0 = new TestClass1();
        // The following exception was thrown during execution in test generation
        try {
            int int3 = testClass1_0.add((int) (short) 10, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test284");
        TestClass1 testClass1_0 = new TestClass1();
        // The following exception was thrown during execution in test generation
        try {
            int int3 = testClass1_0.add((int) (short) 10, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test285");
        TestClass1 testClass1_0 = new TestClass1();
        // The following exception was thrown during execution in test generation
        try {
            int int3 = testClass1_0.add((int) '4', (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test286");
        TestClass1 testClass1_0 = new TestClass1();
        // The following exception was thrown during execution in test generation
        try {
            int int3 = testClass1_0.add((int) (byte) 100, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test287");
        TestClass1 testClass1_0 = new TestClass1();
        // The following exception was thrown during execution in test generation
        try {
            int int3 = testClass1_0.add(1, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test288");
        TestClass1 testClass1_0 = new TestClass1();
        // The following exception was thrown during execution in test generation
        try {
            int int3 = testClass1_0.add((int) 'a', 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test289");
        TestClass1 testClass1_0 = new TestClass1();
        // The following exception was thrown during execution in test generation
        try {
            int int3 = testClass1_0.add((int) '#', (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test290");
        TestClass1 testClass1_0 = new TestClass1();
        // The following exception was thrown during execution in test generation
        try {
            int int3 = testClass1_0.add((int) (short) -1, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test291");
        TestClass1 testClass1_0 = new TestClass1();
        // The following exception was thrown during execution in test generation
        try {
            int int3 = testClass1_0.add((int) (short) 1, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test292");
        TestClass1 testClass1_0 = new TestClass1();
        // The following exception was thrown during execution in test generation
        try {
            int int3 = testClass1_0.add((-1), (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test293");
        TestClass1 testClass1_0 = new TestClass1();
        // The following exception was thrown during execution in test generation
        try {
            int int3 = testClass1_0.add((int) (byte) 100, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test294");
        TestClass1 testClass1_0 = new TestClass1();
        // The following exception was thrown during execution in test generation
        try {
            int int3 = testClass1_0.add((int) (short) 100, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test295");
        TestClass1 testClass1_0 = new TestClass1();
        // The following exception was thrown during execution in test generation
        try {
            int int3 = testClass1_0.add((int) (short) 100, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test296");
        TestClass1 testClass1_0 = new TestClass1();
        // The following exception was thrown during execution in test generation
        try {
            int int3 = testClass1_0.add((int) (byte) 1, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test297");
        TestClass1 testClass1_0 = new TestClass1();
        // The following exception was thrown during execution in test generation
        try {
            int int3 = testClass1_0.add((int) (short) 0, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test298");
        TestClass1 testClass1_0 = new TestClass1();
        // The following exception was thrown during execution in test generation
        try {
            int int3 = testClass1_0.add(1, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test299");
        TestClass1 testClass1_0 = new TestClass1();
        // The following exception was thrown during execution in test generation
        try {
            int int3 = testClass1_0.add((int) (short) 100, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test300");
        TestClass1 testClass1_0 = new TestClass1();
        // The following exception was thrown during execution in test generation
        try {
            int int3 = testClass1_0.add((int) '4', (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test301");
        TestClass1 testClass1_0 = new TestClass1();
        // The following exception was thrown during execution in test generation
        try {
            int int3 = testClass1_0.add((int) (byte) 100, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test302");
        TestClass1 testClass1_0 = new TestClass1();
        // The following exception was thrown during execution in test generation
        try {
            int int3 = testClass1_0.add((int) (byte) 1, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test303");
        TestClass1 testClass1_0 = new TestClass1();
        // The following exception was thrown during execution in test generation
        try {
            int int3 = testClass1_0.add(1, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test304");
        TestClass1 testClass1_0 = new TestClass1();
        // The following exception was thrown during execution in test generation
        try {
            int int3 = testClass1_0.add((int) (short) 0, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test305");
        TestClass1 testClass1_0 = new TestClass1();
        // The following exception was thrown during execution in test generation
        try {
            int int3 = testClass1_0.add((int) '4', 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test306");
        TestClass1 testClass1_0 = new TestClass1();
        // The following exception was thrown during execution in test generation
        try {
            int int3 = testClass1_0.add(100, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test307");
        TestClass1 testClass1_0 = new TestClass1();
        // The following exception was thrown during execution in test generation
        try {
            int int3 = testClass1_0.add((int) (short) 100, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test308");
        TestClass1 testClass1_0 = new TestClass1();
        // The following exception was thrown during execution in test generation
        try {
            int int3 = testClass1_0.add(0, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test309");
        TestClass1 testClass1_0 = new TestClass1();
        // The following exception was thrown during execution in test generation
        try {
            int int3 = testClass1_0.add((int) (byte) -1, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test310");
        TestClass1 testClass1_0 = new TestClass1();
        // The following exception was thrown during execution in test generation
        try {
            int int3 = testClass1_0.add((int) (short) 0, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test311");
        TestClass1 testClass1_0 = new TestClass1();
        // The following exception was thrown during execution in test generation
        try {
            int int3 = testClass1_0.add((int) (byte) 0, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test312");
        TestClass1 testClass1_0 = new TestClass1();
        // The following exception was thrown during execution in test generation
        try {
            int int3 = testClass1_0.add((int) (byte) 0, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test313");
        TestClass1 testClass1_0 = new TestClass1();
        // The following exception was thrown during execution in test generation
        try {
            int int3 = testClass1_0.add((int) (byte) 10, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test314");
        TestClass1 testClass1_0 = new TestClass1();
        // The following exception was thrown during execution in test generation
        try {
            int int3 = testClass1_0.add((int) (byte) -1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test315");
        TestClass1 testClass1_0 = new TestClass1();
        // The following exception was thrown during execution in test generation
        try {
            int int3 = testClass1_0.add((int) (byte) 1, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test316");
        TestClass1 testClass1_0 = new TestClass1();
        // The following exception was thrown during execution in test generation
        try {
            int int3 = testClass1_0.add((int) '4', (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test317");
        TestClass1 testClass1_0 = new TestClass1();
        // The following exception was thrown during execution in test generation
        try {
            int int3 = testClass1_0.add(100, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test318");
        TestClass1 testClass1_0 = new TestClass1();
        // The following exception was thrown during execution in test generation
        try {
            int int3 = testClass1_0.add(10, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test319");
        TestClass1 testClass1_0 = new TestClass1();
        // The following exception was thrown during execution in test generation
        try {
            int int3 = testClass1_0.add((int) (byte) 0, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test320");
        TestClass1 testClass1_0 = new TestClass1();
        // The following exception was thrown during execution in test generation
        try {
            int int3 = testClass1_0.add((-1), (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test321");
        TestClass1 testClass1_0 = new TestClass1();
        // The following exception was thrown during execution in test generation
        try {
            int int3 = testClass1_0.add((int) (byte) 1, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test322");
        TestClass1 testClass1_0 = new TestClass1();
        // The following exception was thrown during execution in test generation
        try {
            int int3 = testClass1_0.add(10, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test323");
        TestClass1 testClass1_0 = new TestClass1();
        // The following exception was thrown during execution in test generation
        try {
            int int3 = testClass1_0.add((int) (byte) 10, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test324");
        TestClass1 testClass1_0 = new TestClass1();
        // The following exception was thrown during execution in test generation
        try {
            int int3 = testClass1_0.add(1, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test325");
        TestClass1 testClass1_0 = new TestClass1();
        // The following exception was thrown during execution in test generation
        try {
            int int3 = testClass1_0.add(100, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test326");
        TestClass1 testClass1_0 = new TestClass1();
        // The following exception was thrown during execution in test generation
        try {
            int int3 = testClass1_0.add((int) (byte) 1, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test327");
        TestClass1 testClass1_0 = new TestClass1();
        // The following exception was thrown during execution in test generation
        try {
            int int3 = testClass1_0.add(10, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test328");
        TestClass1 testClass1_0 = new TestClass1();
        // The following exception was thrown during execution in test generation
        try {
            int int3 = testClass1_0.add((int) (short) 10, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test329");
        TestClass1 testClass1_0 = new TestClass1();
        // The following exception was thrown during execution in test generation
        try {
            int int3 = testClass1_0.add((int) (byte) 10, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test330");
        TestClass1 testClass1_0 = new TestClass1();
        // The following exception was thrown during execution in test generation
        try {
            int int3 = testClass1_0.add((int) (short) -1, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test331");
        TestClass1 testClass1_0 = new TestClass1();
        // The following exception was thrown during execution in test generation
        try {
            int int3 = testClass1_0.add((int) (byte) 0, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test332");
        TestClass1 testClass1_0 = new TestClass1();
        // The following exception was thrown during execution in test generation
        try {
            int int3 = testClass1_0.add((-1), 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test333");
        TestClass1 testClass1_0 = new TestClass1();
        // The following exception was thrown during execution in test generation
        try {
            int int3 = testClass1_0.add(10, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test334");
        TestClass1 testClass1_0 = new TestClass1();
        // The following exception was thrown during execution in test generation
        try {
            int int3 = testClass1_0.add(10, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test335");
        TestClass1 testClass1_0 = new TestClass1();
        // The following exception was thrown during execution in test generation
        try {
            int int3 = testClass1_0.add(10, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test336");
        TestClass1 testClass1_0 = new TestClass1();
        // The following exception was thrown during execution in test generation
        try {
            int int3 = testClass1_0.add((int) (short) 0, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test337");
        TestClass1 testClass1_0 = new TestClass1();
        // The following exception was thrown during execution in test generation
        try {
            int int3 = testClass1_0.add((int) (byte) -1, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test338");
        TestClass1 testClass1_0 = new TestClass1();
        // The following exception was thrown during execution in test generation
        try {
            int int3 = testClass1_0.add((int) (short) 1, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test339");
        TestClass1 testClass1_0 = new TestClass1();
        // The following exception was thrown during execution in test generation
        try {
            int int3 = testClass1_0.add((int) (short) 100, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test340");
        TestClass1 testClass1_0 = new TestClass1();
        // The following exception was thrown during execution in test generation
        try {
            int int3 = testClass1_0.add((int) (short) 100, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test341");
        TestClass1 testClass1_0 = new TestClass1();
        // The following exception was thrown during execution in test generation
        try {
            int int3 = testClass1_0.add(1, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test342");
        TestClass1 testClass1_0 = new TestClass1();
        // The following exception was thrown during execution in test generation
        try {
            int int3 = testClass1_0.add((int) 'a', (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test343");
        TestClass1 testClass1_0 = new TestClass1();
        // The following exception was thrown during execution in test generation
        try {
            int int3 = testClass1_0.add((-1), (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test344");
        TestClass1 testClass1_0 = new TestClass1();
        // The following exception was thrown during execution in test generation
        try {
            int int3 = testClass1_0.add((int) (byte) 1, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test345");
        TestClass1 testClass1_0 = new TestClass1();
        // The following exception was thrown during execution in test generation
        try {
            int int3 = testClass1_0.add((-1), 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test346");
        TestClass1 testClass1_0 = new TestClass1();
        // The following exception was thrown during execution in test generation
        try {
            int int3 = testClass1_0.add((int) '4', (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test347");
        TestClass1 testClass1_0 = new TestClass1();
        // The following exception was thrown during execution in test generation
        try {
            int int3 = testClass1_0.add((int) '4', (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test348");
        TestClass1 testClass1_0 = new TestClass1();
        // The following exception was thrown during execution in test generation
        try {
            int int3 = testClass1_0.add((int) (short) 0, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test349");
        TestClass1 testClass1_0 = new TestClass1();
        // The following exception was thrown during execution in test generation
        try {
            int int3 = testClass1_0.add((int) (byte) 10, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test350");
        TestClass1 testClass1_0 = new TestClass1();
        // The following exception was thrown during execution in test generation
        try {
            int int3 = testClass1_0.add(1, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test351");
        TestClass1 testClass1_0 = new TestClass1();
        // The following exception was thrown during execution in test generation
        try {
            int int3 = testClass1_0.add((int) (byte) 10, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test352");
        TestClass1 testClass1_0 = new TestClass1();
        // The following exception was thrown during execution in test generation
        try {
            int int3 = testClass1_0.add((int) (short) 10, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test353");
        TestClass1 testClass1_0 = new TestClass1();
        // The following exception was thrown during execution in test generation
        try {
            int int3 = testClass1_0.add((int) ' ', 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test354");
        TestClass1 testClass1_0 = new TestClass1();
        // The following exception was thrown during execution in test generation
        try {
            int int3 = testClass1_0.add((int) '4', (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test355");
        TestClass1 testClass1_0 = new TestClass1();
        // The following exception was thrown during execution in test generation
        try {
            int int3 = testClass1_0.add((int) 'a', (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test356");
        TestClass1 testClass1_0 = new TestClass1();
        // The following exception was thrown during execution in test generation
        try {
            int int3 = testClass1_0.add((int) (byte) 1, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test357");
        TestClass1 testClass1_0 = new TestClass1();
        // The following exception was thrown during execution in test generation
        try {
            int int3 = testClass1_0.add((int) (short) 1, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test358");
        TestClass1 testClass1_0 = new TestClass1();
        // The following exception was thrown during execution in test generation
        try {
            int int3 = testClass1_0.add((int) '#', (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test359");
        TestClass1 testClass1_0 = new TestClass1();
        // The following exception was thrown during execution in test generation
        try {
            int int3 = testClass1_0.add((int) '#', 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test360");
        TestClass1 testClass1_0 = new TestClass1();
        // The following exception was thrown during execution in test generation
        try {
            int int3 = testClass1_0.add((int) (byte) 100, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test361");
        TestClass1 testClass1_0 = new TestClass1();
        // The following exception was thrown during execution in test generation
        try {
            int int3 = testClass1_0.add((-1), (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test362");
        TestClass1 testClass1_0 = new TestClass1();
        // The following exception was thrown during execution in test generation
        try {
            int int3 = testClass1_0.add((int) ' ', (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test363");
        TestClass1 testClass1_0 = new TestClass1();
        // The following exception was thrown during execution in test generation
        try {
            int int3 = testClass1_0.add((-1), (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }
}

