package test02_polymorphism;

public class GalaxyPhone implements AlarmSound{
	
	@Override
	public void playAlarm() {
		// TODO Auto-generated method stub
		System.out.println("Ding ding ding!");
	}
}
