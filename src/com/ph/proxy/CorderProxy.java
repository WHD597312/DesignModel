package com.ph.proxy;

public class CorderProxy implements ICoder {
    private ICoder coder;
    public CorderProxy(ICoder coder){
        this.coder=coder;
    }
    @Override
    public void implDemands(String demandName) {
        coder.implDemands(demandName);
    }
}
