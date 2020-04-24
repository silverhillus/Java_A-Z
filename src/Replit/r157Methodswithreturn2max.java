package Replit;

public class r157Methodswithreturn2max {

    /*
    max function gets two ints, x and y.
x is the test case, y is what we test against.

if  x is bigger then y return y
in any other case return x.

for example:

max(1,10)
returns 1

max(11,5)
returns 5



if (x>=y){
     return x;
     }else{
     return y;
  }


  }

   /* int max=0;
    if(x>=y){
        max=y;
    }else{
        max=x;
    }
    return max;




  public static void main(String [] args){

  /*Scanner input=new Scanner(System.in);
  int
    int max=max (1,10);
    System.out.println(max);

     int max=max(x,y);
  System.out.println(max);
  }
  */




    public static void main(String[] args) {
        int max=max(-3,5);
        System.out.println(max);

    }
    public static int max(int x,int  y){

        if (x>=y){
            return y;
        }else{
            return x;
        }

    }

}
