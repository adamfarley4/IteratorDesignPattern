package com.company;

public class Assignment {
    private String title;
    private String description;
    private String topic;
    public int points;

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public String getTopic() {
        return topic;
    }

    public int getPoints() {
        return points;
    }

    public Assignment(String title, String description, String topic,
                      int points){
        this.title = title;
        this.description = description;
        this.topic = topic;
        this.points = points;
    }
    public String toString(){
        return "the title is " + this.title + " the description is " + this.description +
                " the topic is " + this.topic;
    }
}
