public class TestMain {
    public static void main(String[] args){
        Sup s=new Sup();
        Child c1=new Child();

        // s1 is reffered by Super class reference and instantiated as a type of Child.
        // so all static member of Child can not be accessed by s1
        Sup s1=new Child();
        System.out.println(s1.x);
        System.out.println(s1.y);

        Child c2=new Child();
        System.out.println(c2.x);
        System.out.println(c2.y);
        System.out.println(c2.p);
        System.out.println(c2.q);

//restric obj creation..

        int intialVal=10;
        Sample sample=Sample.objectCreate(intialVal);
        System.out.println(sample.x);

        // if we create multiple object he reference of all object will be same

        Sample sample1=Sample.objectCreate(intialVal);
        Sample sample2=Sample.objectCreate(intialVal);
        Sample sample3=Sample.objectCreate(intialVal);
    
        System.out.println(sample1.toString());
    }

}
