// Question 1 )Parse and evaluate simple math word problems returning the answer as an integer.
For example, input : 5 + 13 output : 18

 public class MathWordProblemSolver {
    public static void main(String[] args) {
        String problem = "5 + 13"; // Example input
        int result = solveMathWordProblem(problem);
        System.out.println("Output: " + result);
    }

    public static int solveMathWordProblem(String problem) {
        String[] parts = problem.split(" ");

        int operand1 = Integer.parseInt(parts[0]);
        String operator = parts[1];
        int operand2 = Integer.parseInt(parts[2]);

        int answer = 0;

        switch (operator) {
            case "+":
                answer = operand1 + operand2;
                break;
            case "-":
                answer = operand1 - operand2;
                break;
            case "*":
                answer = operand1 * operand2;
                break;
            case "/":
                answer = operand1 / operand2;
                break;
        }

        return answer;
    }
}
 