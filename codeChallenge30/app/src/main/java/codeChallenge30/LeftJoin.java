package codeChallenge30;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class LeftJoin {

    public List<String> hashmapLeftJoin(HashMap<String,String> h1 , HashMap h2){

        List<String> list = new ArrayList<>();

        for(String item: h1.keySet()){
            if (h2.containsKey(item)){
            list.add( "[\""+item + "\", \""+h1.get(item) +"\", \""+ h2.get(item)+"\"]");
            }else {
                list.add( "[\""+item + "\", \""+h1.get(item) +"\", "+ "NULL]");
            }
        }
        System.out.println(list);
        return list;
    }

}
