class ElectricMoney{
	public String type;
	public String usewith;
	public String definition;

		public void settype(String type){
			this.type = type;
		}

		public String gettype(){
			return type;
		}

		public void setusewith(String usewith){
			this.usewith = usewith;
		}

		public String getusewith(){
			return usewith;
		}

		public void desc(){
			System.out.println("\n\t\t\t\t   ELECTRIC MONEY");
			System.out.println("\nElectronic money is divided into two types");
		}
}

class eWallet extends ElectricMoney{
	public String definition = "An electronic money in the form of application (server-based)).";

	public String inside;

		public void setinside(String inside){
			this.inside = inside;
		}

		public String getinside(){
			return inside;
		}

		public void definition() {
		}
}

	class Account extends eWallet{
		
		// variables
		private int customerIDnumber;
		private int pinNumber;
		public int balance;
		public String customerIDname;

		public Account() {
		}

		public Account(int customerIDnumber, int pinNumber) {
			this.customerIDnumber = customerIDnumber;
			this.pinNumber = pinNumber;
		}

		public Account(int customerIDnumber, int pinNumber, int balance, String customerIDname){
			this.customerIDnumber = customerIDnumber;
			this.pinNumber = pinNumber;
			this.balance = balance;
			this.customerIDname = customerIDname;
		}
		
		public int setcustomerIDnumber(int customerIDnumber){
			this.customerIDnumber = customerIDnumber;
			return customerIDnumber;
		}

		public int getcustomerIDnumber() {
			return customerIDnumber;
		}

		public int setPinNumber(int pinNumber){
			this.pinNumber = pinNumber;
			return pinNumber;
		}

		public int getPinNumber() {
			return pinNumber;
		}

		public void setbalance(int balance) {
			this.balance = balance;
		}

		public int getbalance() {
			return balance;
		}

		public void setcustomerIDname(String customerIDname){
			this.customerIDname = customerIDname;
		}

		public String getcustomerIDname() {
			return customerIDname;
		}
	}

		class OVO extends Account{
			public String usageSystem = "Use of cashback points";
		
			public void Account(){
				System.out.println("Account Data");
			}
		}
		
		class GoPay extends Account{
			public String usageSystem = "Cashback is given into the balance, cashback max Rp. 100.000,- per month";
		
			public void Account(){
				System.out.println("Account Data");
			}
		}


class eMoney extends ElectricMoney{
	public String eMoneydefinition = "A type of electronic money in the form of cards (chip-based)).";

	public String example;

		public void setexample(String example) {
			this.example = example;
		}

		public String getexample() {
			return example;
		}
}


class ElectricMoneyPayement{

	public static void main(String[] args) {

		//ElecticMoney
		ElectricMoney DataElectricMoney = new ElectricMoney();
			DataElectricMoney.desc();

		ElectricMoney Datatype = new ElectricMoney();
			Datatype.settype("\n1. eWallet" + "\n2. eMoney");
		System.out.println(Datatype.gettype());

			//e-Wallet
			System.out.println("\n===================================================================================");
			System.out.println("\t\t\t\t      e-Wallet");
			System.out.println("===================================================================================");

			eWallet Datadefinition = new eWallet();
			System.out.println(Datadefinition.definition);

			System.out.println("\nDescription:");

			ElectricMoney Datausewith = new ElectricMoney();
				Datausewith.setusewith("Aplication");
			System.out.println("*e-Wallet using system " + Datausewith.getusewith());

			eWallet Datainside = new eWallet();
				Datainside.setinside("*Examples of e-wallet products include Go-Pay, OVO, etc.");
			System.out.println(Datainside.getinside());

				//GoPay
				System.out.println("\nGoPay");

				Account DataIDnameGoPay = new Account();
					DataIDnameGoPay.setcustomerIDname("aveAngelive");
				System.out.println("ID Name\t\t: " + DataIDnameGoPay.getcustomerIDname());

				Account DataIDnumberGoPay =  new Account();
					DataIDnumberGoPay.setcustomerIDnumber(10211);
				System.out.println("ID Number\t: " + DataIDnumberGoPay.getcustomerIDnumber());

				Account balanceGoPaydata =  new Account();
					balanceGoPaydata.setbalance(23100000);
				System.out.println("Balance\t\t: Rp. " + balanceGoPaydata.getbalance() + ",-");


				//OVO
				System.out.println("====================================");
				System.out.println("\nOVO");

				Account DataIDname = new Account();
					DataIDname.setcustomerIDname("Angelive1");
				System.out.println("ID Name\t\t: " + DataIDname.getcustomerIDname());

				Account DataIDnumber =  new Account();
					DataIDnumber.setcustomerIDnumber(9898001);
				System.out.println("ID Number\t: " + DataIDnumber.getcustomerIDnumber());

				Account balanceOVOdata =  new Account();
					balanceOVOdata.setbalance(2000000000);
				System.out.println("Balance\t\t: Rp. " + balanceOVOdata.getbalance() + ",-");	
				System.out.println("====================================");

			//e-Money
			System.out.println("\n\n===================================================================================");
			System.out.println("\t\t\t\t       e-Money");
			System.out.println("===================================================================================");

			eMoney dataeMoneydefinition = new eMoney();
				System.out.println(dataeMoneydefinition.eMoneydefinition);

			System.out.println("\nDescription:");

			ElectricMoney Datausewith2 = new ElectricMoney();
				Datausewith2.setusewith("e-Card");
			System.out.println("*e-Wallet using system " + Datausewith2.getusewith());

			eMoney Dataexample = new eMoney();
				Dataexample.setexample("*Examples of e-money products include Flazz BCA, BRI Brizzi, JakCard Bank DKI, etc.\n");
			System.out.println(Dataexample.getexample());
	}
}