package Unit_01;
/*
 * operators in java is a symbol that is used to perform operations 
 * sum=a+b;
 * 	for example: +,-,*,/
 * 	#types of operators in java
 * 		-Unary operators : {prefix and postfix}[a++,a--,++a,etc]
 * 		-Arithmatic operators: {*,-,/,+,%}
 * 		-Shift operators: {<< , >>}
 * 		-relational operators: {> < <= >= !=}
 * 		-Bitwise operators : {& ^ |}
 * 		-Logical operators : {&& ||}
 * 		-ternary operators: {? : }
 * 		-Assignment operators: {=,+=,-=,/=,%=,&/,>>=,>>=}
 */

public class P3_Task02_OperatorsInJava {

	public static void main(String[] args) {
		operator obj = new operator();
		obj.unaryoperators();
		obj.arithmaticoperators();
		obj.shiftoperators();
		obj.relationaloperators();
		obj.bitwiseandlogicaloperators();
		obj.ternaryoperator();
		obj.assignmentoperator();

	}

}
class operator
{
	void unaryoperators() {
		int a=10;
		System.out.println(a++);
		System.out.println(++a);
		System.out.println(a--);
		System.out.println(--a);
		
		
	}
	void arithmaticoperators()
	{
		int a=10,b=5;
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a*b);
		System.out.println(a/b);
		System.out.println(a%b);
	}
	void shiftoperators()
	{
		System.out.println(10<<2);
		System.out.println(10>>2);
	}
	void relationaloperators() {
		int a=10,b=5;
		System.out.println(a==b);
		System.out.println(a!=b);
		System.out.println(a>=b);
		System.out.println(a<=b);
	}
	void bitwiseandlogicaloperators()
	{
		int a=10,b=5,c=20;
		System.out.println(a<b&&a++<c);
		System.out.println(a);
		System.out.println(a<b&a++<c);
		System.out.println(a);
		System.out.println(a>b||a<c);
		System.out.println(a>b|a<c);
		System.out.println(a>b||a++<c);
		System.out.println(a);
		System.out.println(a>b|a++<c);
		System.out.println(a);
		
		System.out.println(12|12);
		System.out.println(12^12);
		
	}
	void ternaryoperator()
	{
		int a = 2;
		int b = 5;
		int min = (a < b) ? a : b;
		System.out.println(min);
	}
	void assignmentoperator()
	{
		int a = 10,b = 20;
		a+=4;
		b-=5;
		System.out.println(a);
		System.out.println(b);
	}
	
}