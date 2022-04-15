class Three{
	static int i=0;
	public Three(){
		i++;
	}
	public static void main(String[] args) {
		Three t1=new Three();
		Three t2=new Three();
		Three t3=new Three();
		Three t4=new Three();
		System.out.println("You have created "+Three.i+" objects.");
	}
}