package com.hand.zyb;

import java.util.List;
import java.util.Map;

/**
 * 用于存储数据的实体类
 * 
 * @author zyb
 * @version 1.0
 * @date 2016年7月29日 下午7:54:08
 */
public class StorageNumber {

	private List<Integer> list;
	private Map<Integer, List<Integer>> map;

	public StorageNumber() {
		super();
	}

	public List<Integer> getList() {
		return list;
	}

	public void setList(List<Integer> list) {
		this.list = list;
		
		
	}

	public Map<Integer, List<Integer>> getMap() {
		return map;
	}

	public void setMap(Map<Integer, List<Integer>> map) {
		this.map = map;
	}

}
