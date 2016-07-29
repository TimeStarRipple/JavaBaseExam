package com.hand.zyb;

import java.util.Scanner;

/**
 * 编程实现工资个人所得税计算程序：
 * 现设定各项社会保险金为 0，从命令行中接收用户输入的工资数,在输
 * 出中打印出需缴纳的税费,形式如下:
 * 请输入工资:	xxxx
 * 所需要缴纳的税费为:	xxxx
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.print( "请输入工资：" );
        
        Scanner scanner = new Scanner(System.in);
        int money = scanner.nextInt();
        
        Employee employee = new Employee(money);
        employee.setTax(TaxHelper.calculateTax(employee));
        
        System.out.println("所需要缴纳的税费为：" + employee.getTax());
    }
    
}


