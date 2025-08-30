import employee.emp;

 class Emppay {
    public static void main(String st[]) {
        emp e = new emp("kuldeep kumar", 101, "Manager", 50000, 10000, 15000, 5000, 3000, 2000);

        e.calculateGrossPay();
        e.calculateNetPay();

        System.out.println("Employee Name: " + e.getName());
        System.out.println("Employee ID: " + e.getEmpid());
        System.out.println("Category: " + e.getCategory());
        System.out.println("Basic Pay: " + e.getBpay());
        System.out.println("HRA: " + e.getHra());
        System.out.println("DA: " + e.getDa());
        System.out.println("PF: " + e.getPf());
        System.out.println("Income Tax: " + e.getIncometax());
        System.out.println("Allowance: " + e.getAllowance());
        System.out.println("Gross Pay: " + e.getGrosspay());
        System.out.println("Net Pay: " + e.getNpay());
    }
 }