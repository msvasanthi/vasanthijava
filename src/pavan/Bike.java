package pavan;


    class Vehicle{
        void run(){
           int a=1;
            System.out.println("Vehicle is running");
        }
    }
    class Bike extends Vehicle{

        public static void main(String args[]){

            Bike obj = new Bike();
          //  System.out.print(obj.a);
            obj.run();
        }
    }

