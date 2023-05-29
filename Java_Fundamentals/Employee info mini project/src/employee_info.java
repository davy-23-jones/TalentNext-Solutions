import java.util.Scanner;

//Employee info mini project
public class employee_info {
    public static void main(String[] args){
        int[] empno = {1001, 1002, 1003, 1004, 1005, 1006, 1007};
        String[] empname = {"Asish", "Sushma", "Rahul", "Chahat", "Ranjan", "Suman", "Tanmay"};
        String[] joindate = {"01/04/2009", "23/08/2012", "12/11/2008", "29/01/2013", "16/07/2005", "1/1/2000", "12/06/2006"};
        String[] dcode = {"e", "c", "k", "r", "m", "e", "c"};
        String[] dept = {"R&D", "PM", "Acct", "Front Desk", "Engg", "Manufacturing", "PM"};
        int[] basic = {20000, 30000, 10000, 12000, 50000, 230000, 29000};
        int[] hra = {8000, 12000, 8000, 6000, 20000, 9000, 12000};
        int[] it = {3000, 9000, 1000, 2000, 20000, 4400, 10000};

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the id of the employee:");
        int id = sc.nextInt();
        int empid = 0;
        for(int i=0;i<empno.length;i++){
            if(empno[i] == id)
                empid = i;
        }
        int salary = 0;
        String designation = null;
        int DA = 0 ;
        switch (dcode[empid]){
            case "e":
                designation = "Engineer";
                DA = 20000;
                break;
            case "c":
                designation = "Consultant";
                DA = 32000;
                break;
            case "k":
                designation = "Clerk";
                DA = 12000;
                break;
            case "r":
                designation = "Receptionist";
                DA = 15000;
                break;
            case "m":
                designation = "Manager";
                DA = 40000;
                break;
        }

        salary = basic[empid]+hra[empid]+DA-it[empid];
        System.out.println("Emp no\t"+"Emp Name\t"+"Department\t"+"Designation\t"+"Salary");
        System.out.println("\n"+id+"\t"+empname[empid]+"\t"+dept[empid]+"\t"+designation+"\t"+salary);

    }
}
