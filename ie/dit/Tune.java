package ie.dit;

import java.io.IOException;
import java.io.FileReader;
import java.util.ArrayList;
import java.io.BufferedReader;

public class Tune
	{
		public Tune()
		{
			loadTunes();
		}
		private int x()
		{
		
		}
		
		private String title()
		{
			
		}
		
		private String altTitle()
		{
			
		}
		
		private String notation()
		{
			
		}
		
		 public String toString()
		{
        StringBuffer sb = new StringBuffer();
        for(String tune:hnj0)
        {
            sb.append(tune + ", ");
        }

        return sb.toString();
		}
	}
	
class TuneBook
{
	ArrayList<String> tunes = new ArrayList<String>();
	
	public void loadTunes()
	{
		BufferedReader inputStream = null;
		
		 try {
            inputStream = new BufferedReader(new FileReader("hnj0.abc"));
            
            String l;
            while ((l = inputStream.readLine()) != null) {
                tunes.add(l);
            }
        }
        catch (IOException e)
        {
            e.printStackTrace();
        } 
        finally 
        {
            if (inputStream != null) {
                try
                {
                    inputStream.close();
                }
                catch(Exception e)
                {
                    e.printStackTrace();
                }
            }
	
	
	}
}
}