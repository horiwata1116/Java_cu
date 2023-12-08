package curriculum_27;

public class Animalprint {
	// フィールド
	
	// 変数を宣言
	private String animalName; // 動物名
	private double height; // 体長
	private int speed; // 速度
	private String scientificName; // 学名
	
	// コンストラクタ作成
	public Animalprint(String animalName, double height, int speed, String scientificName) {
        this.animalName = animalName;
        this.height = height;
        this.speed = speed;
        this.scientificName = scientificName;
    }
	
	// メソッド - コンソールに動物名、体長、速度、学名を表示する -
	public void printInfo() {
		System.out.println("動物名：" + animalName);
		System.out.println("体長：" + height + "m");
		System.out.println("速度：" + speed + "km/h");
		System.out.println("学名：" + scientificName);
		System.out.println(""); // 一行開ける
	}
}
