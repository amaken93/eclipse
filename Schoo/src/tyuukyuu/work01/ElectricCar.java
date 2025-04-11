package tyuukyuu.work2;

public class ElectricCar implements Car{

	public void charge() {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println("電気自動車を充電します：80%");
	}

	@Override
	public void accele() {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println("電気自動車が90キロで走行します。");
	}

	@Override
	public void brake() {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println("電気自動車が停止します。");
	}
	
}
