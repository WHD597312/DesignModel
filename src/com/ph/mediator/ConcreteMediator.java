package com.ph.mediator;

public class ConcreteMediator extends Mediator {
    ColleagueA colleagueA;
    ColleagueB colleagueB;

    public ColleagueA getColleagueA() {
        return colleagueA;
    }

    public void setColleagueA(ColleagueA colleagueA) {
        this.colleagueA = colleagueA;
    }

    public void setColleagueB(ColleagueB colleagueB) {
        this.colleagueB = colleagueB;
    }

    public ColleagueB getColleagueB() {
        return colleagueB;
    }


    @Override
    public void contact(String content, Colleague colleague) {
        if (colleague==colleagueA){
            colleagueB.getMessage(content);
        }else {
            colleagueA.getMessage(content);
        }
    }
}
