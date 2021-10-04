import static org.junit.Assert.*;

import org.junit.Test;

public class ACCTEST {

	@Test
	public void test() {
	
	SavingAcc obj1;
	obj1= new SavingAcc();
	if(obj1.bal<=5000)
	{
		assertEquals(1, 0);

	}
	}

	@Test
	public void test2() {
	
	SavingAcc obj1;
	obj1= new SavingAcc();
	if(obj1.bal>5000)
	{
		assertEquals(0, 0);

	}
	}
	@Test
	public void test3() {
	
CheckingAcc obj1;
	obj1= new CheckingAcc();
	if(obj1.bal>5000)
	{
		assertEquals(0, 0);

	}
	}
	@Test
	public void test4() {
	
CheckingAcc obj1;
	obj1= new CheckingAcc();
	if(obj1.bal<5000)
	{
		assertEquals(0, 0);

	}
	}
	@Test
	public void test6() {
	
		CheckingAcc obj1;
	obj1= new CheckingAcc();
	if(obj1.deop<5000)
	{
		assertEquals(0, 0);

	}
	@Test
	public void test7() {
	
		CheckingAcc obj1;
	obj1= new CheckingAcc();
	if(obj1.deop>5000)
	{
		assertEquals(1, 0);

	}
	}
	@Test
	public void test8() {
	
		SavingAcc obj1;
	obj1= new SavingAcc();
	if(obj1.deop>5000)
	{
		assertEquals(1, 0);

	}
	}

	@Test
	public void test9() {
	
		SavingAcc obj1;
	obj1= new SavingAcc();
	if(obj1.deop<5000)
	{
		assertEquals(0, 0);

	}
	}
	@Test
	public void test10() {
	
		SavingAcc obj1;
	obj1= new SavingAcc();
	if(obj1.bal< obj.with)
	{
		assertEquals(1, 0);

	}
	}


	
	}
