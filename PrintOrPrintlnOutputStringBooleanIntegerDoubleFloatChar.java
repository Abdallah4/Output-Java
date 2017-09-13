/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package print.or.println.output.string.pkgboolean.integer.pkgdouble.pkgfloat.pkgchar;

/**
 *
 * @author Abdallah
 */
public class PrintOrPrintlnOutputStringBooleanIntegerDoubleFloatChar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         //Data Types
      //FIRST:Number
      byte salary; //-128 to 127
      salary=127;

      short salary1; //-32.768 TO 32.767  
      salary1=32000;
      
      int age; // -2^31 To (2^31)-1 {From 0 to (2^32)-1 in java SE 8 and later}   
      age =24;
 
      long myL;    //(-2^63)-1 to (2^63)-1  {From 0 to (2^64)-1 in java SE 8 and later} 
      myL=9223372036854775807L;
    
      float salary3;  //float= 4 bytes
      salary3=12340;
      
     double salary4;  //double = 8 bytes
     salary4=11111;
      
     //SECOND NAMES
     String Name;
     Name ="Abdallah";
     final String Second_Name;
     Second_Name="Mostafa";
    
     //THERD WORD
     
     char D='\u0050'; //hexadecimal
      
     char C='X';
     
     boolean Active;
     Active =true;
    //The println("...") method prints the string "..." and moves the cursor to a new line. The print("...") method instead prints just the string "...", but does not move the cursor to a new line. 
      System.out.println(salary);
      System.out.println(salary1);
      System.out.println(age);
      System.out.println(myL);
      System.out.println(salary3);
      System.out.println(salary4);
      System.out.println(Name);
      System.out.println(Second_Name);
      System.out.println(D);
      System.out.println(C);
      System.out.print(Active);
    }
    
}
