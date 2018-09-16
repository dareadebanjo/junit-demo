package core;

import junit.framework.TestCase;

public class ArithmeticSolverTest extends TestCase {

	public void testAdd(){
		ArithmeticSolver solver = new ArithmeticSolver();
		
		assertEquals(4.0, solver.add(2,2));
	}
	
	public void testAddNegativeNumbers(){
		ArithmeticSolver solver = new ArithmeticSolver();
		
		assertEquals(-4.0, solver.add(-2,-2));
		assertEquals(-55.0, solver.add(-58,3));
		assertEquals(  10.0, solver.add(25,-15));
	}
	
	public void testAddLargeNumbers(){
		ArithmeticSolver solver = new ArithmeticSolver();
		
		//assertEquals(Double.MIN_VALUE, solver.add(Double.MAX_VALUE, 1));
		assertEquals(-54790801.0, solver.add(-58345345,3554544));
	}
	
	public void testAddDecimalsNumbers(){
		ArithmeticSolver solver = new ArithmeticSolver();
		
		assertEquals(8.6, solver.add(5.3, 3.3));
		assertEquals(12.778, solver.add(9.445, 3.333));
		assertNotNull(solver.add(9.445, 3.3333));
	}
	
	public void testSubtract() {
		ArithmeticSolver solver = new ArithmeticSolver();
		
		assertEquals(2.0, solver.subtract(4,2));
	}
	
	public void testMultiply() {
		ArithmeticSolver solver = new ArithmeticSolver();
		
		assertEquals(15.0, solver.multiply(3,5));
	}
	
	public void testDivide() {
		ArithmeticSolver solver = new ArithmeticSolver();
		
		assertEquals(3.0, solver.divide(6,2));
	}
	
	public void testModulus() {
		ArithmeticSolver solver = new ArithmeticSolver();
		
		assertEquals(1.0, solver.modulus(5,2));
	}
}
