public class BudgetCalculatorProject {
        public static void main(String[] args) {  
            double Salary = (3000.00);
            double Saving_percent = (Salary * 0.20);
            double Rent_percent = (Salary * 0.30);
            double Groceries_percent = (Salary * 0.15);
            double Entertainment_percent = (Salary * 0.10);
            double monthySalary = (Salary);
            double savedAmount = (Saving_percent);
            double rentAmount = (Rent_percent);
            double groceriesAmount = (Groceries_percent);
            double entertainmentAmount = (Entertainment_percent);
            double totalExpenses = (savedAmount + rentAmount +groceriesAmount + entertainmentAmount);
            double remainingBalance = (Salary - totalExpenses);
            System.out.print("Monthly salary: ");
            System.out.println(monthySalary);
            System.out.print("Saved amount: ");
            System.out.println(savedAmount);
            System.out.print("Amount spent on rent: ");
            System.out.println(rentAmount);
            System.out.print("Amount spent on groceries: ");
            System.out.println(groceriesAmount);
            System.out.print("Amount spent on entertainment: ");
            System.out.println(entertainmentAmount);
            System.out.print("Total expenses: ");
            System.out.println(totalExpenses);
            System.out.print("Remaining balance: ");
            System.out.println(remainingBalance);
           
     

            
            
            
  
        
    }

    
}