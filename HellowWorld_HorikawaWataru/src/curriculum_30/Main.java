package curriculum_30;

public class Main {
	
	public static void main(String[] args) {
		
		// 問題5：Main.javaの引数にweightの60を入れてください
		Person person1 = new Person("鈴木太郎", 20, 1.7, 60);
		
		System.out.println(person1.getName());
		System.out.println(person1.getAge());
		System.out.println(person1.getHeight());
		
		System.out.println("");
		
		// 問題9の出力
		person1.print();
		
		System.out.println("");
		
		// 問題10の出力
		// // Personオブジェクトの総数を出力
		System.out.println("合計" + Person.getTotalCount() + "人です");
	}

}
