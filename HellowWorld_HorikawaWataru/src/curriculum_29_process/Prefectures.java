package curriculum_29_process;

public class Prefectures {
	
	// カプセル化した変数
	private String name;
	private String capital;
	private double area;
	
	// コンストラクタ
	public Prefectures(String name, String capital, double area) {
        this.name = name;
        this.capital = capital;
        this.area = area;
    }
	
	// ゲッターの定義
	public String getName() {
		return name;
	}
	
	public String getCapital() {
		return capital;
	}
	
	public double getArea() {
		return area;
	}
}
