public class Exercise4_4 {

    public static int getNumber() {
        return 42; //
    }

    public static void sayHello() {
        System.out.println("hello");
    }

    public static void main(String[] args) {

        // 1) Donus degerini kullanmayin -> ne oluyor?
        getNumber();

         /* getNumber() metodu 42 değerini return ile döndürür.
         Ancak biz bu değeri ekrana yazdırmazsak veya bir değişkene atamazsak görünmez.
         return sadece değeri gönderir, ekrana yazdırmaz.
         Bu yüzden getNumber(); şeklinde çağırınca 42 çıktısı elde etmeyiz. */


        // 2) void metodu ifade icinde kullanin -> ne oluyor?
        // System.out.println(sayHello() + 7);

        /* System.out.println(sayHello() + 7);
         HATA verir.
         Çünkü sayHello() void turundedir, yani herhangi bir deger döndürmez.
         Bu nedenle matematiksel bir ifade icinde kullanilamaz. */

    }
}
