package JSONserverclasses;

public class Post {
	
	private String id;
	private String Title;
	private String Author;
	
	
	
	public String getid(){
		return id;
	}
	
	public void setid(String id){
		this.id=id;
		}
	
	public void settitle(String Title){
		this.Title=Title;
	}
	
	public String getTitle(){
		return Title;
	}
	
	public void setAuthor(String Author){
		this.Author=Author;
	}
	public String getAuthor(){
		return Author;
	}

}
