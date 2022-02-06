import java.util.Scanner;

public class Employee {
    private String empID;
    private String empName;
    private double totalSalary;
    private double tax;
    private Scanner sc = new Scanner(System.in);

    public void readValue() {
        System.out.print("ID Pekerja : ");
        this.empID = sc.nextLine();
        System.out.println();

        System.out.print("Nama Pekerja : ");
        this.empName = sc.nextLine();
        System.out.println();

        System.out.print("Total Gaji Pekerja : ");
        this.totalSalary = sc.nextDouble();
        System.out.println();
    }

    public void display() {
        System.out.printf("ID Pekerja\t: %s\nNama Pekerja\t: %s\nTotal Gaji Pekerja\t: %s\nPajak yang Harus Dibayar Pekerja\t: %s\n", this.getEmpID(), this.getEmpName(), this.getTotalSalary(), this.getTax());
    }

    public String getEmpID() {
        return empID;
    }

    public String getEmpName() {
        return empName;
    }

    public double getTotalSalary() {
        return totalSalary;
    }

    public double getTax() {
        return tax;
    }

    public void setEmpID(String empID) {
        this.empID = empID;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public void setTax(double tax) {
        this.tax = tax;
    }

    public void setTotalSalary(double totalSalary) {
        this.totalSalary = totalSalary;
    }
    
}