package core;

public class ArithmeticSolver {
	
	public double add(double leftOp, double rightOp) {
		return rightOp + leftOp;
	}
	
	public double subtract(double leftOp, double rightOp) {
		return leftOp - rightOp;
	}
	
	public double multiply(double leftOp, double rightOp) {
		return leftOp * rightOp;
	}
	
	public double divide(double leftOp, double rightOp) {
		return leftOp / rightOp;
	}
	
	public double modulus(double leftOp, double rightOp) {
		return leftOp % rightOp;
	}

	public double solve(String operator, double leftOp, double rightOp) {
		double answer = 0;
		
		switch (operator) {
		case "+":
			answer = add(leftOp, rightOp);
			break;
		case "-":
			answer = subtract(leftOp, rightOp);
			break;
		case "x":
			answer = multiply(leftOp, rightOp);
			break;
		case "/":
			answer = divide(leftOp, rightOp);
			break;
		case "%":
			answer = modulus(leftOp, rightOp);
			break;
		default:
			break;
		}
		
		return answer;
	}
	
}
