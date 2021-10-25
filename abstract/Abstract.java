// abstract and concrete method/class

// we cant instantiate or create an object of abstract class.

// abstarct class contains abstract and as well as concrete mathod
// but if we declare bastract method the class should be an abstract class

// It does not have any body.But when it is being extenedd it has a body

// the method body can be abstracted we can define the body of that method in another class


// static block,var,methods are allowed in this abstract class also.

// suppose we have shape class we have to cal Square,Rect area but if a developer forget to write any required mothod
// in  a Rect class then it create a problem ,but if we create shape as abstract then we put all common prop in it
// other class will extend in all other class,now if any developer forget to write the logic for the main abstract class
// method then a errotr will be generated in time of writing the code..

abstract class A{
	abstract int total(); //abstract method
	void display(){ //concrete method
		System.out.println("helloo");
	}
}

class B extends A{
	int total(){
		return 100;
	}
}

class C extends B{
	int total(){
		return 200;
	}
}

class D{
	public static void main(String[] args){
		B ob1=new B();
		C ob2=new C();
		int total=ob1.total()+ob2.total();
		System.out.println(total);
		ob1.display();
		System.out.println();
	}
}