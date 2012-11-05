package util;

public class KontzeptuTBX {

	private Integer cId = 0;
	private Integer hierarkia = 0;
	private Integer semTag = 0;
	private String engFSN = "";
	private String[] hiztegiDef = null;
	
	
	public KontzeptuTBX(Integer cId, Integer hierarkia, Integer semTag,
			String engFSN, String[] hiztegiDef) {
		super();
		this.cId = cId;
		this.hierarkia = hierarkia;
		this.semTag = semTag;
		this.engFSN = engFSN;
		this.hiztegiDef = hiztegiDef;
	}
	
	public Integer getcId() {
		return cId;
	}
	public void setcId(Integer cId) {
		this.cId = cId;
	}
	public Integer getHierarkia() {
		return hierarkia;
	}
	public void setHierarkia(Integer hierarkia) {
		this.hierarkia = hierarkia;
	}
	public Integer getSemTag() {
		return semTag;
	}
	public void setSemTag(Integer semTag) {
		this.semTag = semTag;
	}
	public String getEngFSN() {
		return engFSN;
	}
	public void setEngFSN(String engFSN) {
		this.engFSN = engFSN;
	}
	public String[] getHiztegiDef() {
		return hiztegiDef;
	}
	public void setHiztegiDef(String[] hiztegiDef) {
		this.hiztegiDef = hiztegiDef;
	}
	
	
	
	
}
