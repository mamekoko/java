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

public class Main {
    public static void main(String[] args) {
        count = 0;
        sum = 0;
        for(int i = 2; i <= 10; i += 2){
            count++;
            sum = i;
        }
        System.out.println("偶数の個数：" + count);
        System.out.println("偶数の合計値" + sum);
    }
}

public class Main {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            System.out.print(i);
            if (i < 10) {
                System.out.print(", ");
            }
        }
        System.out.println();
    }
}
