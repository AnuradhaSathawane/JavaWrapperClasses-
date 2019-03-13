package love.programming;

public class WrapperClass {
    public static void main(String[] args) {
        Integer myInteger =10;
        //autoboxing(e.g)

        Integer myObjectInteger = new Integer (10);//normal object creation
        int a = myObjectInteger;
        // unboxing

        System.out.println(a);

        Boolean myBoolean = true;//autoboxing
        Boolean myObjectBoolean = new Boolean (false);//normal object

        Boolean  myAnotherObjectBoolean = false;
        myBoolean = myObjectBoolean;
        System.out.println(myBoolean);
        //we are assinged the value above statment
        //myObejctboolean,equals(myAnotherObjectBoolean);
        //myBoolesn = true;



    }
}
