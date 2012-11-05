package util;

public class TerminoTBX {
	
	private Terminoa termino = null;
	private String normalizatua = "";
	private String dId = "";
	private boolean hobetsia = false;
	private String hizkuntza = "";
	
	public TerminoTBX(Terminoa termino, String normalizatua, String dId,
			boolean hobetsia, String hizkuntza) {
		super();
		this.termino = termino;
		this.normalizatua = normalizatua;
		this.dId = dId;
		this.hobetsia = hobetsia;
		this.hizkuntza = hizkuntza;
	}

	public String getKatea(){
		return this.termino.getKarKatea();
	}
	
	public Terminoa getTermino() {
		return termino;
	}

	public void setTermino(Terminoa termino) {
		this.termino = termino;
	}

	public String getNormalizatua() {
		return normalizatua;
	}

	public void setNormalizatua(String normalizatua) {
		this.normalizatua = normalizatua;
	}

	public String getdId() {
		return dId;
	}

	public void setdId(String dId) {
		this.dId = dId;
	}

	public boolean isHobetsia() {
		return hobetsia;
	}

	public void setHobetsia(boolean hobetsia) {
		this.hobetsia = hobetsia;
	}

	public String getHizkuntza() {
		return hizkuntza;
	}

	public void setHizkuntza(String hizkuntza) {
		this.hizkuntza = hizkuntza;
	}

	
	
}
