package src;

interface Iterator {
    public void first(); // 取り出し位置を最初の要素へ変える
    public void next(); // 取り出し位置を次の要素へ変える
    public boolean isDone(); // 取り出し位置が最後を超えたか？
    public Object getItem(); // 現在の取り出し位置から取り出す
    }

class GameListIterator implements Iterator {
    private GameListAggregate aggregate;
    private int current;
    public GameListIterator(GameListAggregate a){ this.aggregate = a; }
    public void first() { current = 0; }
    public void next() { current += 1; }
    public boolean isDone() {
    if (current >= aggregate.getNumberOfStock()) { return true; }
    else { return false; }
    }
    public Object getItem() { return aggregate.getAt(current); }
}