package com.ph.prototype;

public class SARDocument implements OfficalDocument {
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
        System.out.println("软件规格需求说明书");
    }
}
