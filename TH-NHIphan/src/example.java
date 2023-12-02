import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class example {
    public static void main(String[] args) {
        // Creating an example ArrayList of integers
        ArrayList<Integer> exampleList = new ArrayList<>();
        exampleList.add(123);
        exampleList.add(456);
        exampleList.add(789);
        exampleList.add(101);
        exampleList.add(131);
        exampleList.add(151);
        exampleList.add(151);
        exampleList.add(11213);

        // Writing the ArrayList to the file
        try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("DAYSO.DAT"))) {
            objectOutputStream.writeObject(exampleList);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
