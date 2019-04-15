package override;

import java.io.IOException;

public class Dog extends Animal {
	
	private String name;
	public Dog(String name) {
		this.name = name;
	}
	
	@Override
	public String crySound() {
		// TODO Auto-generated method stub
		return name + " : bow wow";
	}

	// throws 하는 method를 override 할 때는, throws절 생략 가능
	// throws를 쓸 때는, 상속관계가 더 낮거나 같은 exception만 올 수 있다
	@Override
	public String crySound(int value) throws IOException{
		// TODO Auto-generated method stub
		return name + " : bow wow" + " * " + value;
	}
	

}
