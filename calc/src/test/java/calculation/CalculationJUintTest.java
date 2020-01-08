package calculation;

import Calculator.Calculator;
import org.junit.After;
import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.testng.asserts.SoftAssert;

import static org.junit.jupiter.api.Assertions.*;

public class CalculationJUintTest {
    @Before
    public void initTest() {
        System.out.println("New test started");
    }
        @After
        public void afterTest () {
            System.out.println("Test finished");
        }

            @Test
            void testGetsum () {
              assertEquals(Calculator.getsum(7,7), 14);
            }

            @Test
            void TestGetdiff () {
                assertEquals(Calculator.getdiff(25,1), 24);
            }

            @Test
            void TestGetmult () {
                assertEquals(Calculator.getmult(5,2), 10);
            }

            @Test
            void TestGetdiv () {
                assertEquals(Calculator.getdiv(10,2), 5);
            }

            @Test
            void TestGetsqrt () {
                assertEquals(Calculator.getsqrt(16), 4);
            }

            @Test
            void TestGetpow () {
                assertEquals(Calculator.getpow(6,2), 36);
            }
        }
