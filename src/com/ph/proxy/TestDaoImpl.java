package com.ph.proxy;

public class TestDaoImpl implements TestDao {
    @Override
    public void save() {
        System.out.println("添加数据");
    }

    @Override
    public void modify() {
        System.out.println("修改数据");
    }

    @Override
    public void delete() {
        System.out.println("删除数据");
    }
}
