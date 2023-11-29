package curriculum_19;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Animal {
	
	public static void main(String[] args) {
		
		// Q1：Dogクラスを呼び出して変数に代入し、動物の名前をコンソールに出力してください。
		Dog classDog = new Dog();
		
		System.out.println(classDog.dog);
		// Q2：Dogクラスを呼び出して変数に代入し、動物の数をコンソールに出力してください。Dognum
		Dog dogNum = new Dog(1);
		System.out.println(dogNum.num);
		
		// 現在の日時を「yyyy-MM-dd H:m:s」形式で変数に代入して、コンソールに出力してください
		
		// 現在時刻を取得
		Date currentDate = new Date();

        // 日付フォーマットを指定
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd H:m:s");

        // フォーマットに従って日付を文字列に変換
        String formattedDate = dateFormat.format(currentDate);

        // コンソールに出力
        System.out.println(formattedDate);
		
	}
}
