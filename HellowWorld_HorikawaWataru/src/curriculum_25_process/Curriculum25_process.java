package curriculum_25_process;

import java.util.Random;
import java.util.Scanner;

import curriculum_25_main.Letsgo;

/*

名前を入力したら下記がコンソールに出力されるように作ってください
	条件：数値は毎回変わるように作ってください
	 	 サブクラスを使用してください
		 スーパークラスを使用してください
		 getterとsetterを使用してください
		 packageを2つ作ってメインと処理を分けてください
		 命名する場合は規則にのっとってください
		 コンストラクタを使用してください

	こんにちは 「 名前 」 さん
	ステータス
	HP：849
	MP：862
	攻撃力：375
	素早さ：937
	防御力：24

	さあ冒険に出かけよう！

*/

public class Curriculum25_process {
	
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		// ランダム変数 - 0から999までの数字をランダムに出力
		Random rand = new Random();
    	int statusHp = rand.nextInt(1000) + 0;
    	int statusMp = rand.nextInt(1000) + 0;
    	int statusAtk = rand.nextInt(1000) + 0;
    	int statusAg = rand.nextInt(1000) + 0;
    	int statusDf = rand.nextInt(1000) + 0;
    	
		Scanner scanner = new Scanner(System.in); // 名前入力用
		String name = scanner.nextLine(); // 入力された文字列
		
		// インスタンスを生成
		Letsgo letsgo = new Letsgo(name, statusHp, statusMp, statusAtk, statusAg, statusDf);
		
		// ステータス表示
		letsgo.printlnStatus();
		
		// さあ冒険に出かけよう！
		letsgo.goToAdventure();
    }
}
