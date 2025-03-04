package ch.heig.dai.lab.fileio;

import java.io.File;

// *** TODO: Change this to import your own package ***
import ch.heig.dai.lab.fileio.jehrensb.*;

public class Main {
    // *** TODO: Change this to your own name ***
    private static final String newName = "Jean-Claude Van Damme";

    /**
     * Main method to transform files in a folder.
     * Create the necessary objects (FileExplorer, EncodingSelector, FileReaderWriter, Transformer).
     * In an infinite loop, get a new file from the FileExplorer, determine its encoding with the EncodingSelector,
     * read the file with the FileReaderWriter, transform the content with the Transformer, write the result with the
     * FileReaderWriter.
     * 
     * Result files are written in the same folder as the input files, and encoded with UTF8.
     *
     * File name of the result file:
     * an input file "myfile.utf16le" will be written as "myfile.utf16le.processed",
     * i.e., with a suffixe ".processed".
     */
    public static void main(String[] args) {
        // Read the folder with files to transform from the command line
        if (args.length != 1 || !new File(args[0]).isDirectory()) {
            System.out.println("You need to provide an existing folder as command line argument.");
            System.exit(1);
        }
        String folder = args[0];
        System.out.println("Application started, reading folder " + folder + "...");
        // TODO: implement the main method here

        while (true) {
            try {
                Thread.sleep(1000);
                // TODO: implement the infinite loop here

            } catch (Exception e) {
                System.out.println("Exception: " + e);
            }
        }
    }
}
