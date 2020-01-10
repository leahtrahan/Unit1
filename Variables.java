//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date -
//Class -
//Lab  -

public class Variables
{

    public static void main ( String[] args )
	{
		//define 1 variable of each of the
		//following data types
		//byte		short		int 		long
		//float		double
		//char      boolean		String

		//integer variables
        byte byteOne = 127;
        short shortOne = 32767;
        int intOne = 3039;
        long longOne = 123456;


        //decimal variables
        float floatOne = 10.0f;
        double doubleOne = 25.4;


        //other integer types
        char charOne = 'A';


        //other types
        boolean booleanOne = true;
        String stringOne = "We're going to World's!";


		//output your information here
		System.out.println("/////////////////////////////////");
		System.out.println("*                               ");
		System.out.println("*        integer types          ");
		System.out.println("*                               ");
        System.out.println("*8 bit - byteOne = "+byteOne+  "");
        System.out.println("*16 bit - shortOne = "+shortOne+"");
        System.out.println("*32 bit - intOne = "+intOne+"");
        System.out.println("*64 bit - longOne = "+longOne+"");
        System.out.println("*                                ");
        System.out.println("*         real types             ");
        System.out.println("                                ");
        System.out.println("*32 bit - floatOne = "+floatOne+"");
        System.out.println("*64 bit - doubleOne = "+doubleOne+"");
        System.out.println("*                                ");
        System.out.println("*       other int types              ");
        System.out.println("*                                ");
        System.out.println("*16 bit - charOne = "+charOne+"");
        System.out.println("*                                ");
        System.out.println("*        other types               ");
        System.out.println("*                                ");
        System.out.println("*booleanOne = "+booleanOne+"");
        System.out.println("*stringOne = "+stringOne+"");
        System.out.println("*                                ");
		System.out.println("/////////////////////////////////");

	}
}