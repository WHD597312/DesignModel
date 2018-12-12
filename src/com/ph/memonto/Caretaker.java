package com.ph.memonto;

public class Caretaker {
    Memoto mMemoto;//备忘录

    /**
     * 存档
     * @param memoto
     */
    public void achive(Memoto memoto){
        this.mMemoto=memoto;
    }

    /**
     * 获取存档
     * @return
     */
    public Memoto getmMemoto(){
        return mMemoto;
    }
}
