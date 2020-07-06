package genericMethod1;

public class DoubleGeneric<T, M> {
	private T dataT;
	private M dataM;
	
	DoubleGeneric(T t, M m) {
		this.dataT = t;
		this.dataM = m;
	}
	
	void setT(T t) {
		this.dataT = t;
	}
	
	
}

interface Genericable<T, M> {
	void printT_M();
}
