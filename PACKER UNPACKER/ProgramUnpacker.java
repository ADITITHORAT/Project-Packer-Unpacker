///////////////////////////////////////////////////////////////////////////////
//
//        File Name:    ProgramUnpacker.java
//        Description:  Main driver class to initiate the unpacking process by
//                      accepting a packed file name via command line and
//                      invoking the MarvellousUnpacker.
//        Author:       Aditi Thorat
//        Date:         23/07/25
//
///////////////////////////////////////////////////////////////////////////////

import  MarvellousPackerUnpacker.MarvellousUnpacker;
import java.util.Scanner;

public class ProgramUnpacker
{
  public static void main(String A[]) 
  {
    try
    {
      Scanner sobj = new Scanner(System.in);

      System.out.println("Enter the name of file which contains packed data  : ");
      String packName = sobj.nextLine();

      MarvellousUnpacker mobj = new MarvellousUnpacker(packName);
      mobj.UnpackingActivity();
    }

    catch(Exception eobj)
    {
      System.err.println("Error during packing: " + eobj.getMessage());
    }
      
  } //End of main
} //End of ProgramUnpacker class
