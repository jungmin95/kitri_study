package computer;

public class Computer extends Calculator {
	
	
	double areaCircle (double r) {
		
		if ( r > 10) {
			return 3.14 * r * r; 
		} else {
			return super.areaCircle(r);
		}
	}
	
	@Override
	int plus(double xx, int yy) {
		return (int) (xx + yy);
	}
}
