class Employee {
   String empName;
   int empId;

   public void setData(String name, int num) {
      this.empName = name;
      this.empId = num;
   }

   public void printData () {
      System.out.println("\nName: "+empName);
      System.out.println("Employee Number: "+empId);
   }
} // class Employee end

class Doctor extends Employee {
    public void Treatment() {
        System.out.println ("Designation: Doctor");
        System.out.println ("Doctor is diagnosing.");
    } 
} // class Doctor end

class Nurse extends Employee {
    public void care() {
        System.out.println ("Designation: Nurse"); 
        System.out.println ("Nurse is caring.");
    } // method care
} // class Nurse end

class Administrator extends Employee {
    public void budget() {
        System.out.println ("Designation: Administrator");
        System.out.println ("Administrator is budgeting.");
    } // method budget
} // class Administrator

class Receptionist extends Employee {
    public void typeCall() {
        System.out.println ("Designation: Receptionist");
        System.out.println ("Receptionist is typing and calling.");
    } // method type
} // class Receptionist end

class Surgeon extends Doctor {
    public void operate() {
        System.out.println ("Designation: Surgeon");
        System.out.println ("Surgeon is operating.");
    } // method operate
} // class Surgeon end

class Janitor extends Employee {
    public void cleaning() {
        System.out.println ("Designation: Janitor");
        System.out.println ("Janitor is cleaning.");
    } // method clean
} // class Janitor end

public class Driver
{
	public static void main(String[] args) {
                // create class object
		Doctor doctor = new Doctor();
                Nurse nurse = new Nurse();
                Administrator admin = new Administrator();
                Surgeon surgeon = new Surgeon();
                Receptionist receptionist = new Receptionist();
                Janitor janitor = new Janitor();
                // call methods
                doctor.setData("kunal",101);
                doctor.printData();
                doctor.Treatment();
                nurse.setData("tulsi", 102);
                nurse.printData();
                nurse.care();
                admin.setData("danesh", 103);
                admin.printData();
                admin.budget();
                surgeon.setData("niyal", 104);
                surgeon.printData();
                surgeon.operate();
                receptionist.setData("aniket", 105);
                receptionist.printData();
                receptionist.typeCall();
                janitor.setData("Add", 106);
                janitor.printData();
                janitor.cleaning();
	} // main function end
}// driver class end