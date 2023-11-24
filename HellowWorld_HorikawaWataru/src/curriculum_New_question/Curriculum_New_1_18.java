package curriculum_New_question;

import java.util.Random;

public class Curriculum_New_1_18 {
	// Q1：引数に文字列型と整数型をいれてコンソールに「Hello JavaSE 11」と出力するメソッドを作成してください。
		public static void  helloJava(String hello, String java, int num){
			System.out.println(hello + " " + java + " " + num);
		}

		// Q2：引数に整数を渡すと渡した値同士を乗算しコンソールに出力するメソッドを作成してください
		public static void keisan(int num1, int num2) {
			System.out.println(num1 * num2);
		}
		
		// Q3：引数として整数の配列を渡すと、受け取った値を順番にコンソールに出力するメソッドを作成してください
		public static void ary(int num[]) {
			for(int numAry: num) {
				System.out.println(numAry);
			}
		}
				
		// Q4：Q2をオーバーロードして引数を小数2つに変更し、引数同士を和算しコンソールに出力してください。
		public static void keisan(double d1, double d2){
			System.out.println(d1 + d2);
		}
			
		// Q5：引数に整数を渡すと、1～100までのランダムな数字を引数の回数分格納して
		// 格納した値を順番にコンソールで出力後、格納した値を返すメソッドを作成してください。
		// ※0は出力＆格納しないようにしてください。
		public static int[] randam100(int num3) {
			int randNumAry[] = new int[num3]; // ランダムな数字を格納する配列
			Random rand = new Random(); // ランダム変数
	    	for(int n = 0; n < num3; n++) {
	    		randNumAry[n] = rand.nextInt(100) + 1; // 1～100をランダムに出力し配列に格納
	    		System.out.println(randNumAry[n]); // コンソールに出力
	    	}
			return randNumAry; // ランダムな数字が num3 個格納された配列を戻す
		}

		// Q6：引数にQ5で作成したメソッドの返り値を受け取り、受け取った配列の要素の平均値をコンソールに出力するメソッドを作成してください。
		// ※小数点以下も表示されるようにしてください。
		public static double aveQ5(int n[]) {
			double total = 0; // 配列に格納された値を合計するための変数
			for(int a = 0; a < n.length; a++) {
				total += n[a]; // 配列の a 番目を自己代入
			}
			System.out.println(total / n.length); // 平均値をコンソールに出力
			return total / n.length; // 平均値を戻す
		}
		
		// Q7：引数にQ6で作成したメソッドの返り値を受け取り、受け取った値が50以上ならばtrueそれ以外はfalseを返しコンソールに出力してください
		public static void fifty(double n){
			boolean fiftyCheck = n >= 50; // boolean型で50以上であればtrueを返すように定義
			System.out.println(fiftyCheck);
		}

		public static void main(String[] args) {
	    // 作成したメソッドをここで呼び出してください
			// Q1
			helloJava("Hello", "Java", 11);
			
			// Q2
			keisan(2,3);
			
			// Q3
			int q3[] = {1, 2 , 3, 4, 5};
			ary(q3);
			
			// Q4
			keisan(0.25, 0.4);
			
			// Q5.Q6.Q7
			int num = 2;
			int[] randamNumbers = randam100(num);
			fifty(aveQ5(randamNumbers));
			
		}
}
