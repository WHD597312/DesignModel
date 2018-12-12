package com.ph.adapter;

/**
 * 适配器
 */
public class VoltAdapter implements FiveVolt {
    Volt220 volt220;//适配者
    public VoltAdapter(Volt220 volt220){
        this.volt220=volt220;
    }
    @Override
    public int getVolt5() {
        return 5;
    }
}
