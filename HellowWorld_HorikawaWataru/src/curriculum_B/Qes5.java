package curriculum_B;

public class Qes5 {
	
	public static void main(String[] args) {
		for(int n = 1; n <= 9; n++) {
			for(int i = 1; i <= 20; i++) {
				// 積が10未満
				if(i < 10 && i * n < 10) {
					System.out.print("0" + "0" + i + " * " + "0" + "0" + n + " = " + "0" + "0" + (i * n));
					System.out.print(" || ");
				}
				else if(i < 10 && i * n >= 10) {
					System.out.print("0" + "0" + i + " * " + "0" + "0" + n + " = " + "0" + (i * n));
					System.out.print(" || ");
				}
				else if(i <= 19 && i * n >= 10 && i * n < 100) {
					System.out.print("0" + i + " * " + "0" + "0" + n + " = " + "0" + (i * n));
					System.out.print(" || ");
				}
				// 積が10以上100未満
				else if(i <= 19 && i * n >= 10 && i * n < 100) {
					System.out.print("0" + i + " * " + "0" + "0" + n + " = " + "0" + (i * n));
					System.out.print(" || ");
				}
				else if(i == 20 && i * n >= 10 && i * n < 100) {
					System.out.println("0" + i + " * " + "0" + "0" + n + " = " + "0" + (i * n));
				}
				// 積が100以上
				else if(i <= 19 && i * n >= 100) {
					System.out.print("0" + i + " * " + "0" + "0" + n + " = " + (i * n));
					System.out.print(" || ");
				}
				else if(i == 20 && i * n >= 100) {
					System.out.println("0" + i + " * " + "0" + "0" + n + " = " + (i * n));
				}
			}
		}
	}
}
