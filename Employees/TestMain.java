public class TestMain {
    public static void main(String[] args){
        Managers[] mng=new Managers[5];
        double max=-1;
        int id=-1;
        for(int i=0;i<5;i++){
            double salary=234.12+i;
            double bonus=12.21+i;
            double total=salary+bonus;
            mng[i]=new Managers("employee"+i,"dept"+i,salary,bonus);
            if(total>max){
                max=total;
                id=i;
            }
        }


        System.out.println(mng[id].display());
        // System.out.println("id="+mng[id].getId()+",Name="+mng[id].getName()+",Dept.="+mng[id].getDept()+",Salary="+mng[id].getSalary()+",Bonus="+mng[id].getBonus());
    }
}
