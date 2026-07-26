import java.util.ArrayList;

public class CsvTablePrinter {
    public static void main(String[] args) {

        ArrayList<String> csvRow = new ArrayList<>();

        csvRow.add("name,age,city");
        csvRow.add("shadha,25,muscat");
        csvRow.add("reem,24,nizwa");
        csvRow.add("maryam,30,alswayq");

        // Split the header
        String[] f = csvRow.get(0).split(",");

        // Print the header
        IO.println(f[0] + "\t" + f[1] + "\t" + f[2]);

        // Separator line
        IO.println("-".repeat(30));

        int count = 0;

        // Loop through the data rows
        for (int i = 1; i < csvRow.size(); i++) {

            String[] row = csvRow.get(i).split(",");

            // Skip malformed rows
            if (row.length != f.length) {
                IO.println("Skipping malformed row: " + csvRow.get(i));
                continue;
            }

            // Print the row
            IO.println(row[0] + "\t" + row[1] + "\t" + row[2]);

            count++;
        }

        // Print NUM OF Rows
        IO.println("Rows shown: " + count);
    }
}


