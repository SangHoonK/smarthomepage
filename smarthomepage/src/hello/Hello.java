package hello;
public class Hello {
	
	public Hello(){
		System.out.println("프로그램을 시작합니다.");
	}
	public void disp(String n) {
		System.out.println(n);
	}
	public int rannum(){
		int n1 = (int)(Math.random()*100)+1;
		int n2 = (int)(Math.random()*100)+1;
		return n1 * n2;
	}
	
	public static void main(String[] args) {
		
		Hello hel = new Hello();
		System.out.println("Hello java\n");
		
		for(int i = 2;i<=9;i++){
			for(int j = 1;j<=9;j++) {
				System.out.println(i+" * "+j+" = "+(i*j));
			}
			System.out.println();
		}
		hel.disp("complete");
		
		System.out.println(hel.rannum());
	}
}

