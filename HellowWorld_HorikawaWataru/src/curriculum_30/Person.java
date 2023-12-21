package curriculum_30;

public class Person {
	
	// 問題1：インスタンスフィールドを定義してください
	private String name;
	private int age;
	private double height;
	
	// 問題4：インスタンスフィールド「weight」を定義し、コンストラクタの中で値をセットしてください（double型）
	private double weight;
	private static int totalCount = 0; // 人数のカウント用
	
	// 問題2：コンストラクタを定義してください（下記それぞれの引数）
	// name, age, height
	// 問題3：コンストラクタの中で各インスタンスフィールドに値をセットしてください
	
	public Person(String name, int age, double height, double weight){
		this.setName(name);
		this.setAge(age);
		this.setHeight(height);
		this.setWeight(weight); // weightの追加
		totalCount++; // 新しいPersonオブジェクトが作成されるたびに合計を増やす
	}
	
	
	// 問題6：インスタンスメソッド「bmi」を定義してください（戻り値：double）
	// 問題7：bmiメソッドでインスタンスのBMIを返すようにしてください
	public double bmi() {
		// BMI ＝ 体重kg ÷ (身長m * 身長m)
		// 少数第二位を四捨五入
		return (double)Math.round(this.weight / (this.height * this.height) * 10)/10;
	}
	
	// 問題8：インスタンスメソッド「print」を定義してください（戻り値：void）
	// 問題9：printメソッドの中でthisを用いて「名前は〇〇です」,「年は〇〇です」「BMIは○○です」と出力してください
	public void print() {
		System.out.println("名前は" + this.name +"です");
		System.out.println("年は" + this.age +"です");
		System.out.println("BMIは" + this.bmi() +"です");
	}
	
	// 問題10：人数の合計を「合計○人です」と出力してください。
	public static int getTotalCount() {
        return totalCount;
    }
	
	
	
	
	// ゲッター、セッターの定義
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}
	
	public double getWeight() {
		return weight;
	}
	
	public void setWeight(double weight) {
		this.weight = weight;
	}
	
}
