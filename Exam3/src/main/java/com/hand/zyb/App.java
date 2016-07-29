package com.hand.zyb;

import java.util.Scanner;

/**
 * (8 分)输入某年某月某日，判断这一天是这一年的第几天？ 从控制台读取日期,日期输入的格式为”2015-07-26”形式.(不允 许使用
 * Calendar,Date,DateTime 类中的函数),输入输出的形式 如下: 请输入日期: 2015-01-01 你输入的日期为当年的第 1 天
 */
public class App {
	public static void main(String[] args) {
		System.out.print("请输入日期: ");

		Scanner scanner = new Scanner(System.in);
		String strDate = scanner.nextLine();

		String[] strDateArr = strDate.split("-");
		MyDate myDate = new MyDate();

		myDate.setYear(Integer.parseInt(strDateArr[0]));
		myDate.setMonth(Integer.parseInt(strDateArr[1]));
		myDate.setDay(Integer.parseInt(strDateArr[2]));

		int dayNumber = DayHelper.calculateDay(myDate);
		System.out.print("你输入的日期为当年的第" + dayNumber + "天");
	}
}
