import java.util.Scanner;

public class FilePathSplitter {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        IO.println ("Enter full path");
        String name = input.nextLine();

        if(name.isBlank()){
            IO.println("Invalid path");}

        if (name.contains("\\")) {
            System.out.println(name.replace("\\", "/"));
        } else {
            System.out.println("No backslash");
        }
        int lastSlash = name.lastIndexOf('/');
        String folder = name.substring(0, lastSlash);
        String fileName = name.substring(lastSlash + 1);
String  extension;
        if (fileName.contains(".")) {
            extension = fileName.substring(fileName.lastIndexOf(".") + 1).toLowerCase();
        } else {
            extension = "none";
        }

        String pathStyle;
        boolean windowsPath = name.contains("\\");

        if (windowsPath) {
            pathStyle = "Windows Path";
        } else {
            pathStyle = "Unix Path";
        }

        // Print result
        System.out.println("Path: " + name);
        System.out.println("Folder: " + folder);
        System.out.println("File Name: " + fileName);
        System.out.println("Extension: " + extension);
        System.out.println("Path Style: " + pathStyle);
    }
    }


