# Group 15

## Team
![화면 캡처 2021-07-11 124707](https://user-images.githubusercontent.com/68000537/125182134-55ccb800-e246-11eb-97f4-c5ceaf7e66c7.png)
### Design
박주미: 사람들의 행동과 서비스 사용성에 관심이 많은 디자이너

### Frontend
이서윤: react로 개발하는 프론트 개발자  
이재욱: 라이언로켓에서 일하고 있는 프론트엔드 개발자

### Backend
손윤석: 스프링으로 개발하는 백엔드 개발자   
임지선: 사람들과 소통하기 좋아하고 클린코드에 관심이 많은 백엔드 개발자

---

# HelloWings

- 처음 개발을 공부하는 사람들, 새로운 스택에 도전해보고 싶은 사람들을 위한 **북 큐레이팅 서비스**입니다.
- 인터넷에 개발 관련 책을 추천하는 블로그 포스팅은 많지만, 각 분야별 추천 도서와 해당 도서에 대한 **찐개발자들의 후기**가  한 곳에 모여있는 서비스는 찾기가 힘들어 기획하게 되었습니다. 
- ***HelloWings***는 "Hello, World!"와 Wings의 합성어로 개발 생태계를 처음 접하는 뉴비들이 저희 서비스를 통해 날개를 달았으면 좋겠다는 바람에서 지어진 이름입니다.

## 전체 소스 코드
- [Frontend](https://github.com/GDGSummerHackathon-group15/gdg-group15-frontend)
- [Backend](https://github.com/GDGSummerHackathon-group15/gdg-group15-backend)


## 기능 상세 
### API 문서
- [Postman API Documentation](https://documenter.getpostman.com/view/15287546/Tzm6nGqX)
- 설계한 모든 API에 대한 백엔드 구현이 완료되었습니다. 
### 회원 관련 기능
- **Github 로그인**
    - OAuth를 사용하여 Github 계정으로 로그인
    - 데이터베이스에 유저 저장
- **유저 정보 + 위시 리스트 조회**
    - 유저 정보를 받아오고 유저가 추가한 위시 리스트를 조회
### 도서 검색 관련 기능
- **개발분야 조회**
    - Frontend, Backend등 포괄적인 분야로 메인카테고리 리스트 조회
![image](https://user-images.githubusercontent.com/68000537/125229797-73675380-e312-11eb-92ce-a3810942757f.png)

- **카테고리 리스트 조회**
    - 각 개발분야 내의 메인 카테고리와 서브 카테고리 조회
    - ex) Backend -> 프레임워크 -> Java
- **도서 리스트 조회**
    - 서브 카테고리 내의 도서 리스트 조회
![image](https://user-images.githubusercontent.com/68000537/125229824-81b56f80-e312-11eb-803d-69859a6359bb.png)
- **책 상세페이지 조회**
    - 책에 관련된 정보와 별점 및 별점을 남긴 유저 수를 조회
![image](https://user-images.githubusercontent.com/68000537/125229903-ac072d00-e312-11eb-93ec-2eca0ddc7fcb.png)

### 리뷰 및 위시 리스트 관련 기능
- **리뷰 추가**
    - 별점과 리뷰 내용을 입력받고 도서의 리뷰리스트에 저장
- **리뷰 수정**
    - 별점과 리뷰를 수정하고 도서의 리뷰리스트에 업데이트
- **위시리스트 등록**
    - 도서를 유저의 위시리스트에 저장
- **위시리스트 삭제**
    - 저장되어있던 위시리스트에서 위시를 삭제
![image](https://user-images.githubusercontent.com/68000537/125229918-b7f2ef00-e312-11eb-88e3-6f624d3a9ccc.png)

## 데모 영상
![녹화_2021_07_12_13_01_30_717](https://user-images.githubusercontent.com/68000537/125229424-c096f580-e311-11eb-9da4-e031f5117821.gif)
![녹화_2021_07_19_11_36_22_436](https://user-images.githubusercontent.com/68000537/126095110-7d5f8e81-90ae-49e2-92ba-36a681d61ee8.gif)

## 기술 상세
### Design
- Adobe Illustrator
- Figma

### Frontend
- react
- react query
- typescript


### Backend
#### 기술 스택
- Java
- Spring Boot
- Spring Data JPA
- AWS EC2, VPC
- Nginx

#### 데이터베이스 설계
- [ERD](https://github.com/GDGSummerHackathon-group15/gdg-group15-backend/wiki/ERD)

#### 인증
- OAuth를 활용하여 GitHub 로그인을 구현하였습니다.
- 클라이언트로부터 Authorization 헤더로 받은 토큰을 Interceptor에서 확인하는 방식으로 사용자를 검증하였습니다.
