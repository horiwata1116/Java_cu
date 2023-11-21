package curriculum_B;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Qes6 {
	
	/*
	 * [概要] 商品名を入力すると在庫数を表示する
	 * [詳細] 商品はパソコン、冷蔵庫、扇風機、洗濯機、加湿器、テレビ、ディスプレイ
	 *        上記商品以外が入力された場合は 「『受け取った値』は指定の商品ではありません」 と表示
	 *        拡張for文・Switch文・条件演算子を使用すること　※普通のif文は使用不可
	 */
	
	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in); // 商品名を入力するスキャナー
		String text = scanner.nextLine(); // 入力された商品名の取得
		List<String> split = Arrays.asList(text.split("、")); // 入力された文字列を「 、 」で区切って配列 split に格納
		Random rand = new Random(); // ランダム変数
		int tvZaiko = rand.nextInt(12) + 0; // テレビ在庫数用
		
		// 拡張for文 -- 配列 split の要素の数だけ繰り返す
		for(String kaden: split) {
			
	    	int zaiko = rand.nextInt(12) + 0; // 0～11をランダムに入力
	    	// 条件演算子 -- 取り扱いのある商品はOK、ない商品はNGに
	    	String str = (kaden.equals("パソコン")) || (kaden.equals("冷蔵庫")) || (kaden.equals("扇風機")) || (kaden.equals("洗濯機")) || (kaden.equals("加湿器")) || (kaden.equals("テレビ")) || (kaden.equals("ディスプレイ")) ? "OK" : "NG";
	    	
	    	// switch文１ -- OK と NG で分岐
			switch(str) {			
			case "OK":
				// switch文２ -- テレビ、ディスプレイかそうでないかで分岐
				String tv = (kaden.equals("パソコン")) || (kaden.equals("冷蔵庫")) || (kaden.equals("扇風機")) || (kaden.equals("洗濯機")) || (kaden.equals("加湿器")) ? "家電" : "テレビ、ディスプレイ";
				
				switch(tv) {
				
				case "家電" :
					System.out.println(kaden + "の残り台数は" + zaiko + "台です");
					break;
				
				case "テレビ、ディスプレイ" :
					// switch文３ -- テレビかディスプレイかで分岐
					String dic = (kaden.equals("テレビ")) ? "テレビ" : "ディスプレイ";
					
					switch(dic) {
					
					case "テレビ" :
						System.out.println(kaden + "の残り台数は" + tvZaiko + "台です");
						break;
						
					case "ディスプレイ" :
						System.out.println(kaden + "の残り台数は" + (11 - tvZaiko) + "台です");
						break;
						
					}
					
				}
				break;
			
			case "NG":
				System.out.println(" 『 " + kaden + " 』 は指定の商品ではありません");
				break;
				
			}
		}
	}
}