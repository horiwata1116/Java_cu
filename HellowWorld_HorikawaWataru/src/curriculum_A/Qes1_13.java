package curriculum_A;

public class Qes1_13 {
	
	public static void main(String[] args) {
		
		// 問１ ローカル変数の宣言をする
		// 問２ 変数の初期値を代入し初期化する
		
		// バイト型
		byte b = 0;
		
		// 短整数型
		short sh = 0;
		
		// 整数型
		int i = 0;
		
		// 長整数型
		long l = 0;
		
		// 単精度浮動小数点数型
		float f = 0.0f;
		
		// 倍精度浮動小数点数型
		double d = 0.0;
		
		// 文字型
		char c = '\u0000';
		
		// 文字列型
		String str = null;
		
		// ブーリアン型
		boolean boo = false;
		
		// 問３ 初期化をしたそれぞれの変数に値を代入する
		// バイト型 「10」を代入
		b = 10;
		
		// 短整数型 「100」を代入
		sh = 100;
				
		// 整数型 「1000」を代入
		i = 1000;
				
		// 長整数型 「10000」を代入
		l = 10000;
				
		// 単精度浮動小数点数型 「9.5」を代入
		f = 9.5f;
				
		// 倍精度浮動小数点数型 「10.5」を代入
		d = 10.5;
				
		// 文字型 「a」を代入
		c = 'a';
				
		// 文字列型 「ハロー」を代入
		str = "ハロー";
				
		// ブーリアン型 「true」を代入
		boo = true;
		
		/*
		 * 問４ 下記の通りにコンソール出力されるようにしてください
		 * 11110 11110
		 * 20 20
		 * a ハロー true a ハロー true
		 * 11130 11130 
		 * 10000000000 10000000000
		 * 0.105 0.105
		 * -90 -90
		 */
		
		// 11110 11110
		System.out.print(b + sh + i + l + " ");
		System.out.println(b + sh + i + l);
		
		// 20 20
		System.out.print(b * 2 + " ");
		System.out.println(b * 2);
		
		// a ハロー true a ハロー true
		System.out.print(c + " " + str + " " + boo + " ");
		System.out.println(c + " " + str + " " + boo);
		
		// 11130 11130
		System.out.print((int)(b + sh + i + l + f + d) + " ");
		System.out.println((int)(b + sh + i + l + f + d));
		
		// 10000000000 10000000000
		System.out.print((b * sh * i * l) + " ");
		System.out.println(b * sh * i * l);
		
		// 0.105 0.105
		System.out.print(d / sh + " ");
		System.out.println(d / sh);
		
		// -90 -90
		System.out.print(b - sh + " ");
		System.out.println(b - sh);
		
		/*
		 * 問５ 下記プログラムを実行すると「ハローJAVA2023」という結果が表示されるように修正する
		 * 修正前
		 * String num="20";
		 * int num1=23;
		 * System.out.println("ハローJAVA"+(num+num1));
		 */
		
		// 修正後 System.outprintln("ハローJAVA" + (num+num1)) の (num + num1) の () を削除
		String num="20";
		int num1=23;
		System.out.println("ハローJAVA"+ num + num1);
		
		/*
		 * 問６ 『』で囲われた人の情報を変数にして、formatの通りコンソールに出力してください
		 * 『山田太郎 18歳 170.5cm 62.2kg 寿司』
		 * 
		 * ↓↓format↓↓
		 * 「初めまして○○です」
		 * 「年齢は○○歳です」
		 * 「身長は○○cmです」
		 * 「体重は○○kgです」
		 * 「好きな食べ物は○○です」
		 */
		
		// 変数の宣言
		String name = "山田太郎";
		int age = 18;
		double height = 170.5;
		double weight = 62.2;
		String like = "寿司";
		
		// コンソールに出力する
		System.out.println("「初めまして" + name + "です」");
		System.out.println("「年齢は" + age + "歳です」");
		System.out.println("「身長は" + height + "cmです」");
		System.out.println("「体重は" + weight + "kgです」");
		System.out.println("「好きな食べ物は" + like + "です」");
		
		/*
		 * 問７ 問６で作成した変数を使ってBMIも出力する
		 * 「BMIは○○です」
		 * BMI = 体重kg / (身長m * 身長m) 小数点第二位を四捨五入
		 */
		
		System.out.println("BMIは" + (double)Math.round(weight / ((height / sh) * (height / sh)) * b) / b + "です」");
		
		/*
		 * 問８ 問６で宣言した変数に再代入し下記の通りコンソールに出力してください"
		 * 「初めまして鈴木一郎です」
		 * 「年齢は24歳です」
		 * 「身長168.5cmです」
		 * 「体重は64.2kgです」
		 * 「好きな食べ物はオムライスです」
		 * 「BMIは22.6です」
		 */
		
		// 変数に再代入する
		name = "鈴木一郎";
		age = 24;
		height = 168.5;
		weight = 64.2;
		like = "オムライス";
		
		// コンソールに出力
		System.out.println("「初めまして" + name + "です」");
		System.out.println("「年齢は" + age + "歳です」");
		System.out.println("「身長は" + height + "cmです」");
		System.out.println("「体重は" + weight + "kgです」");
		System.out.println("「好きな食べ物は" + like + "です」");
		System.out.println("BMIは" + (double)Math.round(weight / ((height / sh) * (height / sh)) * b) / b + "です」");
		
		/*
		 * 問９ 8で使用した変数【年齢・身長・体重】の数値を和算で自己代入し、下記の通りコンソールに出力してください
		 * 「初めまして鈴木一郎です」
		 * 「年齢は48歳です」
		 * 「身長337.0cmです」
		 * 「体重は128.4kgです」
		 * 「好きな食べ物はオムライスです」
		 * 「BMIは11.31です」
		 */
		
		// 変数に自己代入する
		age += age;
		height += height;
		weight += weight;
		
		// コンソールに出力
		System.out.println("「初めまして" + name + "です」");
		System.out.println("「年齢は" + age + "歳です」");
		System.out.println("「身長は" + height + "cmです」");
		System.out.println("「体重は" + weight + "kgです」");
		System.out.println("「好きな食べ物は" + like + "です」");
		System.out.println("BMIは" + (double)Math.round(weight / ((height / sh) * (height / sh)) * b) / b + "です」");
		
		// 問１０ 問８で使用した年齢が25歳以上ならtrueが出力されるようにしてください。ただしif文は使いません
		
		// 問８の状態と同じになるように変数に再代入
		age = 24;
		height = 168.5;
		weight = 64.2; 
		
		boolean ageCheck = age >= 25;
		System.out.println(ageCheck);
		
		// 問１１ 問８で使用した【年齢・身長・体重】を文字列型に型変換し繋げて出力してください
		
		// 文字列型に変換する
		String ageStr = String.valueOf(age);
		String heightStr = String.valueOf(height);
		String weightStr = String.valueOf(weight);
		
		// コンソールに出力
		System.out.println(ageStr + heightStr + weightStr);
		
		// 問１２ 問１１で変換した【年齢・身長】を整数型に変換して出力してください
		
		// 文字列型を整数型に変換する
		int ageStrInt = Integer.parseInt(ageStr);
		double heightStrDb = Double.parseDouble(heightStr);
		int heightStrDbInt = (int)heightStrDb;
		
		// コンソールに出力
		System.out.println(ageStrInt);
		System.out.println(heightStrDbInt);
		
		
		// 問１３ 12で変換した【年齢・身長】で【年齢が25もしくは身長が160以上】であればtrueを出力してください
		// if文使用不可
		boolean ageHeightcheck = ageStrInt >= 25 || heightStrDbInt >= 160;
		System.out.println(ageHeightcheck);
	}
}
