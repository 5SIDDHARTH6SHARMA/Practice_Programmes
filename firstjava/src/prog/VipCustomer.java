package prog;
public class VipCustomer {
  private String name;
  private double credit_limit;
  private String email;

  public VipCustomer(String name, double credit_limit, String email) {
    this.name = name;
    this.credit_limit = credit_limit;
    this.email = email;
  }

  public VipCustomer() {
    this("your name", 0.00, "your e-mail");
  }

  public VipCustomer(double credit_limit, String email) {
    this("Siddharth", credit_limit, email);
    this.credit_limit = credit_limit;
    this.email = email;
  }

  public void getName() {
    System.out.println("Your name is: " + name + ".");
  }

  public void getCredit_limit() {
    System.out.println("Your credit limit is: " + credit_limit + ".");
  }

  public void getEmail() {
    System.out.println("Your e-mail is: " + email + ".");
  }
}