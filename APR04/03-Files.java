/**
 * WAP to filter all files from any folder
 * 
 */
import java.io.*;
import java.util.ArrayList;
class Solution{
    public static void main(String[] args) {
        ArrayList<String> directoryList = new ArrayList<String>();
        ArrayList<String> filesList = new ArrayList<String>();
        try{
            File file = new File(".");
            for(File this_file : file.listFiles())
            {
                if(this_file.isFile())
                    filesList.add(this_file.toString());
                else if(this_file.isDirectory())
                    directoryList.add(this_file.toString());
            }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        System.out.println("Listing the directories");
        for(String this_directory_name : directoryList)
            System.out.println(this_directory_name);
        System.out.println("Listing the files");
        for(String this_file_name : filesList)
            System.out.println(this_file_name);
    }
}