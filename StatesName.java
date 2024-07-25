class StatesName{
	public static void main(String[] args)
	{
		System.out.println("Start main in StatesName");
		
		String state1="Andhra Pradesh";
		String state2="Arunchal Pradesh"; 
		String state3="Assam"; 
		String state4="Bihar"; 
		String state5="Chhattisgarh"; 
		String state6="Goa"; 
		String state7="Gujarat"; 
		String state8="Harayana"; 
		String state9="Himachal Pradesh"; 
		String state10="Jammu and Kashmir"; 
		String state11="Jharkhand"; 
		String state12="Karnataka"; 
		String state13="Kerala";
		String state14="Madhya Pradesh"; 
		String state15="Maharastra";
		String state16="Manipur"; 
		String state17="Meghalaya"; 
		String state18="Mizoram"; 
		String state19="Nagaland"; 
		String state20="Odisha"; 
		String state21="Punjab";
		String state22="Rajasthan"; 
		String state23="Sikkim";
        String state24=" Tmail Nadu";
		String state25="Telangana";
		String state26="Tripura";
		String state27="Uttar Pradesh"; 
		String state28="Uttarkhand"; 
		String state29="West Bengal"; 
	
		String[] states={state1,state2,state3,state4,state5,state6,state7,state8,state9,state10,state11,state12,state13,state14,state15,state16,state17,state18,state19,state20,state21,state22,state23,state24,state25,state26,state27,state28,state29};
		
		int total=states.length;
		System.out.println("Total no of states: "+total);
		
		for(int stateName=0;stateName<29;stateName++)
		{
			String state=states[stateName];
			System.out.println("Song name: "+state);
			
		}
		
		System.out.println("End main in StatesName");
		
	}
}
//3. Store all in India state names and print reference
