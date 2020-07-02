package problem;

public interface IStack {
	
	//현재 데이터 갯수
	public abstract int length();
	//추출
	public abstract Object pop();
	//삽입
	public abstract boolean push(Object ob);
	
	//읽기
	public abstract Object peek();
	//데이터 갯수 유무
	public abstract boolean isEmpty();

}
