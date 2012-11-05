package util;

import java.util.ArrayList;

public class OrdainZerrenda {

	private ArrayList<Ordaina> ordainak = new ArrayList<Ordaina>();
	
	public OrdainZerrenda(){
		super();
		this.ordainak = new ArrayList<Ordaina>();
	}
	
	public OrdainZerrenda(ArrayList<Ordaina> ordainak) {
		super();
		this.ordainak = ordainak;
	}
	
	public void gehitu(Ordaina ordaina){
		this.ordainak.add(ordaina);
	}
	
	public void elkartu(OrdainZerrenda zerrenda){
		for (int i=0;i<=zerrenda.getOrdainak().size();i++){
			if (!this.ordainak.contains(zerrenda.getOrdainak().get(i))){
				this.ordainak.add(zerrenda.getOrdainak().get(i));
			}
		}
	}
	
	public ArrayList<Ordaina> getOrdainak() {
		return ordainak;
	}

	public void setOrdainak(ArrayList<Ordaina> ordainak) {
		this.ordainak = ordainak;
	}
	
	
}
