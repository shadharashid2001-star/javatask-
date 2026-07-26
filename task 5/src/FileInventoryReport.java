import java.util.ArrayList;

public class FileInventoryReport {

    public static void main(String[] args) {

        // Store CSV records
        ArrayList<String> files = new ArrayList<>();

        files.add("photo.png,340");
        files.add("app.java,8");
        files.add("report.pdf,120");
        files.add("music.mp3,5000");
        files.add("notes.txt,15");
        files.add("image.jpg,450");

        int totalSize = 0;

        int documentCount = 0;
        int imageCount = 0;
        int audioCount = 0;
        int codeCount = 0;
        int otherCount = 0;

        String largestFile = "";
        int largestSize = 0;

        // Loop through records
        for (int i = 0; i < files.size(); i++) {

            String[] parts = files.get(i).split(",");

            // Skip invalid record
            if (parts.length != 2) {
                System.out.println("Skipping invalid record: " + files.get(i));
                continue;
            }

            String fileName = parts[0].trim();
            int size = Integer.parseInt(parts[1].trim());

            // Get extension
            int dot = fileName.lastIndexOf(".");
            String extension = fileName.substring(dot + 1);

            // Classify file
            if (extension.equals("txt") || extension.equals("pdf")
                    || extension.equals("docx") || extension.equals("xlsx")) {

                System.out.println("File type: Document");
                documentCount++;

            } else if (extension.equals("jpg") || extension.equals("png")
                    || extension.equals("gif")) {

                System.out.println("File type: Image");
                imageCount++;

            } else if (extension.equals("mp3") || extension.equals("wav")) {

                System.out.println("File type: Audio");
                audioCount++;

            } else if (extension.equals("java") || extension.equals("py")
                    || extension.equals("js")) {

                System.out.println("File type: Code");
                codeCount++;

            } else {

                System.out.println("File type: Other");
                otherCount++;
            }

            // Print file information
            System.out.println("File Name: " + fileName);
            System.out.println("Extension: " + extension);
            System.out.println("Size: " + size + " KB");
            System.out.println();

            // Add total size
            totalSize += size;

            // Find largest file
            if (size > largestSize) {
                largestSize = size;
                largestFile = fileName;
            }
        }

        // Print summary
        System.out.println("------ Summary ------");
        System.out.println("Total files: " + files.size());
        System.out.println("Total size: " + totalSize + " KB");
        System.out.println("Documents: " + documentCount);
        System.out.println("Images: " + imageCount);
        System.out.println("Audio: " + audioCount);
        System.out.println("Code: " + codeCount);
        System.out.println("Other: " + otherCount);
        System.out.println("Largest file: " + largestFile + " (" + largestSize + " KB)");
    }
}