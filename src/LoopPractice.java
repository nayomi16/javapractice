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



}
