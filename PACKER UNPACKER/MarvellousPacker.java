///////////////////////////////////////////////////////////////////////////////////
//
//        File Name:    MarvellousPacker.java
//        Description:  Used to pack multiple files from a directory into a single 
//                      output file with metadata (filename, size, content).
//        Author:       Aditi Thorat
//        Date:         20/07/25
//
////////////////////////////////////////////////////////////////////////////////////


package MarvellousPackerUnpacker;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public  class MarvellousPacker
{
    private  String packName;
    private  String dirName;

    public MarvellousPacker(String A, String B)
    {
      this.packName = A;
      this.dirName = B;
    }

    public void PackingActivity()
    {
      try
    {
      System.out.println("-----------------------------------------------------------------------------------------------");
      System.out.println("----------------------------Marvellous Packer Unpacker-----------------------------------------");
      System.out.println("-----------------------------------------------------------------------------------------------");
      System.out.println("-------------------------------Packing Activity -----------------------------------------------");
      System.out.println("-----------------------------------------------------------------------------------------------");
      int iRet = 0 ,i = 0,j =0,iCountFile = 0;
      
      
      File fobj = new File(dirName);
      //Check the exisitance of the directory 
      if((fobj.exists()) && (fobj.isDirectory()))
      {
        System.out.println(dirName + " is  successfully opened");
        

        File packobj = new File(packName);
      
        //Create a packed file 
        boolean bRet = packobj.createNewFile();
        if(bRet == false)
        {
          System.out.println("Unable to create pack file ");
          return;
        }

        System.out.println("Packed file sucessfully created with name : "+packName);

        //Retrive all files from directory 
        File Arr[] = fobj.listFiles(); 

        //Packed file object 
        FileOutputStream foobj = new FileOutputStream(packobj);

        //Buffer for read and write activity 
        byte Buffer[] = new byte [1024];


        String Header = null;
        
        //Directory Traversal
        for( i = 0;i < Arr.length ;i++)
        {
          Header = Arr[i].getName() +" "+ Arr[i].length(); 

          //Loop to form 100 bytes header
          for(j = Header.length();j<100;j++)
          {
            Header = Header + " ";
          }
          //Write header into packed file 
          foobj.write(Header.getBytes());

          //open file from directory for reading 
          FileInputStream fiobj = new FileInputStream(Arr[i]);

          //Write contents of file into packed file 
          while((iRet = fiobj.read(Buffer)) != -1)
          {
            foobj.write(Buffer,0,iRet);
            System.out.println("File name scaned is : "+Arr[i].getName());
            System.out.println("File size read is : "+iRet);
          }
          fiobj.close();
          iCountFile++;
        }
        
        System.out.println("Packing activity done");
        System.out.println("-----------------------------------------------------------------------------------------------");
        System.out.println("--------------------------------Statistical Report --------------------------------------------");
        System.out.println("-----------------------------------------------------------------------------------------------");

        System.out.println("Total files Packed: "+iCountFile);
        
        System.out.println("-----------------------------------------------------------------------------------------------");
        System.out.println("------------------------Thank you for using our application------------------------------------");
        System.out.println("-----------------------------------------------------------------------------------------------");

      }
      else
      {
        System.out.println("There is no such directory ");
      }
    } //End of try

    catch(IOException eobj)
    {
      System.err.println("Error during packing: " + eobj.getMessage());
    }
      
    } //End of packing Activity function
} //End of Marvellous Packer Class
