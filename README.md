# 4주차 과제 — Spring Boot 기초

풀스택 개발 강의 (React + Java Spring Boot) **4주차** 과제입니다.  
이 저장소는 **과제 안내 전용**이며, 수강생은 **Fork 후 Pull Request**로 제출합니다.

---

## 📌 제출 방식 (PR)

1. 이 저장소 상단 **Fork** → 본인 계정으로 복사  
2. Fork한 저장소를 로컬에 `git clone`  
3. 브랜치 생성: `git checkout -b week04/본인GitHub아이디`  
4. 아래 **제출 폴더 규칙**에 맞게 파일 추가 후 커밋·푸시  
5. **원본 저장소(`likelion-session/week04-assignment`)** 로 **Pull Request** 생성  
6. PR 제목 예: `[4주차] 홍길동 (GitHub: username)`

자세한 단계는 [SUBMISSION.md](./SUBMISSION.md)를 참고하세요.

---

## 📁 제출 폴더 규칙

```
submissions/
└── {본인GitHub아이디}/
    ├── README.md                 # 이름, 완료한 실습, 실행 방법(mvnw 등), 스크린샷 링크
    ├── practice1-hello/          # 실습 1: Hello API
    ├── practice2a-memory/       # 실습 2A: 메모리 Todo (비전공 권장, JPA 없음)
    ├── (선택) practice2b-jpa/   # 실습 2B: JPA Todo
    ├── (선택) practice3-dto/    # 실습 3~5·종합은 선택
```

- 폴더명은 **반드시 본인 GitHub 사용자명**과 동일하게 합니다.  
- **실습 2A·2B·3~5**는 **하나의 Spring Boot 프로젝트**에 이어 붙여도 됩니다. 비전공 **최소 제출**은 실습 1 + **2A(메모리)** 입니다.  
- `README.md`에 **JDK 버전**, **`./mvnw spring-boot:run`** (또는 IntelliJ Run) 등 **실행 방법**을 꼭 적어 주세요.

---

## ✅ 과제 내용

문제 전문·배점·팁은 **[ASSIGNMENT.md](./ASSIGNMENT.md)** 를 참고하세요.

| 실습 | 요약 | 배점 |
|------|------|------|
| 1 | Hello REST API | 25 |
| 2 | **2A 메모리** 또는 **2B JPA** (하나로 채점) | 60 |
| 3~5·종합 | DTO·예외·검증·종합 | 각 5점·보너스 (선택) |

**총점 100점** — 실습 **1 + 2(2A 또는 2B)** 만으로 **85점**까지. 상세는 [ASSIGNMENT.md](./ASSIGNMENT.md).

---

## 📅 마감

- 강의에서 안내하는 **마감일시**를 따릅니다.

---

## ❓ 문의

강의 채널 또는 이 저장소 **Issues**로 문의하세요.

---

## 📚 참고

- [Spring Boot 공식 문서](https://spring.io/projects/spring-boot)
- [Spring Initializr](https://start.spring.io/)
- [RESTful API 설계](https://restfulapi.net/)
