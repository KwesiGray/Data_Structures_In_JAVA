package list;
public class TestList {
    public static void main(String[] args) {
        FixedSizeList<String> hostelNames = new FixedSizeList<String>();

        hostelNames.add("WaterLoo");
        System.out.println(hostelNames.size());

        hostelNames.add("R&M Annex");
        System.out.println(hostelNames.size());

        hostelNames.add("Hilda");
        System.out.println(hostelNames.size());

        hostelNames.add("Corazon");
        System.out.println(hostelNames.size());

        hostelNames.add(2,"Nat Kat");
        System.out.println(hostelNames.size());

        hostelNames.add(1,"Oak");
        System.out.println(hostelNames.size());


        //Checking What Hostel is at a specified Index.
        System.out.println("The Hostel Name at Index No. 2 is: " + hostelNames.get(2));
        System.out.println("The Hostel Name at Index No. 1 is: " + hostelNames.get(1));

        //After removing an element from the list & checking the list Size
        hostelNames.remove(2);
        System.out.println("The New List Size is: "+hostelNames.size());

        hostelNames.add(5, "Figenko");
        System.out.println("The New List Size is: "+hostelNames.size());

        //Checking if our contain method works
        System.out.println(hostelNames.contains("WaterLoo"));


        //Create a method that will return all the indexes of an element
        System.out.println(hostelNames.indexOf("Hilda")+(" Is the index of Hilda"));



    }
}
