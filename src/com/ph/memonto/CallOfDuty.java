package com.ph.memonto;

public class CallOfDuty {
    private int mCheckPont=1;
    private int mLifeValue=100;
    private String mWeapon="沙漠之鹰";

    public void play(){
        System.out.println("玩游戏："+String.format("第%d关",mCheckPont)+" 奋战杀敌中");
        mLifeValue-=10;
        mCheckPont++;
        System.out.println("到达"+String.format("第%d关",mCheckPont));
    }

    public void quit(){
        System.out.println("------------------");
        System.out.println("退出前游戏的属性:"+this.toString());
        System.out.println("退出游戏");
        System.out.println("------------------");
    }

    public Memoto createMemoto(){
        Memoto memoto=new Memoto();
        memoto.mCheckPoint=mCheckPont;
        memoto.mLifeValue=mLifeValue;
        memoto.mWeapon=mWeapon;
        return memoto;
    }
    public void restore(Memoto memoto){
        this.mCheckPont=memoto.mCheckPoint;
        this.mLifeValue=memoto.mLifeValue;
        this.mWeapon=memoto.mWeapon;
        System.out.println("恢复后的游戏属性："+this.toString());
    }

    @Override
    public String toString() {
        return "CallOfDuty{" +
                "mCheckPont=" + mCheckPont +
                ", mLifeValue=" + mLifeValue +
                ", mWeapon='" + mWeapon + '\'' +
                '}';
    }
}
