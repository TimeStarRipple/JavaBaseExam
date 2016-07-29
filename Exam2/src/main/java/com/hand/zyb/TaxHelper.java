package com.hand.zyb;
/**
* 薪水计算帮助类
* @author zyb
* @version 1.0
* @date 2016年7月29日 下午6:59:44
*/
public class TaxHelper {
	
	public static double calculateTax(Employee employee)
	{
		int money = employee.getMoney();
		double tax = 0;
		
		money -= 3500;
		
		if(money < 1500)
		{
			tax = money * 0.03;
			return tax;
		}
		if(money < 4500)
		{
			tax = 1500 * 0.03 + (money - 1500) * 0.1;
			return tax;
		}
		if(money < 9000)
		{
			tax = 1500 * 0.03 + 3000 * 0.1 + (money - 4500) * 0.2;
			return tax;
		}
		if (money < 35000) {
			tax = 1500 * 0.03 + 3000 * 0.1 + 4500 * 0.2 + (money - 9000) * 0.25;
			return tax;
		}
		if (money < 55000) {
			tax = 1500 * 0.03 + 3000 * 0.1 + 4500 * 0.2 + 26000 * 0.25 + (money - 35000) * 0.3;
			return tax;
		}
		if (money < 80000) {
			tax = 1500 * 0.03 + 3000 * 0.1 + 4500 * 0.2 + 26000 * 0.25 + 20000 * 0.3 + (money - 55000) * 0.35;
			return tax;
		}
		tax = 1500 * 0.03 + 3000 * 0.1 + 4500 * 0.2 + 26000 * 0.25 + 20000 * 0.3 + 25000 * 0.35 + (money - 80000) *0.45;
		return tax;
	}

}
