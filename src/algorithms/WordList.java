package algorithms;

import java.io.*;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

public class WordList implements StringSearchInterface {
    private ArrayList<String> wordList;
    private ArrayList<String> results;
    private static final String url = "http://dl.dropbox.com/u/18678304/2011/BSc2/words.txt";
	public WordList(String urlString) throws IOException{
		
		BufferedReader in = null;
		try{
			wordList = new ArrayList<String>();
			in = new BufferedReader(new InputStreamReader(new URL(url).openStream()));
			String inputLine;
			while((inputLine= in.readLine()) != null)
				wordList.add(inputLine);
		}
		finally{
			if(in !=null)
				in.close();
		}
	}
	
	
	public List<String> getSubstringList(String subString) {
		results = new ArrayList<String>();
		for(int i=0; i<wordList.size(); i++){
			String check = wordList.get(i);
		 if(check.toLowerCase().contains(subString.toLowerCase())){
		    results.add(check);
		 }
		}
		 return (List<String>)results;
	}

	public void addString(String s) {
        wordList.add(s);
	}

}
