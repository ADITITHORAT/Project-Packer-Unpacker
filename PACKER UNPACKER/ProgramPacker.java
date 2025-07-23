///////////////////////////////////////////////////////////////////////////////
//
//        File Name:    ProgramPacker.java
//        Description:  Main driver class to initiate the packing process by
//                      accepting a directory and output file name and
//                      invoking the MarvellousPacker. 
//        Author:       Aditi Thorat
//        Date:         20/07/25
//
///////////////////////////////////////////////////////////////////////////////

import MarvellousPackerUnpacker.MarvellousPacker;
import java.util.Scanner;
public class ProgramPacker
{
  public static void main(String A[]) 
  {
    try
    {
      Scanner sobj = new Scanner(System.in);

      System.out.println("Enter the name of directory that you want to pack : ");
      String dirName = sobj.nextLine();
      

      System.out.println("Enter the name of file that you want to create for packing : ");
      String packName = sobj.nextLine();

      
      MarvellousPacker mobj = new MarvellousPacker(packName,dirName);
      mobj.PackingActivity();

    }

    catch(Exception eobj)
    {
      System.err.println("Error during packing: " + eobj.getMessage());
    }
      
  } //End of main
} //End of ProgramPacker class
