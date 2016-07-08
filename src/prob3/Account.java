package prob3;

public class Account {

	String accountNo;
	int balance;
	
	public Account(){
		
	}
	
	public int save(int save){
		this.balance = save;
		System.out.println(this.accountNo + " 계좌에 " + save + "만원이 입금되었습니다.");
		return this.balance;
	}
	
	public int deposit(int deposit){
		this.balance = this.balance - deposit;
		System.out.println(this.accountNo + " 계좌에 " + deposit + "만원이 출금금되었습니다.");
		return this.balance;
	}
	
	public String getAccountNo() {
		return this.accountNo;
	}

	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	public Account(String string) {
		this.accountNo = string;
		System.out.println(string + " 계좌가 개설되었습니다.");
	}

	

}
