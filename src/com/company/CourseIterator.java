package com.company;
public class CourseIterator implements Iterator{
    private Assignment[] assignments;
    private int position;

    CourseIterator(Assignment[] assignments){
        this.assignments = assignments;
    }
    public Assignment next(){
        if(!hasNext())return null;
        Assignment assignment = assignments[position];
        position = position + 1;
        return assignment;
    }
    public boolean hasNext(){
        return ((position < assignments.length) && (assignments[position] != null));
    }
}
