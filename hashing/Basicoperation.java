import java.util.*; //Required Import are here
public class Basicoperation {
    public static void main(String[] args) {
        HashMap<String, Integer> hm= new HashMap<>();   //Creation of a haspmap
        // All the operation in this to remains the same no change
        //LinkedHashMap<Integer,Integer> lm = new LinkedHashMap<>(); // create a linkedhashmap key ar inserted in ordered
        //TreeMap <String,Integer> tm= new TreeMap <>(); // Create a tree hash map in this keys ars sorted
        hm.put("Tea",20);           // How to add in a hashmap
        hm.put("Samosa",10);
        hm.put("Pizza",250);
        hm.put("Burger",150);
        System.out.println(hm);     //This is how can print in a HashMAp
        System.out.println("The Search Key is:"+hm.get("Tea")); //This is How you can get a single item form hashmap
        hm.put("Coffee",50);
        System.out.println(hm);  
        System.out.println("The Search key you contains is:" +hm.containsKey("Nana"));      //To check that i.e; is in the hashmap or not
        System.out.println("The Search key you contains is:" +hm.containsKey("Coffee"));
        System.out.println("The Search key you want to delete is:" +hm.remove("Coffee"));       //to remove a key for hashmap
        System.out.println(hm);
        System.out.println("The size is:"+hm.size());   //Print the size of hash map
        System.out.println("Is The List Is empty :"+hm.isEmpty()); //to check whetever it is empty r not
        for(String k: hm.keySet()){         //Literation in hashmap Is done with the help of set
            System.out.println("Key="+k+ ", value="+hm.get(k));
        }
        hm.clear();     // It clear the haspmap makes it siz zero
        System.out.println("Is the  list empty " +hm.isEmpty());
    }

}
