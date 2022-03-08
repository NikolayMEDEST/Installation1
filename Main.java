import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {

        String srcLog;
        String resLog;
        String saveGamesLog;
        String tempLog;
        String mainLog;
        String testLog;
        String mainFileLog;
        String utilsFileLog;
        String drawablesLog;
        String vectorsLog;
        String iconsLog;

        File src = new File("C:\\Users\\_\\Desktop\\HomeWorks\\Installation1\\Games\\src");
        if (src.mkdir()) {
            srcLog = "директория src создана успешно";
        } else {
            srcLog = "директория src не создана";
        }
        File res = new File("C:\\Users\\_\\Desktop\\HomeWorks\\Installation1\\Games\\res");
        if (res.mkdir()) {
            resLog = "директория res создана успешно";
        } else {
            resLog = "директория res не создана";
        }
        File saveGames = new File("C:\\Users\\_\\Desktop\\HomeWorks\\Installation1\\Games\\saveGames");
        if (saveGames.mkdir()) {
            saveGamesLog = "директория saveGames создана успешно";
        } else {
            saveGamesLog = "директория saveGames не создана";
        }
        File temp = new File("C:\\Users\\_\\Desktop\\HomeWorks\\Installation1\\Games\\temp");
        if (temp.mkdir()) {
            tempLog = "директория temp создана успешно";
        } else {
            tempLog = "директория temp не создана";
        }

        File mainDir = new File("C:\\Users\\_\\Desktop\\HomeWorks\\Installation1\\Games\\src\\main");
        if (mainDir.mkdir()) {
            mainLog = "директория main создана успешно";
        } else {
            mainLog = "директория main не создана";
        }
        File test = new File("C:\\Users\\_\\Desktop\\HomeWorks\\Installation1\\Games\\src\\test");
        if (test.mkdir()) {
            testLog = "директория test создана успешно";
        } else {
            testLog = "директория test не создана";
        }

        File mainFile = new File("C:\\Users\\_\\Desktop\\HomeWorks\\Installation1\\Games\\src\\main\\Main.java");
        try {
            mainFile.createNewFile();
        } catch (IOException exception) {
            System.out.println(exception.getMessage());
        }

        if (mainFile.exists()) mainFileLog = "файл main.java создан успешно";
        else mainFileLog = "файл main.java не был создан";

        File utilsFile = new File("C:\\Users\\_\\Desktop\\HomeWorks\\Installation1\\Games\\src\\main\\Utils.java");
        try {
            utilsFile.createNewFile();
        } catch (IOException exception) {
            System.out.println(exception.getMessage());
        }

        if (utilsFile.exists()) utilsFileLog = "файл utilsFile.java создан успешно";
        else utilsFileLog = "файл utilsFile.java не был создан";

        File drawables = new File("C:\\Users\\_\\Desktop\\HomeWorks\\Installation1\\Games\\res\\drawables");
        if (drawables.mkdir()) {
            drawablesLog = "директория drawables создана успешно";
        } else {
            drawablesLog = "директория drawables не создана";
        }
        File vectors = new File("C:\\Users\\_\\Desktop\\HomeWorks\\Installation1\\Games\\res\\vectors");
        if (vectors.mkdir()) {
            vectorsLog = "директория vectors создана успешно";
        } else {
            vectorsLog = "директория vectors не создана";
        }
        File icons = new File("C:\\Users\\_\\Desktop\\HomeWorks\\Installation1\\Games\\res\\icons");
        if (icons.mkdir()) {
            iconsLog = "директория icons создана успешно";
        } else {
            iconsLog = "директория icons не создана";
        }

        File tempTxt = new File("C:\\Users\\_\\Desktop\\HomeWorks\\Installation1\\Games\\temp\\temp.txt");
        try {
            tempTxt.createNewFile();
        } catch (IOException exception) {
            System.out.println(exception.getMessage());
        }
        // cобираем логи
        StringBuilder bigLogs = new StringBuilder()
                .append(srcLog)
                .append("\n")
                .append(resLog)
                .append("\n")
                .append(saveGamesLog)
                .append("\n")
                .append(tempLog)
                .append("\n")
                .append(mainLog)
                .append("\n")
                .append(testLog)
                .append("\n")
                .append(mainFileLog)
                .append("\n")
                .append(utilsFileLog)
                .append("\n")
                .append(drawablesLog)
                .append("\n")
                .append(vectorsLog)
                .append("\n")
                .append(iconsLog)
                .append("\n");

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
}
