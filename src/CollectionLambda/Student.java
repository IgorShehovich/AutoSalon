package CollectionLambda;

import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Student {
    String name;
    int age;
    static Vector<Student> spisok = new Vector<>();
    static int i=0;

    static {
        List<String> colName = new ArrayList();
        colName.add("Petro");
        colName.add("Pavlo");
        colName.add("Misha");
        colName.add("Sasha");
        colName.add("Andriu");


        for (int i = 0; i < 10; i ++) {
            Random random = new Random();
            spisok.add(new Student(colName.get(random.nextInt(5)), random.nextInt(15) + 15));
        }

    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public int hashCode() {
        char[] ar=this.name.toCharArray();
        int sum=0;
        for(char temp:ar){
            sum=sum+temp;
        }

        return sum*2111+age;
    }

    @Override
    public boolean equals(Object obj) {
        Student s=(Student) obj;
        return age==s.age&name.equals(s.name);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public static void main(String[] args) {
       // System.out.println(spisok);
        Set<Student>  s=new HashSet<>();

        Student st=new Student("qwe",233);
        Student s2=new Student("qwe",23);
        System.out.println(st.equals(s2));
        System.out.println(st.hashCode());
        System.out.println(s2.hashCode());
//        s.add(st);
//        s.add(st);
//        System.out.println(s);
//        System.out.println(st instanceof Student);
//        Stream.of(new Student("qwe",23),
//                new Student("qwe",23),
//                new Student("qwe",23)).forEach(
//                (x)-> {
//                    System.out.println(x instanceof  Student);
//                });
//        //int i=0;
//        Map<String,Integer> resultat=new TreeMap();
//        for(Student student:spisok){
//            Integer t=resultat.get(student.name);
//        if(t==null){
//            resultat.put(student.name,1);
//        }else{
//            resultat.put(student.name,t+1);
//        }
//
//        }
//        System.out.println(resultat);
//        spisok.stream().forEach((g)->{
//            g.age=g.age+1;
//            System.out.println(g);
//        });
//        System.out.println("yyyyyyyyyyyyyyyyyyyyyyyyyyyy  "+spisok);
//
//        spisok.stream().filter((k)->{return k.name.equals("Andriu");}).count();
//        spisok.stream().map((x)->{
//           return x.name;
//        }).distinct().collect(Collectors.toList());
////        spisok.stream().filter((n)->{return n.age==23;}).forEach((e)->{
////            System.out.println(e);
////            i++;
////        });
////        System.out.println(i);
//One  l= (x,y)->{
//    return x*7;
//};
//l.metod(23,"ssd");
    }

//    @Override
//    public int compareTo(Student o) {
//        return this.name.compareTo(o.name)*211+(this.age-o.age);
//    }
}

interface  One{
    int metod(int par, String par2);
    default void   two(){
        System.out.println("dvffffdfdf");
    }
}
