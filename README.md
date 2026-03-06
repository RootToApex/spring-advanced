# SPRING ADVANCED
--------
Spring Boot 기반의 코드 개선 과제

--------

수행한 과제 및 해결 과정

Lv.0 - 환경 설정 및 인프라 구축
설정 파일(application.yml) 에러 해결: resources 폴더 누락으로 인한 구동 실패를 폴더 생성 및 Resources Root 마킹으로 해결.

DB 연동: Docker 환경(MySQL 3307 포트)에 맞춘 데이터 소스 설정 및 스키마 생성.

Lv.1 - ArgumentResolver 등록
문제: @Auth 어노테이션 로직이 있어도 컨트롤러에서 정상 작동하지 않음.

원인: WebMvcConfigurer 등록 없이는 Spring이 Resolver의 존재를 알 수 없음.

해결: WebConfig 클래스를 생성하여 addArgumentResolvers 메서드에 직접 등록.

Lv.2 - 코드 품질 개선 (Refactoring)
Early Return 적용: 중복 체크 로직을 최상단으로 옮겨 불필요한 passwordEncoder.encode() 실행 방지.

Guard Clause 적용: throw 문 이후의 불필요한 else 블록을 제거하여 코드 가독성 향상.

Validation 책임 이동: 서비스 레이어의 검증 로직을 DTO(@Valid, @Pattern)로 이동시켜 유지보수성 강화.

Lv.3 - N+1 문제 해결
성능 최적화: Todo 조회 시 발생하는 N+1 문제를 @EntityGraph를 사용하여 1번의 쿼리로 최적화.

학습 포인트: 기본값을 LAZY로 유지하되, 필요한 상황에서만 한번에 가져오는 것이 가장 효율적임을 이해.

Lv.4 - 테스트 코드 개선
테스트 정합성 확보: 실제 서비스와 테스트 코드 간의 예외 타입 및 메시지 불일치 해결.

안정성 강화: saveManager() 로직 내 유저 null 체크 가드 절을 추가하여 NullPointerException 방지.

--------

기술 스택
Language: Java 17

Framework: Spring Boot 3.3.3

Persistence: Spring Data JPA

Build Tool: Gradle

Database: MySQL

Authentication: JWT

Infrastructure: Docker
