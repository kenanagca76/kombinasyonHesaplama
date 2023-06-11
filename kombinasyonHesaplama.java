package combination;
import java.util.Scanner;
public class combination {
    public static void main(String[] args) {
 // Ödev
 //N elemanlı bir kümenin elemanları ile oluşturulacak r elemanlı farklı grupların sayısı n’in r’li kombinasyonu olarak adlandırılır. N’in r’li kombinasyonu C(n,r) şeklinde gösterilir.
 //Java ile kombinasyon hesaplayan program yazınız.
 //Kombinasyon formülü ==> C(n,r) = n! / (r! * (n-r)!)
        int n,r,nFaktoryel=1,rFaktoryel=1,nrFaktoryel=1,result=1;

        Scanner input= new Scanner(System.in);
        System.out.print("Birinci sayıyı giriniz: ");
        n=input.nextInt();
        System.out.print("ikinci sayıyı giriniz: ");
        r=input.nextInt();

        for(int i=1;i<=n;i++){
            nFaktoryel=nFaktoryel*i;
        }
        System.out.println("Kullanıcıdan gelen birinci sayı 'n': "+ n+"!" + "\n" +
                "Faktöriyel değeri: " + nFaktoryel );

        for(int i=1;i<=r;i++){
            rFaktoryel=rFaktoryel*i;
        }
        System.out.println("Kullanıcıdan gelen ikinci sayı 'r': "+ r+"!" + "\n" +
                "Faktöriyel değeri: " + rFaktoryel);

        for(int i=1;i<=(n-r);i++){
            nrFaktoryel=nrFaktoryel*i;
        }
        System.out.println("n-r: "+ (n-r)+"!" + "\n" + "Faktöriyel değeri: " + nrFaktoryel);

        result=nFaktoryel/(rFaktoryel*nrFaktoryel);

        System.out.println("C(n,r)=n!/(r!*(n-r)!): " +"İşlemin Sonucu: " + result);

    }
}
