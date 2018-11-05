import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

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
	}

}
