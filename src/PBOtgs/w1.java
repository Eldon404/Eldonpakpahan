
package PBOtgs;

import java.util.Scanner;


public class w1 {

    public static void main(String[] args) {
          Scanner in = new Scanner(System.in);
        int input;
        while(true){
        System.out.println("1.input data");
        System.out.println("2. tampil data");
        System.out.println("3. keluar");
        System.out.print("pilih ");
        input = in.nextInt();
        switch(input){
            case 1 :
                break;
            case 2 :
                break;
            case 3 :
                System.exit(0);
            break;
        }
        }
    }
}