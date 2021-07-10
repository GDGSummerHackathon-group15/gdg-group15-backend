insert into part(name)
values("Backend");
insert into part(name)
values("Frontend");

insert into main_category(title, part_id)
values("프레임워크", 1);

insert into sub_category(title, category_id)
values("자바", 1);

insert into sub_category(title, category_id)
values("자바스크립트", 1);

insert into sub_category(title, category_id)
values("파이썬", 1);

insert into sub_category(title, category_id)
values("PHP", 1);

insert into book(description, image_url, title, roadmap_id)
values("데이터베이스 입문자를 위한 책입니다.", "http://image.yes24.com/goods/67882661/XL", "데이터베이스 개론", 1);

insert into book(description, image_url, title, roadmap_id)
values("자바 입문자를 위한 책입니다.", "http://image.yes24.com/goods/24259565/XL", "자바의 정석", 1);

insert into book(description, image_url, title, roadmap_id)
values("리액트 입문자를 위한 책입니다.", "http://image.yes24.com/goods/62597469/XL", "리액트를 다루는 기술", 2);

insert into user(avatar_url, name)
values("https://avatars.githubusercontent.com/u/68000537?v=4", "janeljs")
