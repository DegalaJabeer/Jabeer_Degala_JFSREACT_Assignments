COLLECTIONS ASSIGNMENT

1Q. <LONG,CONTACT>

import java.util.*;

 class Collections1{
    long phoneNumber;
    String contactName,email;
    char gender;
    public Collections1(long phoneNumber,String contactName,String email,char gender)
    {
        this.phoneNumber=phoneNumber;
        this.contactName=contactName;
        this.email=email;
        this.gender=gender;
    }

}
public class Collections2
{
    public static void main(String[] args) {
        Map<Long,Collections1>map=new TreeMap<>(Collections.reverseOrder());
        Collections1 c1=new Collections1(7981335478K,"Jabeer","jabeer@gmail.com",'M');
        Collections1 c2=new Collections1(97689654K,"Raj","raj@capg.com",'M');
        Collections1 c3=new Collections1(345678902K,"Karan","karangmail.com",'M');
        Collections1 c4=new Collections1(8765432176K,"Rama","rama@capgemini.com",'M');
        map.put(1L,c1);
        map.put(2L,c2);
        map.put(3L,c3);
        map.put(4L,c4);


        for(Map.Entry<Long, Collections1> entry:map.entrySet()){
            long key=entry.getKey();
            Collections1 c5=entry.getValue();
          System.out.println(key+" Details:");

            System.out.println("phone number: "+c5.phoneNumber+" contact name: "+c5.contactName+"email: "+c5.email+" gender: "+c5.gender);
        }
        System.out.print(" ");

    }
}


4th Question: Objects Leap Year:

package collections;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.LinkedList;
import java.util.List;

public class LeapYear {
	public static void main(String[] args) {
		
		Date date = new Date("01/09/1999");
			Date date1 = new Date("10/12/2000");
			Date date2 = new Date("18/10/2003");
			
			
			List<Date> dob = new LinkedList<>();
			dob.add(date);
			dob.add(date1);
			dob.add(date2);
			
			 
			DateTimeFormatter df = DateTimeFormatter.ofPattern("dd/MM/yyyy");
			
			for (int i = 0; i < dob.size(); i++) {
				
				LocalDate up = LocalDate.parse(dob.get(i).date,df);
				String s=(up).format(df);
				 
				  
				if(up.getYear() % 4 == 0) {
					System.out.println(s + " is an leap year");
				}else {
					System.out.println(s + " is not an leap year");
				}
			}
			

	}

}
class Date {
	
	String date;
	
	public Date(String date) {
		super();
		this.date = date;
	}

	@Override
	public String toString() {
		return "[date=" + date + "]";
	}

}