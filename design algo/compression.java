package design_algo;

public class compression {

}
import java.io.*;
import java.util.*;

public class LZWCompression {

    // Define a HashMap and other variables that will be used in the program
    public HashMap<String, Integer> dictionary = new HashMap<>();
    public int dictSize = 256;
    public String str = "";
    public byte inputByte;
    public byte[] buffer = new byte[3];
    public boolean onleft = true;


    public void compress(String uncompressed) throws IOException {
        // Dictionary size limit, builds dictionary
        for (int i = 0; i < 256; i++) {
            dictionary.put(Character.toString((char) i), i);
        }

        // Read input uncompress file & Write out compressed file
        RandomAccessFile read = new RandomAccessFile(uncompressed, "r");
        RandomAccessFile out = new RandomAccessFile(uncompressed.concat(
                ".lzw"), "rw");

        try {
            // Reads the First Character from input file into the String
            inputByte = read.readByte();
            int i = new Byte(inputByte).intValue();
            if (i < 0) {
                i += 256;
            }
            char ch = (char) i;
            str = "" + ch;

            // Reads Character by Character
            while (true) {
                inputByte = read.readByte();
                i = new Byte(inputByte).intValue();

                if (i < 0) {
                    i += 256;
                }
                System.out.print(i + ", ");
                ch = (char) i;

                // If str + ch is in the dictionary..
                // Set str to str + ch
                if (dictionary.containsKey(str + ch)) {
                    str = str + ch;
                } else {
                    String s12 = to12bit(dictionary.get(str));

                    // Store the 12 bits into an array and then write it to the
                    // output file
                    if (onleft) {
                        buffer[0] = (byte) Integer.parseInt(
                                s12.substring(0, 8), 2);
                        buffer[1] = (byte) Integer.parseInt(
                                s12.substring(8, 12) + "0000", 2);
                    } else {
                        buffer[1] += (byte) Integer.parseInt(
                                s12.substring(0, 4), 2);
                        buffer[2] = (byte) Integer.parseInt(
                                s12.substring(4, 12), 2);
                        for (int b = 0; b < buffer.length; b++) {
                            out.writeByte(buffer[b]);
                            buffer[b] = 0;
                        }
                    }
                    onleft = !onleft;

                    // Add str + ch to the dictionary
                    if (dictSize < 4096) {
                        dictionary.put(str + ch, dictSize++);
                    }

                    // Set str to ch
                    str = "" + ch;
                }
            }

        } catch (IOException e) {
            String str12bit = to12bit(dictionary.get(str));
            if (onleft) {
                buffer[0] = (byte) Integer.parseInt(str12bit.substring(0, 8), 2);
                buffer[1] = (byte) Integer.parseInt(str12bit.substring(8, 12)
                        + "0000", 2);
                out.writeByte(buffer[0]);
                out.writeByte(buffer[1]);
            } else {
                buffer[1] += (byte) Integer.parseInt(str12bit.substring(0, 4), 2);
                buffer[2] = (byte) Integer.parseInt(str12bit.substring(4, 12), 2);

                for (int b = 0; b < buffer.length; b++) {
                    out.writeByte(buffer[b]);
                    buffer[b] = 0;
                }
            }
            read.close();
            out.close();
        }
    }


    public String to12bit(int i) {
        String str = Integer.toBinaryString(i);
        while (str.length() < 12) {
            str = "0" + str;
        }
        return str;
    }


    public static void main(String[] args) throws IOException {
        try {
            LZWCompression lzw = new LZWCompression();

            Scanner input = new Scanner(System.in);

            System.out.println("Enter the name of your (input.txt) file.");

            String str = input.nextLine();

            File file = new File(str);

            Scanner fileScanner = new Scanner(file);

            String line = "";

            while (fileScanner.hasNext()) {
                line = fileScanner.nextLine();
                System.out.println("Contents of your file being compressed: \n"
                        + line);
            }
            lzw.compress(str);
            System.out.println("\nCompression of your file is complete!");
            System.out.println("Your new file is named: " + str.concat(".lzw"));
        } catch (FileNotFoundException e) {
            System.out.println("File was not found!");
        }
    }
}