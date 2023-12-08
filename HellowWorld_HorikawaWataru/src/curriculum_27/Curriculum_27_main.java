package curriculum_27;

import java.util.Scanner;

public class Curriculum_27_main {
	/* 
	 * コンソールに下記が入力されたときにコンソール出力結果がコンソールに表示されるように作ってください
	 * ライオン:2.1:80,ゾウ:3.2:40,パンダ:1.9:30,チンパンジー:0.94:25,シマウマ:2.4:65,インコ:0.1:50
	 * コンソール出力結果
	 * 
	 * コンソールに文字を入力してください
	 * 動物名：ライオン
	 * 体長：2.1m
	 * 速度：80km/h
	 * 学名：パンテラ レオ
	 * 
	 * 動物名：ゾウ
	 * 体長：3.2m
	 * 速度：40km/h
	 * 学名：ロキソドンタ・サイクロティス
	 * 
	 * 動物名：パンダ
	 * 体長：1.9m
	 * 速度：30km/h
	 * 学名：アイルロポダ・メラノレウカ
	 * 
	 * 動物名：チンパンジー
	 * 体長：0.94m
	 * 速度：25km/h
	 * 学名：パン・トゥログロディテス
	 * 
	 * 動物名：シマウマ
	 * 体長：2.4m
	 * 速度：65km/h
	 * 学名：チャップマンシマウマ
	 * 
	 * 動物名：インコ
	 * 体長：0.1m
	 * 速度：50km/h
	 * 学名：不明
	 * */
	
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("コンソールに文字を入力してください");
		
		String input = scanner.nextLine(); // 入力された文字列取得
		String[] animalData = input.split(","); // 入力された文字列を , で区切り、配列に格納
		
		// インスタンス化し配列作成
		Animalprint[] animals = new Animalprint[animalData.length];
		
		// animalData の要素の数だけ繰り返す for文
		// 
		for(int i = 0; i < animalData.length; i++) {
			
			String[] animalInfo = animalData[i].split(":"); // 配列の文字列を : で区切り、配列に格納
			
			// 動物の各情報の変数を定義
			String animalName = animalInfo[0];
			double height = Double.parseDouble(animalInfo[1]);
			int speed = Integer.parseInt(animalInfo[2]);
			String scientificName = null;
			
			//  switch文で動物名ごとに学名を変更
			switch(animalName) {
			case "ライオン":
				scientificName = "パンテラ レオ";
				break;
			
			case "ゾウ":
				scientificName = "ロキソドンタ・サイクロティス";
				break;
			
			case "パンダ":
				scientificName = "アイルロポダ・メラノレウカ";
				break;
			
			case "チンパンジー":
				scientificName = "パン・トゥログロディテス";
				break;
			
			case "シマウマ":
				scientificName = "チャップマンシマウマ";
				break;
				
			case "インコ":
				scientificName = "不明";
				break;
			}
			
			// 配列を更新
			animals[i] = new Animalprint(animalName, height, speed, scientificName);
			
		}
		
		// 配列 animals の要素を順番にコンソールに表示
		// クラス Animalprint のメソッドを実行
		for (Animalprint animal : animals) {
            animal.printInfo();
        }
		
	}
}
