package tyuukyuu.work3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Drive {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Driver dr = new Driver();
		Scanner scan = new Scanner(System.in);
		int fuel;
		try {
			while (true) {
				System.out.println("=== 車両管理システム ===");
				System.out.println("1. トラックを作成");
				System.out.println("2. スポーツカーを作成");
				System.out.println("3. 電気自動車を作成");
				System.out.println("4. システム終了");

				System.out.print("選択してください:");

				int num = scan.nextInt();

				if (num == 4) {
					break;
				}

				if (num < 1 || num > 4) {
					System.out.println("選択肢から選んでください。");
					continue;
				}

				System.out.print("車の名前を入力してください:");
				String name = scan.next();

				switch (num) {
				case 1:
					Truck tr = new Truck();
					System.out.println("運転開始:" + name);
					System.out.print("燃料を何リットル補充しますか？:");
					fuel = scan.nextInt();
					dr.refuel(tr);
					System.out.println(fuel + "L");
					dr.drive(tr);
					System.out.println("運転が終了しました。\n");
					break;

				case 2:
					SportCar sc = new SportCar();
					System.out.println("運転開始:" + name);
					System.out.print("燃料を何リットル補充しますか？:");
					fuel = scan.nextInt();
					dr.refuel(sc);
					System.out.println(fuel + "L");
					dr.drive(sc);
					System.out.println("運転が終了しました。\n");
					break;

				case 3:
					ElectricCar ec = new ElectricCar();
					System.out.println("運転開始:" + name);
					System.out.print("充電を何％行いますか？:");
					int charge = scan.nextInt();
					dr.charge(ec);
					System.out.println(charge + "%");
					dr.drive(ec);
					System.out.println("運転が終了しました。\n");
					break;

				default:
					System.out.println("エラー。もう一度選んでください");
				}
			}
		} catch (InputMismatchException e) {
			// TODO: handle exception
			System.out.println("エラー：整数以外の入力");
		} finally {
			scan.close();
		}

	}

}
