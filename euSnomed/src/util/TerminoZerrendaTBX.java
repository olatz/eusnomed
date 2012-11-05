package util;

import java.util.HashMap;

public class TerminoZerrendaTBX {
	
	private HashMap<String, TerminoTBX> terminoakTBX = null;

	public TerminoZerrendaTBX(HashMap<String, TerminoTBX> terminoakakTBX) {
		super();
		this.terminoakTBX = terminoakakTBX;
	}

	public void gehitu(TerminoTBX termino){
		this.terminoakTBX.put(termino.getdId(), termino);
	}
	
	public HashMap<String, TerminoTBX> getTerminoakTBX() {
		return terminoakTBX;
	}

	public void setTerminoakTBX(HashMap<String, TerminoTBX> terminoakakTBX) {
		this.terminoakTBX = terminoakakTBX;
	}

	

	
	
}
