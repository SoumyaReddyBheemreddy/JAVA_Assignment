package soumya.assignment.data;

public class Initialization {
    int number;
    char character;
    public void print(){
        System.out.println(number);
        System.out.println(character);
    }
    /*
        Error java: variable value might not have been initialized
         * local variables must be initialized before using them.
         * member variables are initialized by default as 0 or null.
    */
    public void printLocal(){
        int value = 0; //to overcome error initializing  local variables
        char symbol = 0;
        System.out.println(value);
        System.out.println(symbol);
    }
    public static void main(String[] args){
        Initialization initialization = new Initialization();
        initialization.print();
        initialization.printLocal();
    }
}
