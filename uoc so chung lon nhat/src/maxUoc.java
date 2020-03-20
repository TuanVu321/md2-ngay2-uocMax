import java.util.Scanner;

public class maxUoc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so a");
        int a = scanner.nextInt();
        System.out.println("Nhap so b");
        int b = scanner.nextInt();
        a = Math.abs(a);
        b = Math.abs(b);
        if(a==0||b==0){
            System.out.println("so 0 khong phai so nguyen");
        }
        if (a == b) {
            System.out.println("Hai so giong nhau nen uoc chung cua no la "+a);
        }
        while (a != b) {
            if (a > b) {
                a = a - b;
            } else {
                b = b - a;
            }
        }
        System.out.println("Uoc so chung lon nhat la: " + a);


    }
}
