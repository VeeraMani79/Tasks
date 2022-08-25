package Examples;

public class Color {
    private String name;
    private String code;
    
 
    public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public Color(String name, String code)
    {
        this.name = name;
        this.code = code;
    }
 
    @Override
    public String toString() {
        return name + "=" + code;
    }
 
    // getters and setters
}



