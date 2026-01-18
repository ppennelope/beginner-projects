package sa;


import java.util.Scanner;

public class not_ortalaması {

	public static void main(String[] args) {
Scanner input = new Scanner (System.in);

int a,b,c;
double ortalama;


System.out.println("Quiz notunu gir piç :  ");
a = input.nextInt();
System.out.println("Vize notunu gir sik kafalı : ");
b = input.nextInt();
System.out.println("Final notunu gir amına soktuğum  : ");
c = input.nextInt();

ortalama = ((a * 0.2)+(b * 0.2)+(c * 0.6));

System.out.println("Ortalamanız  : " + ortalama);

if(ortalama<50){
System.out.println("Kaldın amınasoktuğumun salağı");
}

else 
System.out.println("Bravo sidarı sikmeye hak kazadınız!!!");

	}

}
