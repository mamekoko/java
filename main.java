class main { //クラス部分
  public static void main (String[] args) {
    System.out.println("hello Java");
    //数値はダブルクオーテーションは不要。計算も可能。" "で囲むとそのまま出力される。
    System.out.println(3);
    System.out.println(5+5);
    //文字列を足し算できる。連結できる。
    System.out.println("5"+"6");
    System.out.println("Let's"+"Party");
  }
}

public class Main {
    public static void main(String[] args) {
        // forループを使って、iを10から2ずつ減少させながら繰り返す
        for (int i = 10; i >= 2; i -= 2) {
            // iの値を表示する
            System.out.println(i);
        }
    }
}