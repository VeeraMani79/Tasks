package Collections2;

public class State {
 private String Name;
 private String cmName;
 private int noOfDistricts;
 private String language;
 private String capitals;
public String getName() {
	return Name;
}
public void setName(String name) {
	Name = name;
}
public String getCmName() {
	return cmName;
}
public void setCmName(String cmName) {
	this.cmName = cmName;
}
public int getNoOfDistricts() {
	return noOfDistricts;
}
public void setNoOfDistricts(int noOfDistricts) {
	this.noOfDistricts = noOfDistricts;
}
public String getLanguage() {
	return language;
}
public void setLanguage(String language) {
	this.language = language;
}
public String getCapitals() {
	return capitals;
}
public void setCapitals(String capitals) {
	this.capitals = capitals;
}
public State(String name, String cmName, int noOfDistricts, String language, String capitals) {
	super();
	Name = name;
	this.cmName = cmName;
	this.noOfDistricts = noOfDistricts;
	this.language = language;
	this.capitals = capitals;
}
@Override
public String toString() {
	return "State [Name=" + Name + ", cmName=" + cmName + ", noOfDistricts=" + noOfDistricts + ", language=" + language
			+ ", capitals=" + capitals + "]";
}
 
 
}
