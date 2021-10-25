// private constructor

// instances will be created when the class will be loaded into jvm
// only one object can be created for this class So this class will be claaed as signle tonned class
// constructor shuold be private and method should be static

public class Sample {
    int x;
    static Sample s=null;
    private Sample(){}
    private Sample(int x){
        this.x=x;
    }
    static Sample objectCreate(int p){
        if(s==null)
            s=new Sample(p);
        return s;
    }
}
