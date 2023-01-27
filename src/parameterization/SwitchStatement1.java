package parameterization;

public class SwitchStatement1 {

	public static void main(String[] args) {
//Syntax :
		
//		switch(Expression) {
//		case value1:
//			//code to executed
//			break;
//		case value2:
//			//code to be executed
//			break:
//		case value 3:
//			//cod to be executed
//			break:
//		default:
//			//code to be executed if all the cases are not matched
//		}
int no=10;
switch(no)
{
case 10:
	System.out.println("no is 10 match to 10");
	break;
	
case 20:
	System.out.println("no is 20 match to 10");
	break;
	
case 30:
	System.out.println("no is 30 match to 10");
	break;
	default:
		System.out.println("not matched");
}
	}

}
