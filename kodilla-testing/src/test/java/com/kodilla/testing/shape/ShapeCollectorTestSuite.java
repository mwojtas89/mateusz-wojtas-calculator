package com.kodilla.testing.shape;

import org.junit.jupiter.api.*;



public class ShapeCollectorTestSuite {
    private static int testCounter = 0;

    @BeforeAll
    public static void beforeAllTests() {
        System.out.println("This is the beginning of tests.");
    }

    @AfterAll
    public static void afterAllTests() {
        System.out.println("All tests are finished.");
    }

    @BeforeEach
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("Preparing to execute test #" + testCounter);
    }

    @Nested
    @DisplayName("Testing circles")
    class CircleTest {
        @Test
        void testAddFigure () {
            //Given
            ShapeCollector test = new ShapeCollector();
            Shape shape = new Circle("circle", 5);
            //When
            test.addFigure(shape);
            //Then
            Assertions.assertEquals(1, test.getListQuantity());
        }
        @Test
        void testRemoveFigure () {
            //Given
            ShapeCollector test = new ShapeCollector();
            Shape shape = new Circle("circle", 5);
            test.addFigure(shape);

            //When
            boolean result = test.removeFigure(shape);
            //Then
            Assertions.assertTrue(result);
            Assertions.assertEquals(0, test.getListQuantity());
        }
        @Test
        void testGetFigure () {
            //Given
            ShapeCollector test = new ShapeCollector();
            Shape shape = new Circle("circle", 5);
            test.addFigure(shape);

            //Then
            Assertions.assertEquals(shape,test.getFigure(0));
        }
        @Test
        void testShowFigures () {
            //Given
            ShapeCollector test = new ShapeCollector();
            Shape shape = new Circle("circle", 5);
            test.addFigure(shape);
            //When
            String text = test.showFigures();
            //Then
            Assertions.assertEquals("circle", text);
        }
    }
}
