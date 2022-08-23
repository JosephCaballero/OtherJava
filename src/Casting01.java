import java.sql.SQLOutput;

public class Casting01 {
    public static void main(String[] args) {
        //Declare and initialize a byte with a value of 128
        //Observe NetBeans' complaint
        //byte bvalue = 128; 128 is too big for byte

        //Declare and initialize a short with a value of
        short shortvalue = 128;
        //Create a print statement that casts this short to a byte
        System.out.println((byte)shortvalue );


        //Declare and initialize a byte with a value of 127
        byte bytevalue1 = 127;
        //Add 1 to this variable and print it
        bytevalue1 += 1;
        System.out.println(bytevalue1);
        bytevalue1 += 1;
        //Add 1 to this variable again and print it again
        System.out.println(bytevalue1);



    }
}
