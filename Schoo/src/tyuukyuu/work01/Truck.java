package tyuukyuu.work01;

public class Truck implements Car, Refuel {

	@Override
	public void refuel() {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println("トラックに燃料を補充します：50L");
	}

	@Override
	public void accele() {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println("トラックが50キロで走行します。");
	}

	@Override
	public void brake() {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println("トラックが停止します。");
	}

}
