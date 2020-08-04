package poketmon.poket;

public class Picachu extends Overr {
	public int cnt;
	public Picachu(String name) {//초기화
		this.name = name;		//이름으로 초기화
		race = "Picachu"; 	//종족은 이상해씨 초기화
		age = 0;				//나이는 0으로 초기화
		power = 100;			//파워는 기본값 150
		energy = 300;			//에너지 기본값 200
		cnt = 0;				//cnt 0으로 초기화
		System.out.println("피카추가 만들어졌습니다");
	}
	public void eat() { //밥먹는 메서드
		energy += 10;	//에너지 10씩증가
		cnt++;			//cnt는 1증가 	
		aging();		//aging()메서드를 호출
	}
	public void sleep() {//잠자는 메서드
		energy += 15; 	//잠자면 에너지 15증가
		cnt++;			//cnt는 1증가
		aging();		//aging()메서드를 호출
	}
	public void exercise() {	//운동하기 메서드
		energy -= 20;	//에너지 소모 20감소
		power += 10;	//파워 10증가
	}
	public void aging() {	//나이먹는 메서드
		//cnt가 5증가할때마다 1살 증가
		if(cnt >= 5) {
			age++;
			cnt=0;
		}
	}
	public void attack() { //공격하는 메서드
		energy -= 15;	//에너지 15감소
		power += 20;	//파워 20증가
	}
}
