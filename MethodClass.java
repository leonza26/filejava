public class MethodClass {
    
    public void myPublicMethod() {
    System.out.println("Public methods must be called by creating objects");
  }
  // method public hanya bisa di panggil dengan objek tidak seperti static
    public static void main(String[] args) {
    MethodClass myObj = new MethodClass(); 
    myObj.myPublicMethod(); 
  }
}