import java.util.ArrayList;
import java.util.List;

public class FileTypeClassifier {
    public static void main(String[] args) {
        //create list
        ArrayList<String> fileNames = new ArrayList<>();
        fileNames.add("report.pdf");
        fileNames.add("photo.jpg");
        fileNames.add("program.java");
        fileNames.add("notes.txt");
        fileNames.add("course.pptx");
        fileNames.add("images.png");
        fileNames.add("index.html");
        fileNames.add("README");
        //Keep a counter for Document, Image, Code, and Other
        int Document = 0;
        int Image = 0;
        int Code = 0;
        int other = 0;

        for (String file : fileNames) {
            if (file.lastIndexOf(".") == -1) {
                other++;
                continue;
            }
            String extentions = file.substring(file.lastIndexOf(".") + 1).toLowerCase();

            //classfy
            if (extentions.equals("pdf")) {
                IO.println("file type is pdf: Document  ");
            }
            else if (extentions.equals("jpg")) {
                IO.println("file type is image ");
            }
             else if (extentions.equals("java")) {
                IO.println("file type is  Code   ");
            } else {
                IO.println("file type  Other   ");
            }


        }
    }
}
