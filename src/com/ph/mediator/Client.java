package com.ph.mediator;

public class Client {

    public static void main(String[] args){

        ConcreteMediator mediator=new ConcreteMediator();
        ColleagueA colleagueA=new ColleagueA("张三",mediator);
        ColleagueB colleagueB=new ColleagueB("李四",mediator);
        mediator.setColleagueA(colleagueA);
        mediator.setColleagueB(colleagueB);
        colleagueA.contact("我是A，我要和同事B说说工作的事情");
        colleagueB.contact("我是B,我下午有事，下午商量吧");
    }
}
