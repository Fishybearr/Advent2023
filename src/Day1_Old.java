package src;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Day1_Old
{

    public static void FindDirection(String fileName)
    {
        String data = null;
        int floor = 0;
        int posCount = 0;
        try
        {
            //ArrayList<String> lines = new ArrayList<>(Files.readAllLines(Paths.get(fileName)));
           data = Files.readString(Paths.get(fileName));

            //System.out.println(data);

            for (char c : data.toCharArray())
            {
                if (c == '(')
                {
                    floor+=1;
                    posCount+=1;
                }
                else if(c == ')')
                {
                    floor -=1;
                    posCount+=1;
                }

                if (floor == -1)
                {
                    System.out.println("Entered Basemenet @ " + posCount);
                }
            }

            System.out.println(floor);

        }
        catch (IOException e)
        {
            System.out.println("Error: File Not found");
        }





    }

    public static void main(String[] args)
    {
        String path = "data/directionsInput.txt";
        FindDirection(path);
    }



}
