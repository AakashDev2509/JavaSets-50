package set1;

public class Q7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=828,y,m,w,d;
		y=a/365;
		m=(a%365)/30;
		w=((a%365)%30)/7;
		d=((a%365)%30)%7;
		System.out.print("NO OF YEAR "+y+'\n');
		System.out.print("NO OF MONTH "+m+'\n');
		System.out.print("NO OF WEEK "+w+'\n');
		System.out.print("NO OF DAY "+d+'\n');

	}

}
