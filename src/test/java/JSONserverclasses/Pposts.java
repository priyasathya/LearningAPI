package JSONserverclasses;

public class Pposts {
	private String id;
	private String Title;
	private String Author;
	private Info info;
	
	
	public void setid(String id){
		this. id =id;
	}
	public String getid(){
		return id;
	}
	
	public void setTitle(String Title){
		this.Title=Title;
	}
	
	public String getTitle(){
		return Title;
	}
	public void setAuthor (String Author){
		this. Author = Author;
	}
	
	public String getAuthor(){
		return Author;
	}
	
	public void setInfo (Info info){
		this.info =info;
	}
	public Info getInfo(){
		return info;
	}

}
