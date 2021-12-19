import java.util.ArrayList;

public class Sandwich {
private Bread bread;
private ArrayList<Vegetable> vegetables;
private Meat meat;
  
public Sandwich(){
this.bread=null;
this.vegetables=new ArrayList<Vegetable>();
this.meat=null;
}
  
public void addBread(Bread b){
this.bread=b;
}
  
public void addVegetable(Vegetable v){
this.vegetables.add(v);
}
  
public void addMeat(Meat m){
this.meat=m;
}
  
public String toString(){
String ret=this.bread.getName()+" ";
  
for(int i=0;i<this.vegetables.size();i++){
  
ret+=this.vegetables.get(i).getName();
if(i<this.vegetables.size()-1){
ret+=",";
}
}
ret+=" "+this.meat.getName();

return(ret);
}

// get total amount
public double getTotal(){
double ret=0;
ret+=this.bread.getPrice();
for(int i=0;i<this.vegetables.size();i++){
ret+=this.vegetables.get(i).getPrice();
}
ret+=this.meat.getPrice();
  
return(ret);
}

}