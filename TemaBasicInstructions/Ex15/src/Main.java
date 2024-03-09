
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int a=0;a<=9;a++)
		{
			for(int b=0;b<=9;b++)
			{
				int x=3*1000+a*100+2*10+b;
				if(x%9==0) System.out.println(x);
			}
		}
	}

}
