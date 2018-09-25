package Entity;

import java.util.Set;
import java.util.Vector;

public class AutoShop {
    String adress;
   //Set<Car> salon = new Set()

    public static void main(String[] args) {
        Vector er=new Vector();
//        er.parallelStream().
//        IgorInterfase var1=new IgorInterfase() {
//            @Override
//            public void one(int t) {
//                System.out.println(t);
//            }
//            void two(){
//
//            }
//        };
//        IgorInterfase var5=(w)-> {
//            System.out.println(w);
//        };
//        var5.one(7);
//        var5.tree();
//        var1.tree();
    }
}
class My implements  IgorInterfase{

    @Override
    public void one(int t) {

    }

}

class My1 implements  IgorInterfase{

    @Override
    public void one(int t) {

    }

    @Override
    public int tree() {
        return 0;
    }
}

interface IgorInterfase{
     abstract void one(int  t);

    default int tree(){
        return 3;
    }
}