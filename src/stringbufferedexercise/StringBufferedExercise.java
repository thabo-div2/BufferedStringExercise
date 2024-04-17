/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package stringbufferedexercise;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

/**
 *
 * @author Thabo Setsubi st10445734@vcconnnect.edu.za ST10445734
 */
public class StringBufferedExercise
{

    //This is the main method
    public static void main(String[] args)
    {
        String exitProgram = "exit";
        boolean isRun = true;
        
        
       StringBuilder stringBuilder = new StringBuilder();
       
       try
       {
           while (isRun) 
           {
               System.out.println("Enter text (or 'exit' to end program): ");
               BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
               String br = reader.readLine();
               if(br.equals(exitProgram)) 
               {
                   System.out.println("Bye, have a great time!!!");
                   isRun = false;
               } else 
               {
                   
                 stringBuilder = stringBuilder.append(br).append(System.lineSeparator());
                 System.out.println("Accumulated Text: ");
                 System.out.println(stringBuilder);
               }
               
           }
       }
       catch(IOException e)
       {
           System.out.print(e);
           System.out.println(e.getMessage());
           isRun = false;
       }
    }
    //-------------------------00ooo0oo End of file oo0ooo00------------------//
}
