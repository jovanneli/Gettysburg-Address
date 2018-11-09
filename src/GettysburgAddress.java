import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * 
 * @author jovanne li
 *
 */

public class GettysburgAddress 
{

	public static void main(String[] args) throws FileNotFoundException 
	{
		Scanner file = new Scanner(new File("Gettysburg Address.txt"));
		
		ArrayList<String> speech = new ArrayList<String>();
		String word = "";
		while(file.hasNext())
		{
			word = file.next();
			speech.add(word);
		}
		
		String longestWord = speech.get(0);
		for(String element: speech)
		{
			if(element.length() > longestWord.length())
			{
				longestWord=element;
			}
		}
		System.out.println("Longest word: " + longestWord);
		
		double total = 0;
		for(String element: speech)
		{
			total += element.length(); 
		}
		double average = total/speech.size();
		System.out.println("Average word length: " + average);
	}
}
