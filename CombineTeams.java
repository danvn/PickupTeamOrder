/**
 * Created by dannguyen on 3/31/16.
 * This is the pick-up basketball team scheduler. The idea is that teams add their names and the first to come are the first to
 * play. Players can come individually or with any assortment of players. The system will add teams to the queue while maintaining
 * players that want to stay together.
 */
import java.io.*;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;
import java.util.Collections;
import java.util.Map.Entry;
import java.util.Map;
import java.util.Set;

public class CombineTeams {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        String file = "/Users/dannguyen/Dropbox/Code/src/testTeams.txt";

        // Read in txt file. Add a new key for each new line.
        // Each key's value is the new line's contents as a string
        HashMap<Integer, String> newTeams = new HashMap<Integer, String>();
        HashMap<Integer,List<String>> teamsArrayList = new HashMap<Integer,List<String>>();
        String line;
        BufferedReader reader = new BufferedReader(new FileReader(file));
        int i = 1;
        int x = 1;
        while ((line = reader.readLine()) != null)
        {
            newTeams.put(i, line);
            i++;
        }

        List myList = new ArrayList();
        for (Map.Entry<Integer, String> entry : newTeams.entrySet()) {
            System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());
            myList = Arrays.asList(entry.getValue().split(", "));
            teamsArrayList.put(x, myList);
            x++;
        }


        for (Map.Entry<Integer, List<String>> entry : teamsArrayList.entrySet()) {
            System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());
        }

        System.out.println(newTeams.get(1));
        System.out.println(myList.get(1));

        reader.close();

    }

}


