public class EmployeeTest {
    public static void main(String[] args) {
        Employee[] emp = new Employee[10];    
        for (int i = 0; i < emp.length; i++) {
            emp[i] = new Employee();
        }
        
        for (Employee employee : emp) {
            employee.readValue();
        }

        for (int i = 0; i < emp.length; i++) {
            calctax(emp[i]);
        }

        for (Employee employee : emp) {
            employee.display();
        }

        highestSalary(emp);
       
    }

    static void calctax(Employee emp) {
        double temp;
        if (emp.getTotalSalary() < 30000.0) {
            emp.setTax(0);
        } else if (emp.getTotalSalary() >= 30000.0 && emp.getTotalSalary() <= 60000.0) {
            temp = 0.05 * (emp.getTotalSalary() - 30000.0);
            emp.setTax(temp);
        } else if (emp.getTotalSalary() > 60000.0) {
            emp.setTax((0.05 * (30000.0)) + (0.08 * (emp.getTotalSalary() - 60000.0)));
        }
    }

    static void highestSalary(Employee emp[]) {
        double tempsal = 0;
        String tempid = null;
        String tempname = null;
        for (int i = 0; i < emp.length; i++) {
            for (int j = i+1; j < emp.length; j++) {
                if (emp[i].getTotalSalary() > emp[j].getTotalSalary()) {
                    tempsal = emp[i].getTotalSalary();
                    tempid = emp[i].getEmpID();
                    tempname = emp[i].getEmpName();
                    emp[i].setTotalSalary(emp[j].getTotalSalary());
                    emp[i].setEmpID(emp[j].getEmpID());
                    emp[i].setEmpName(emp[j].getEmpName());
                    emp[j].setTotalSalary(tempsal);
                    emp[j].setEmpID(tempid);
                    emp[j].setEmpName(tempname);
                }
            }
        }

        System.out.println(emp[emp.length-1].getEmpName() + " memiliki total gaji tertinggi. Berikut informasi nya : ");
        emp[emp.length-1].display();
    }
}