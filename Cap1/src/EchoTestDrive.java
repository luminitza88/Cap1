
public class EchoTestDrive {

	public static void main(String[] args) {
		
		Echo e1=new Echo();
		int x=0;
		Echo e2=new Echo();
		while (x<4) {
			e1.hello();
			e1.count=e1.count+1;
			
			e2.count=e2.count+1;
			e2.count=e2.count+e1.count;
			x=x+1;
		}
System.out.println(e2.count);
System.out.println("new comm");
	}

}
