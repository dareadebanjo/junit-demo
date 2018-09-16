package core;

import junit.framework.TestCase;

public class ArithmeticSolverTest extends TestCase {

	public void testAdd(){
		ArithmethicSolver solver = new ArithmeticSolverTest();
		
		assertEquals(4, solver.add(2,2));
	}
	
	public void testSubtract() {
		ArithmethicSolver solver = new ArithmeticSolverTest();
		
		assertEquals(2, solver.subtract(4,2));
	}
	
	public void testMultiply() {
		ArithmethicSolver solver = new ArithmeticSolverTest();
		
		assertEquals(15, solver.multiply(3,5));
	}
	
	public void testDivide() {
		ArithmethicSolver solver = new ArithmeticSolverTest();
		
		assertEquals(3, solver.divide(6,2));
	}
	
	public void testModulus() {
		ArithmethicSolver solver = new ArithmeticSolverTest();
		
		assertEquals(1, solver.modulus(5,2));
	}
}
