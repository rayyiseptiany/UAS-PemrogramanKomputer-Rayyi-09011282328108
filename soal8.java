public class soal8 {
    
    String username;
    String password;
    boolean isActive;

    public soal8 (String username, String password) {
        this.username = username;
        this.password = password;
        this.isActive = true; // set akun aktif saat pertama kali dibuat
    }

    public void activateAccount() {
        isActive = true;
        System.out.println("Akun " + username + " telah diaktifkan.");
    }

    public void deactivateAccount() {
        isActive = false;
        System.out.println("Akun " + username + " telah dinonaktifkan.");
    }

    public boolean isActive() {
        return isActive;
    }

    // getter dan setter untuk atribut username dan password
    // ...

    public static void main(String[] args) {
        soal8 user = new soal8("rayyi", "password123");
        System.out.println("Status akun: " + user.isActive());

        user.deactivateAccount();
        System.out.println("Status akun setelah dinonaktifkan: " + user.isActive());

        user.activateAccount();
        System.out.println("Status akun setelah diaktifkan: " + user.isActive());
    }
}