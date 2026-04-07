class Factorial{
	static int fact(int n){
		int r = 1;
		for(int i = 1; i <= n; i++){
			r *=i;
		}
		return r;
	}
	public static void main(String[]args){
		System.out.println(fact(5));
	}
}