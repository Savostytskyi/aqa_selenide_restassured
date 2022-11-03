import org.testng.Assert;
import org.testng.annotations.Test;

public class ArrayTest {

    @Test
    public void verifyArrayIsNotEmpty() {
        String listItems[] = {"IPhone", "Mac", "IPad", "Lenovo"};

        String item = "IPhone";


/*
        for (int i = 0; i < item.length(); i++) {

            if (i % 2 > 0) {
                System.out.println(item.charAt(i));
            }

        }*/


      /*  for (int i = 0; i < listItems.length; i=i+1) {
            System.out.println(listItems[i]);
            System.out.println(i);
        }*/
 /*       int i = 0;
        while (!listItems[i].equals("IPad")) {
            System.out.println(listItems[i]);
            System.out.println(i);
            i++;
        }
        System.out.println("_____________________");
        int j = 0;
        do {
            System.out.println(listItems[j]);
            System.out.println(j);
            j++;
        } while (!listItems[j].equals("IPad"));*/
    }
}
