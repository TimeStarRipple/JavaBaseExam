package com.hand.zyb;

import java.util.List;
import java.util.Map;
import java.util.Set;;

/**
* 排序帮助类
* @author zyb
* @version 1.0
* @date 2016年7月29日 下午7:51:51
*/
public class SortHelper {
	
	public static void sortStorageNumber(StorageNumber sn) {
		Map<Integer, List<Integer>> map = sn.getMap();
		Set<Integer> set = map.keySet();
		
		List<Integer> list = null;
		for (Integer integer : set) {
			list = map.get(integer);
			sortList(list);
		}
		
	}
	
	private static void sortList(List<Integer> list)
	{
		for (int i = 0; i < list.size() - 1; i++) {
			for (int j = 0; j < list.size() - 1 - i; j++) {
				if(list.get(j) > list.get(j + 1))
				{
					int temp = list.get(j);
					list.set(j, list.get(j + 1));
					list.set(j + 1, temp);
				}
			}
		}
	}

}
