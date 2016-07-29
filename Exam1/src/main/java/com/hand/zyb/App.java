package com.hand.zyb;

import java.util.ArrayList;
import java.util.List;

/**
 * (8 分)判断 101-200 之间有多少个素数，并输出所有素数。
 * 输出结果格式如下:
 * 101-200 间总共有 xx 个素数,分别是:xxx,xxx,xxx
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	int count = 0;
    	List<Integer> list = new ArrayList<Integer>();
        for (int i = 101; i < 200; i++) {
			if(test(i))
			{
				count++;
				list.add(i);
			}
		}
        
        System.out.println("101-200 间总共有" + count + "个素数, 分别是：");
        for (Integer integer : list) {
			System.out.print(integer + ",");
		}
    }
    
    public static boolean test(int number)
    {
    	int sqrtNumber = (int) Math.sqrt(number);
    	for (int i = 2; i < sqrtNumber + 2; i++) {
			if(number%i == 0)
			{
				return false;
			}
		}
    	return true;
    }
}
