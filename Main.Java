// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class HelloWorld {
    public static void main(String[] args) {
        Employee emp = new Employee("Umut",2000.0,45.0,1990);
        
        System.out.println(emp.toString());
    }
}

class Employee{
    String name;
    Double salary;
    Double workHours;
    int hireYear;

    public Employee(String _name, Double _salary, Double _workHours, int _hireYear){
        this.name=_name;
        this.salary=_salary;
        this.workHours=_workHours;
        this.hireYear=_hireYear;
    }
    
    public Double tax(){
        if(this.salary > 1000)
            return this.salary*3/100;
        return 0.0;
    }
    
    public Double bonus(){
        Double bonusWorksHours = this.workHours - 40.0;
        if(bonusWorksHours > 0)
            return bonusWorksHours*30;
        return 0.0;
    }
    
    public Double raiseSalary(){
        int workYears = 2021 - this.hireYear;
        Double realSalary = this.salary - this.tax() + this.bonus();
        
        if(workYears < 10 )
            return realSalary*0.05;
        else if (workYears > 9 && workYears < 20)
            return realSalary*0.10;
        else
            return realSalary*0.15;
            
    }
    
    public String toString() { 
        return "Name: '" + this.name + "'\nSalary: '" + this.salary + "'\nWork Hours: '" + this.workHours + "\nHire Year: '" + this.hireYear + "\nTax: '"+this.tax()+"\nBonus: '"+this.bonus()+"'\nRaise Salary: '"+this.raiseSalary() + "'\nTax And Bonus Salary: '"+(this.salary+this.bonus()-this.tax())+"'";
    } 
    
}
