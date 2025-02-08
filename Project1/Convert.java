
//placeholder
import java.io.*;
import java.util.*;

public class Convert {

    public static void convertFile(String filename) throws IOException {
        File gpxFile = new File(filename); // create a file object for the GPX file
        File csvFile = new File(filename.substring(0, filename.length() - 3) + "csv"); // do it again for the csv
        FileWriter scribe = new FileWriter(csvFile); // scribe / writer for csv file
        Scanner scanner = new Scanner(gpxFile); /// scanner for gpx file
        String[] header = { "Time,", "Latitude,", "Longitude,\n" }; // creates the header for the csv
        for (String column : header) // for each col in the header
            scribe.write(column); // write in the header
        int time = 0; // time var
        while (scanner.hasNextLine()) { //while loop for next line
            String line = scanner.nextLine(); //logic for writing to csv
            int start = line.indexOf("lat=");  //finds the start of the lat
            if (start == -1)  //if there is no latitudinal value, keep it going
                continue;
            int[] quotation = new int[4];
            for (int i = 0; i < 4; i++) { //for loop to find the end of the latitude value
                quotation[i] = line.indexOf("\"", start);
                start = quotation[i] + 1;
            }
            String lat = line.substring(quotation[0] + 1, quotation[1]);
            String lon = line.substring(quotation[2] + 1, quotation[3]);
            lat = lat.replaceAll("\\?", ""); //replace non-relevant alphanumeric chars
            lat = lat.replaceAll("\\s+", ""); //replace non-relevant alphanumeric chars
            lon = lon.replaceAll("\\?", ""); //replace non-relevant alphanumeric chars
            lon = lon.replaceAll("\\s", ""); //replace non-relevant alphanumeric chars
            scribe.write(String.valueOf(time) + ","); //write in the time value
            scribe.write(lat + ","); //input the actual lat/longitude values
            scribe.write(lon + "\n");
            time += 5; //le incrimentation
        }
        scribe.close(); //closes the writer and the scanner for the sake of good practice
        scanner.close();
    }
}