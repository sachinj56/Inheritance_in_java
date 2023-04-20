public class Main {

    /*
    In Java, it is possible to inherit attributes and methods from one class to another. We group the "inheritance concept" into two categories:

subclass (child) - the class that inherits from another class
superclass (parent) - the class being inherited from
To inherit from a class, use the extends keyword.
     */
// creating class Base
   static class Base{
       public int x;
        public void printMe(){
            System.out.println();
        }
        // Creating getter method for the Base class
        public int getX(){
            return x;
        }
        // Creating setter method for the Base class
    public void setX(int x){
        System.out.println("I am in Base class now and setting X for base class");
            this.x = x;
    }
    }

    // Creating a inherited class derived
   static class Derived extends Base{

        public int y;

        //creating getter method for the derived class
        public int getY(){
            return y;
        }

        // creating setter method for the derived class
        public void setY(int y){
            this.y = y;
        }

    }
    public static void main(String[] args) {
        // Creating an object of the Base class and setting the value of x
        Base b = new Base();
        b.setX(4);
        System.out.println( "I am in base class now and setting the value of x to " + b.getX());

        // Creating an Object of derived class and setting the value of x
        Derived d = new Derived();
        d.setX(6);
        System.out.println("I am in derived class and setting the value of x from derived class to " + d.getX());
    }
}