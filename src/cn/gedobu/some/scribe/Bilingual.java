package cn.gedobu.some.scribe;

public class Bilingual {
	String englishName;
	String chineseName;
	
	Bilingual hasTheEnglishName(String name)
	{
		this.englishName = name;
		return this;
	}
	
	Bilingual hasTheChineseName(String name)
	{
		this.chineseName = name;
		return this;
	}
}
