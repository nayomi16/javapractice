import java.util.Scanner;

public class LoopPractice {



    static String h="jjj";
    public void loop1(){

        for(int i=0;i<6;i++){

            for(int k=1;k<=i+1;k++){
                System.out.print(k);
            }
            for (int j=0;j<5-i;j++){
                System.out.print("*");
            }
            System.out.print("\n");
        }

    }


    public void loop2(){
        for(int i=0;i<6;i++){

            for(int j=1;j<=5-i;j++){
                System.out.print(j);
            }
            for (int k=1;k<=i+1;k++){
                System.out.print("&");
            }
            System.out.print("\n");
        }

    }
    public void loop3(){
        int k=1;
        for(int j=0;j<6;j++){
         for (int i=1;i<=j+1;i++){
            System.out.print("@");
        }System.out.print("\n");
        }
    }

    public void loop4(){
        int r=11;
        int y=20;
        int e=21;
        int u=10;
        int h=30;
        for(int i=1;i<11;i++){
            System.out.print(i+"\t");
            for (int j=0;j<=0;j++){
                System.out.print(u+"\t");
                u--;
            }

            for (int j=0;j<=0;j++){
                System.out.print(r+"\t");
                r++;
            }
            for (int j=0;j<=0;j++){
                System.out.print(y+"\t");
                y--;
            }

            for (int j=0;j<=0;j++){
                System.out.print(e+"\t");
                e++;
            }
            for (int j=0;j<=0;j++){
                System.out.println(h+"\t");
                h--;
            }



//            for (int j=0;j<=0;j++){
//                System.out.print(r);
//                r++;
//           }
//            for (int j=0;j<=0;j++){
//                System.out.print(u+"\t");
//                u--;
//            }
        }
    }

    public void loop5(){

        for(int i=0;i<5;i++){
            for(int j=0;j<8;j++){
                System.out.print("B");
            }
            System.out.print("\n");
        }
    }

    public void loop6(){
        int i=0;
        int[] arry=new int[10];
        while (i<10) {
            Scanner sc = new Scanner(System.in);
            int y=sc.nextInt();
            arry[i]=y;
            i++;

        }
        int min=arry[0];
        int max=arry[0];
        for (int j=1;j<10;j++){
            if(min>arry[j]){
                min=arry[j];
            }

            if(max<arry[j]){
                max=arry[j];
            }

        }
        System.out.println("min= "+min);
        System.out.println("max= "+max);
    }

    public void loop7(){
        int i=0;
        int result=1;
        Scanner sc=new Scanner(System.in);
        int base=sc.nextInt();
        int ex=sc.nextInt();
        do{
            result=result*base;
            i++;
        }while(i<ex);
        System.out.println(result);

    }

    public void loop8(){
        int mulodd=1;
        int sumeven=0;
        for(int i=1;i<=20;i++){
            if(i%2==1){
                System.out.println(i);
                mulodd=mulodd*i;
            }

        }
        for(int i=1;i<=100;i++){

            if(i%2==0){
                sumeven=sumeven+i;
            }
        }
        System.out.println("multification of odd numbers 1 to 20= "+mulodd);
        System.out.println("sum of even numbers 1 to 100= "+sumeven);
    }

    public void loop9(){
        int k=1;
        int p=5;
        for(int i=1;i<=7;i++){
            for (int l=1;l<=i+p;l++){
                System.out.print(" ");
            }p=p-2;

            for (int j=1;j<=i+k;j++){
                System.out.print("$");

            }k++;
            System.out.println("\t");
        }
    }

    public void loop10(){
        int k=0;
        int p=5;
        for(int i=1;i<7;i++){
            for (int l=1;l<=i+p;l++){
                System.out.print(" ");
            }p=p-2;
            System.out.print(" #");
            for (int j=1;j<=i+k;j++){
                if(j==i+1) {
                    System.out.print("#");
                }else{
                    System.out.print("  ");
                }
            }k++;

            System.out.println("");
        }
        System.out.println("");
        for(int i=6;i>0;i--){
            System.out.print("#");
            System.out.print("  ");
        }

    }

    public void loop11(){
        int k=0;
        int p=5;
        for(int i=1;i<=7;i++){
            for (int l=1;l<=i+p;l++){
                System.out.print(" ");
            }p=p-2;
            System.out.print("#");
            for (int j=1;j<=i+k;j++){
                if(j==i) {
                    System.out.print("#");
                }else{
                    System.out.print("\t");
                }
            }k++;

            System.out.println("");
        }

    }

}
