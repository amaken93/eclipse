package tyuukyuu.work3;

public class Truck implements Car, Refuel {

	@Override
	public void refuel() {
		// TODO 自動生成されたメソッド・スタブ
		System.out.print("トラックに燃料を補充します：");
	}

	@Override
	public void accele() {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println("50キロで走行します。");
	}

	@Override
	public void brake() {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println("トラックが停止します。");
	}

}
