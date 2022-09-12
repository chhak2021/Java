package database;

public class TransactionTest {

	public static void main(String[] args) {
		/*
		Connection conn = null;    
		PreparedStatement pstmtItem = null;    
		PreparedStatement pstmtDetail = null;     
		String jdbcDriver = "jdbc:mysql://localhost:3306/chap12?useUnicode=true&characterEncoding=euckr";
		String dbUser = "id";
		String dbPass = "pw";

		try {        
			int id = Integer.parseInt(idValue);                
			conn = DriverManager.getConnection(jdbcDriver, dbUser, dbPass);        
			conn.setAutoCommit(false);                
			pstmtItem = conn.prepareStatement("insert into ITEM values (?, ?)");        
			pstmtItem.setInt(1, id);        
			pstmtItem.setString(2, "상품 이름 " + id);        
			pstmtItem.executeUpdate();                
			
			if (request.getParameter("error") != null) {            
				throw new Exception("의도적 익셉션 발생");        
			}                
			
			pstmtDetail = conn.prepareStatement("insert into ITEM_DETAIL values (?, ?)");
			pstmtDetail.setInt(1, id);        
			pstmtDetail.setString(2, "상세 설명 " + id);
			pstmtDetail.executeUpdate();
			
			conn.commit();    
		} catch(Throwable e) {
			if (conn != null) {
				try {
					conn.rollback();
				} catch(SQLException ex) {}        
			}        
			
			occuredException = e;    
		} finally {        
			try { pstmtItem.close(); } catch(SQLException ex) {}        
			try { pstmtDetail.close(); } catch(SQLException ex) {}
			try { conn.close(); } catch(SQLException ex) {}    
		}		
		*/
	}
}
