package com.hand.zyb;

/**
 * 员工实体类
 * 
 * @author zyb
 * @version 1.0
 * @date 2016年7月29日 下午6:56:55
 */
public class Employee {

	private int money;
	private double tax;

	public Employee() {
		super();
	}

	public Employee(int money) {
		super();
		this.money = money;
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}

	public double getTax() {
		return tax;
	}

	public void setTax(double tax) {
		this.tax = tax;
	}

}
