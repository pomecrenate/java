module com.udemy.java.consumer {
  // service 모듈 사용
  // 모듈을 의존한다고 그 안의 모든 클래스를 사용 가능한건 아님
  // exports를 통해 내보내기가 허용된 패키지 안 클래스만 사용 가능
  requires com.udemy.java.service.provider;
  // Logger 사용
  // transitive 키워드로 인해 이 모듈을 정의한 다른 모듈도 java.logging 사용 가능
  requires transitive java.logging;
}
