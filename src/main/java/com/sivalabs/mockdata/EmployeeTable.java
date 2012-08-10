/**
 * 
 */
package com.sivalabs.mockdata;

/**
 * @author skatam
 *
 */
public class EmployeeTable extends Table<Integer, Employee>
{
	private static final EmployeeTable INSTANCE = new EmployeeTable();
	private EmployeeTable()
	{
	}
	public static EmployeeTable getInstance()
	{
		return INSTANCE;
	}
}
