public class OnlyStaticWithoutMainFun{
    static{
        System.out.println("It is not possible. to run the code without main function.");
    }
    /*
     * Try it by commenting the entrie main block and run the code 
     */
    public static void main(String args[]){
        System.out.println("Come to reality. Main function is king who starts every thing. Without king there is nothing");
    }
}

/*
 * 
    Error: Main method not found in class OnlyStaticWithoutMainFun, please define the main method as:
        public static void main(String[] args)
    or a JavaFX application class must extend javafx.application.Application
 * 
 */