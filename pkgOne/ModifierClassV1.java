//package pkgOne;  //for public
public class ModifierClassV1{
	public int publicVariable = 10;
	int defaultVariable = 20;
	protected int protectedVariable = 30;
	private int privateVariable = 40;

	public void publicMethod(){
		System.out.println("Public Variable ::" +publicVariable);
		System.out.println("Public Method");
	}
	void defaultMethod(){
		System.out.println("Default Variable :: " + defaultVariable);
		System.out.println("Default Method");
	}
	protected void protectedMethod(){
		System.out.println("Protected Variable ::" + protectedVariable);
		System.out.println("protected Method");
	}
	private void privateMethod(){
		System.out.println("Private Variable :: " + privateVariable);
		System.out.println("private Method");
	}
}
