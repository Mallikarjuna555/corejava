package com.xworkz;

public class NewsPaper {

	private String name;
	private String lang;
	private Integer since;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLang() {
		return lang;
	}

	public void setLang(String lang) {
		this.lang = lang;
	}

	public NewsPaper(String name, String lang) {
		super();
		this.name = name;
		this.lang = lang;
	}
	@Override
	public boolean equals(Object obj) {
		System.out.println("equals method invoked");
		if(obj!=null) {
			if(obj instanceof NewsPaper) {
			NewsPaper casted=(NewsPaper)obj;
		String	ref=casted.getLang();
		String	ref1=casted.getName();
		if(this.lang.equals(ref) && this.name.equals(ref1)) {
			System.out.println("matching");
			return true;
		}
		
			}
		}
		return false;
	}
	
	
		
	
}
