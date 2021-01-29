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
    private String domains;
    private String set01;
    private String set02;
    private String set03;
    private String set04;
    private String set05;
    private String set06;
    private String set07;
    public String getSet01() {
        return set01;
    }

    public void setSet01(String set01) {
        this.set01 = set01;
    }

    public String getSet02() {
        return set02;
    }

    public void setSet02(String set02) {
        this.set02 = set02;
    }

    public String getSet03() {
        return set03;
    }

    public void setSet03(String set03) {
        this.set03 = set03;
    }

    public String getSet04() {
        return set04;
    }

    public void setSet04(String set04) {
        this.set04 = set04;
    }

    public String getDomains() {
        return domains;
    }

    public void setDomains(String domains) {
        this.domains = domains;
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
