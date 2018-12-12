package com.ph.prototype;

import java.util.Hashtable;

public class PrototypeManager {
    private Hashtable hashtable=new Hashtable();
    private static PrototypeManager pm=new PrototypeManager();
    private PrototypeManager(){
        hashtable.put("far",new FARDocument());
        hashtable.put("sar",new SARDocument());
    }
    public static PrototypeManager getInstance(){
        return pm;
    }
    public void addOfficalDocument(String key,OfficalDocument officalDocument){
        hashtable.put(key,officalDocument);
    }
    public OfficalDocument getOfficalDocument(String key){
        return ((OfficalDocument) hashtable.get(key)).clone();
    }
}
