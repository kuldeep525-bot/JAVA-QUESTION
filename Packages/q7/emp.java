// 7. Write a Java program to perform employee payroll processing using packages. In the java file, Emp.java creates a package employee and creates a class Emp. Declare the variables name,empid, category, bpay, hra, da, npay, pf, grosspay, incometax, and allowance. Calculate the values in methods. Create another java file Emppay.java. Create an object e to call the methods to perform and print values.

package employee;

public class emp{
  
    private String name;
    private int empid;
    private String category;
    private double bpay;
    private double hra;
    private double da;
    private double npay;
    private double pf;
    private double grosspay;
    private double incometax;
    private double allowance;

    public emp(String name,int empid, String category , double bpay, double hra, double da,  double pf, double incometax ,double allowance)
    {
      this.name=name;
      this.empid=empid;
      this.category=category;
      this.bpay=bpay;
      this.hra=hra;
      this.da=da;
      this.pf=pf;
      this.incometax=incometax;
      this.allowance=allowance;
    }

      public void calculateGrossPay() {
        grosspay = bpay + hra + da + allowance;
    }


    public void calculateNetPay() {
        npay = grosspay - pf - incometax;
    }

    public String getName() {
        return name;
    }

    public int getEmpid() {
        return empid;
    }

    public String getCategory() {
        return category;
    }

    public double getBpay() {
        return bpay;
    }

    public double getHra() {
        return hra;
    }

    public double getDa() {
        return da;
    }

    public double getNpay() {
        return npay;
    }

    public double getPf() {
        return pf;
    }

    public double getGrosspay() {
        return grosspay;
    }

    public double getIncometax() {
        return incometax;
    }

    public double getAllowance() {
        return allowance;
    }
  
}