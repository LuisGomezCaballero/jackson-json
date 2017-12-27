package app;

public class MyObject {
	private String myString;
	private int myInt;

	public MyObject() {
		super();
	}

	public MyObject(String myString, int myInt) {
		super();
		this.myString = myString;
		this.myInt = myInt;
	}

	public String getMyString() {
		return myString;
	}

	public void setMyString(String myString) {
		this.myString = myString;
	}

	public int getMyInt() {
		return myInt;
	}

	public void setMyInt(int myInt) {
		this.myInt = myInt;
	}

	@Override
	public String toString() {
		return "MyObject [myString=" + myString + ", myInt=" + myInt + "]";
	}

}