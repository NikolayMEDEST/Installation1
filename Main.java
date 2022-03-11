import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {

        File src = new File("C:\\Users\\_\\Desktop\\HomeWorks\\Installation1\\Games\\src");
        File res = new File("C:\\Users\\_\\Desktop\\HomeWorks\\Installation1\\Games\\res");
        File saveGames = new File("C:\\Users\\_\\Desktop\\HomeWorks\\Installation1\\Games\\saveGames");
        File temp = new File("C:\\Users\\_\\Desktop\\HomeWorks\\Installation1\\Games\\temp");
        File mainDir = new File("C:\\Users\\_\\Desktop\\HomeWorks\\Installation1\\Games\\src\\main");
        File test = new File("C:\\Users\\_\\Desktop\\HomeWorks\\Installation1\\Games\\src\\test");
        File mainFile = new File("C:\\Users\\_\\Desktop\\HomeWorks\\Installation1\\Games\\src\\main\\Main.java");
        File utilsFile = new File("C:\\Users\\_\\Desktop\\HomeWorks\\Installation1\\Games\\src\\main\\Utils.java");
        File drawables = new File("C:\\Users\\_\\Desktop\\HomeWorks\\Installation1\\Games\\res\\drawables");
        File vectors = new File("C:\\Users\\_\\Desktop\\HomeWorks\\Installation1\\Games\\res\\vectors");
        File icons = new File("C:\\Users\\_\\Desktop\\HomeWorks\\Installation1\\Games\\res\\icons");
        File tempTxt = new File("C:\\Users\\_\\Desktop\\HomeWorks\\Installation1\\Games\\temp\\temp.txt");


        // для сборки логов
        StringBuilder bigLogs = new StringBuilder();

        // создаем директории
        createNewDir (src, bigLogs);
        createNewDir (res, bigLogs);
        createNewDir (saveGames, bigLogs);
        createNewDir (temp, bigLogs);
        createNewDir (mainDir, bigLogs);
        createNewDir (test, bigLogs);
        createNewDir (drawables, bigLogs);
        createNewDir (vectors, bigLogs);
        createNewDir (icons, bigLogs);

        // создаем файлы
        createNewFile (mainFile);
        createNewFile (utilsFile);
        createNewFile (tempTxt);


        String logsForWriting = bigLogs.toString();
        System.out.println(logsForWriting);

        try (FileWriter writer = new FileWriter(tempTxt, false)) {
            writer.write(logsForWriting);
            writer.append('\n');
            writer.append('!');
            writer.flush();

        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public static void createNewDir (File nameDir, StringBuilder bigLogs) {
        String logName;
        if (nameDir.mkdir()) {
            logName = "Директория создана успешно";
        } else {
            logName = "директория не создана";
        }
        bigLogs.append(logName);
        bigLogs.append("\n");
    }

    public static void createNewFile (File nameDir) {
        try {
            nameDir.createNewFile();
        } catch (IOException exception) {
            System.out.println(exception.getMessage());
        }

    }


}
