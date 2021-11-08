/*
class test {
    public static void main(String[] args) {
        System.out.println("Hello");
        System.out.print("Coders");
    }
}
*/

/*
 * String[] args String []args String args[]
 * 
 * /* prog.c compile prog.c -> a.out .\a.out gcc prog.c -> a.out
 * 
 * 
 * java: javac day1.java = compile it generates byte code or class file
 */

/*
 * class is blueprint object is the implementation of blueprint
 */

class iphone {
    int contact; // data member
    // method

    void showData() {
        System.out.print("Sohan's No - " + contact);
    }

    public static void main(String[] args) {
        iphone ob = new iphone(); // create object
        ob.contact = 174680;
        System.out.println("Sohan's No - " + ob.contact);
        ob.showData();
    }
}