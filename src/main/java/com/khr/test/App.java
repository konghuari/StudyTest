package com.khr.test;

import org.openjdk.jol.info.ClassLayout;
import org.openjdk.jol.vm.VM;

import java.nio.ByteOrder;

/**
 * Hello world!
 *
 *ddd
 *dddd
 *ff
 * dfdf
 *
 *
 */
public class App 
{
    public static void main( String[] args )
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
