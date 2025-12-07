// IS_A relationship
//Maintwo is a ModifierClassV1
//ModifierClassV1 is super Class(parent)
//Maintwo is sub class(child )
//Maintwo can access state and behavior
class Maintwo extends ModifierClassV1{
	public static void main(String[] args){
		var obj = new Maintwo();
		obj.protectedMethod();

	}
}
