package com.hand.zyb;

/**
 * (8 分)随机生成 50 个小于 100 的整数,放入 List 中,将 List 中的
 * 数据除以 10,以结果的整数值作为 key 放入 Map 中,得到如
 * {1=>[11,10,12],2=>[21,24,23]}的 Map,再将 Map 中 key 对应的
 * 数组进行排序(不允使用 sort 方法，需要自行编写排序方法),
 * 得到如{1=>[10,11,12],2=>[21,23,24]}
 * 输出的形式如下:
 * 随机生成 50 个小于 100 的数,分别为:	xxx,xxxx,xxxx
 * Map 中的数据为:	{1=>[11,10,12],2=>[21,24,23]}
 * 排序后的 Map 为:	{1=>[10,11,12],2=>[21,23,24]}
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	StorageNumber sn = new StorageNumber();
    	sn.setList(ProduceNumber.produceListNumber(50));
    	sn.setMap(ProduceNumber.calculateMap(sn.getList()));
    	
        System.out.println( "随机生成 50 个小于 100 的数,分别为:" );
        for (Integer integer : sn.getList()) {
			System.out.print(integer);
		}
        System.out.println();
        
        System.out.println("Map 中的数据为：");
        System.out.println(sn.getMap());
        
        SortHelper.sortStorageNumber(sn);
        
        System.out.println("排序后的 Map 为：");
        System.out.println(sn.getMap());
        
    }
}
