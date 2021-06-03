package src;
class Game {
    private String name; // 名称
    private int price; // 価格
    public Game(String name, int price) { // コンストラクタ
    this.name= name;
    this.price = price;
    }
    public String getName() { return name; } // 名称を取得
    public int getPrice() { return price; } // 価格を取得
}