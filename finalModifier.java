class finalModifier{
	public static void main(String[] args){
		var ch = new Child();
		//can't assign new value ,cuz of final modifier
		//ch.value = "Current value from child";
		System.out.println(ch.value);
		ch.greet();



	} 

}

class OtherClass{
	final int i=10;
}

class Parent {
	//String value = "Final Value from parent";
	//if u use final variable ,will not assign new value
	final String value = "Final Value from parent";
	void greet(){
		System.out.println("Hello!!!");
	}
}
class Child extends Parent{
	// can't change method by using @Override
	// child can change parent's values
	@Override
	void greet(){
		System.out.println("heys!!");
	}

}
// parent class ka method ko final use yin child mr inheri maya
// parent clss ko  final use yin chid class lote maya