import java.util.Scanner;

class Conversation{
/**
 * implements a chatbot that engages in a conversation based on how many rounds the user
 * wants it to be and mirrors the user responses
 */
  public static void main(String[] arguments){
    
    int numOfRounds = 0;
    String responseOfUser;
    String responseOfChatbot = "";
    String[] responseStrings = {"Ohhh, how interesting!", "Mmm-mm", "Ohh", "Really?", "Really?", "Uh-huh"};
    Scanner input = new Scanner(System.in);
    System.out.print("How many rounds: ");
    numOfRounds = input.nextInt();
    String[] transcript = new String[(numOfRounds*2)+2];
    input.nextLine();
    System.out.println("Hi there! What is on your mind?");
    int numTranscript = 0;
    transcript[numTranscript] = "Hi there! What is on your mind?";
    
    for(int x = 0; x < numOfRounds; x++) {
      responseOfUser = input.nextLine();
      numTranscript++;
      transcript[numTranscript] = responseOfUser;
      String[] output = responseOfUser.split(" ");
      int num = 0;

      for(int y = 0; y<output.length; y++) {
        if (output[y].equals("you") || output[y].equals("You")) {
          output[y] = "i";
          num++;
        }else if (output[y].equals("i") || output[y].equals("I")) {
          output[y] = "you";
          num++;
        }else if (output[y].equals("me") || output[y].equals("Me")) {
          output[y] = "you";
          num++;
        }else if(output[y].equals("am") || output[y].equals("Am")) {
          output[y] = "are";
          num++;
        }else if(output[y].equals("your") || output[y].equals("Your")) {
          output[y] = "my";
          num++;
        }else if (output[y].equals("my") || output[y].equals("My")) {
          output[y] = "your";
          num++;
        }
      }

      if(num > 0){
        for (int z = 0; z < output.length; z++) {
          responseOfChatbot += output[z];
          if (z < output.length - 1) {
            responseOfChatbot += " ";
          }
        }
        System.out.println(responseOfChatbot + "?");
        numTranscript++;
        transcript[numTranscript] = responseOfChatbot + "?";
        responseOfChatbot = "";
      }else{
        int randomResponse = (int)(Math.random()*3);
        System.out.println(responseStrings[randomResponse]);
        numTranscript++;
        transcript[numTranscript] = responseStrings[randomResponse];
      }
    }
    System.out.println("See ya!");
    numTranscript++;
    transcript[numTranscript] = "See ya!";
    System.out.println("\nTRANSCRIPT: ");
    for (String lines: transcript) {
      System.out.println(lines);
    }
    input.close();
  }
}