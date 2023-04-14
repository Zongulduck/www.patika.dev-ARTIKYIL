import java.util.Scanner;
public class ARTIKYIL {
    public static void main(String[]args){
        int yıl;
        Scanner inp=new Scanner(System.in);
        System.out.println("Artık Yıl hesaplayıcı");
        System.out.print("İstediğiniz Yılı giriniz:");
        yıl= inp.nextInt();
        if(yıl % 4 == 0){
            if(yıl%100==0) {
                if (yıl % 400 == 0) {
                    System.out.println(yıl + " Artık yıldır.");
                } else {
                    System.out.println(yıl + " Artık yıl değildir");
                }
            }
            else{
                System.out.println(yıl + " Artık yıldır.");
            }

        }
        else{
            System.out.println(yıl+" Artık yıl değildir");
        }
    }
}
