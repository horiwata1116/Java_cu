package curriculum_B;

import java.math.BigDecimal;
import java.util.Scanner;

public class Qes7 {
	/*
	 * [概要] 人数と各科目の点数を入力すると全科目の平均点と各科目の平均点を表示する。
	 * [詳細] 科目は 英語、数学、理科、社会の４教科
	 *        人数の入力、点数の入力、個人平均点、科目ごとの平均点の順番に出力
	 */
	public static void main(String[] args) {
		 // 人数入力用のスキャナー
		System.out.print("生徒の人数を入力してください（2以上）: ");
		Scanner scanner = new Scanner(System.in);
		
		int text = scanner.nextInt(); // 人数の入力
		String subject[] = {"英語", "数学", "理科", "社会"}; // 科目を配列に入れる
		int pointStr[][] = new int[text][4]; // 点数を入れるための多次元配列 [num人目] [0:英語 1:数学 2:理科 3:社会]
		int subTotal[] = new int[text]; // 合計点を入れるための配列
		BigDecimal ave; // 平均点の変数
		BigDecimal a = new BigDecimal("4"); // 平均点を求める際に使う
		BigDecimal n = BigDecimal.valueOf(text); // intからBigDecimalに変換
		int subjectTotal = 0; // 各科目の合計点を入れるための変数
		BigDecimal subjectAve = BigDecimal.valueOf(subjectTotal).setScale(2, BigDecimal.ROUND_DOWN).divide(n);
		
		// 人数入力をしたら開始する処理 -- for文で入力された人数と同じ回数繰り返す
		for(int num = 0; num < text; num++ ) {
			
			// 拡張for文で配列 subject の要素の数と同じ回数繰り返す処理
			for(String str: subject) {
				
				// 点数入力用のスキャナー
				System.out.print((num + 1) + "人目の『"+ str +"』の点数を入力してください : "); 
				Scanner pointScanner = new Scanner(System.in); 
				int point = scanner.nextInt(); // 点数の入力
				
				// switch文で科目ごとに処理を分岐 -- 多次元配列 pointStr に入れる
				switch(str){
				
				case "英語" :
					pointStr[num][0] = point;
					break;
					
				case "数学" :
					pointStr[num][1] = point;
					break;
					
				case "理科" :
					pointStr[num][2] = point;
					break;
				
				case "社会" :
					pointStr[num][3] = point;
					System.out.println();// 1行開ける
					break;
				}
				
			}
			
			// 全教科の合計点数
			subTotal[num] = pointStr[num][0] + pointStr[num][1] + pointStr[num][2] + pointStr[num][3];
		}
		
		// 点数が入力されたら開始する処理 -- 個人の平均点を出す処理
		for(int num = 0; num < text; num++){
			ave = BigDecimal.valueOf(subTotal[num]).setScale(2, BigDecimal.ROUND_DOWN).divide(a);
			System.out.println((num + 1) + "人目の平均点は" + ave + "点です。");
		}
		
		// 1行開ける
		System.out.println();
		
		// 個人の平均点を出した後に開始する処理 -- 各科目の平均点を出す処理
		// 多次元配列 pointStrから点数を取り出し、subjectTotalに加算して人数で割る
		for(int b = 0; b <= 3; b++) {
			subjectTotal = 0;
			for(int num = 0; num < text; num++) {
				subjectTotal = subjectTotal += pointStr[num][b];
				if(num == (text - 1)) {
					subjectAve = BigDecimal.valueOf(subjectTotal).setScale(2, BigDecimal.ROUND_DOWN).divide(n);
					System.out.println(subject[b] + "の平均点は" + subjectAve + "点です。");
					}
				}
			}
		}
	}
