# SpringBoot_JPA
<br>

## 초기 설정

##### 라이브러리 : spring web, jpa, h2, lombok, validation

JUnit4 사용 시 build.gradle에 추가

```
//JUnit4 추가
testImplementation("org.junit.vintage:junit-vintage-engine") {
 exclude group: "org.hamcrest", module: "hamcrest-core"
}
```

<br>

##### Lombok 적용

Setting → plugin → lombok 검색 및 실행

Setting → Annotation Processors → Enable annotation processing 체크하기

<br>

##### 실행속도 증가시키기

Setting → Build, Execution, Deployment → Build Tools → Gradle

- Build and run using : Gradle에서 IntelliJ IDEA로 변경
- Run tests using : Gradle에서 IntelliJ IDEA로 변경

<br>

<br>

### Spring Boot와 JPA를 활용한 프로젝트

#### [목표]

- 회원 관리 : 쿠키 및 세션 활용
- 일대다 맵핑 관계 : JPA 활용
- 테스트 전략
- Exception 전략
- 게시판 : REST API를 활용한 CRUD 게시판
- 실시간 트랜잭션 관리
- Git Flow 적용

<br>

#### 멤버(Member)

| 정보      | 타입   |
| --------- | ------ |
| member_id | Long   |
| email     | String |
| password  | String |
| name      | String |
| mbti      | Mbti   |

<br>

#### MBTI

| 정보      | 타입   |
| --------- | ------ |
| mbti_id   | Long   |
| mbti_name | String |
| Member    | List   |

<br>

## 회원가입 & 로그인




