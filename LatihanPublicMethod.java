/* soal 1 : Buat objek Mobil bernama myCar. Panggil metode fullThrottle()and speed()pada myCarobjek, 
 dan jalankan program: */
 public class LatihanPublicMethod {
    
    public void fullThrottle(String namaMobil) {
    System.out.println("Nama Mobil           : " + namaMobil);
  }

  	public void speed(int speed) {
    System.out.println("kecepatan mobil saya : " + speed + "CC");
  }

    public static void main(String[] args) {
    LatihanPublicMethod myCar = new LatihanPublicMethod(); 
    myCar.fullThrottle("audi");
    myCar.speed(200);

  }
}