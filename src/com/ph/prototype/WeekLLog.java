package com.ph.prototype;

public class WeekLLog implements Cloneable{

    private String name;
    private String content;
    private String date;
    private Attachment attachment;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setAttachment(Attachment attachment) {
        this.attachment = attachment;
    }

    public Attachment getAttachment() {
        return attachment;
    }

    @Override
    public WeekLLog clone(){
        try {
            WeekLLog weekLLog= (WeekLLog) super.clone();
            weekLLog.attachment=this.attachment.clone();
            return weekLLog;
        }catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }
    public void desc(){
        System.out.println(name+":在"+date+"工作内容是"+content);
    }
}
