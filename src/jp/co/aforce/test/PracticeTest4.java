package jp.co.aforce.test;

import java.util.Arrays;

public class PracticeTest4 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		//練習問題1
		//②が正しい
		//String型の比較には.equalsを使わないといけないから。
		
		//練習問題2
		String[] animal = {"犬", "猫", "うさぎ", "へび"};
		
		//練習問題3
		String myAnimal = "猫";
		
		if(Arrays.asList(animal).contains(myAnimal)) {
			System.out.println(myAnimal + "はリストに含まれています");
		}else {
			System.out.println(myAnimal + "はリストに含まれていません");
		}
		
		//練習問題4
		int myBirthmonth = 9;
		
		if(myBirthmonth == 1) {
			System.out.println("元日,成人の日");
		}else if(myBirthmonth == 2) {
			System.out.println("建国記念の日,天皇誕生日");
		}else if(myBirthmonth == 3) {
			System.out.println("春分の日");
		}else if(myBirthmonth == 4) {
			System.out.println("昭和の日");
		}else if(myBirthmonth == 5) {
			System.out.println("憲法記念日,みどりの日,こどもの日");
		}else if(myBirthmonth == 6) {
			System.out.println("なし");
		}else if(myBirthmonth == 7) {
			System.out.println("海の日,スポーツの日");
		}else if(myBirthmonth == 8) {
			System.out.println("山の日");
		}else if(myBirthmonth == 9) {
			System.out.println("敬老の日,秋分の日");
		}else if(myBirthmonth == 10) {
			System.out.println("なし");
		}else if(myBirthmonth == 11) {
			System.out.println("文化の日,勤労感謝の日");
		}else {
			System.out.println("なし");
		}
		
		//ifの方が使い慣れているから
		//switchよりはifの方が活用頻度が高いため
	}

}
