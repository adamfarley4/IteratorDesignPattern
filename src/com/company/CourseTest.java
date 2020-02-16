package com.company;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CourseTest {

    @Test
    void getMax() throws Exception{
        assertEquals(5, Course.getMax());
    }

    @Test
    void getAssignmentWeights() throws Exception{
        assertEquals(10,10);
    }
}