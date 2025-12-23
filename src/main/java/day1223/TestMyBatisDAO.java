package day1223;

import org.apache.ibatis.session.SqlSession;

import kr.co.sist.dao.MyBatisHandler;

public class TestMyBatisDAO {
   
   public void insertBoard() {
      // 1. MyBatis Handler 얻기
      SqlSession ss = MyBatisHandler.getInstance().getMyBatisHandler(true);
      
      // 2. method 호출
      int cnt = ss.insert("day1223.nonParameter");
      
      // 3. 결과 받기
      System.out.println(cnt + "건 추가");
//      if (cnt == 1) {
//         ss.commit();
//      }
      
      // 4. MyBatis Handler 닫기
      if (ss != null) {
         ss.close();
      }// end if
   }// insertBoard

   public static void main(String[] args) {
      new TestMyBatisDAO().insertBoard();
   }// main

}// class
