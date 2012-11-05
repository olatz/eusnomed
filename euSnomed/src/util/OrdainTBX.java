package util;

import java.util.ArrayList;

public class OrdainTBX {

	private Ordaina ordain = null;
	private String normalizatua = "";
	private String dId = "";
	private Integer iturbura = 0;
	private Integer sorkuntza = 0;
	private String[] jatorriTerminoa=null;
	private String[] adibidea = null;
	private boolean hobetsia = false;
	private boolean dependentziak = false;
	private ArrayList<OsagaiaTBX> osagaiak = null;
	
	
	public OrdainTBX(Ordaina ordain, String normalizatua, Integer iturbura,
			Integer sorkuntza, String[] jatorriTerminoa, String[] adibidea,
			boolean hobetsia, boolean dependentziak,
			ArrayList<OsagaiaTBX> osagaiak) {
		super();
		this.ordain = ordain;
		this.normalizatua = normalizatua;
		this.iturbura = iturbura;
		this.sorkuntza = sorkuntza;
		this.jatorriTerminoa = jatorriTerminoa;
		this.adibidea = adibidea;
		this.hobetsia = hobetsia;
		this.dependentziak = dependentziak;
		this.osagaiak = osagaiak;
	}
	
	public String getKatea(){
		return this.ordain.getKarKatea();
	}
	
	public Ordaina getOrdain() {
		return ordain;
	}
	public void setOrdain(Ordaina ordain) {
		this.ordain = ordain;
	}
	public String getNormalizatua() {
		return normalizatua;
	}
	public void setNormalizatua(String normalizatua) {
		this.normalizatua = normalizatua;
	}
	public String getDId(){
		return dId;
	}
	public void setDId(String dId){
		this.dId = dId;
	}
	public Integer getIturbura() {
		return iturbura;
	}
	public void setIturbura(Integer iturbura) {
		this.iturbura = iturbura;
	}
	public Integer getSorkuntza() {
		return sorkuntza;
	}
	public void setSorkuntza(Integer sorkuntza) {
		this.sorkuntza = sorkuntza;
	}
	public String[] getJatorriTerminoa() {
		return jatorriTerminoa;
	}
	public void setJatorriTerminoa(String[] jatorriTerminoa) {
		this.jatorriTerminoa = jatorriTerminoa;
	}
	public String[] getAdibidea() {
		return adibidea;
	}
	public void setAdibidea(String[] adibidea) {
		this.adibidea = adibidea;
	}
	public boolean isHobetsia() {
		return hobetsia;
	}
	public void setHobetsia(boolean hobetsia) {
		this.hobetsia = hobetsia;
	}
	public boolean isDependentziak() {
		return dependentziak;
	}
	public void setDependentziak(boolean dependentziak) {
		this.dependentziak = dependentziak;
	}
	public ArrayList<OsagaiaTBX> getOsagaiak() {
		return osagaiak;
	}
	public void setOsagaiak(ArrayList<OsagaiaTBX> osagaiak) {
		this.osagaiak = osagaiak;
	}
	
	
	
}
