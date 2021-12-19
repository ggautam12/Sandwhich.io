public class Meat {
private String name;
private double price;
  
public Meat(){
this.name="";
this.price=0;
}
  
public Meat(String a,double d){
this.name=a;
this.price=d;
}
  
  
public void setName(String a){
this.name=a;
}
  
public void setPrice(double d){
this.price=d;
}
  
public String getName(){
return(this.name);
}
  
public double getPrice(){
return(this.price);
}
  
public String toString(){
return(this.name+" $"+this.price);
}
}