package curriculum_23;

public class Theme2 {
	// 下記がコンソールに出力されるように作成してください
 	// ※thisとsetterとgetterとフィールドを使ってください
 	
  	// 動物名：ライオン
	// 体長：2.1m
	// 速度：80km/h
	
	// カプセル化
	private String animal = "ライオン";
	private double height = 2.1;
	private int speed = 0;
	
	public Theme2(String animal, double height, int speed){
		this.animal = animal;
		this.height = height;
		this.setSpeed(speed);
	}
	
	// 動物名のゲッター
	public String getAnimal(){
		return this.animal;
	}
	
	// 動物名のセッター
	public String setAnimal(String animal){
		return this.animal = animal;
	}
	
	// 体長のゲッター
	public double getHeight() {
		return this.height;
	}
	
	// 体長のセッター
	public double setHeight(double height){
		return this.height = height;
	}
	
	// 速度のゲッター
	public int getSpeed() {
		return speed;
	}
	
	// 速度のセッター
	public int setSpeed(int speed){
		return this.speed = speed;
	}
	
	// コンソールに出力
	public static void main(String[] args){
		Theme2 theme2 = new Theme2("ライオン", 2.1, 0);
		System.out.println("動物名：" + theme2.getAnimal());
		System.out.println("体長：" + theme2.getHeight() + "m");
		System.out.println("速度：" + theme2.setSpeed(80) + "km/h");
	}

}
