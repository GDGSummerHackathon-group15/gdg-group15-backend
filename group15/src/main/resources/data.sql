--part
insert into part(name)
values("Backend");
insert into part(name)
values("Frontend");

--main category
insert into main_category(title, part_id)
values("프레임워크", 1);

insert into main_category(title, part_id)
values("관계형 데이터베이스", 1);

--sub category
insert into sub_category(title, category_id)
values("자바", 1);

insert into sub_category(title, category_id)
values("자바스크립트", 1);

insert into sub_category(title, category_id)
values("파이썬", 1);

insert into sub_category(title, category_id)
values("데이터베이스", 2);

insert into sub_category(title, category_id)
values("SQL", 2);

insert into sub_category(title, category_id)
values("오라클/PostgreSQL", 2);

insert into sub_category(title, category_id)
values("MySQL/MariaDB", 2);

insert into sub_category(title, category_id)
values("MS SQL 서버", 2);

--book
insert into book(description, image_url, title, sub_category_id)
values("데이터베이스 입문자를 위한 책입니다.", "http://image.yes24.com/goods/67882661/XL", "데이터베이스 개론", 4);

insert into book(description, image_url, title, sub_category_id)
values("완전 초보의 데이터베이스 따라잡기", "http://image.yes24.com/goods/32613394/XL", "데이터베이스 첫걸음", 4);

insert into book(description, image_url, title, sub_category_id)
values("멘토가 들려주는 따스한 데이터 모델링 이야기", "http://image.yes24.com/momo/TopCate0001/kepub/L_454591.jpg", "프로젝트 성패를 결정짓는 데이터 모델링 이야기", 4);

insert into book(description, image_url, title, sub_category_id)
values("하루 30분 36강으로 배우는 완전 초보의 SQL 따라잡기", "http://image.yes24.com/goods/22744867/XL", "SQL 첫걸음", 5);

insert into book(description, image_url, title, sub_category_id)
values("누구나 쉽게 배우는 데이터 분석 기초", "http://image.yes24.com/goods/64434562/XL", "모두의 SQL", 5);

insert into book(description, image_url, title, sub_category_id)
values("DB 성능 최적화를 위한 SQL 실전 가이드", "http://image.yes24.com/goods/24089836/XL", "SQL 레벨업", 5);

insert into book(description, image_url, title, sub_category_id)
values("비전공자도 기초부터 확실하게!", "http://image.yes24.com/goods/65849798/XL", "Do it! 오라클로 배우는 데이터베이스 입문", 6);

insert into book(description, image_url, title, sub_category_id)
values("Oracle 설치부터 PL/SQL 정복까지!", "http://image.yes24.com/goods/58731074/XL", "이것이 오라클이다", 6);

insert into book(description, image_url, title, sub_category_id)
values("우리 주변에서 쉽게 볼 수 있는 ‘서점’을 예로 들어 데이터베이스를 설명한다.", "http://image.yes24.com/momo/TopCate382/MidCate009/38185830.jpg", "오라클로 배우는 데이터베이스 개론과 실습", 6);

insert into book(description, image_url, title, sub_category_id)
values("MySQL 설치부터 PHP 연동까지 한번에!", "http://image.yes24.com/momo/TopCate815/MidCate005/81445368(1).jpg", "이것이 MySQL이다", 7);

insert into book(description, image_url, title, sub_category_id)
values("MariaDB 설치부터 PHP 연동까지 한번에!", "http://image.yes24.com/goods/71736690/XL", "이것이 MariaDB다", 7);

insert into book(description, image_url, title, sub_category_id)
values("개발자와 DBA를 위한", "http://image.yes24.com/momo/TopCate182/MidCate09/18180167.jpg", "Real MySQL", 7);

insert into book(description, image_url, title, sub_category_id)
values("MariaDB 10.0과 MySQL 5.6을 함께 배우는", "http://image.yes24.com/momo/TopCate345/MidCate010/34493339.jpg", "Real MariaDB", 7);

insert into book(description, image_url, title, sub_category_id)
values("실습으로 체험하고 바로 운영한다", "http://image.yes24.com/momo/TopCate853/MidCate001/85208930.jpg", "이것이 SQL Server다", 8);

insert into book(description, image_url, title, sub_category_id)
values("디비로 누리는 특별한 세상 / 나의 첫 번째 데이터베이스 개발하기", "http://image.yes24.com/momo/TopCate1146/MidCate009/114580109.jpg", "SQL Server 개발편", 8);

insert into book(description, image_url, title, sub_category_id)
values("디비로 누리는 특별한 세상 / 나의 첫 번째 데이터베이스 운영하기", "http://image.yes24.com/momo/TopCate1146/MidCate009/114580188.jpg", "SQL Server 운영편", 8);

insert into book(description, image_url, title, sub_category_id)
values("자바 ORM 표준 JPA는 SQL 작성 없이 객체를 데이터베이스에 직접 저장할 수 있게 도와주고, 객체와 관계형 데이터베이스의 차이도 중간에서 해결해준다. 이 책은 JPA 기초 이론과 핵심 원리, 그리고 실무에 필요한 성능 최적화 방법까지 JPA에 대한 모든 것을 다룬다. 또한, 스프링 프레임워크와 JPA를 함께 사용하는 방법을 설명하고, 스프링 데이터 JPA, QueryDSL 같은 혁신적인 오픈 소스를 활용해서 자바 웹 애플리케이션을 효과적으로 개발하는 방법을 다룬다.",
      "http://image.yes24.com/goods/19040233/XL", "자바 ORM 표준 JPA 프로그래밍",1);

insert into book(description, image_url, title, sub_category_id)
values("자바 엔터프라이즈 개발을 편하게 해주는 오픈소스 경량 애플리케이션 프레임워크인 스프링은 자바와 객체 지향이라는 기반 위에 굳건히 세워져 있다. 따라서 스프링을 제대로 이해하고 활용하려면 먼저 자바와 객체 지향부터 올바르게 이해해야 한다.",
       "http://image.yes24.com/momo/TopCate482/MidCate010/48193689.jpg", "스프링 입문을 위한 자바 객체 지향의 원리와 이해", 1);

insert into book(description, image_url, title, sub_category_id)
values("스프링을 처음 접하거나 스프링을 경험했지만 스프링이 어렵게 느껴지는 개발자부터 스프링을 활용한 아키텍처를 설계하고 프레임워크를 개발하려고 하는 아키텍트에 이르기까지 모두 참고할 수 있는 스프링 완벽 바이블이다.",
       "http://image.yes24.com/momo/TopCate87/MidCate10/8691327.jpg", "토비의 스프링 3", 1);

insert into book(description, image_url, title, sub_category_id)
values("이 책은 제목 그대로 스프링 부트와 AWS로 웹 서비스를 구현한다. JPA와 JUnit 테스트, 그레이들, 머스테치, 스프링 시큐리티를 활용한 소셜 로그인 등으로 애플리케이션을 개발하고, 뒤이어 AWS 인프라의 기본 사용법과 AWS EC2와 RDS를 사용해 서비스가 가능하도록 한다. 이렇게 점진적으로 스프링 부트 프로젝트를 개선해서 배포 자동화하고 무중단 배포까지 경험한다. 실무 현장에서의 노하우와 테스트 방법, 객체지향 프로그래밍 등을 소개하고 다룬다.",
       "http://image.yes24.com/goods/83849117/XL", "스프링 부트와 AWS로 혼자 구현하는 웹 서비스", 1);

insert into book(description, image_url, title, sub_category_id)
values("대규모 트래픽을 적은 비용으로 처리할 수 있는 고성능 서버의 비밀은 무엇일까? 스프링 부트 개발, 테스트, 문서화, 보안, 도커화, 운영까지 모두를 한 권에 마스터하는 것을 목표로, 익숙하고 손쉬운 이커머스 예제를 따라 해보면서 당장 바로 활용 가능한 스프링 부트(Spring Boot), 스프링 웹플럭스(WebFlux), 리액티브 프로그래밍(Reactive programming) 실전 활용 전략을 익힐 수 있다.",
       "http://image.yes24.com/goods/101803558/XL", "스프링 부트 실전 활용 마스터", 1);

insert into book(description, image_url, title, sub_category_id)
values("서버와 데이터베이스 개념을 시작으로 노드의 기본 개념을 차근차근 설명해나간다. 군더더기 없는 직관적인 설명, 풍부한 그림으로 기본 개념을 확실히 이해하고, 노드의 기능과 생태계를 사용해보며 실제로 동작하는 서버를 만들어보자. 웹 서버, 웹 API 서버, SNS 서비스, 실시간 GIF 채팅방, 경매 시스템, 위치 기반 장소 검색 서비스, 커맨드라인 인터페이스를 모두 만들어 볼 수 있다. 실무에 당장 적용할 수 있고, 참고할 수 있는 예제와 코드를 최신 문법으로 다뤄보자.",
       "http://image.yes24.com/goods/62597864/XL", "Node.js 교과서", 2);

insert into book(description, image_url, title, sub_category_id)
values("웹 서버, 채팅 서버, 모바일 서버, 위치 기반 서비스 서버, JSON-RPC 서버까지 한 권으로 끝낸다! 이 책은 누구나 쉽게 접근할 수 있는 자바스크립트 언어로 웹 서버를 만들며 서버 개발에 입문한다. 웹 서버를 만들며 작성한 소스 코드를 바로바로 수정해서 다양한 서버를 단박에 만들 수 있다. 그래서 이 책을 보면 당신의 회사에 필요한 서버를 지금 당장 만들 수 있는 능력이 생긴다.",
       "http://image.yes24.com/goods/36886447/XL", "Do it! Node.js 프로그래밍", 2);

insert into book(description, image_url, title, sub_category_id)
values("Node.js는 JavaScript를 사용하여 쉽게 확장 가능한 서버 측 어플리케이션을 만들 수 있는 매우 유용한 소프트웨어 플랫폼으로, 효율적인 코드 작성을 통해 설계 및 코드 분할을 가능하게 한다. 『Node.js 디자인 패턴』은 Node.js의 비동기 단일 스레드 아키텍처와 주요 디자인 패턴을 설명하고, 비동기식 제어 흐름 패턴과 스트림 구성 요소를 마스터하는 방법을 보여주며, 가장 일반적인 디자인 패턴의 Node.js 구현 목록과 Node.js 전용 특정 디자인 패턴으로 마무리된다.",
       "http://image.yes24.com/goods/65050060/XL", "Node.js 디자인 패턴", 2);

insert into book(description, image_url, title, sub_category_id)
values("넷플릭스, 아마존닷컴, 이베이를 포함한 대규모 웹 사이트들이 모놀리식 아키텍처에서 마이크로서비스 아키텍처로 변화하고 있다. 이들은 왜 마이크로서비스 아키텍처를 선택했을까? 마이크로서비스 아키텍처를 직접 설계하고 구현해보며 개념과 구축 방법을 이해하고, 장애 처리, 보안, 로그 수집, 배포, 적용 시점처럼 고려해야 할 주제들도 함께 학습한다.",
       "http://image.yes24.com/goods/58775939/XL", "Node.js 마이크로서비스 코딩 공작소", 2);

insert into book(description, image_url, title, sub_category_id)
values("웹 개발자라면 필수적으로 갖춰야 할 거의 모든 지식을 담고 있다. 웹 기본 기술부터 파이썬 웹 개발 시 기초 지식이 되는 표준 라이브러리를 배우고, 풍부한 실습 예제를 통해 Django의 핵심 기능을 배울 수 있다. 또한 초급자를 고려하여 윈도우 환경에서 개발 환경을 구성한다. 하지만 운영 서버 배포 과정에서는 현업에 빠르게 적용할 수 있도록, PythonAnywhere를 이용한 가상 환경과 리눅스를 활용하며, 가장 널리 활용되는 Apache 웹 서버와 최근 각광받고 있는 NGINX 웹 서버를 모두 경험해 볼 수 있다.",
       "http://image.yes24.com/goods/63503495/XL", "파이썬 웹 프로그래밍", 3);

insert into book(description, image_url, title, sub_category_id)
values("기본편은 파이썬 웹 프로그래밍을 시작하려는 입문자를, 실전편은 상용화 수준의 프로젝트를 개발하려고 하는 웹 개발자를 위한 책이다. 부록에서는 책에서 개발한 앱을 AWS, Heroku에서 배포하는 데까지 나아간다.",
       "http://image.yes24.com/goods/80855594/XL", "파이썬 웹 프로그래밍, 실전편", 3);

insert into book(description, image_url, title, sub_category_id)
values("파이썬을 지식으로 아는 것뿐 아니라 파이썬을 응용하여 백엔드 시스템을 개발할 수 있도록 도와주는 책이다. 파이썬으로 백엔드 API 시스템을 개발할 때 가장 널리 사용되는 프레임워크 중 하나인 flask를 사용해 실제 응용할 수 있는 API를 개발해 나가는 과정을 상세하게 알려주고 있다. 단순히 파이썬이나 flask에 관한 내용이 아닌 실제 API 개발에 관한 내용을 더 중점으로 두고 있다. 인터넷 검색을 통해서 금방 얻을 수 있는 지식이 아니라, 온라인 검색에서 쉽게 얻을 수 없고 실제로 오랫동안 다양한 개발 경험을 통해 얻을 수 있는 노하우와 인사이트들을 담고 있다.",
       "http://image.yes24.com/goods/68713424/XL", "깔끔한 파이썬 탄탄한 백엔드", 3);

insert into book(description, image_url, title, sub_category_id)
values("다양한 웹 사이트에서 만나볼 수 있는 웹 프로그래밍의 기초적인 내용을 위주로 독자들이 직접 코드를 구현해 나가며 학습할 수 있도록 방향을 제시한다. 책에서 소개하는 내용과 예제뿐만 아니라 실전에서도 바로 응용할 수 있도록 다양한 관점에서 코드를 해석하고, 독자들이 어떠한 질문을 가지고 진행해야 할지를 함께 제시하며 책을 다 읽은 후에도 스스로 학습하며 성장할 수 있도록 한다.",
       "http://image.yes24.com/goods/83568594/XL", "Django 한 그릇 뚝딱", 3);

insert into book(description, image_url, title, sub_category_id)
values("이 책은 플라스크라는 파이썬 프레임워크로 실제 서비스 중인 파이보(pybo.kr)라는 질문·답변 게시판을 만든 뒤 AWS에 배포하는 과정까지 친절하게 안내한다.",
       "http://image.yes24.com/goods/95751850/XL", "Do it! 점프 투 플라스크", 3);

--user
insert into user(avatar_url, name)
values("https://avatars.githubusercontent.com/u/68000537?v=4", "janeljs")
