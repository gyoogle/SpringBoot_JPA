# SpringBoot_JPA
<br>

![class_diagram_SpringBoot_JPA-Architecture Diagram drawio](https://user-images.githubusercontent.com/34904741/137341750-9ebbfa34-43f5-42a5-a1a3-cbd7577677be.png)

<br>

![class_diagram_SpringBoot_JPA-Controller+Service drawio](https://user-images.githubusercontent.com/34904741/137332278-304271b6-5568-44f3-a427-267922bd7077.png)

<br>

## 기술 스택

- Frontend : Mustache
- Backend : Spring Boot, Spring Data JPA, MySQL
- DevOps : AWS EC2, AWS RDS, Travis CI, CodeDeploy

<br>

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

