public class GrandChild extends Child{
    int gVar;
    GrandChild(int gVar,int name,int v){
        super(name,v);
        this.gVar=gVar;
    }
    // @Override
    // public String toString() {
    //     return "GrandChild [gVar=" + gVar + "]";
    // }

    public static void main(String[] args){
        GrandChild gc=new GrandChild(1, 2, 3);

        System.out.println(gc.gVar+" "+gc.v+" "+gc.name);
    }
}


// In java instance variables have the highst prority so if we redeclare
// a variable of parent class in child class the value will be changed at the
// child class.It will not effect the parent class instances variable ,Though we use 
// super()




/*
kon request take age nebo?
we have to calculate the factor from the prority situations
which car is allocated where
	distance(distance by time and ditnace by road)
	on the way according to his desstination(direction)(not prime)
		but we have to cosider the ditance also
	charing current status
	availableity checking of the charging station(after reaching the charging station)
		[manage the reservation table at the end of charging station]
		slot wastage time should be minimum*/
		
		
		
		
		
		/*User.findOne({id:""})
		.then((user)=>{
			res.send({});
			res.josn(user);
		}).error((err)=>{})*/
		
		
		
		
		
		
		
	// 9742221286