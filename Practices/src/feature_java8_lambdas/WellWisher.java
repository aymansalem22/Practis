package feature_java8_lambdas;

public class WellWisher {
	public static void wish(Greeting greeting) {
		greeting.greet();
	}

	public static void main(String[] args) {
		wish(() -> System.out.println("Namstre"));

	}

}

/*
 * #process of cycle!!
 * 
 * step1:Greeting hindiGreeting=new HindiGreeting(); wish(hindiGreeting);
 * 
 * Greeting englishGreeting=new EnglishGreeting(); wish(englishGreeting);
 * 
 * step 2: passing an anonymous class object to the wish method wish(new
 * Greeting(){
 * 
 * @Override public void greet() { System.out.println("Namaste");
 * 
 * } });
 * 
 * step 3:without object and anonymous class
 * 
 * wish( public void greet() { System.out.println("Namaste"); } );
 * 
 * 
 * step 4: without name of method
 * 
 * wish(
 * 
 * public void () { System.out.println("Namaste"); } );
 * 
 * step 5: remove the public declaration and return type step6: -> lambda
 * expression
 * 
 * wish(() -> { System.out.println("Namaste"); });
 * 
 * step 7: method body contains only a single line, the curly braces are also
 * unnecessary
 */
