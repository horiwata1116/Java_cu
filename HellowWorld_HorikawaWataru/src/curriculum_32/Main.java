package curriculum_32;

import curriculum_33.Bicycle;
import curriculum_33.Car;

public class Main {
	
	public static void main(String[] args) {
		
		Person person1 = new Person("鈴木", "太郎", 20, 1.7, 60);
		//person1.print();
		
		Person person2 = new Person("山田", "花子", 22, 1.5, 40);
		//person2.print();
		
		//Person.printCount();
		
		// MainクラスにsetOwnerを用いて、Carクラスのインスタンス「car」の所有者を「person1」に、
		// Bicycleクラスのインスタンス「bicycle」の所有者を「person2」に設定します。Personクラスのインスタンスからフルネームを取得し、
		// ownerにセットしてください。
		
		// インスタンス化
		Car car = new Car();
		Bicycle bicycle = new Bicycle(); 
		
		car.setOwner(person1.fullName());
		bicycle.setOwner(person2.fullName());
		
		// 問題5：ownerをコンソールに出力してください。
		System.out.println(car.getOwner());
		System.out.println(bicycle.getOwner());
		
		// 問題10：Mainクラスからbuyメソッドを用いて、「person1」がcarを購入、「person2」がbicycleを購入するプログラムを作成しましょう。
		person1.buy(car);
		person2.buy(bicycle);
	}

}
