package jp.co.aforce.test;

public class MinMax {
	//練習問題1
	//PracticeTest6
	int getMaxValue(int a, int b, int c) {
		int max = a;
		if(max < b) {
			max = b;
		}else {
			//処理なし
		}
		if(max < c) {
			max = c;
		}else {
			//処理なし
		}
		
		return max;
	}
	
	int getMinValue(int a, int b, int c) {
		int min = a;
		if(min > b) {
			min = b;
		}else {
			//処理なし
		}
		if(min > c) {
			min = c;
		}else {
			//処理なし
		}
		
		return min;
	}
}
