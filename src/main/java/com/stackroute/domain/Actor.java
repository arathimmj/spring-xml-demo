package com.stackroute.domain;

public class Actor {

    public Actor(String actorName, String actorGender, String actorAge) {
        this.actorName = actorName;
        this.actorGender = actorGender;
        this.actorAge = actorAge;
    }

    public Actor() {
    }

    public String getActorName() {
        return actorName;
    }

    public void setActorName(String actorName) {
        this.actorName = actorName;
    }

    public String getActorGender() {
        return actorGender;
    }

    public void setActorGender(String actorGender) {
        this.actorGender = actorGender;
    }

    public String getActorAge() {
        return actorAge;
    }

    public void setActorAge(String actorAge) {
        this.actorAge = actorAge;
    }

    private String actorName;
    private String actorGender;
    private String actorAge;



}
