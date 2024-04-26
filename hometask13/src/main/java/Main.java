import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {

        splitScr("/Users/tvs/textRomeoGuliet.txt");

    }
    public static void splitScr(String text) {
        try(BufferedReader reader = new BufferedReader(new FileReader(text));
        BufferedWriter writerRomeo = new BufferedWriter(new FileWriter("/Users/tvs/romeo.txt"));
        BufferedWriter writerGuliet = new BufferedWriter(new FileWriter("/Users/tvs/gulieta.txt"))){
            String line;
            boolean isRomeo = false;
            boolean isGuliet = false;
            while ((line = reader.readLine()) != null) {
                if(line.startsWith("Romeo:")){
                    isRomeo = true;
                    isGuliet = false;
                    writerRomeo.write(line);
                    writerRomeo.newLine();
                } else if (line.startsWith("Gulieta:")) {
                    isGuliet = true;
                    isRomeo = false;
                    writerGuliet.write(line);
                    writerGuliet.newLine();
                }else {
                    if (isRomeo){
                        writerRomeo.write(line);
                        writerRomeo.newLine();
                    } else if (isGuliet) {
                        writerGuliet.write(line);
                        writerGuliet.newLine();
                    }
                }
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}