package vehicle;

import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    Bicycle bicycle =  new Bicycle("ビアンキ", "緑");
    
    System.out.println("【自転車の情報】");
    bicycle.printData();
    System.out.println("-----------------");
    System.out.println("走る距離を入力してください：");
    int i1 = scanner.nextInt();
    bicycle.run(i1);
    
    System.out.println("=================");
    Car car = new Car("フェラーリ", "赤");
    
    System.out.println("【車の情報】");
    car.printData();
    System.out.println("-----------------");
    System.out.println("走る距離を入力してください：");
    int i2 = scanner.nextInt();
    car.run(i2);
    
    System.out.println("-----------------");
    System.out.println("給油する量を入力してください：");
    int i3 = scanner.nextInt();
    car.charge(i3);
  }
}