package com.ph.prototype;

public class FARDocument implements OfficalDocument {
    @Override
    public OfficalDocument clone() {
        try {
            OfficalDocument officalDocument= (OfficalDocument) super.clone();
            return officalDocument;
        }catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public void display() {
        System.out.println("可行性文档说明");
    }
}
