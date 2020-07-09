import com.linuxense.javadbf.DBFField;
import com.linuxense.javadbf.DBFReader;
import com.linuxense.javadbf.DBFUtils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class h2db {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\a0348\\IdeaProjects\\test\\src\\main\\resources\\file\\LIC01.DBF");
        DBFReader reader = null;
        try {
            reader = new DBFReader(new FileInputStream(file));
            int numberOfFields =  reader.getFieldCount();

            Object[] rowObjects;

            while ((rowObjects = reader.nextRecord()) != null) {
                System.out.println(rowObjects[4] + " " + rowObjects[5] + " " + rowObjects[7] + ": " + rowObjects[91]);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        finally {
            DBFUtils.close(reader);
        }

    }
}
