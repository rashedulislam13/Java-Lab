
package javalabfinal;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InvalidObjectException;


public class CopyCharacter {
    
    
    
    public static void main(String[] args) throws IOException, java.io.IOException {
try {FileReader file = new FileReader("D:\\2nd Year 1st Semester\\Object Oriented Programming\\Java lab Qsn Solved\\JavaLabFinal\\character.txt");
FileWriter file2 = new
FileWriter("D:\\2nd Year 1st Semester\\Object Oriented Programming\\Java lab Qsn Solved\\JavaLabFinal\\characterOut.txt");
int c;
while((c=file.read())!=-1){
System.out.print((char)c+"");
file2.write((char)c+"");
}
System.out.println();
file.close();
file2.close();
} catch (FileNotFoundException e) {}
}

    private static class IOException extends Exception {

        public IOException() {
        }
    }
    
}
