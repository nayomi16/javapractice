public class LoopPractice {

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


}
