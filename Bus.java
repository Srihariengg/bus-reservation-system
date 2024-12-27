package project;

public class Bus {
int Bus_no;
public int getBus_no() {
	return Bus_no;
}

public void setBus_no(int bus_no) {
	Bus_no = bus_no;
}

public boolean isAC() {
	return AC;
}

public void setAC(boolean aC) {
	AC = aC;
}

public int getCapacity() {
	return capacity;
}

public void setCapacity(int capacity) {
	this.capacity = capacity;
}

boolean AC;
int capacity;

	Bus(int no,boolean ac,int cap){
		this.Bus_no=no;
		this.AC=ac;
		this.capacity=cap;
	}

	public void displaybusinfo() {
		 System.out.println("Bus_no:"+Bus_no+" ac:"+AC+" capacity:"+capacity);
		
	}


}
