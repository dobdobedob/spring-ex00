package lecture.p03core;

import lombok.Setter;

@Setter
public class MyServlet {
	private void doGet() {
		// 0. 사전작업
		MyDao dao = new MyDao();
		
		// 2. request handle
		
		// 3. business logic
		dao.update();
		
		// 4. add attribute
		
		// 5. forward / redirect
		
	}
}
