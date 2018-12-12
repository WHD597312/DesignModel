package com.ph.test;

import com.ph.adapter.OpearationAdapter;
import com.ph.adapter.Volt220;
import com.ph.adapter.VoltAdapter;
import com.ph.build.Builder;
import com.ph.build.Computer;
import com.ph.build.Director;
import com.ph.build.MacbookBuilder;
import com.ph.prototype.Attachment;
import com.ph.prototype.OfficalDocument;
import com.ph.prototype.PrototypeManager;
import com.ph.prototype.WeekLLog;

public class Test {
    public static void main(String[] args){
        WeekLLog weekLLog=new WeekLLog();
        weekLLog.setName("张三");
        weekLLog.setContent("工作android");
        weekLLog.setDate("2018-11-12");
        Attachment attachment=new Attachment();
        attachment.setName("附件1");
        weekLLog.setAttachment(attachment);

        WeekLLog newWeekLog=weekLLog.clone();
//        newWeekLog.setName("李四");
        newWeekLog.setContent("工作IOS");
        newWeekLog.setDate("2018-11-15");

        weekLLog.desc();
        System.out.println("姓名是否相同"+(weekLLog.getName()==newWeekLog.getName()));
        System.out.println("--------------------");
        newWeekLog.desc();
        System.out.println("附件是否相同:"+(weekLLog.getAttachment()==newWeekLog.getAttachment()));


        System.out.println("--------------------");
        PrototypeManager pm=PrototypeManager.getInstance();
        OfficalDocument officalDocument=pm.getOfficalDocument("far");
        officalDocument.display();
        OfficalDocument officalDocument1=pm.getOfficalDocument("far");
        officalDocument1.display();
        System.out.println(officalDocument==officalDocument1);

        Builder builder=new MacbookBuilder();//创建建造者对象
        Director director=new Director(builder);//创建装饰着对象，将建造者对象传给装饰者
        director.construct("英特尔主板","Retina显示器");
        Computer computer=builder.create();
        System.out.println(computer);

        System.out.println("----------------------------------------");
        OpearationAdapter opearationAdapter=new OpearationAdapter();
        int[] arr={56,87,65,75,64,92,45,78,60,54};
        arr=opearationAdapter.sort(arr);
        for (int i = 0; i <arr.length; i++) {
            System.out.print(arr[i]+"\t");
        }
        int ss=opearationAdapter.search(arr,87);
        System.out.println("87分在第"+ss+"个位置");
        VoltAdapter adapter=new VoltAdapter(new Volt220());
        int val=adapter.getVolt5();
        System.out.println("输出电压:"+val);
    }
}
