package curriculum_B;

public class Qes4 {
	/*
	 * [概要] for文を使って九九の級の段まで出力する。
	 * [詳細] 数式の間は「 || 」で区切り、数字は2桁表示にする。
	 */
	public static void main(String[] args) {
		
		/* 
		 * 以下for文の内容
		 * 1つ目の項を「 n 」(for文1)、2つ目の項を「 i 」(for文2)とする。
		 * 「 n 」は「for文2」が9回繰り返されると +1 される
		 */
		
		// for文1↓
		for(int n = 1; n <= 9; n++) {
			
			// for文2↓
			for(int i = 1; i <= 9; i++){
				// 積が10未満の場合
				if(i <= 8 && n * i < 10) {
					System.out.print("0" + n + " * " + "0" + i + " = " + "0" + (n * i));
					System.out.print(" || ");
				}
				else if(i <= 9 && n * i < 10) {
					System.out.println("0" + n + " * " + "0" + i + " = " + "0" + (n * i));
				}
				
				// 積が10以上の場合
				else if(i <= 8 && n * i >= 10) {
					System.out.print("0" + n + " * " + "0" + i + " = "  + (n * i));
					System.out.print(" || ");
				}
				else if(i <= 9 && n * i >= 10) {
					System.out.println("0" + n + " * " + "0" + i + " = "  + (n * i));
				}
				
			}
		}
	}
}
