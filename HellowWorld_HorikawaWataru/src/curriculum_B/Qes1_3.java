package curriculum_B;

import java.util.Random;
import java.util.Scanner;

public class Qes1_3 {
	
	public static void main(String[] args) {
		/*
		 *  問１
		 *  [概要] コンソール上に入力された値をユーザー名として登録を行う
		 *  [詳細] 文字数制限は10文字以内、正常な値が入力された場合登録完了メッセージを表示する
		 */
		 
		// 引数で標準入力System.inを指定する
	    @SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
	    String text = scanner.nextLine(); // 入力された文字列
	    boolean alphaNumcheck = !text.matches("^[0-9a-zA-Z]+$"); // 半角英数字判定
	    /*
	     *  文字数制限の条件分岐
	     *  半角英数字以外の入力で「半角英数字のみで名前を入力してください」
	     *  10文字以上の入力で「名前を10文字以内で入力してください」
	     *  入力なし、nullで「名前を入力してください」
	     *  正常な値であれば「ユーザー名「 " + text +  " 」を登録しました」
	     */
	    if(text.length() == 0 ||  text == null ) {
	    	System.out.println("「名前を入力してください」");
	    }
	    else if(alphaNumcheck == true) {
	    	System.out.println("「半角英数字のみで名前を入力してください」"); // 問２半角英数字のみ入力可能
	    }
	    else if(text.length() > 10) {
	    	System.out.println("「名前を10文字以内で入力してください」");
	    }
	    
	    else {
	    	System.out.println("「ユーザー名「 " + text +  " 」を登録しました」");
	    	
	    	 /*
	    	  *  問３
	    	  *  [概要] ユーザー名の入力が成功したらじゃんけんゲームを起動する
	    	  *  [詳細] ジャンケンは勝つまで繰り返し、勝つまでにかかった合計回数を表示する。
	    	  */
	    	
	    	int jankenNum = 0; // じゃんけんの回数カウント変数
	    	int jankenWin = 0; // じゃんけんの勝利用カウント変数
	    	while(jankenWin < 1) {
	    		jankenNum++;
	    		@SuppressWarnings("resource")
				Scanner jankenSca = new Scanner(System.in);
	    		int jankenText = jankenSca.nextInt(); // 入力された文字列
	    		/*
	    		 * じゃんけん条件分岐
	    		 * 入力された数字が0の場合グー、1の場合チョキ、2の場合パー
	    		 */
	    		
	    		if(jankenText == 0) {
	    			System.out.println(text + "の手はグー");
	    			}
	    		else if(jankenText == 1){
	    			System.out.println(text + "の手はチョキ");
	    			}
	    		else if(jankenText == 2) {
	    			System.out.println(text + "の手はパー");
	    			}
		    	/*
		    	 * コンピューター側のじゃんけん条件分岐
		    	 * ランダムに0～2の数字を入力
		    	 * 入力された数字が0の場合グー、1の場合チョキ、2の場合パー
		    	 */
		    	Random rand = new Random(); // ランダム変数
		    	int computerNum = rand.nextInt(3) + 0; // 0～2をランダムに入力
		    	if (computerNum == 0) {
					System.out.println("相手の手はグー");
				}
				else if (computerNum == 1) {
					System.out.println("相手の手はチョキ");
				}
				else if (computerNum == 2) {
					System.out.println("相手の手はパー");
				}
		    	// 勝ちの場合
		    	if ((jankenText == 0) && (computerNum == 1) || ((jankenText == 1) && (computerNum == 2) || ((jankenText == 2) && (computerNum == 0)))) {
					jankenWin ++;
					System.out.println("やるやん。");
					System.out.println("次は俺にリベンジさせて");
					System.out.println("勝つまでにかかった回数は" + jankenNum + "です");
					}
		    	// 自分がチョキ、相手がグーで負けの場合
		    	else if((jankenText == 1) && (computerNum == 0)) {
		    		System.out.println("俺の勝ち！");
		    		System.out.println("負けは次につながるチャンスです！");
		    		System.out.println("ネバーギブアップ！");
		    	}
		    	// 自分がパー、相手がチョキで負けの場合
		    	else if((jankenText == 2) && (computerNum == 1)) {
		    		System.out.println("俺の勝ち！");
		    		System.out.println("たかがじゃんけん、そう思ってないですか？");
		    		System.out.println("それやったら次も、俺が勝ちますよ");
		    	}
		    	// 自分がグー、相手がパーで負けの場合
		    	else if((jankenText == 0) && (computerNum == 2)) {
		    		System.out.println("俺の勝ち！");
		    		System.out.println("なんで負けたか、明日まで考えといてください。");
		    		System.out.println("そしたら何かが見えてくるはずです");
		    	}
		    	// あいこの場合
		    	else if((jankenText == 0) && (computerNum == 0) || (jankenText == 1) && (computerNum == 1) || (jankenText == 2) && (computerNum == 2)) {
		    		System.out.println("DRAW あいこ もう一回しましょう！");
		    	}
	    	}
	    }
	}
}