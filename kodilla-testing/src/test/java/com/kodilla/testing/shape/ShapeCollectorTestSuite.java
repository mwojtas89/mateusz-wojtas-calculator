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
            Shape shape1 = new Circle("circle1", 6);
            //When
            test.addFigure(shape);
            test.addFigure(shape1);
            //Then
            Assertions.assertEquals(2, test.getListQuantity());
        }
        @Test
        void testRemoveFigure () {
            //Given
            ShapeCollector test = new ShapeCollector();
            Shape shape = new Circle("circle", 5);
            Shape shape1 = new Circle("circle1", 1);
            Shape shape2 = new Circle("circle2", 2);
            Shape shape3 = new Circle("circle3", 3);
            test.addFigure(shape);
            test.addFigure(shape1);
            test.addFigure(shape2);
            test.addFigure(shape3);

            //When
            boolean result = test.removeFigure(shape);
            //Then
            Assertions.assertTrue(result);
            Assertions.assertEquals(3, test.getListQuantity());
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

    @Nested
    @DisplayName("Testing Squares")
    class SquareTest {
        @Test
        void testAddFigure () {
            //Given
            ShapeCollector test = new ShapeCollector();
            Shape shape = new Square("square", 5);
            Shape shape1 = new Square("square", 6);
            //When
            test.addFigure(shape);
            test.addFigure(shape1);
            //Then
            Assertions.assertEquals(2, test.getListQuantity());
        }
        @Test
        void testRemoveFigure () {
            //Given
            ShapeCollector test = new ShapeCollector();
            Shape shape = new Square("square", 5);
            Shape shape1 = new Square("square1", 1);
            Shape shape2 = new Square("square2", 2);
            Shape shape3 = new Square("square3", 3);
            test.addFigure(shape);
            test.addFigure(shape1);
            test.addFigure(shape2);
            test.addFigure(shape3);

            //When
            boolean result = test.removeFigure(shape);
            //Then
            Assertions.assertTrue(result);
            Assertions.assertEquals(3, test.getListQuantity());
        }
        @Test
        void testGetFigure () {
            //Given
            ShapeCollector test = new ShapeCollector();
            Shape shape = new Square("square", 5);
            Shape shape1 = new Square("square1", 3);
            Shape shape2 = new Square("square2", 2);
            test.addFigure(shape);
            test.addFigure(shape1);
            test.addFigure(shape2);
            int n = 2;

            //Then
            Assertions.assertEquals(shape2,test.getFigure(n));
        }
        @Test
        void testShowFigures () {
            //Given
            ShapeCollector test = new ShapeCollector();
            Shape shape = new Square("square", 5);
            test.addFigure(shape);
            //When
            String text = test.showFigures();
            //Then
            Assertions.assertEquals("square", text);
        }
    }

    @Nested
    @DisplayName("Testing Triangles")
    class TriangleTest {
        @Test
        void testAddFigure () {
            //Given
            ShapeCollector test = new ShapeCollector();
            Shape shape = new Triangle("t", 5);
            Shape shape1 = new Triangle("t1", 6);
            //When
            test.addFigure(shape);
            test.addFigure(shape1);
            //Then
            Assertions.assertEquals(2, test.getListQuantity());
        }
        @Test
        void testRemoveFigure () {
            //Given
            ShapeCollector test = new ShapeCollector();
            Shape shape = new Triangle("t", 5);
            Shape shape1 = new Triangle("t1", 1);
            Shape shape2 = new Triangle("t2", 2);
            Shape shape3 = new Triangle("t3", 3);
            test.addFigure(shape);
            test.addFigure(shape1);
            test.addFigure(shape2);
            test.addFigure(shape3);

            //When
            boolean result = test.removeFigure(shape);
            //Then
            Assertions.assertTrue(result);
            Assertions.assertEquals(3, test.getListQuantity());
        }
        @Test
        void testGetFigure () {
            //Given
            ShapeCollector test = new ShapeCollector();
            Shape shape = new Triangle("t", 5);
            Shape shape1 = new Triangle("t1", 3);
            Shape shape2 = new Triangle("t2", 2);
            test.addFigure(shape);
            test.addFigure(shape1);
            test.addFigure(shape2);
            int n = 2;

            //Then
            Assertions.assertEquals(shape2,test.getFigure(n));
        }
        @Test
        void testShowFigures () {
            //Given
            ShapeCollector test = new ShapeCollector();
            Shape shape = new Triangle("t", 5);
            test.addFigure(shape);
            //When
            String text = test.showFigures();
            //Then
            Assertions.assertEquals("t", text);
        }
    }

}
