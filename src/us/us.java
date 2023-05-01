package us;
import java.util.Scanner;
public class us {
	static int usAlma(int tab,int us){   
        if (us==0) return 1; 
       
        return tab*usAlma(tab,us-1);
    }
	public static void main(String[] args) {
        Scanner inp= new Scanner(System.in);
        System.out.println("Tabaný giriniz: ");
        int t= inp.nextInt();
        System.out.println("Üssü giriniz: ");
        int u= inp.nextInt();
        System.out.println("Sonuç:"+usAlma(t,u));
    }

}
