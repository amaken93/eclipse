package tyuukyuu.work02;

public class SportCar implements Car, Refuel {

	@Override
	public void refuel() {
		// TODO 自動生成されたメソッド・スタブ
		System.out.print("スポーツカーに燃料を補充します：");
	}

	@Override
	public void accele() {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println("70キロで走行します。");
	}

	@Override
	public void brake() {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println("スポーツカーが停止します。");
	}

}
