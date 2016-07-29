package com.hand.zyb;

/**
 * 天数帮助类
 * 
 * @author zyb
 * @version 1.0
 * @date 2016年7月29日 下午7:27:29
 */
public class DayHelper {

	public static int calculateDay(MyDate date)
	{
		int dayNumber = 0;
		
		int year = date.getYear();
		int month = date.getMonth();
		int day = date.getDay();
		
		if (month <= 2) {
			dayNumber = 31 + day;
			return dayNumber;
		}
		
		if(isLeapYear(year))
		{
			dayNumber = 31 + 29;
		}
		else
		{
			dayNumber = 31 + 28;
		}
		
		switch (month) {
		case 12:
			dayNumber += 30;
		case 11:
			dayNumber += 31;
		case 10:
			dayNumber += 30;
		case 9:
			dayNumber += 31;
		case 8:
			dayNumber += 31;
		case 7:
			dayNumber += 30;
		case 6:
			dayNumber += 31;
		case 5:
			dayNumber += 30;
		case 4:
			dayNumber += 31;	
		default:
			dayNumber += day;
			break;
		}
		
		return dayNumber;
	}

	public static boolean isLeapYear(int year) {
		if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
			return true;
		} else {
			return false;
		}
	}

}
