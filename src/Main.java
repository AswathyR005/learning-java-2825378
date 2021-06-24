
public class Main {

    public static void main(String args[]) {
        String question = "who won test championship finals in 2021?";
        String choiceOne = "India";
        String choiceTwo = "NewZealand";
        String choiceThree = "England";

        String correctAnswer = choiceTwo;
        system.out.println(question);
        system.out.println(choiceOne);
        system.out.println(choiceTwo);
        system.out.println(choiceThree);
        Scanner input=new Scanner(system.in);
        answer=input.next();
        if(answer==choiceTwo){
            system.out.println("Congrats!!");
        }
        else{
            system.out.println("Wrong Answer");
        }
        
        // Write a print statement asking the question
        // Write a print statement giving the answer choices

        // Have the user input an answer
        // Retrieve the user's input

        // If the user's input matches the correctAnswer...
        // then the user is correct and we want to print out a congrats message to the user.

        // If the user's input does not match the correctAnswer...
        // then the user is incorrect and we want to print out a message saying that the user is incorrect as well as what the correct choice was.

    }

}
