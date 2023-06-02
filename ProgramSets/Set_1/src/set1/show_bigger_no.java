package set1;

public class show_bigger_no {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=5 , b=7, c=9;
		int big;
		if(a>b&&b>c)
			big=a;
		else if(b>a&&b>c)
			big=b;
		else
			big=c;
		System.out.print("Bigger No is"+big);

	}

}
