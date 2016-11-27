package bankAccountProject;

public abstract class AccountEntity extends Account {
private String nameOrg;
private String regSertificateNumber;
 
//нужно еще обратиться к полю родителя accountBalanceS
String printNameOrgBalance(){
	 System.out.println(nameOrg);
	 return nameOrg;
}

public String getNameOrg() {
	return nameOrg;
}

public void setNameOrg(String nameOrg) {
	this.nameOrg = nameOrg;
}


public String getRegSertificateNumber() {
	return regSertificateNumber;
}

public void setRegSertificateNumber(String regSertificateNumber) {
	this.regSertificateNumber = regSertificateNumber;
}

}
