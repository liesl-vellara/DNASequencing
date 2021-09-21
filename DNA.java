
public class DNA {
  public static void main(String[] args) {
     //  -. .-.   .-. .-.   .
    //    \   \ /   \   \ / 
    //   / \   \   / \   \  
    //  ~   `-~ `-`   `-~ `-

    // dna strands that we will be testing our program against
    String dna1 = "ATGCGATACGCTTGA";
    String dna2 = "ATGCGATACGTGA";
    String dna3 = "ATTAATATGTACTGA";

    //generic string variable which will be set to either of the DNA sequencing
    String dna = dna1;

    // finding the length of dna
    System.out.println(dna.length());

    //does the dna start with codon ATG
    System.out.println(dna.indexOf("ATG"));

    //does the dna have the stop condon TGA
    System.out.println(dna.indexOf("TGA"));

    //checking if the dna is a protein
    if (dna.indexOf("ATG") != -1 
      && dna.indexOf("TGA") != -1 
      && (dna.indexOf("TGA")-dna.indexOf("ATG"))%3 == 0)
    {
      String protein = dna.substring(3, dna.indexOf("TGA"));
      System.out.println("Protein: " + protein);
    } else {
      System.out.println("No protein");
    }
    //Change the dna to dna2 and dna3 to check if they are protein or not

  }
}
