package jp.co.aforce.test;

import java.util.HashMap;
import java.util.Map;

public class PracticeTest3 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		//練習問題1
		String[] data = {"1", "田中太郎", "男性", "27"};
		
		//練習問題2
		System.out.println(data[1]);
		
		//練習問題4
		Employee emp = new Employee();
		emp.setEmployee(1, "田中太郎", "男性", "27");
		emp.setEmployee(2, "佐藤花子", "女性", "22");
		emp.setEmployee(3, "鈴木次郎", "男性", "31");
		
		emp.print();
		
		//練習問題5
		HashMap<String, Integer> study = new HashMap<>();
		study.put("国語", 90);
		study.put("数学", 80);
		study.put("英語", 65);
		
		for(Map.Entry<String, Integer> getStudy : study.entrySet()) {
			System.out.println(getStudy.getKey() + " : " + getStudy.getValue());
		}
		
		//練習問題6
		//HashMapを使えば教科名と点数を紐付けできると思ったから。
	}

}
