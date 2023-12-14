package curriculum_29_main;
/*

0, "北海道:札幌市:83424"
1, "青森県:青森市:9646"
2, "岩手県:盛岡市:15275"
3, "宮城県:仙台市:7282"
4, "秋田県:秋田市:11638"
5, "山形県:山形市:9323"
6, "福島県:福島市:13784"
7, "茨城県:水戸市:6097"
8, "栃木県:宇都宮市:6408"
9, "群馬県:前橋市:6362"
10, "埼玉県:さいたま市:3798"
	
コンソールに数字と昇順・降順の値が入力されると上記配列に対応する
都道府県がソートされてコンソールに出力されるように作ってください
※Packageを2つ作ってください
※複数選択できるようにしてください
	
例:
8,5,9,.....
と入力された場合（昇順）
	
都道府県名：山形県
県庁所在地：山形市
面積：9323.0km2
	
都道府県名：栃木県
県庁所在地：宇都宮市
面積：6408.0km2

都道府県名：群馬県
県庁所在地：前橋市
面積：6362.0km2

*/

import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Pattern;

import curriculum_29_process.Prefectures;

public class Main {
	@SuppressWarnings({ "resource" })
	public static void main(String[] args) {
		
		// インスタンスを生成
		Prefectures[] prefectures = {
				new Prefectures("北海道", "札幌市", 83424),
				new Prefectures("青森県", "青森市", 9646),
				new Prefectures("岩手県", "盛岡市", 15275),
				new Prefectures("宮城県", "仙台市", 7282),
				new Prefectures("秋田県", "秋田市", 11638),
				new Prefectures("山形県", "山形市", 9323),
				new Prefectures("福島県", "福島市", 13784),
				new Prefectures("茨城県", "水戸市", 6097),
				new Prefectures("栃木県", "宇都宮市", 6408),
				new Prefectures("群馬県", "前橋市", 6362),
				new Prefectures("埼玉県", "さいたま市", 3798)
				};
		
		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine(); // 入力された文字列
		
		String pattern = "[^0-9,]+";
		// 入力がnull or 空白 or 数字以外で終了
		if(input == null || input == "") {
			return;
		}else if (Pattern.matches(pattern, input)) {
			return;
		}
		
		// コンソールに入力された数字を , で分割して整数の配列に変換
		int[] numbers = Arrays.stream(input.split(","))
				.map(String::trim) // 空白を取り除く
				.mapToInt(Integer::parseInt)
				.toArray();
		
		// 配列内の数字を昇順にソート
		Arrays.sort(numbers);
		
		// ソートされた順序で都道府県情報を出力
		for (int index : numbers) {
			if (index >= 0 && index < prefectures.length) {
				Prefectures prefecture = prefectures[index];
				System.out.println("都道府県名：" + prefecture.getName());
				System.out.println("県庁所在地：" + prefecture.getCapital());
				System.out.println("面積：" + prefecture.getArea() + "km2");
				System.out.println();
				}
			}
		}
	}
