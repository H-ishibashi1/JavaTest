package jp.co.aforce.test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Employee {
	//練習問題3
	private int number;
	private String name;
	private String sei;
	private String age;
	
	HashMap<Integer,ArrayList<String>> keyList = new HashMap<>();
	
	
	void setEmployee(int number, String name, String sei, String age) {
		ArrayList<String> empList = new ArrayList<String>();
		empList.add(name);
		empList.add(age);
		keyList.put(number, empList);
		}
	
	void print() {
		for(Map.Entry<Integer, ArrayList<String>> empPrint : keyList.entrySet()) {
			ArrayList<String> empList2 = new ArrayList<String>();
			empList2.addAll(empPrint.getValue());
			System.out.println("番号は" + empPrint.getKey() + "、名前は" + empList2.get(0) + "、年齢は" + empList2.get(1) + "歳です");
		}
	}
}
