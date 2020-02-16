package com.company;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AssignmentTest {

    @Test
    void getTitle() throws Exception{
        Assignment assignment = new Assignment("adam", "is cool", "male", 10);
        assertEquals("adam",assignment.getTitle());
    }

    @Test
    void getDescription() throws Exception {
        Assignment assignment = new Assignment("adam", "is cool", "male", 10);
        assertEquals("is cool",assignment.getDescription());
    }

    @Test
    void getTopic() throws Exception {
        Assignment assignment = new Assignment("adam", "is cool", "male", 10);
        assertEquals("male",assignment.getTopic());
    }

    @Test
    void getPoints() throws Exception{
        Assignment assignment = new Assignment("adam", "is cool", "male", 10);
        assertEquals(10,assignment.getPoints());
    }

    @Test
    void testToString() throws Exception{
        Assignment assignment = new Assignment("adam", "is cool", "male", 10);
        assertEquals("the title is adam the description is is cool the topic is male",
                assignment.toString());
    }
}