package em.java_.heritage_interface_arraylist_exception_enum_chrono;

public enum Day {
	MATIN(8, "il est l'heure de se lever"), 
	MIDI(12, "a table"), 
	APRESMIDI(15, "jouer au football"), 
	SOIR(20, "se coucher"), 
	NUIT(2, "faire de beaux reves");
	
	private int hour;
	private String msg;
	
	Day(int hour, String message){
		
		this.hour=hour;
		this.msg = message;
	}
	
	public int getHour() {
		return hour;
	}
	
	public String getMsg() {
		return msg;
	}

}
