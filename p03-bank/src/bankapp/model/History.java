package bankapp.model;

public class History {
	public History(String date, Double value, String typeOfOperation) {
		super();
		this.date = date;
		this.value = value;
		this.typeOfOperation = typeOfOperation;
	}

	private String date;
	private Double value;
	private String typeOfOperation;
	
	public String getDate() {
		return date;
	}
	
	//public List<History> getHistory() {
	//	return history;
	//}
}
