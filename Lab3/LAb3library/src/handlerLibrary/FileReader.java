package handlerLibrary;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FileReader {
    //Получение данных из файла
    public static List<Integer> readFile(String path) throws IOException
    {
        List<Integer> list = new ArrayList<Integer>();
        FileInputStream inputStream = new FileInputStream(path);

        int read;
        do
        {
            read = inputStream.read();

            if (read != -1)
            {
                list.add(read);
            }

        }
        while (read != -1);
        return list;
    }
}
