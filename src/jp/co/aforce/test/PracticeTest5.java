package jp.co.aforce.test;

import java.util.Random;

public class PracticeTest5 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		//練習問題1
		Random random = new Random();
		int fortune = random.nextInt();
		System.out.println(fortune);
		
		switch(fortune) {
		case 1:
			System.out.println("吉です");
			break;
		case 2:
			System.out.println("中吉です");
			break;
		case 3:
			System.out.println("大吉です");
			break;
		default:
			System.out.println("凶です");
			break;
		}
		
		//練習問題2
		int sum = 0;
		for(int i = 1;i <= 100;i++) {
			if(i % 7 == 0) {
				System.out.println(i);
				sum += i;
			}else {
				//処理なし
			}
		}
		System.out.println("7の倍数の総合計は" + sum);
		
		//練習問題3
		for(int i = 1;i <= 9;i++) {
			for(int j = 1;j <= 9;j++) {
				System.out.print(i * j + " ");
			}
			System.out.println("");
		}
	}

}
