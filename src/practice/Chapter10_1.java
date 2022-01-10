package practice;

import java.sql.SQLException;

public class Chapter10_1 {
	public static void main(String[] args) {
		try {
			int array[] = {1, 3, 5};
			Chapter10_1.validIndex(array, 2);
			Chapter10_1.validIndex(array, 3);
			
			System.out.println("validIndexの呼び出し終了");
		} catch (IllegalArgumentException e) {
			System.out.println("IllegalArgumentExceptionが発生しました");
			e.printStackTrace();
		}
		
		try {
			Chapter10_1.throwSQLException();
			
		} catch (SQLException e02) {
			System.out.println("SQLExceptionが発生しました");
			e02.printStackTrace();	
		}
		
		
		System.out.println("mainメソッド終了");
	}
	
	
    public static void validIndex(int array[], int index) {
    	if (index < array.length) {
    		System.out.println("インデックスの要素は" + array[index] + "です");
    	} else {
    		throw new IllegalArgumentException(index + "はサイズの範囲外です");
    	}
    }
    
    public static void throwSQLException() throws SQLException {
    	throw new SQLException("SQLエラーです");
    }
}
