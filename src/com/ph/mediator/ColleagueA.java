package com.ph.mediator;

public class ColleagueA extends Colleague {
    public ColleagueA(String name, Mediator mediator) {
        super(name, mediator);
    }
    public void getMessage(String message){
        System.out.println("同事A"+name+"获得信息"+message);
    }
    public void contact(String message){
        mediator.contact(message,this);
    }
}
