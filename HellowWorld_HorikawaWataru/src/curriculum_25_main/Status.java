package curriculum_25_main;

// スーパークラス
public class Status {
	
	// カプセル化
    private String name; // 名前
    private int hp; // HP
    private int mp; // MP
    private int attack; // 攻撃力
    private int agility; // 素早さ
    private int defense; // 防御力

    // コンストラクタの作成
    public Status(String name, int hp, int mp, int attack, int agility, int defense) {
        this.name = name;
        this.hp = hp;
        this.mp = mp;
        this.attack = attack;
        this.agility = agility;
        this.defense = defense;
    }

    // 各ゲッターとセッター
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getMp() {
        return mp;
    }

    public void setMp(int mp) {
        this.mp = mp;
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public int getAgility() {
        return agility;
    }

    public void setAgility(int agility) {
        this.agility = agility;
    }

    public int getDefense() {
        return defense;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }

    
    // ステータスを表示するメソッド
    public void printlnStatus() {
        System.out.println("こんにちは " + name + " さん");
        System.out.println("ステータス");
        System.out.println("HP：" + hp);
        System.out.println("MP：" + mp);
        System.out.println("攻撃力：" + attack);
        System.out.println("素早さ：" + agility);
        System.out.println("防御力：" + defense);
        System.out.println(" "); // 1行開ける
    }
}
