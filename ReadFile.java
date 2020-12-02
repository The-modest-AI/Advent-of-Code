import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class ReadFile{           //Reading from the 'txt' file and adding the int values to the ArrayList

    private static final ArrayList<Integer> first = new ArrayList<>();

    public static void setFirst() {            //The method to read and set the first

        var sc = "TextFile.txt";
        File file = new File(sc);
        //try with resource
        try (Scanner scanner = new Scanner(file)) {

            while (scanner.hasNext()) {
                if (scanner.hasNextInt()) {
                    first.add(scanner.nextInt());
                } else {
                    scanner.next();
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    //Getter method for first ArrayList's value with index
    public static Integer getFirst(int i) {
        return first.get(i);
    }
    //Getter method of ArrayList " first's " size!
    public static List<Integer> getFirst() {
        return first;
    }
}
