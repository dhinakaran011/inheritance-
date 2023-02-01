class Kid extends Mother{

String name = "Suman"; 

public static void main(String args[]){

Kid kid = new Kid();

kid.study();

}

public void work(){

System.out.println("worked");

System.out.println(name+" "+super.name);

}

public void study(){

Kid kd = new Kid();

System.out.println("study");

kd.work();

}

}
