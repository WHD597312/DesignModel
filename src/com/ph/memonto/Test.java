package com.ph.memonto;

public class Test {
    public static void main(String[] args){
        CallOfDuty game=new CallOfDuty();
        game.play();
        Caretaker caretaker=new Caretaker();
        caretaker.achive(game.createMemoto());
        game.quit();

        CallOfDuty newGame=new CallOfDuty();
        newGame.restore(caretaker.getmMemoto());
    }
}
