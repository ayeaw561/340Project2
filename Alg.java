import java.util.*;
import java.io.*;
public class Alg{

    public static void main(String[] args)throws IOException{
        Scanner scan = new Scanner(System.in);
        String name;
        int input;
        System.out.print("Enter file name: ");
        name = scan.nextLine() + ".txt";
        System.out.print("\nEnter input: ");
        input = scan.nextInt();
        Scanner num = new Scanner(new File(name));
        LList list = new LList();
        while(num.hasNextInt()){
            list.add(num.nextInt());
        }

        //insertionsortList(input, list);

    }

    static void insertionsortArray(int n, int s[]){

        int i, j, x;
        for(i = 1; i < n; i++){
            x = s[i];
            j = i - 1;
            while(j > 0 && s[j] > x){
                s[j + i] = s[j];
                j--;
            }
            s[j + 1] = x;
        }
    }
/*    static void insertionsortList(int n, LList s){



        int i, j, a, b;
        LList x = new LList();
        for(i = 1; i < n; i++){
            j = i-1;
            b = (int)s.get(j);
            a = (int)s.get(i);
            while(j >= 0 && b > a){
                b = (int)s.get(j);
                 = b;
                j--;
            }
            s[j + 1] = x;
        }
    }*/

}