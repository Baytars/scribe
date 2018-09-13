package cn.gedobu.some.scribe;

public class Body extends Bilingual {
	String gender;
	int age;
	
	Body genderIs(String gender)
	{
		this.gender = gender;
		return this;
	}
	
	Body ageIs(int age)
	{
		this.age = age;
		return this;
	}
}
