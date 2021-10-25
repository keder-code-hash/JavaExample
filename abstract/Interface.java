// java does not support multiple inheritance.
// we can not crete any obj of interface.method in interface is abstract type;


class p{
	int a=100;
}

class q extends p{
	int b;
}

interface r{
	int c=200;
}

class z extends q implements r{
	public static void main(String[] args){
		int total=a+b+c;
		System.out.println(total);
	}
}