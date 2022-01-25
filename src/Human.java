import java.util.Date;

public class Human {
        String firstName;
        String lastName;
        Animal pet;
        Car machine;
        private Double salary;
        private Double lastSalaryCheck;
        private Date lastSalaryDate;


        public Human() {
        this.salary = 10000.0;
        this.lastSalaryDate = new Date();
        this.lastSalaryCheck = this.salary;
        }

        public Double getSalary() {
        System.out.println("You recently checked your payout: " + this.lastSalaryDate + " it was: " + lastSalaryCheck + " PLN");
        this.lastSalaryCheck = this.salary;
        this.lastSalaryDate = new Date();
        return this.salary;
        }

         public void setSalary(Double salary) {
             if (salary < 0) {
                 System.out.println("Dude you have not income");
             } else {
                 System.out.println("New data has been sent to the accounting system");
                 System.out.println("Please collect the annex to the contract from Hania from HR");
                 System.out.println("By the way, ZUS and US already knows about changing your paycheck, hiding your income won't do anything");
                 this.salary = salary;
             }

         }
    }








