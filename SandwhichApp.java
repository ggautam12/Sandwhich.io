import java.io.IOException;
import java.util.Scanner;


public class SandwichApp {

  
public static void main(String[] args) {
 
  
Bread b1=new Bread("White Bread",1.5);
Bread b2=new Bread("Wheat Bread",1.6);
Bread b3=new Bread("French Bread",1.8);
Bread b4=new Bread("Organic Bread",2.0);

  
Vegetable v1=new Vegetable("red onions",.05);
Vegetable v2=new Vegetable("olives",.1);
Vegetable v3=new Vegetable("pickles",.1);
Vegetable v4=new Vegetable("lettuce",.2);
Vegetable v5=new Vegetable("green peppers",.25);
Vegetable v6=new Vegetable("tomatoes",.3);
Vegetable v7=new Vegetable("cheese",.5);
  
  
  
Meat m1=new Meat("Ham",1.0);
Meat m2=new Meat("Roasted Chicken",1.1);
Meat m3=new Meat("Turkey Breast",1.2);
Meat m4=new Meat("Roast Beef",1.5);
  
  
char ch='y';
Scanner sc=new Scanner(System.in);
  
int a,b,c;
Sandwich s=null;
Order o=null;
  
while(ch=='y' || ch=='Y'){
  
s=new Sandwich();
o=new Order();

  
System.out.println("=== Select Sandwich Bread: ===");
System.out.println("1 "+b1);
System.out.println("2 "+b2);
System.out.println("3 "+b3);
System.out.println("4 "+b4);
  
do{
System.out.print("Select a bread [1, 4]: ");
a=sc.nextInt();
if(a<0 || a>4){
if(a<0){
System.out.println("Error! Number must be greater than 0.");
}
else{
System.out.println("Error! Number must be less than 5.");
}
}
}
while(a<0 || a>4);
  

if(a==1){s.addBread(b1);}
if(a==2){s.addBread(b2);}
if(a==3){s.addBread(b3);}
if(a==4){s.addBread(b4);}
  
  
while(true){
  

System.out.println("=== Select Sandwich Vegetables: ===");
System.out.println("1 "+v1);
System.out.println("2 "+v2);
System.out.println("3 "+v3);
System.out.println("4 "+v4);
System.out.println("5 "+v5);
System.out.println("6 "+v6);
System.out.println("7 "+v7);
System.out.println("8 Quit vegetable selection");
System.out.print("Select vegetables[1, 8]: ");
b=sc.nextInt();

  
if(b<0 || b>8){
if(b<0){
System.out.println("Error! Number must be greater than 0.");
}
else{
System.out.println("Error! Number must be less than 9.");
}
}
else{

if(b==1){s.addVegetable(v1);}
if(b==2){s.addVegetable(v2);}
if(b==3){s.addVegetable(v3);}
if(b==4){s.addVegetable(v4);}
if(b==5){s.addVegetable(v5);}
if(b==6){s.addVegetable(v6);}
if(b==7){s.addVegetable(v7);}
if(b==8){break;}
}
}
  
  
while(true){
  
System.out.println("=== Select Sandwich Meat: ===");
System.out.println("1 "+m1);
System.out.println("2 "+m2);
System.out.println("3 "+m3);
System.out.println("4 "+m4);
System.out.println("5 Quit meat selection");
System.out.print("Select meat[1, 5]: ");
c=sc.nextInt();
  
if(c<0 || c>5){
if(c<0){
System.out.println("Error! Number must be greater than 0.");
}
else{
System.out.println("Error! Number must be less than6.");
}
}
else{
  

if(c==1){s.addMeat(m1);}
if(c==2){s.addMeat(m2);}
if(c==3){s.addMeat(m3);}
if(c==4){s.addMeat(m4);}
if(c==5){break;}
}
}

  
System.out.print("Enter customer's name: ");
sc.nextLine();
String name=sc.nextLine();
  
o.setCustomer(name);;
o.setSandwich(s);
  
System.out.println("\n"+o);
  
try {
SandwichIO.writeOrderToFile(o);
} catch (IOException ex) {
System.out.println("File Read / Write Problem");
}

  
System.out.print("\nContinue to order more sandwich? (y/n):");
String yn=sc.next();
  
ch=yn.charAt(0);
}
  
System.out.println("End Program");
sc.close();
}
  
}