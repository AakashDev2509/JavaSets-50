package set1;

public class show_bigger_no_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=6,b=7,c=1,big;
		if(a>b) {
			if(c>a)
				big=a;
			else
				big=c;
		}
		else {
			if(b>c)
				big=b;
			else
				big=c;
		}
		System.out.print(big);
	}

}
