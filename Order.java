import java.text.DateFormat;
import java.util.Date;

public class Order {
private Sandwich sandwich;
private String customer;
  
  
public Order(){
this.sandwich=null;
this.customer="";
}
  
public void setSandwich(Sandwich s){
this.sandwich=s;
}
  
public void setCustomer(String c){
this.customer=c;
}
  
public String toString(){
  
Date now = new Date();
DateFormat defaultDate = DateFormat.getDateTimeInstance(DateFormat.MEDIUM, DateFormat.MEDIUM);
String time = defaultDate.format(now);
String ret=time+" ";
ret+=this.customer+" ";
ret+=this.sandwich;
  
double rTotal=0;
rTotal=this.sandwich.getTotal();
ret+=" $"+rTotal;

return(ret);
}
}