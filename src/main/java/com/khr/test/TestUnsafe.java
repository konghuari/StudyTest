/**
 * Copyright (C), 2015-2020, DXY All Rights Reserved.
 * FileName: T02_TestUnsafe
 * Author:   konghuari
 * Date:     2020/2/25 16:48
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.khr.test;
import org.junit.jupiter.api.DynamicTest;
import sun.misc.Unsafe;

import java.lang.reflect.Field;

public class TestUnsafe {

    int i = 0;
    private static TestUnsafe t = new TestUnsafe();

    public static void main(String[] args) throws Exception {
        Field unsafeField = Unsafe.class.getDeclaredFields()[0];
        unsafeField.setAccessible(true);
        Unsafe unsafe = (Unsafe) unsafeField.get(null);

        Field f = TestUnsafe.class.getDeclaredField("i");
        long offset = unsafe.objectFieldOffset(f);
        System.out.println(offset);

        boolean success = unsafe.compareAndSwapInt(t, offset, 0, 1);
        System.out.println(success);
        System.out.println(t.i);
        //unsafe.compareAndSwapInt()
    }


}