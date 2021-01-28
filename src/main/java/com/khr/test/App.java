package com.khr.test;

import org.openjdk.jol.info.ClassLayout;
import org.openjdk.jol.vm.VM;

import java.nio.ByteOrder;

/**
 * Hello world!
 *
 *
 *dddd
 *
 */
public class App

{
    private String domain;

    public String getDomain() {
        return domain;
    }

    public void setDomain(String domain) {
        this.domain = domain;
    }

    public static void main(String[] args )
    {
        App object = new App();
        //打印hashcode
        System.out.println(object.hashCode());
        //查看字节序
        System.out.println(ByteOrder.nativeOrder());

        //打印当前jvm信息
        System.out.println(VM.current().details());
        String classLayout = ClassLayout.parseInstance(object).toPrintable();
        System.out.println(classLayout);


    }
}
