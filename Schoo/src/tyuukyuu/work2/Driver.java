package tyuukyuu.work2;

public class Driver {

	public void refuel(Refuel r) {
		r.refuel();
	}
	
	public void charge(ElectricCar ec) {
		ec.charge();
	}
	
	public void drive(Car c) {
		c.accele();
		c.brake();
	}

}
