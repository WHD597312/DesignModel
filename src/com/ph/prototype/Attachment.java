package com.ph.prototype;

public class Attachment implements Cloneable{
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void download(){
        System.out.println("下载的附件名称是:"+name);
    }

    @Override
    public Attachment clone() {
        try {
            Attachment attachment= (Attachment) super.clone();
            return attachment;
        }catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }
}
