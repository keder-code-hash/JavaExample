public class TestMain{
    public static void main(String[] args){
        int x;//it is not same as x(line 8) 
        //without having any subclass we can create an instance of abstract A class
        // Anonymous Class
        //if the reference is not needed in future we can use this technique
        
        // A a1=new A(10){
        //     void pow(){
        //         x=x*x;
        //     }
        // };
        // a1.pow();
        // a1.print();

        new A(10){
            void pow(){
                x=x*x;
            }
        }.print1();
    }
}

// in case of abstract class we can not instantiate the object of this class because we have declared a method in that
// calass the defineation is not there so,there will be a problem for that (method is not defined)
// now we are going to delete that method frm that calss and stll it is being a problem. now it weill act as a abstract
// or may as a concrete one..son in main we have to use the blank definatipn so that we can handel the
// defination of that abstract class..
// A a1=new A(10){};




