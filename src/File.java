import java.io.*;
public class File {
    public static void main(String[] args) {
        try(FileReader reader = new
                FileReader("C:\\Users\\polos\\IdeaProjects\\File\\src\\4me.cfg"))
        {
            // читаемпосимвольно
            int c;
            while((c=reader.read())!=-1){
                System.out.print((char)c);
            }
        }
        catch(IOException ex){
            System.out.println(ex.getMessage());
        }
    }
}
