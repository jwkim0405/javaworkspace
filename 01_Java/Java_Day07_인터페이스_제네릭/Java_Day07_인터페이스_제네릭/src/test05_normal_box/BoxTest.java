package test05_normal_box;

class Box {
	private Object obj;
	
	public Object getObj() {
		return obj;
	}
	
	public void setObj(Object obj) {
		this.obj = obj;
	}
}

public class BoxTest {
	public static void main(String[] args) {
		Box box = new Box();
		
		box.setObj(11);
		box.setObj("Hello");
		box.setObj(41.22);
		
		Object obj = box.getObj();  // 꺼낼 때는 Object로 꺼낼 수 밖에...
		
		if (obj instanceof Double) {
			System.out.println("실수형의 값입니다: " + box.getObj());
			Double d = (Double) box.getObj();
			// ??????????????????? Double, double -> 갑분 대문자 D로?
		}
	}
}
