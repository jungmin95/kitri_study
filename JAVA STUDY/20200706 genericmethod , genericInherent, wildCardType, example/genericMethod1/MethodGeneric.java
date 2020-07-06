package genericMethod1;

public class MethodGeneric {
	public <T, M> M method(T t) {
		M m;
		m = (M)t;
		
		
		return m;
	}
}
