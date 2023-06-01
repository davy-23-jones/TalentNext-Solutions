public class Employee extends Person {
    double annualsalary;
    String year;
    int insurance, n;
    public Employee(){
        super();
        this.annualsalary = 1200000.00;
        this.year = "2015";
        this.insurance = 4356789;
    }
    public void getter(){
        System.out.println(annualsalary+"\t"+year+"\t"+insurance);
        super.getName();
    }
    public void setter(double as, String year, int insurance){
        this.insurance = insurance;
        this.year = year;
        this.annualsalary = as;
    }
}
