package multiLevelInheritance;

public class MultiLevelInheritance {

	public static void main(String[] args) {
		
		Audi audi=new Audi();
		
		audi.accelerator(); //Vehicle Class
		audi.applyBreak(); //Vehicle Class
		audi.color(); //Vehicle Class
		audi.fourWheels(); //Car Class
		audi.speed(); //Vehicle Class
		audi.wheels(); //Vehicle Class
		audi.whiteColor();// Audi Class
	}
}