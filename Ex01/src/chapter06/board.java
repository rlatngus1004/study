package chapter06;

public class board {
	
	private String title;
	private String content;
	private String author;
	private int pwd;
	
	public board(String title, String content, String author, int pwd) {
		super();
		this.title = title;
		this.content = content;
		this.author = author;
		this.pwd = pwd;
	}
	public int getPwd() {
		return pwd;
	}
	public void setPwd(int pwd) {
		this.pwd = pwd;
	}
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	
}
