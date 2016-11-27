package bankAccountProject;

public abstract class Individual extends Account {
	private String nameIndividual;
	private String passNumber;
	
	//нужно еще обратиться к полю родителя accountBalance
		String printNameBalance(){
			System.out.println(nameIndividual);
			return nameIndividual ;
			
		}
	
	public String getNameIndividual() {
		return nameIndividual;
	}

	public void setNameIndividual(String nameIndividual) {
		this.nameIndividual = nameIndividual;
	}

	public String getPassNumber() {
		return passNumber;
	}

	public void setPassNumber(String passNumber) {
		this.passNumber = passNumber;
	}

	

}
