package src;

public class IteratorTest {
    public static void main(String[] args) {
    GameListAggregate gameListAggregate = new GameListAggregate();
    gameListAggregate.add(new Game("みんなでゴルフ", 3700));
    gameListAggregate.add(new Game("ファイナルファンタジア", 7300));
    gameListAggregate.add(new Game("ロケットモンスター", 5400));
    gameListAggregate.add(new Game("サイコロの達人", 5200));
    Iterator iterator = gameListAggregate.createIterator();
    iterator.first(); // 探す場所を先頭位置にしてもらう
    while ( ! iterator.isDone() ) { // まだある？ まだあるよ！
    Game game = (Game)iterator.getItem(); // はいどうぞ (と受取る)
    System.out.println(game.getName()); // 名称を取得して表示
    iterator.next(); // 探す位置を次を移動
    }
    }
}