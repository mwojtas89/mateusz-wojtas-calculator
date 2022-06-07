package com.kodilla.spring;

import com.kodilla.spring.forum.ForumUser;
import com.kodilla.spring.shape.Circle;
import com.kodilla.spring.shape.Shape;
import com.kodilla.spring.shape.Square;
import com.kodilla.spring.shape.Triangle;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class KodillaSpringApplicationTests {

    @Test
    void testCircleLoadedIntoContainer() {
        //Given
        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.kodilla.spring.shape");
        Shape shape = context.getBean(Circle.class);

        //When
        String name = shape.getShapeName();

        //Then
        assertEquals("This is a circle", name);
    }

    @Test
    void testTriangleLoadedIntoContainer() {
        //Given
        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.kodilla.spring.shape");
        Shape shape = context.getBean(Triangle.class);

        //When
        String name = shape.getShapeName();

        //Then
        assertEquals("This is a triangle", name);
    }

    @Test
    void testForumUser() {
        //Given
        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.kodilla.spring.forum");
        ForumUser forumUser = context.getBean(ForumUser.class);

        //When
        String name = forumUser.userName;

        //Then
        assertEquals("John Smith", name);
    }

    @Test
    void contextLoads() {
    }

    @Test
    void testSquareLoadedIntoContainer() {
        //Given
        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.kodilla.spring.shape");
        Shape shape = context.getBean(Square.class);
        //When
        String name = shape.getShapeName();
        //Then
        assertEquals("This is a square", name);
    }

}
