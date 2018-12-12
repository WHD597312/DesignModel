package com.ph.memonto;

/**
 * 这是一个备忘录对象，用来存储一个对象的字段。
 */
public class Memoto {
    public int mCheckPoint;
    public int mLifeValue;
    public String mWeapon;

    @Override
    public String toString() {
        return "Memoto{" +
                "mCheckPoint=" + mCheckPoint +
                ", mLifeValue=" + mLifeValue +
                ", mWeapon='" + mWeapon + '\'' +
                '}';
    }
}
