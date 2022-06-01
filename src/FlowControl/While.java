package FlowControl;

public class While {
    public static void main(String[] args) {

        /*int i=1;*/

        /*while (i<=10)
        {
            System.out.println(i);
            i++;
        }*/

       /* do{
            System.out.println("i"+i);
            i++;
        }
        while (i<=10);*/

        for(int i=1;i<=10;i++)
        {
          /*  System.out.println(i);

            if(i==5)
            {
                break;
            }*/

            l1:{
                System.out.println("before block");

                if(i==5)
                {
                    break l1;
                }
            }
            System.out.println("after block");
        }

    }
}
