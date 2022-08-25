package Day4;

public class UseDoor {
public static void main(String[] args) {
	String [] b=args[0].split(",");
	Door door=new Door();
 door.color=b[0]; 
 door.materialType=b[1];
  boolean c=Boolean.parseBoolean(b[2]);
  int f=door.color.length();
  int d=door.materialType.length();
 
  int g=f+d;
  
 System.out.println("COLOR= "+door.color.toUpperCase()+", MaterialType= "+door.materialType.toUpperCase()+", SMARTLOCK TYPE= "+c+", TOTAL LENGTH= "+g);

	
	
}
}