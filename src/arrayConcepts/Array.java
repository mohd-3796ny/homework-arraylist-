package arrayConcepts;

public class Array {


	public static void main(String[] args) {


		int i[]	=new int[4];
		i[0]=10;
		i[1]=20;
		i[2]=30;
		i[3]=40; //n-1	
		
		System.out.println(i[1]);
		
		System.out.println(i[3]);
		System.out.println(i[2]);
		System.out.println(i.length);
	
		for (int j=0;j<i.length;j++) {
			System.out.println(i[j]);
		}
double d[]=new double[3];
	d[0]=9.33;
	d[1]=12.51;
	d[2]=15.11;
	System.out.println(d[1]);
	
	char c[] = new char[3];
	c[0]='a';
	c[1]='d';
	c[2]='$';
	System.out.println(c[1]);	
	
	String s[]=new String[2];

	s[0]="test";
	s[1]="hello";
	System.out.println(s[1]);
	
	Object ob[] = new Object[6];
	
	ob[0]="Ryad";
	ob[1]=25;
	ob[2]=21.55;
	ob[3]="1/3/1991";
	ob[4]='M';
	ob[5]="london";
	System.out.println(ob[5]);
	System.out.println();
	
	}
}