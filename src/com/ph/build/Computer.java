package com.ph.build;

public abstract class Computer {
    protected String mBoard;
    protected String mDisplay;
    protected String mOS;

    public String getmBoard() {
        return mBoard;
    }

    public void setmBoard(String mBoard) {
        this.mBoard = mBoard;
    }

    public String getmDisplay() {
        return mDisplay;
    }

    public void setmDisplay(String mDisplay) {
        this.mDisplay = mDisplay;
    }

    public String getmOS() {
        return mOS;
    }

    public void setmOS() {

    }

    @Override
    public String toString() {
        return "Computer的主机是"+mBoard+"显示器是"+mDisplay+"操作系统是"+mOS;
    }
}
