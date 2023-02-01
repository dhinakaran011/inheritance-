class Mother extends Grandma{

String name = "Stella"; 

public void work(){

System.out.println(name +" "+super.name);

super.work();

}

}
