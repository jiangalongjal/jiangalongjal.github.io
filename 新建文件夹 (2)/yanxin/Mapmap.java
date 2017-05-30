package com.yanxin;

import java.util.*;
public class Mapmap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String,Student> map = new HashMap<String,Student>();
		map.put("000",new Student());
		map.put("003",new Student());
		map.put("001",new Student());
		map.put("002",new Student());
		map.put("004",new Student());
		
		//获取元素
		Student student = map.get("000");
		System.out.println("名字:"+student.getName());
		//删除
		map.remove("001");
		//清空
		map.clear();
		
		//map遍历
		Set<String> Key = map.keySet();
		//map中值比较大   推荐使用for，必须是同类型的
		for(String s:Key){
			System.out.println(s+"");
		}
		Iterator iterator = Key.iterator();
		while(iterator.hasNext()){
			String key = (String) iterator.next();
			System.out.println("key is"+Key +"value is"+map);
		}
	}

}
