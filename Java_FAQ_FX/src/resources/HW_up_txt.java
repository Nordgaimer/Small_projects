package resources;

import java.util.ArrayList;

/**
 * Created by javadev on 16.03.14.
 */
public class HW_up_txt {
    public static String text ;
    public static String makeString (){

        ArrayList<String> list = new ArrayList<String>(500);

        list.add("\n");
        list.add("-------------NO TEXT YET-------------NO TEXT YET-------------NO TEXT YET\n");
        list.add("-------------NO TEXT YET-------------NO TEXT YET-------------NO TEXT YET\n");
        list.add("-------------NO TEXT YET-------------NO TEXT YET-------------NO TEXT YET\n");
        list.add("-------------NO TEXT YET-------------NO TEXT YET-------------NO TEXT YET\n");
        list.add("-------------NO TEXT YET-------------NO TEXT YET-------------NO TEXT YET\n");
        list.add("-------------NO TEXT YET-------------NO TEXT YET-------------NO TEXT YET\n");
        list.add("-------------NO TEXT YET-------------NO TEXT YET-------------NO TEXT YET\n");
        list.add("-------------NO TEXT YET-------------NO TEXT YET-------------NO TEXT YET\n");
        list.add("-------------NO TEXT YET-------------NO TEXT YET-------------NO TEXT YET\n");
        list.add("-------------NO TEXT YET-------------NO TEXT YET-------------NO TEXT YET\n");
        list.add("-------------NO TEXT YET-------------NO TEXT YET-------------NO TEXT YET\n");
        list.add("-------------NO TEXT YET-------------NO TEXT YET-------------NO TEXT YET\n");
        list.add("-------------NO TEXT YET-------------NO TEXT YET-------------NO TEXT YET\n");
        list.add("-------------NO TEXT YET-------------NO TEXT YET-------------NO TEXT YET\n");
        list.add("-------------NO TEXT YET-------------NO TEXT YET-------------NO TEXT YET\n");
        list.add("-------------NO TEXT YET-------------NO TEXT YET-------------NO TEXT YET\n");
        list.add("-------------NO TEXT YET-------------NO TEXT YET-------------NO TEXT YET\n");
        list.add("-------------NO TEXT YET-------------NO TEXT YET-------------NO TEXT YET\n");
        list.add("-------------NO TEXT YET-------------NO TEXT YET-------------NO TEXT YET\n");

        String tmp ="";
        for (int i=0;i<list.size();i++){
            tmp+=list.get(i);
            text=tmp;
        }
        return text;
    }
}
