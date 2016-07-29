package com.hand.zyb;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 生成数据的帮助类
 * 
 * @author zyb
 * @version 1.0
 * @date 2016年7月29日 下午7:54:54
 */
public class ProduceNumber {

	/*
	 * count代表要产生多少个数
	 */
	public static List<Integer> produceListNumber(int count) {
		List<Integer> list = new ArrayList<Integer>();

		int number = 0;
		for (int i = 0; i < count; i++) {
			number = (int) (Math.random() * 100);
			list.add(number);
		}

		return list;
	}

	public static Map<Integer, List<Integer>> calculateMap(List<Integer> list) {
		Map<Integer, List<Integer>> map = new HashMap<Integer, List<Integer>>();

		int number = 0;
		List<Integer> listNumber = null;
		for (Integer integer : list) {
			number = integer / 10;
			if (map.containsKey(number)) {
				listNumber = map.get(number);
				listNumber.add(integer);
				map.put(number, listNumber);
			} else {
				listNumber = new ArrayList<Integer>();
				listNumber.add(integer);
				map.put(number, listNumber);
			}
		}

		return map;
	}

}
