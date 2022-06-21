package test;

public class Test {
	public static void change(String s) {
		String b="";
		int a=0,i=0;
		while (i<s.length()) {
			a = (int) s.charAt(i);
		if(a>=90 || a<=65 ){
			b+= (char) a;
			a=0;i++;
			}else		{
			a+=32;		
			b+= (char) a;		
			a=0;i++;
				}
		}
		upCase(b);
	}
	public static void upCase(String b) {
		String c="";
		int i=0,a=0;
		a = (int) b.charAt(i) -32;
		c+= (char) a;
		i=1;
		while(i<b.length()) {
			if(b.charAt(i)!=' ') {
				a = (int) b.charAt(i);
				c+= (char) a;	i++;
			}else {
				a = (int) b.charAt(i);
				c+= (char) a;	
				a = (int) b.charAt(i+1) -32;
				c+= (char) a;	i+=2;
			}	
		}	
		System.out.println(c);
	}
	public static void main(String[] args) {
		String s = "kiểm tra daY";
		change(s);
	}
}
