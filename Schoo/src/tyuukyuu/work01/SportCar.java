package tyuukyuu.work01;

public class SportCar implements Car, Refuel {

	@Override
	public void refuel() {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println("スポーツカーに燃料を補充します：50L");
	}

	@Override
	public void accele() {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println("スポーツカーが70キロで走行します。");
	}

	@Override
	public void brake() {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println("スポーツカーが停止します。");
	}

}
