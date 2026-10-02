import java.util.ArrayList;

/**
 * A class to hold details of audio files.
 * 
 * @author David J. Barnes and Michael Kölling
 * @version 7.0
 */
public class MusicOrganizer
{
    // An ArrayList for storing the file names of music files.
    private ArrayList<String> files;
        
    /**
     * Create a MusicOrganizer
     */
    public MusicOrganizer()
    {
        files = new ArrayList<>();
    }
    
    /**
     * Add a file to the collection.
     * @param filename The file to be added.
     */
    public void addFile(String filename)
    {
        files.add(filename);
    }
    
    /**
     * Return the number of files in the collection.
     * @return The number of files in the collection.
     */
    public int getNumberOfFiles()
    {
        return files.size();
    }
    
    /**
     * List a file from the collection.
     * @param index The index of the file to be listed.
     */
    public void listFile(int index)
    {
        if(validIndex(index)) {
            String filename = files.get(index);
            System.out.println(filename);
        }
    }
    
    /**
     * Remove a file from the collection.
     * @param index The index of the file to be removed.
     */
    public void removeFile(int index)
    {
        if(validIndex(index)) {
            files.remove(index);
        }
    }
    
    //Step 1 (improper check with empty collection)
    public boolean checkIndex(int index) 
    {
        if (index >= 0 && index <= files.size()-1){
            return true;
        }
        else {
            System.out.println("Please input an index between 0 and " + (files.size()-1));
            return false;
        }
    }
    
    //Step 2, alternative version of checkIndex
    public boolean validIndex(int index)
    {
        if (index >= 0 && index <= files.size()-1){
            return true;
        }
        else {
            return false;
        }
    }
    
    //Step 6, method that lists all names in the files array
    public void listAllFiles()
    {
        for(String filename : files) 
        {        
            System.out.println(filename);
        }
    }
    
    //Step 7, list file names with associated index
    public void listWithIndex()
    {
        int position = 0;
        //same concept as while but with while loop
        
        /*for (String filename : files){
            System.out.println(position + ": " + filename);
            position ++;
        } */

        while (position < files.size())
        {
         System.out.println(position + ":" + files.get(position));
         position ++;
        }
    }
}
