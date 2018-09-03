package com;

public class Factory{ //getClass 产生Sample 一般可使用动态类装载装入类。
    public static Sample creator(int which){
        if (which==1) {
            return new SampleA();
        }else if (which==2) {
            return new SampleB();
        }
        return null;
    }
}