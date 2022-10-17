package busticketreservation;

public class Bus {
    private int busNo;
	private boolean ac;
	private int capacity; //get and set 
	
	Bus(int no,boolean ac,int cap){
		this.busNo=no;
		this.ac=ac;
		this.capacity=cap;
	}
	public int getBusNo(){ //accessor method
		return busNo;
	}
	public void setBusNo(int no){ //mutator method
		busNo=no;	
	}
	public boolean isAc(){ //accessor method
		return ac;
	}
	public void setAc(boolean val){ //mutator method
		ac=val;	
	}
	public int getCapacity(){ //accessor method
		return capacity;
	}
	public void setCapacity(int cap){ //mutator method
		capacity=cap;	
	}
	public void displayBusInfo(){
		System.out.println("Bus(No:" + busNo + " Ac:" + ac + " Total Capacity: " + capacity);
		
	}

}
