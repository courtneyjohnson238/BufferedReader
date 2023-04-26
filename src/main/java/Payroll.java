
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
public class Payroll {




    public static void main(String[] args) {
        try {

            // create a FileReader object connected to the File
            FileReader fileReader = new FileReader("EmployeeData.txt");
            // create a BufferedReader to manage input stream
            BufferedReader bufReader = new BufferedReader(fileReader);
            String input;
            // read until there is no more data
            while((input = bufReader.readLine()) != null) {
                System.out.println(input);

                String[] tokens = input.split("\\|");
                int id = Integer.parseInt(tokens[0]);
                double hoursWorked = Double.parseDouble(tokens[2]);
                double payRate = Double.parseDouble(tokens[3]);
                String name = tokens[1];

                Employee employee = new Employee(id,name,hoursWorked,payRate);

               /* System.out.printf("Employee ID: %d, Name: %s, Gross pay: $%.2f%n",
                        employee.getId(),employee.getName(),employee.getGrossPay());*/


                System.out.println("Employee ID: " + employee.getId() + ", Name: " + employee.getName() + ", Gross pay: " + employee.getGrossPay());






            }
// close the stream and release the resources
            bufReader.close();

        } catch(IOException e){
// display stack trace if there was an error
            e.printStackTrace();
        }

    }
}
