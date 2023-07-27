package Q1;

public class Book {
private int bid;
private String bname;
private String bAuthor;
private double price;

public Book() {
	
}
public Book(int bid, String bname, String bAuthor, double price) {
	super();
	this.bid = bid;
	this.bname = bname;
	this.bAuthor = bAuthor;
	this.price = price;
}
public int getBid() {
	return bid;
}
public void setBid(int bid) {
	this.bid = bid;
}
public String getBname() {
	return bname;
}
public void setBname(String bname) {
	this.bname = bname;
}
public String getbAuthor() {
	return bAuthor;
}
public void setbAuthor(String bAuthor) {
	this.bAuthor = bAuthor;
}
public double getPrice() {
	return price;
}
public void setPrice(double price) {
	this.price = price;
}
@Override
public String toString() {
	return "Book [bid=" + bid + ", bname=" + bname + ", bAuthor=" + bAuthor + ", price=" + price + "]";
}


}
