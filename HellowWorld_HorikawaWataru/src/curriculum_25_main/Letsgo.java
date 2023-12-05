package curriculum_25_main;

// サブクラス
public class Letsgo extends Status {
	
    // コンストラクタの作成
    public Letsgo(String name, int hp, int mp, int attack, int agility, int defense) {
        super(name, hp, mp, attack, agility, defense);
    }

    // 「さあ冒険に出かけよう！」を表示するメソッド
    public void goToAdventure() {
        System.out.println("さあ冒険に出かけよう！");
    }
}