package package3multiinheritance;

public class ClassI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassE clase=new ClassE();
		ClassF clasf=new ClassF();
		ClassG clasg=new ClassG();
		ClassH clash=new ClassH();

		System.out.println(clase.bike);
		System.out.println(clasf.bike);
		System.out.println(clasg.bike);
		System.out.println(clasg.fuelCapacity);
		System.out.println(clash.bike);
		System.out.println(clash.fuelCapacity);
		System.out.println(clash.dieselBike);
	}
}