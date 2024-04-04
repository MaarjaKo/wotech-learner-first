public class Main {
public static void main(String[] args) {    
 
  // until +5 wear super warm
  // +5 to 15 warm
  // 15 to 30 wear normal
  // 30+ you need cooling
 
  int temperature = 4;

  if (temperature <= 5) {
    System.out.println("Wear super warm!");
  }
  else if (temperature <= 5) {
    System.out.println("Wear warm!");
  }
  else if (temperature <= 15) {
    System.out.println("Wear normal!");
  }
  else if (temperature <= 30) {
    System.out.println("You need cooling!");
  } else {
    System.out.println("Please correct temperature!");
  }

  }    
}
