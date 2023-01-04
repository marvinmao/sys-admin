package com.marvin.sysadmin.msb;

import java.io.IOException;

/**
 * @Auther: marvinmao
 * @Date: 2022/12/7
 * @Description:
 */
public class T01_NormalReference {

    public static void main(String[] args) throws IOException {
        M m = new M();
        m = null;
        System.out.println(m);

        System.gc();
        System.out.println(m);
        System.in.read();
    }
}
