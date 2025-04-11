package tyuukyuu.work01;

public class Drive {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Driver dr = new Driver();
		Truck tr = new Truck();
		SportCar sc = new SportCar();
		ElectricCar ec = new ElectricCar();
		
		System.out.println("運転手が車を運転します。");
		dr.refuel(tr);
		dr.drive(tr);
		System.out.println("運転が終了しました。\n");
		
		System.out.println("運転手が車を運転します。");
		dr.refuel(sc);
		dr.drive(sc);
		System.out.println("運転が終了しました。\n");
		
		System.out.println("運転手が車を運転します。");
		dr.charge(ec);
		dr.drive(ec);
		System.out.println("運転が終了しました。");
	}

}
