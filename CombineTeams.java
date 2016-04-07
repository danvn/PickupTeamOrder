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

public class CombineTeams {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        String file = "/Users/dannguyen/Dropbox/Code/src/testTeams.txt";
        HashMap<Integer, String> newTeams = new HashMap<Integer, String>();
        String line;

        BufferedReader reader = new BufferedReader(new FileReader(file));

        int i = 1;
        while ((line = reader.readLine()) != null)
        {
            newTeams.put(i, line);
            i++;
        }


        System.out.println(newTeams.get(7));
        System.out.println(Arrays.asList(newTeams)); // Print whole teams list
        reader.close();



    }

}


