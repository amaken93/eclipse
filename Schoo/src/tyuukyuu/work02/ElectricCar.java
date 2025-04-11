package tyuukyuu.work02;

public class ElectricCar implements Car{

	public void charge() {
		// TODO 自動生成されたメソッド・スタブ
		System.out.print("電気自動車を充電します：");
	}

	@Override
	public void accele() {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println("90キロで走行します。");
	}

	@Override
	public void brake() {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println("電気自動車が停止します。");
	}
	
}
