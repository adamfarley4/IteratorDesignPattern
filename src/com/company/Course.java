package com.company;

public class Course {
    private static final int max= 5;
    private Assignment[] assignments;
    private int count = 0;
    private String name;
    private String title;

    public Course(String name,String title){
        assignments = new Assignment[max];
        this.name = name;
        this.title = title;
    }
    public static int getMax() {
        return max;
    }
    public void addAssignment(String title, String description, String topic,
                  int points){
        Assignment assignment = new Assignment(title, description, topic, points);
        if(count >= max){
            assignments = growArray(assignments);
        }
        assignments[count] = assignment;
        count = count + 1;
    }
    public CourseIterator createIterator(){
        return new CourseIterator(assignments);
    }
    public double getAssignmentWeights(){
        double weights = 0;
        for(int i = 0; i < assignments.length - 1;i++){
            weights += assignments[i].points;
        }
        return weights / (assignments.length - 1);
    }
    public String toString(){
        return " the name is " + this.name + " the title is " + title;
    }
    private Assignment[] growArray(Assignment[] first){
        first = new Assignment[max * 2];
        for(int i = 0; i < assignments.length;i++){
            first[i] = assignments[i];
        }
        return first;
    }
}
