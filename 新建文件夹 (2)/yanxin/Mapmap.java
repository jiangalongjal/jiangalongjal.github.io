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
		
		//��ȡԪ��
		Student student = map.get("000");
		System.out.println("����:"+student.getName());
		//ɾ��
		map.remove("001");
		//���
		map.clear();
		
		//map����
		Set<String> Key = map.keySet();
		//map��ֵ�Ƚϴ�   �Ƽ�ʹ��for��������ͬ���͵�
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
