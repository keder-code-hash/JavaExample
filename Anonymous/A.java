import java.lang.reflect.Constructor;

public abstract class A {
    int x;
    public A(int x){
        this.x=x;
    }
    abstract void pow();

    void print1(){
        pow();// defined the pow in test main
        System.out.println(x);
    }
}
