package OOPS;

public class Students {
    String name;
    int age;
    long phone;

    @Override
    public String toString() {
        return "Students{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", phone=" + phone +
                '}';
    }

    // method to assign values in the object and dont forgot to pass the address at the end
//    void assignValues(String n , int a, long p, Students obj){
//        obj.name = n;
//        obj.age = a;
//        obj.phone = p;
//    }
    Students(String name , int age, long phone){
        this.name =name;
        this.age =age;
        this.phone =phone;
    }


    static void main(String[] args) {
        //to make objects from the class
//        Students vivek = new Students();
        //to assign values use the method
//        vivek.assignValues("Vivek",20,123456,vivek);
        // this will give the address of the object not the whole object
//        System.out.println(vivek);

        // first generate toString method
//        System.out.println(vivek);


        // Constructor

        Students jatin = new Students("jatin",18,123123);
        System.out.println(jatin);

        Students vivek = new Students("vivek",20,1000001);
        System.out.println(vivek);
    }
}
