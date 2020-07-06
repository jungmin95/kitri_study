package genericInherent;

public class Product<T, M> {

}
class ChildProduct<T, M, N> extends Product<T, M>{
	ChildProduct(T t, M m, N n) {
		super();
	}
}