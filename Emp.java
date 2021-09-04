
public class Emp {
	protected int id;
	protected String name;
	protected int salary;
	protected String start;
	protected String gender;
	protected int phone;
	protected String address;
	protected String department;
	protected int basicPay;
	protected int deduction;
	protected int taxable;
	protected int incomeTax;
	protected int netPay;
	public Emp(int id, String name, int salary, String start, String gender, int phone, String address,
			String department, int basicPay, int deduction, int taxable, int incomeTax, int netPay) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.start = start;
		this.gender = gender;
		this.phone = phone;
		this.address = address;
		this.department = department;
		this.basicPay = basicPay;
		this.deduction = deduction;
		this.taxable = taxable;
		this.incomeTax = incomeTax;
		this.netPay = netPay;
	}
	@Override
	public String toString() {
		return "[id=" + id + ", name=" + name + ", salary=" + salary + ", start=" + start + ", gender=" + gender
				+ ", phone=" + phone + ", address=" + address + ", department=" + department + ", basicPay=" + basicPay
				+ ", deduction=" + deduction + ", taxable=" + taxable + ", incomeTax=" + incomeTax + ", netPay="
				+ netPay + "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String getStart() {
		return start;
	}
	public void setStart(String start) {
		this.start = start;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getPhone() {
		return phone;
	}
	public void setPhone(int phone) {
		this.phone = phone;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public int getBasicPay() {
		return basicPay;
	}
	public void setBasicPay(int basicPay) {
		this.basicPay = basicPay;
	}
	public int getDeduction() {
		return deduction;
	}
	public void setDeduction(int deduction) {
		this.deduction = deduction;
	}
	public int getTaxable() {
		return taxable;
	}
	public void setTaxable(int taxable) {
		this.taxable = taxable;
	}
	public int getIncomeTax() {
		return incomeTax;
	}
	public void setIncomeTax(int incomeTax) {
		this.incomeTax = incomeTax;
	}
	public int getNetPay() {
		return netPay;
	}
	public void setNetPay(int netPay) {
		this.netPay = netPay;
	}
	
	
}
