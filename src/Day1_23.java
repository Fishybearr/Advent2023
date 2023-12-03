package src;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

public class Day1_23
{
    /*
        TODO: Somehow add written numbers into calculation, Most likely find position in string of each element
           if starting index of word is less than starting index of number then it's first
           if starting index is is largest, then it's last

     */

    public static void main(String[] args)
    {
        String path = "data/ListofNumbers.txt";
        String testPath = "data/TestNumbers.txt";
        Calibrate(path);
    }



    public static void Calibrate(String filePath)
    {


        try {
            ArrayList<String> lines = new ArrayList<>(Files.readAllLines(Paths.get(filePath)));
            int finalNumber = 0;





            for (String l : lines)
            {
                ArrayList<Integer> wordIndexes = new ArrayList<>();

                // System.out.println(l);
                String numberSoFar = "";
                String fL = "";




                    if (l.contains("one"))
                    {

                       l = l.replace("one","oonee");
                        l = l.replace("one","1");


                    }
                    if (l.contains("two"))
                    {

                        l = l.replace("two","ttwoo");
                        l = l.replace("two","2");


                    }
                    if (l.contains("three"))
                    {

                        l = l.replace("three","tthreee");
                        l = l.replace("three","3");


                    }
                    if (l.contains("four"))
                    {

                        l = l.replace("four","ffourr");
                        l = l.replace("four","4");


                    }
                    if (l.contains("five"))
                    {

                        l = l.replace("five","ffivee");
                        l = l.replace("five","5");


                    }
                    if (l.contains("six"))
                    {
                        l = l.replace("six","ssixx");
                        l = l.replace("six","6");


                    }
                    if (l.contains("seven"))
                    {
                        l = l.replace("seven","ssevenn");
                        l = l.replace("seven","7");

                    }

                    if (l.contains("eight"))
                    {
                        l = l.replace("eight","eeightt");
                        l = l.replace("eight","8");
                    }

                    if (l.contains("nine"))
                    {
                        l = l.replace("nine","nninee");
                        l = l.replace("nine","9");
                    }




                //TODO: Maybe just change all of these words to ints in the data
                for(int x= 0; x<l.length();x++ )
                {



                    try {

                        //System.out.println(l.substring(x,x+1));
                        int ph= Integer.parseInt(l.substring(x,x+1));

                        numberSoFar += l.substring(x,x+1);





                    }
                    catch (Exception e)
                    {

                    }

                }


                fL += numberSoFar.substring(0,1);
                fL += numberSoFar.substring(numberSoFar.length()-1);

                System.out.println(l + " min max: " + fL);
                finalNumber += Integer.parseInt(fL);




            }

            System.out.println(finalNumber);
        }
        catch (IOException e)
        {
            System.out.println("Error File Not Found");
        }
    }

}
