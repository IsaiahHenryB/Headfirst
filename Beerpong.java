public class Beerpong {

    public static void main(String[] arg) {
        {
            int num =99;
            String word = "bottles";

            while (num > 0)
            {
                if (num == 1)
                {
                    word = "bottle";
                }

                System.out.println(num + " " + word + " of beer on the wall");
                System.out.println(num + " " + word + " of beer.");
                System.out.println("Take one down.");
                System.out.println("pass it around.");
                //this substract 1 each time the loop looped around
                num = num-1;

            }
            //this continue printing only if beernum is bigger then 0
            if (num > 0){
                System.out.println(num + " " + word + " of beer on the wall");
            }
            else {
                System.out.println(" oh oh no more bottles on the wall, sorry ");
            }
        }

    }
         //end else
    }//end while loop
//end main method
 // end class
