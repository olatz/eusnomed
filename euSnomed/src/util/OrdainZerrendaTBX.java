package util;

import java.util.HashMap;

public class OrdainZerrendaTBX {
	
	private HashMap<String, OrdainTBX> ordainakTBX = null;

	public OrdainZerrendaTBX(HashMap<String, OrdainTBX> ordainakTBX) {
		super();
		this.ordainakTBX = ordainakTBX;
	}

	public void gehitu(OrdainTBX ordain){
		this.ordainakTBX.put(ordain.getKatea(), ordain);
	}
	
	public void aldatu(String dId, OrdainTBX ordain){
		this.ordainakTBX.put(dId, ordain);
	}
	
	public HashMap<String, OrdainTBX> getOrdainakTBX() {
		return ordainakTBX;
	}

	public void setOrdainakTBX(HashMap<String, OrdainTBX> ordainakTBX) {
		this.ordainakTBX = ordainakTBX;
	}
	
	
	
	
}
