package LAB8;

public class Main {
public static void main(String[]args) {
	int i=100;
	int j=0;
	
	try {
		j=18/i;
		if(j==0) {
			throw new Exception();
		}
	}
	catch(Exception obj) {
		System.out.println("Something wrong  "+obj);
	}
}
}
