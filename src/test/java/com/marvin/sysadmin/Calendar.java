package com.marvin.sysadmin;

import java.util.Scanner;

/*
 * 输入年份，输出日历表（从1900.1.1开始计算总天数）
 */
public class Calendar {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("请输入年份:");
        int year = in.nextInt();

        System.out.print("开始打印日历。。。。。。。。。。。");
        System.out.print("\n");

        for (int i = 1; i <= 12; i++) {
            printCalendar(year, i);
        }
    }

    /**
     * 功能描述: 打印某年某月份日历
     *
     * @param: [year, month]
     * @return: void
     */
    public static void printCalendar(int year, int month) {
        System.out.print("\n");
        System.out.print("==== " + year + " 年" + month + " 月份日历 ====");
        System.out.print("\n");
        int sum = 0;
        //按年计算1900.1.1到输入年份的1.1一共有多少天(分闰年和平年)
        for (int i = 1900; i < year; i++) {
            if (i % 4 == 0 && i % 100 != 0 || i % 400 == 0) {
                sum += 366;
            } else {
                sum += 365;
            }
        }
        //按月计算今年的1.1号到输入月份的1号一共有多少天
        //二月分闰年(29)和平年(28),大月31天，小月30天
        for (int j = 1; j < month; j++) {
            sum += calMonthDays(year, j);
        }
        // 计算星期几
        int wekday = sum % 7;
        System.out.println("一\t二\t三\t四\t五\t六\t日");
        for (int i = 1; i <= wekday; i++) {
            System.out.print("\t");
        }
        for (int i = 1; i <= calMonthDays(year, month); i++) {
            if (sum % 7 == 6) {
                System.out.print(i + "\n");
            } else {
                System.out.print(i + "\t");
            }
            sum++;
        }
        System.out.print("\n");
    }

    /**
     * 功能描述: 计算某年某月份天数(分闰年和平年)，如2023年2月份有28天
     *
     * @param: [year, month]
     * @return: int
     */
    public static int calMonthDays(int year, int month) {
        if (month == 2) {
            if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
                return 29;
            } else {
                return 28;
            }
        } else {
            if (month == 4 || month == 6 || month == 9 || month == 11) {
                return 30;
            } else {
                return 31;
            }
        }
    }

}