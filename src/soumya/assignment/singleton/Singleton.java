package soumya.assignment.singleton;

public class Singleton {
    String text;
    /*
    * java: non-static variable text cannot be referenced from a static context
    * because static members of a class assigned to class itself not with instances.
    * */
    public static Singleton print(String str){
            //text = str;
            return new Singleton();
    }
    public void printString(){
        System.out.println(text);
    }
    public static void main(String[] args){
        print("hello");
        Singleton singleton = new Singleton();
        singleton.printString();
    }
}
